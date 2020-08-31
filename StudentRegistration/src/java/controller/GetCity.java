/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

//import com.sun.faces.facelets.tag.jstl.core.CatchHandler;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 *
 * @author anu5
 */
public class GetCity extends HttpServlet {
Connection connect;
PreparedStatement pst;
ResultSet rs;

public Connection connectDB(){
    try{
       Class.forName("com.mysql.jdbc.Driver");
       connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/college_registration","root","root123");
      return connect;
    }
    catch(Exception e){
        System.out.println("There is problem in Database Connection");
    }
    return connect;
  }
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
        response.setContentType("text/html;charset=UTF-8");
        
        String state = request.getParameter("state");
        
        String sql1 = "select id from master_state where state='"+state+"'";
        try {
            connect = connectDB();
            pst = connect.prepareStatement(sql1);
            ResultSet rs1 = pst.executeQuery();
            while (rs1.next()) {
                String sql = "select * from master_city where st_id = '"+rs1.getString("id")+"'";
                pst = connect.prepareStatement(sql);
                rs = pst.executeQuery();
                try (PrintWriter out = response.getWriter()) {
                while (rs.next()) {
                    /* TODO output your page here. You may use following sample code. */
                    out.println("<option value='"+rs.getString("city")+"'>" + rs.getString("city") + "</option>");
                }
                }
            }   
        } catch (Exception e) {

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
