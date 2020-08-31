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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lakhan Mnae
 */
public class CheckUsername extends HttpServlet {
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
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        String uname = request.getParameter("uname");
        PrintWriter out = response.getWriter();
        if(uname.isEmpty()){
           out.print("<p>Please Enter Username..</p>");
        }
        else{
           try {
            
            conn = connectDB();
            pst = conn.prepareStatement("select * from student_login where username = '"+uname+"'");
            rs = pst.executeQuery();
            if(rs.next()){
                out.println("<p class='text-danger'>Username already exist... You cannot use this.</p>");
            }
            else{
                out.println("<p class='text-success'>Username available for you... You can use it</p>");
            }
        }
        catch(SQLException e){
        
        }
      finally{
    rs.close();
    conn.close();
    }
    
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
            throws ServletException, IOException{
    try {
        processRequest(request, response);
    } catch (SQLException ex) {
        Logger.getLogger(CheckUsername.class.getName()).log(Level.SEVERE, null, ex);
    }
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
    try {
        processRequest(request, response);
    } catch (SQLException ex) {
        Logger.getLogger(CheckUsername.class.getName()).log(Level.SEVERE, null, ex);
    }
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
