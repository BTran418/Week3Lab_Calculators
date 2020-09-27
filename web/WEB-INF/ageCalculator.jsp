<%-- 
    Document   : agecalculator
    Created on : Sep 23, 2020, 7:51:43 PM
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
        <h1>Age Calculator</h1>
        <form action="age" method="post">
            Current Age: <input type="text" name="age" value="${age}"><br>
            <input type="submit" value="Submit"><br>
        </form>
            <p>${message}<br>
            <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
