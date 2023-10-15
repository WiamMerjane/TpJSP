/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.controlleur;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ma.projet.entites.Client;
import ma.projet.services.ServiceClient;
import ma.projet.services.sendMail;
import ma.projet.util.Util;

/**
 *
 * @author Cloud
 */
@WebServlet(name = "Inscription", urlPatterns = {"/Inscription"})
public class Inscription extends HttpServlet {
    private Object esponse;

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String email = request.getParameter("email");
        String date = request.getParameter("date").replace("-", "/");
        String password = Util.md5(request.getParameter("password"));
       
        ServiceClient cs = new ServiceClient();
        cs.create(new Client(nom, prenom, new Date(date), email, password,0,null));
      
        response.sendRedirect("Authentification.jsp?email="+email);
        
//        RequestDispatcher dispatcher = null;
//        
//        if (this.paramLogin.equalsIgnoreCase(email) && this.paramPassword.equalsIgnoreCase(password)){
//            dispatcher = request.getRequestDispatcher("/Welcome.jsp");
//            
//         }else{
//             dispatcher = request.getRequestDispatcher("/Authentification.jsp");
//
//        }
//        dispatcher.forward(request , response);
        
        
        

        
        
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
