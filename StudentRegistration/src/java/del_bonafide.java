/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lakhan Mnae
 */
public class del_bonafide extends HttpServlet {

  
            Connection conn;
PreparedStatement pst;
ResultSet rs;
    
public Connection connectDB(){
    try{
       Class.forName("com.mysql.jdbc.Driver");
       conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college_registration","root","root123");
      
      System.out.println("Database Connected");
      
      return conn;
    }
    catch(Exception e){
        System.out.println("There is problem in Database Connection");
    }
    return conn;
  }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        PrintWriter out1= response.getWriter();
        String id2 = request.getParameter("id2");
        
        String sql2 = "delete from bonafide_data where sid = '"+id2+"'";
        
        try {
                conn = connectDB();
                pst = conn.prepareStatement(sql2);
                pst.executeUpdate();
              // response.sendRedirect("/StudentRegistration/jsps/add_tg.jsp");
              
        } catch (Exception e) {
            out1.print(e);
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
