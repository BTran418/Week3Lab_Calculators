<%-- 
    Document   : arithmaticcalculator
    Created on : Sep 23, 2020, 7:52:40 PM
    Author     : BTran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="text" name="firstNum" value="${firstNum}"><br>
            Second: <input type="text" name="secondNum" value="${secondNum}"><br>
            <input type="submit" name="opperand" value="%"><input type="submit" name="opperand" value="*">
            <input type="submit" name="opperand" value="+"><input type="submit" name="opperand" value="-">
        </form>
            <p>Result: ${message} <br>
            <a href="age">Age Calculator</a>
    </body>
</html>


            