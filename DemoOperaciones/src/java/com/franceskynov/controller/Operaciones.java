package com.franceskynov.controller;

import com.franceskynov.model.Datos;
import com.franceskynov.model.Operadores;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Frantcisco
 */
@WebServlet(name = "Operaciones", urlPatterns = {"/operaciones"})
public class Operaciones extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try {

            Datos d = new Datos();
            d.setNumA(Double.parseDouble(request.getParameter("txtNumA")));
            d.setNumB(Double.parseDouble(request.getParameter("txtNumB")));
            d.setNumC(Double.parseDouble(request.getParameter("txtNumC")));

            int op = Integer.parseInt(request.getParameter("sltOperacion"));
            response.setContentType("text/html");
            
            operar(d, op);
            
            request.setAttribute("todo", Double.toString(d.getResultado()));
            request.setAttribute("x1", Double.toString(d.getX1()));
            request.setAttribute("x2", Double.toString(d.getX2()));

            if (d.getX1() == 0 && d.getX2() == 0){

                request.setAttribute("operacion", "cuadratica");

            }else{

                request.setAttribute("operacion", "comunes");

            }

            request.getRequestDispatcher("/resultado.jsp").forward(request, response);

        } catch (Exception e) {

            RequestDispatcher RequetsDispatcherObj = request.getRequestDispatcher("/index.jsp");
            RequetsDispatcherObj.forward(request, response);
        }
    }

    /**
     *
     * @param d
     * @param op
     */
    public void operar(Datos d, int op) {

        Operadores oper = new Operadores();
        if (op > -1) {

            switch (op) {
                
                case 0:
                    oper.sumar(d);
                    break;
                    
                case 1:
                    oper.restar(d);
                    break;
                    
                case 2:
                    oper.multiplicar(d);
                    break;
                    
                case 3:
                    oper.dividir(d);
                    break;
                    
                case 4:
                    oper.exponenciacion(d);
                    break;
                    
                case 5:
                    oper.radicacion(d);
                    break;
                    
                case 6:
                    oper.cuadratica(d);
                    break;
                    
                default:
                    break;
            }
            
        } else {
            
            
        }
    }

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
        // processRequest(request, response);

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
        processRequest(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
