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
public class StudentBranch extends HttpServlet {
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
        String branch = request.getParameter("branch");
        String sql3 = "SELECT sl.fname,sl.mname,sl.lname,sl.branch,cd.sid,cd.state,cd.city,cd.hometown,"
             + "cd.pin,g.sid,g.fname,g.mname,g.lname,g.mobile,g.relation,g.state,g.city,g.hometown,g.pin,"
             + "pd.sid,pd.state,pd.city,pd.hometown,pd.pin,s.category,s.year,s.blood,s.DOB,s.bplace,s.nationality,"
             + "s.caste,s.pan_no,s.adhar_no,s.status,s.admission,s.sid,sl.gender,sl.email,sl.mobile,sl.id,p.sid,p.fname,"
             + "p.mname,p.lname,p.mobile,p.mother_name,p.education ,p.occupation,p.designation,s.religion,p.email FROM student_login sl,"
             + "c_address cd,guardian g,p_address pd,students s,parent p where s.status='2' and s.sid = sl.id and cd.sid = sl.id "
             + "and g.sid = sl.id and pd.sid = sl.id and s.sid = sl.id and p.sid = sl.id and sl.branch='"+branch+"'";
        try {

            conn = connectDB();
            pst = conn.prepareStatement(sql3);
            rs = pst.executeQuery();

            while (rs.next()) {
                String id = rs.getString("id");
                out.print("<tr>");
                out.print("<td><a href='summary1.jsp?id=" + id + "'>" + rs.getString("sl.fname") + " " + rs.getString("sl.mname") + " " + rs.getString("sl.lname") + "</a></td>");
                out.print("<td>"+rs.getString("sl.mobile")+"</td>");
                out.print("<td>"+rs.getString("s.nationality")+"</td>");
                out.print("<td>"+rs.getString("s.DOB")+"</td>");
                out.print("<td>"+rs.getString("s.category")+"</td>");
                out.print("<td>"+rs.getString("s.year")+"</td>");
                out.print("<td>"+rs.getString("s.blood")+"</td>");
                out.print("<td>"+rs.getString("s.caste")+"</td>");
                out.print("<td>"+rs.getString("s.religion")+"</td>");
                out.print("<td>"+rs.getString("sl.gender")+"</td>");
                out.print("<td>"+rs.getString("s.bplace")+"</td>");
                out.print("<td>"+rs.getString("sl.email")+"</td>");
                out.print("<td>"+rs.getString("s.admission")+"</td>");
                out.print("<td>"+rs.getString("cd.hometown")+","+rs.getString("cd.city")+","+rs.getString("cd.state")+",Pin:"+rs.getString("cd.pin")+"</td>");
                out.print("<td>"+rs.getString("pd.hometown")+","+rs.getString("pd.city")+","+rs.getString("pd.state")+",Pin:"+rs.getString("pd.pin")+"</td>");
                out.print("<td>"+rs.getString("s.adhar_no")+"</td>");
                out.print("<td>"+rs.getString("s.pan_no")+"</td>");
                out.print("<td>" + rs.getString("sl.fname") + " " + rs.getString("sl.mname") + " " + rs.getString("sl.lname") + "</td>");
                out.print("<td>"+rs.getString("p.mother_name")+"</td>");
                out.print("<td>"+rs.getString("p.mobile")+"</td>");
                out.print("<td>"+rs.getString("p.email")+"</td>");
                out.print("<td>"+rs.getString("p.education")+"</td>");
                out.print("<td>"+rs.getString("p.occupation")+"</td>");
                out.print("<td>"+rs.getString("p.designation")+"</td>");
                out.print("<td>" + rs.getString("g.fname") + " " + rs.getString("g.mname") + " " + rs.getString("g.lname") + "</td>");
                out.print("<td>"+rs.getString("g.mobile")+"</td>");
                out.print("<td>"+rs.getString("g.relation")+"</td>");
                out.print("<td>"+rs.getString("g.hometown")+","+rs.getString("g.city")+","+rs.getString("g.state")+",Pin:"+rs.getString("g.pin")+"</td>"); 
                out.print("</tr>");
            }
        } catch (Exception e) {
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
