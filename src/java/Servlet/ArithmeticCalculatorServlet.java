/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author BTran
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
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
//            String firstNum = request.getParameter("firstNum");
//            String secondNum = request.getParameter("firstNum");
//            request.setAttribute("firstNum", firstNum);
//            request.setAttribute("secondNum", secondNum);
        try {
            int firstNum = Integer.parseInt(request.getParameter("firstNum"));
            int secondNum = Integer.parseInt(request.getParameter("secondNum"));
            String[] operations = request.getParameterValues("opperand");
            request.setAttribute("firstNum", firstNum);
            request.setAttribute("secondNum", secondNum);
            for (int n = 0; n < operations.length; n++){
                if (operations[n].equals("%")){
                    request.setAttribute("message", (firstNum%secondNum));
                }
                else if (operations[n].equals("*")){
                    request.setAttribute("message", (firstNum*secondNum));
                }
                else if (operations[n].equals("+")){
                    request.setAttribute("message", (firstNum+secondNum));
                }
                else if (operations[n].equals("-")){
                    request.setAttribute("message", (firstNum-secondNum));
                }
            }
                       
        } catch (NumberFormatException e){
            request.setAttribute("message", "Please try again. Input invalid.");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
            return;
        }
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }

}
