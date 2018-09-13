<%-- 
    Document   : agecalculator
    Created on : Sep 13, 2018, 12:06:06 PM
    Author     : 754632
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            Enter your age: <input type="text" name="ageValue" ><br>
            <input type="submit" value="Age next birthday">
        </form>
        <div>
            ${message}
        </div>
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
