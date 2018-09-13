/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 754632
 */

public class ArithmeticCalculatorServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        
        int numberOne = Integer.parseInt(first);
        int numberTwo = Integer.parseInt(second);
        int result;
        
        if(request.getParameter("add") != null ){
            result = numberOne + numberTwo;
        }
        
        else if(request.getParameter("substract") != null ){
            result = numberOne - numberTwo;
        }
        
        else if(request.getParameter("multiply") != null ){
            result = numberOne - numberTwo;
        }
        
        else if(request.getParameter("percentage") != null ){
            result = numberOne % numberTwo;
        }
    }
 
}
