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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Dhruv
 */
public class StudentYear extends HttpServlet {
Connection conn;
PreparedStatement pst;
ResultSet rs;

//Connection servlet to mysql

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
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String year = request.getParameter("year");
        HttpSession session = request.getSession(false);
        String bid = session.getAttribute("bid").toString();
        String sql = "select * from students s,student_login st where s.sid=st.id and s.year='"+year+"' and s.branch='"+bid+"'";
        
        try{conn = connectDB();
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        while(rs.next()){
           out.println("<tr>");
           out.println("<td>"+rs.getString("st.fname")+" "+rs.getString("st.mname")+" "+rs.getString("st.lname")+"</td>");
           out.println("<td>"+rs.getString("st.mobile")+"</td>");
           String sql2 = "select * from master_branch where id='"+rs.getString("branch")+"'";
           pst = conn.prepareStatement(sql2);
           ResultSet rs1 = pst.executeQuery();
           while(rs1.next()){
              out.println("<td>"+rs1.getString("branch_name")+"</td>");
           }
           out.println("</tr>");
        }
        }catch(SQLException e){
           System.out.print(e);
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
