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
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

/**
 *
 * @author Lakhan Mnae
 */
public class GenerateMarksheet extends HttpServlet {

  
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
        
        HttpSession session = request.getSession(false);
        String Tid = session.getAttribute("tg_id").toString();
        
            /* TODO output your page here. You may use following sample code. */
            PrintWriter out = response.getWriter();
            JasperReport report;
            JasperPrint print;
            
            String question1 = "";
            int q1 = 0;
            String question2 = "";
            int q2 = 0;
            String question3 = "";
            int q3 = 0;
            String question4 = "";
            int q4 = 0;
            
            int obt1 =0;
            int obt2 = 0;
            int obt3 = 0;
            int obt4 = 0;
            
            int To1 = 0;
            int To2 = 0;
            int To3 = 0;
            int To4 = 0;
            
            int TotalObtain = 0;
            int Total = 0;
            double percentage = 0;
            String teacher=null;
            
            
          
            String SName = request.getParameter("student name");
            String Roll = request.getParameter("roll");
            String Subject = request.getParameter("subject");
            //question 1
            String a1 = request.getParameter("a1");
            String  b1 = request.getParameter("b1");
            String c1 = request.getParameter("c1");
            String t1 = request.getParameter("t1");
            
            //question 2
            String a2 = request.getParameter("a2");
            String b2 = request.getParameter("b2");
            String c2 = request.getParameter("c2");
            String t2 = request.getParameter("t2");
            
            //question 3
            String a3 = request.getParameter("a3");
            String b3 = request.getParameter("b3");
            String c3 = request.getParameter("c3");
            String t3 = request.getParameter("t3");
            
            //question 4
            String a4 = request.getParameter("a4");
            String b4 = request.getParameter("b4");
            String c4 = request.getParameter("c4");
            String t4 = request.getParameter("t4");
            
            //question 5
            String a5 = request.getParameter("a5");
            String b5 = request.getParameter("b5");
            String c5 = request.getParameter("c5");
            String t5 = request.getParameter("t5");
            
            //question 6
            String a6 = request.getParameter("a6");
            String b6 = request.getParameter("b6");
            String c6 = request.getParameter("c6");
            String t6 = request.getParameter("t6");
            
            //question 7
            String a7 = request.getParameter("a7");
            String b7 = request.getParameter("b7");
            String c7 = request.getParameter("c7");
            String t7 = request.getParameter("t7");
            
            //question 8
            String a8 = request.getParameter("a8");
            String b8 = request.getParameter("b8");
            String c8 = request.getParameter("c8");
            String t8 = request.getParameter("t8");
            
    
            //Take out tg name...here
            
            String sql = "select * from  master_tg where id ="+Tid;
            try{
                conn = connectDB();
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                while(rs.next()){
                    teacher = rs.getString("name");
                }
            }catch(Exception e){
           System.out.print(e);
        }
            
            //End
            
            
            
            
            // frustrating begins
            int ai1=0, bi1=0, ci1=0, ti1=0;
            int ai2=0,bi2=0,ci2=0,ti2=0;
            int ai3=0,bi3=0,ci3=0,ti3=0;
            int ai4=0,bi4=0,ci4=0,ti4=0;
            int ai5=0,bi5=0,ci5=0,ti5=0;
            int ai6=0,bi6=0,ci6=0,ti6=0;
            int ai7=0,bi7=0,ci7=0,ti7=0;
            int ai8=0,bi8=0,ci8=0,ti8=0;
            
            
                //q1
            if(a1.isEmpty()){
                 ai1 = 0;
            }else{
                 
                 ai1 = Integer.parseInt(a1);
            }
            
            if(b1.isEmpty()){
                 bi1 = 0;
            }else{
                 
                 bi1 = Integer.parseInt(b1);
            }
            
            if(c1.isEmpty()){
                 ci1 = 0;
            }else{
                 
                 ci1 = Integer.parseInt(c1);
            }
            
            if(t1.isEmpty()){
                 ti1 = 0;
            }else{
                 
                 ti1 = Integer.parseInt(t1);
            }
            
                 //q2
            if(a2.isEmpty()){
                 ai2 = 0;
            }else{
                 
                 ai2 = Integer.parseInt(a2);
            }
            
            if(b2.isEmpty()){
                 bi2 = 0;
            }else{
                 bi2 = Integer.parseInt(b2);
            }
            
            if(c2.isEmpty()){
                 ci2 = 0;
            }else{
                 ci2 = Integer.parseInt(c2);
            }
            
            if(t2.isEmpty()){
                 ti2 = 0;
            }else{
                 ti2 = Integer.parseInt(t2);
            }
            
            
                 //q3
            if(a3.isEmpty()){
                  ai3 = 0;
            }else{
                
                 ai3 = Integer.parseInt(a3);
            }
            
            if(b3.isEmpty()){
                 bi3 = 0;
            }else{
                 bi3 = Integer.parseInt(b3);
            }
            
            if(c3.isEmpty()){
                 ci3 = 0;
            }else{
                 ci3 = Integer.parseInt(c3);
            }
            
            if(t3.isEmpty()){
                 ti3 = 0;
            }else{
                 ti3 = Integer.parseInt(t3);
            }
            
                 //q4
            if(a4.isEmpty()){
                 ai4 = 0;
            }else{
                 ai4 = Integer.parseInt(a4);
            }
            
            if(b4.isEmpty()){
                 bi4 = 0;
            }else{
                 
                 bi4 = Integer.parseInt(b4);
            }
            
            if(c4.isEmpty()){
                 ci4 = 0;
            }else{
                 
                 ci4 = Integer.parseInt(c4);
            }
            
            if(t4.isEmpty()){
                 ti4 = 0;
            }else{
                 
                 ti4 = Integer.parseInt(t4);
            }
            
                 //q5
            if(a5.isEmpty()){
                 ai5 = 0;
            }else{
                 
                 ai5 = Integer.parseInt(a5);
            }
            
            if(b5.isEmpty()){
                 bi5 = 0;
            }else{
                 
                 bi5 = Integer.parseInt(b5);
            }
            
            if(c5.isEmpty()){
                 ci5 = 0;
            }else{
                 
                 ci5 = Integer.parseInt(c5);
            }
            
            if(t5.isEmpty()){
                 ti5 = 0;
            }else{
                 
                 ti5 = Integer.parseInt(t5);
            }
            
                 //q6
            if(a6.isEmpty()){
                 ai6 = 0;
            }else{
                 
                 ai6 = Integer.parseInt(a6);
            }
            
            if(b6.isEmpty()){
                 bi6 = 0;
            }else{
                 
                 bi6 = Integer.parseInt(b6);
            }
            
            if(c6.isEmpty()){
                 ci6 = 0;
            }else{
                 
                 ci6 = Integer.parseInt(c6);
            }
            
            if(t6.isEmpty()){
                 ti6 = 0;
            }else{
                 
                 ti6 = Integer.parseInt(t6);
            }
            
                 //q7
            if(a7.isEmpty()){
                 ai7 = 0;
            }else{
                 
                 ai7 = Integer.parseInt(a7);
            }
            
            if(b7.isEmpty()){
                 bi7 = 0;
            }else{
                 
                 bi7 = Integer.parseInt(b7);
            }
            
            if(c7.isEmpty()){
                 ci7 = 0;
            }else{
                 
                 ci7 = Integer.parseInt(c7);
            }
            
            if(t7.isEmpty()){
                 ti7 = 0;
            }else{
                 
                 ti7 = Integer.parseInt(t7);
            }
            
                 //q8
            if(a8.isEmpty()){
                 ai8 = 0;
            }else{
                 
                 ai8 = Integer.parseInt(a8);
            }
            
            if(b8.isEmpty()){
                bi8 = 0;
            }else{
                 bi8 = Integer.parseInt(b8);
            }
            
            if(c8.isEmpty()){
                 ci8 = 0;
            }else{
                 
                 ci8 = Integer.parseInt(c8);
            }
            
            if(t8.isEmpty()){
                 ti8 = 0;
            }else{
                 
                 ti8 = Integer.parseInt(t8);
            }
            
          
            
            // Frustrating end... :)
            
            
            

          // check question 1 or 2
            if(ai1 == 0 || bi1 == 0 || ci1 == 0 || ti1 == 0){
                question1 = "question 2";
                q1 = 2;
                obt1 = (ai2 + bi2 + ci2);
                To1 = ti2;
            }else{
                question1 = "question 1";
                q1 = 1;
                 obt1 = (ai1 + bi1 + ci1);
                 To1 = ti1;
            }
            

            
            // check question 3 or 4
            if(ai3 == 0 || bi3 == 0 || ci3 == 0 || ti3 == 0){
                question2 = "question 4";
                q2 = 4;
                obt2 = (ai4+ bi4+ ci4);
                To2 = ti4;
            }else{
                question2 = "question 3";
                q2 = 3;
                obt2 = (ai3 + bi3 + ci3);
                To2 = ti3;
            }

            
            // check question 5 or 6
            if(ai5 == 0|| bi5 == 0 || ci5 == 0 || ti5 == 0){
                question3 = "question 6";
                q3 = 6;
                obt3 = (ai6 + bi6 + ci6);
                To3 = ti6;
            }else{
                question3 = "question 5";
                q3 = 5;
                obt3 = (ai5 + bi5 + ci5);
                To3 = ti5;
            }
            
            
            // check question 7 or 8
            if(ai7 == 0 || bi7 == 0 || ci7 == 0 || ti7 == 0){
                question4 = "question 8";
                q4 = 8;
                obt4 = (ai8 + bi8 + ci8);
                To4 = ti8;
            }else{
                question4 = "question 7";
                q4 = 7;
                obt4 = (ai7 + bi7 + ci7);
                To4 = ti7;
            }
            
            TotalObtain = (obt1 + obt2 + obt3 + obt4);
            Total = (To1 + To2 + To3 + To4);
            percentage = (double)((TotalObtain*100)/ Total);
//            out.println("Obtain: "+TotalObtain);
//            out.println("Total: "+Total);
//            out.println("percentage: "+percentage);
            
            
            
            // PDF Generate
            
            try{
            HashMap jasperParameter = new HashMap<String,Object>();
            //putting values
            jasperParameter.put("Student Name", SName);
            jasperParameter.put("Roll Number", Roll);
            jasperParameter.put("Subject Name", Subject);
            
            jasperParameter.put("Q1or2", question1);
            jasperParameter.put("Q3or4", question2);
            jasperParameter.put("Q5or6", question3);
            jasperParameter.put("Q7or8", question4);
            
            jasperParameter.put("O1",Integer.toString(obt1));
            jasperParameter.put("O2", Integer.toString(obt2));
            jasperParameter.put("O3", Integer.toString(obt3));
            jasperParameter.put("O4", Integer.toString(obt4));
            
            jasperParameter.put("T1", Integer.toString(To1));
            jasperParameter.put("T2", Integer.toString(To2));
            jasperParameter.put("T3", Integer.toString(To3));
            jasperParameter.put("T4", Integer.toString(To4));
            
            jasperParameter.put("TotalObtained", Integer.toString(TotalObtain));
            jasperParameter.put("Total", Integer.toString(Total));
            jasperParameter.put("Percentage", Double.toString(percentage));
            jasperParameter.put("TeacherName", teacher);
            
            report = JasperCompileManager.compileReport("E:\\ORS\\Paper\\Marksheet.jrxml");
            print = JasperFillManager.fillReport(report,jasperParameter, new JREmptyDataSource());
            JasperExportManager.exportReportToPdfFile(print,"E:\\ORS\\papers\\"+SName+"_paper.pdf");
            
            out.print("Successfull");
            
            } catch(Exception e){
           System.out.println(e);
           
        }
            String path = request.getContextPath();
        response.sendRedirect(path+"/Download_paper?name="+SName);
            
            
          
        
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
