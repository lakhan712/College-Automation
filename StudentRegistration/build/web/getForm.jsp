<%-- 
    Document   : getForm
    Created on : Jun 16, 2018, 10:49:30 AM
    Author     : anu5
--%>

<%@page import="net.sf.jasperreports.engine.JasperFillManager"%>
<%@page import="java.util.HashMap"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="connect.jsp"%>
<%@page import="net.sf.jasperreports.engine.JRException,net.sf.jasperreports.engine.JasperCompileManager,net.sf.jasperreports.engine.JasperExportManager,
        net.sf.jasperreports.engine.JasperFillManager,net.sf.jasperreports.engine.JasperPrint,net.sf.jasperreports.engine.JasperReport" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Registration Form</title>
    </head>
    <body>
        <%
         String marks_ob1 = "",marks_ob2 = "",marks_ob3 = "";
         String marks_total1 ="",marks_total2 ="",marks_total3 ="";
         String year1 = "",year2 = "",year3 = "";
         String percentage1 = "",percentage2 = "",percentage3 = "";
            
        JasperReport report;
        JasperPrint print;
        String user_name = request.getParameter("user_name");
        int i = Integer.parseInt(request.getParameter("id"));
        String sql1 = "select * from academic_record where exam='FE' and sid="+i;
        pst = connection.prepareStatement(sql1);
        ResultSet rs1 = pst.executeQuery();
        while(rs1.next()){
             marks_ob1 = rs1.getString("marks_ob");
             marks_total1 = rs1.getString("marks_total");
             percentage1 = rs1.getString("percentage");
             year1 = rs1.getString("year");
        }
        String sql2 = "select * from academic_record where exam='SE' and sid="+i;
        pst = connection.prepareStatement(sql2);
        ResultSet rs2 = pst.executeQuery();
        while(rs2.next()){
             marks_ob2 = rs2.getString("marks_ob");
             marks_total2 = rs2.getString("marks_total");
             percentage2 = rs2.getString("percentage");
             year2 = rs2.getString("year");
        }
        String sql3 = "select * from academic_record where exam='TE' and sid="+i;
        pst = connection.prepareStatement(sql3);
        ResultSet rs3 = pst.executeQuery();
        while(rs3.next()){
             marks_ob3 = rs3.getString("marks_ob");
             marks_total3 = rs3.getString("marks_total");
             percentage3 = rs3.getString("percentage");
             year3 = rs3.getString("year");
        }
        
        try{
        HashMap jasperParameter = new HashMap();
        jasperParameter.put("session", i);
        jasperParameter.put("marks_ob1", marks_ob1);
        jasperParameter.put("marks_total1", marks_total1);
        jasperParameter.put("percentage1", percentage1);
        jasperParameter.put("marks_ob2", marks_ob2);
        jasperParameter.put("marks_total2", marks_total2);
        jasperParameter.put("percentage2", percentage2);
        jasperParameter.put("year1", year1);
        jasperParameter.put("year2", year2);
        jasperParameter.put("marks_ob3", marks_ob3);
        jasperParameter.put("marks_total3", marks_total3);
        jasperParameter.put("percentage3", percentage3);
        jasperParameter.put("year3", year3);
        report = JasperCompileManager.compileReport("E:\\ORS\\report\\RegistrationForm.jrxml");
        print = JasperFillManager.fillReport(report,jasperParameter, connection);
        JasperExportManager.exportReportToPdfFile(print,"E:\\ORS\\Student_doc\\"+user_name+"_report.pdf");
        System.out.println(marks_ob1);
        System.out.println(marks_ob2);
        System.out.println(marks_ob3);
        }
        catch(JRException e){
           System.out.println(e);
        }
        String path = request.getContextPath();
        response.sendRedirect(path+"/Download?user_name="+user_name);
        %>
<!--        <a href="download.jsp?user_name=<%=user_name%>">Download</a>Form-->
    </body>
</html>
