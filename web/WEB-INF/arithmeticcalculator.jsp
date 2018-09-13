<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 13, 2018, 12:55:54 PM
    Author     : 754632
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
        <form><form method="post" action="calculator">
            First: <input type="text" name="first" ><br>
            Second: <input type="text" name="second" ><br>
            
            <input type="submit" name="add" value="+">
            <input type="submit" name="substract" value="-">
            <input type="submit" name="multiply" value="*">
            <input type="submit" name="percentage" value="%">
            
        </form>
        <div>
            result: ${message}
        </div>
        <a href="age">Age Calculator</a>
    </body>
</html>
