<%-- 
    Document   : arithmeticcalculator
    Created on : 17-Jan-2022, 10:59:41 PM
    Author     : merya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet"   type="text/css" href="Style/Calculator.css">
              <title>Arithmetic Calculator</title>
</head>
<body>
    
    <div class="main">
      <h1>Arithmetic Calculator</h1>
      <form action="arithmetic" method="post">
            <label for="first">First</label>
            <input type="text" name="first" id="first"/>
            <br>
            <lable for="second">Second</lable>
            <input type="text" name="second" id="second"/>
            <div>
            <button type="submit" id="addition" value="+" name="addition">+</button>
            <button type="submit" id="subtraction" value="-" name="subtraction">-</button>
            <button type="submit" id="multiplication" value="*" name="multiplication">*</button>
            <button type="submit" id="division" value="%" name="division">%</button>
            </div>
             <p> ${message}</p>
             <a href="age">Age Calculator</a>
        </form>
    </div>
</body>
</html>
