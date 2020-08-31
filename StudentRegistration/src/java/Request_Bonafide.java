/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lakhan Mnae
 */
@WebServlet(urlPatterns = {"/Request_Bonafide"})
public class Request_Bonafide extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
//            System.out.println("You are in Request_Boanafide");
            HttpSession session = request.getSession(false);
            String c_year_type = request.getParameter("c_year_type");
            String admission_year_type = request.getParameter("admission_year_type");
            String A_year = request.getParameter("A_year");
            String purpose = request.getParameter("purpose");
            String id = request.getParameter("id");
//            System.out.println("id is "+id);
            if(c_year_type.equals("") || admission_year_type.equals("") || A_year.equals("") || purpose.equals("")){
                out.print("Input field is empty");
            }else{
            String sql_bonafide = "insert into bonafide_data(sid,c_year_type,admission_year_type,A_year,purpose,status) values('"+id+"','"+c_year_type+"','"+admission_year_type+"','"+A_year+"','"+purpose+"',1)";
//             String sql_name = "select * from student_login where id ='"+id+"'"; 
            try {
            conn = connectDB();
            pst = conn.prepareStatement(sql_bonafide);
                 pst.executeUpdate();
//            pst = conn.prepareStatement(sql_name);
//            rs = pst.executeQuery();
//            if(rs.next()){
//            session.setAttribute("fname", rs.getString("fname"));
//            session.setAttribute("lname", rs.getString("lname"));
//           }
            session.setAttribute("st_id", id);
           response.sendRedirect("student_home.jsp");
           
              
        } catch (Exception e) {
           System.out.println(e);
        }
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
