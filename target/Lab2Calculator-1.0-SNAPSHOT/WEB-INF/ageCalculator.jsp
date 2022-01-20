<%-- 
    Document   : agecalculator
    Created on : 17-Jan-2022, 8:38:37 PM
    Author     : Meron Seyoum
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet"   type="text/css" href="Style/Calculator.css">
         <title>Age Calculator</title>
    </head>
    <body>
      <div class="main">
            <h1>Age Calculator</h1> 

            <form action="age" method="post">
                <label for="age">Enter Your Age:</label>
                <input type="text" name="age" id="age"/>
                <br>
                <button class="next">Age Next Birthday?</button>
                <p> ${message}</p>
                <a href="arithmetic">Arithmetic Calculator</a>
            </form>
        </div>

    </body>
</html>
