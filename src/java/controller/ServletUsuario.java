/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.BeanUsuario;

/**
 *
 * @author PERSONAL
 */
@WebServlet(name = "ServletUsuario", urlPatterns = {"/Usuario"})
public class ServletUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String accion=request.getParameter("accion");
         
        
        if(accion==null){
           request.getSession().setAttribute("msg", "Acceso Incorrecto");
        }else if(accion.compareTo("ACCESO")==0){
            String nick=request.getParameter("usuario");
            String password=request.getParameter("contrasenia");
            HttpSession session=request.getSession(true);
            
            System.out.println(nick+password);
            BeanUsuario b=new BeanUsuario();
            b.setNick(nick);
            b.setPassword(password);
            
            String nombre=DaoUsuario.getNombre(b);
            System.out.println(nombre);
            if(nombre==null){
                request.getSession().setAttribute("msg", "Usuario no existe");
            }else{
                request.setAttribute(nombre, b.getNombre());
                request.getSession().setAttribute("msg", "Bienvenido" + " " + nombre);
            }
            
           
            response.sendRedirect("mensaje.jsp");
            
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
        processRequest(request, response);
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
