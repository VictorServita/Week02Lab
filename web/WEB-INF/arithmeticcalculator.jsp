<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 13, 2018, 12:55:54 PM
    Author     : Victor Servita
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
        
        <form method="post" action="arithmetic">
            First: <input type="text" name="first" value="${fnumber}" ><br>
            Second: <input type="text" name="second" value="${snumber}"><br>
            
            <input type="submit" name="button" value="add">
            <input type="submit" name="button" value="substract">
            <input type="submit" name="button" value="multiply">
            <input type="submit" name="button" value="modulus">
            
        </form>
        <div>
          Result: ${message}
        </div>
        <br>
        <a href="age">Age Calculator</a>
    </body>
</html>
