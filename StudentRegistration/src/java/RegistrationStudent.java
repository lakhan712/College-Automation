/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

/**
 *
 * @author anu5
 */
public class RegistrationStudent extends HttpServlet {
    
    public Connection connectDB(){
        Connection connect = null;
        try{
       Class.forName("com.mysql.jdbc.Driver");
      connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/college_registration","root","root123");
      return connect;
     }
     catch(ClassNotFoundException | SQLException e){
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
        //Personal detail start here
            HttpSession session = request.getSession(false);
            String id = (String) session.getAttribute("st_id");
            String DOB = request.getParameter("DOB");
            String nationality = request.getParameter("nationality").toUpperCase();
            String category = request.getParameter("category").toUpperCase();
            String blood_group = request.getParameter("blood_group");
            String caste = request.getParameter("caste").toUpperCase();
            String religion = request.getParameter("religion").toUpperCase();
            String stu_gender = request.getParameter("stu_gender").toUpperCase();
            String birth_place = request.getParameter("birth_place").toUpperCase();
            String branch = request.getParameter("branch");
            String year = request.getParameter("year");
        //Personal detail end here
        
        //contact details start here
             //Present Adress
            String p_state = request.getParameter("p_state").toUpperCase();
            String p_city = request.getParameter("p_city").toUpperCase();
            String p_pin = request.getParameter("p_pin");
            String p_hometown = request.getParameter("p_hometown").toUpperCase();
            
            //Permnent Adress
            String per_state = request.getParameter("per_state").toUpperCase();
            String per_city = request.getParameter("per_city").toUpperCase();
            String per_pin = request.getParameter("per_pin");
            String per_hometown = request.getParameter("per_hometown").toUpperCase();
            
            String adhaar = request.getParameter("adhaar");
            String pan = request.getParameter("pan");
        //contact details ends here
        
        //Parents details start here
             String p_fname = request.getParameter("p_fname").toUpperCase();
             String p_mname = request.getParameter("p_mname").toUpperCase();
             String p_sname = request.getParameter("p_sname").toUpperCase();
             String mother_name = request.getParameter("mother_name").toUpperCase();
             String p_mobile = request.getParameter("p_mobile");
             String p_email = request.getParameter("p_email");
             String p_edu = request.getParameter("p_edu").toUpperCase();
             String p_occu = request.getParameter("p_occu").toUpperCase();
             String p_desig = request.getParameter("p_desig").toUpperCase();
        //Parents details ends here
        
        //Gardian Detail starts here
             String g_fname = request.getParameter("g_fname").toUpperCase();
             String g_mname = request.getParameter("g_mname").toUpperCase();
             String g_lname = request.getParameter("g_lname").toUpperCase();
             String gmobile = request.getParameter("gmobile");
             String relation = request.getParameter("relation").toUpperCase();
             String g_state = request.getParameter("g_state").toUpperCase();
             String g_city = request.getParameter("g_city").toUpperCase();
             String g_pin = request.getParameter("g_pin");
             String g_hometown = request.getParameter("g_hometown").toUpperCase();
        //Gardian Detail ends here
        //Academic Detail start here
             String admission = request.getParameter("admission");
             //FE
             String fe_exam = request.getParameter("fe_exam");
             String fe_year = request.getParameter("fe_year");
             String fe_marks_obtained = request.getParameter("fe_marks_obtained");
             String fe_marks_total = request.getParameter("fe_marks_total");
             String fe_percentage = request.getParameter("fe_percentage");
             
             //SE
             String se_exam = request.getParameter("se_exam");
             String se_year = request.getParameter("se_year");
             String se_marks_obtained = request.getParameter("se_marks_obtained");
             String se_marks_total = request.getParameter("se_marks_total");
             String se_percentage = request.getParameter("se_percentage");
             
             //TE
             String te_exam = request.getParameter("te_exam");
             String te_year = request.getParameter("te_year");
             String te_marks_obtained = request.getParameter("te_marks_obtained");
             String te_marks_total = request.getParameter("te_marks_total");
             String te_percentage = request.getParameter("te_percentage");
        //Academic Detail ends here 

        //Validation
        if(DOB.isEmpty() || nationality.isEmpty() || category.isEmpty() || blood_group.isEmpty() || caste.isEmpty() || religion.isEmpty() || stu_gender.isEmpty() || birth_place .isEmpty() ||
                p_state.isEmpty() || p_city .isEmpty() || p_pin .isEmpty() || p_hometown .isEmpty() || per_state .isEmpty() || per_city.isEmpty() || per_pin.isEmpty() || per_hometown .isEmpty() ||
                p_fname.isEmpty() || p_mname.isEmpty() || p_sname.isEmpty() || mother_name.isEmpty() || p_mobile.isEmpty() || g_fname.isEmpty() || g_mname.isEmpty() || g_lname .isEmpty() ||
                gmobile.isEmpty() || relation.isEmpty() || g_state.isEmpty() || g_city.isEmpty() || g_pin.isEmpty() || g_hometown.isEmpty()){
            try{
                PrintWriter out = response.getWriter();
                out.println("<p class='text-danger'>You have not filled all fields.. Please Fill all required * details</p>");
                RequestDispatcher rd = request.getRequestDispatcher("/student_home.jsp");
                rd.include(request, response);
                //response.sendRedirect("/StudentRegistration/student_home.jsp?fail=Form not submited..");
            }catch(IOException e){
            }        
        }
        else{
            String sql1 = "insert into academic_record(sid,exam,year,marks_ob,marks_total,percentage) values('"+id+"','"+fe_exam+"','"+fe_year+"','"+fe_marks_obtained+"','"+fe_marks_total+"','"+fe_percentage+"')";
            String sql2 = "insert into academic_record(sid,exam,year,marks_ob,marks_total,percentage) values('"+id+"','"+se_exam+"','"+se_year+"','"+se_marks_obtained+"','"+se_marks_total+"','"+se_percentage+"')";
            String sql3 = "insert into academic_record(sid,exam,year,marks_ob,marks_total,percentage) values('"+id+"','"+te_exam+"','"+se_year+"','"+te_marks_obtained+"','"+te_marks_total+"','"+te_percentage+"')";
            //Current Address data insert
            String sql4 = "insert into c_address(sid,state,city,hometown,pin) values('"+id+"','"+p_state+"','"+p_city+"','"+p_hometown+"','"+p_pin+"')";
            
            //Permnent Address
            String sql5 = "insert into p_address(sid,state,city,hometown,pin) values('"+id+"','"+per_state+"','"+per_city+"','"+per_hometown+"','"+per_pin+"')";
            
            //Guardian Address
            String sql6 = "insert into guardian(sid,fname,mname,lname,mobile,relation,state,city,hometown,pin) values('"+id+"','"+g_fname+"','"+g_mname+"','"+g_lname+"','"+gmobile+"','"+relation+"','"+g_state+"','"+g_city+"','"+g_hometown+"','"+g_pin+"')";
            
            //Parent Details
            String sql7 = "insert into parent(sid,fname,mname,lname,mobile,email,mother_name,education,occupation,designation) values('"+id+"','"+p_fname+"','"+p_mname+"','"+p_sname+"','"+p_mobile+"','"+p_email+"','"+mother_name+"','"+p_edu+"','"+p_occu+"','"+p_desig+"')";
            
            //Personal Details
            String sql8 = "insert into students(sid,category,branch,year,blood,DOB,bplace,nationality,religion,caste,pan_no,adhar_no,admission,status) values('"+id+"','"+category+"','"+branch+"','"+year+"','"+blood_group+"','"+DOB+"','"+birth_place+"','"+nationality+"','"+religion+"','"+caste+"','"+pan+"','"+adhaar+"','"+admission+"',0)";
            try{
                Connection connect = connectDB();
                PreparedStatement pst = connect.prepareStatement(sql1);
                 pst.executeUpdate();
                 PreparedStatement pst1 = connect.prepareStatement(sql2);
                 pst1.executeUpdate();
                 PreparedStatement pst2 = connect.prepareStatement(sql3);
                 pst2.executeUpdate();
                PreparedStatement pst3 = connect.prepareStatement(sql4);
                 pst3.executeUpdate();
                 PreparedStatement pst4 = connect.prepareStatement(sql5);
                 pst4.executeUpdate();
                 PreparedStatement pst5 = connect.prepareStatement(sql6);
                 pst5.executeUpdate();
                 PreparedStatement pst6 = connect.prepareStatement(sql7);
                 pst6.executeUpdate();
                 PreparedStatement pst7 = connect.prepareStatement(sql8);
                 pst7.executeUpdate();
                 response.setContentType("text/html;charset=UTF-8");
                 String path = request.getServletContext().getContextPath();
                 try (PrintWriter out = response.getWriter()) {
                     out.println("<center>");
                     out.println("<p>Form has been submitted successfully..</p>");
                     out.println("<p>Wait till <b>TG</b> aproval</p>");
                     out.println("<p>After aproval you can download form from download section</p>");
                     out.println("<p><a href='"+path+"/student_home.jsp'>Click here</a> to go home page</p>");
                     out.println("<center>");
                 }
             }
             catch(SQLException e){
                 System.out.println("There is problem:"+e);
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
