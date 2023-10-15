/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.controlleur;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import ma.projet.entites.Client;
import ma.projet.services.ServiceClient;
import ma.projet.util.Util;

/**
 *
 * @author YOUNSE
 */
@WebServlet(name = "updatemotdepasse", urlPatterns = {"/updatemotdepasse"})
public class updatemotdepasse extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      String password=request.getParameter("password");
      String passwordcnf=request.getParameter("passwordcnf");
      ServiceClient cl = new ServiceClient();
      if(password.equals(passwordcnf)){
        HttpSession session = request.getSession();
        Client c = (Client) session.getAttribute("client");
        c.setPassword(Util.md5(password));
        cl.update(c);
         response.sendRedirect("Authentification.jsp?email="+c.getEmail());
      }
      else{
      response.sendRedirect("updatemotdepasse.jsp?email=mot de passe incorrect");
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
