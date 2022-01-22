package ca.sait.lab2calculator.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author meron Seyoum
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String firstInput = request.getParameter("first");
        String secondInput = request.getParameter("second");
        String message = "";

        if (firstInput == null || firstInput.isEmpty() && secondInput == null || secondInput.isEmpty()) {
            request.setAttribute("message", "Invalid");
        } else {
            try {
                int first = Integer.parseInt(firstInput);
                int second = Integer.parseInt(secondInput);
                int result = 0;
                String arithmetic = "";
                if (request.getParameter("addition") != null) {
                    result = first + second;
                    arithmetic = "+";
                } else if (request.getParameter("subtraction") != null) {
                    result = first - second;
                    arithmetic = "-";
                } else if (request.getParameter("multiplication") != null) {
                    result = first * second;
                    arithmetic = "*";
                } else if (request.getParameter("division") != null) {
                    if (second == 0) {
                        request.setAttribute("message", "You must enter a non Zero number");
                    } else {
                        result = first / second;
                        arithmetic = "%";
                    }
                }

                request.setAttribute("message", "Result : " + first + " " + arithmetic + " " + second + " = " + result);
            } catch (NumberFormatException ex) {
                request.setAttribute("message", "You must enter a number");
            }
        }
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

    }
}
