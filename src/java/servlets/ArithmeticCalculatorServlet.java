/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 754632
 */

public class ArithmeticCalculatorServlet extends HttpServlet 
{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        request.setAttribute("message", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String math = request.getParameter("button");
        String regex = "[0-9]+";
        int result = 0;
        
        if( first == null || second == null ||
            first.equals("") || second.equals("") ||
            !first.matches(regex) || !second.matches(regex))
        {
            request.setAttribute("message", "invalid");
            request.setAttribute("fnumber", first);
            request.setAttribute("snumber", second);
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        }
        else
        {
            int numberOne = Integer.parseInt(first);
            int numberTwo = Integer.parseInt(second);
        
            switch(math)
            {
                case "add":                
                    result = numberOne + numberTwo;
                    break;
                
                case "substract":               
                    result = numberOne - numberTwo;             
                    break;
                
                case "multiply":                
                    result = numberOne * numberTwo;               
                    break;
                
                case "modulus":               
                    result = numberOne % numberTwo;              
                    break;    
                    
                default: 
                    break;
                
            }
        }
         request.setAttribute("message", String.valueOf(result));
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
}
