<%-- 
    Document   : getBonafide
    Created on : 19 Nov, 2018, 2:20:13 AM
    Author     : Lakhan Mnae
--%>
<%@page import="net.sf.jasperreports.engine.JasperFillManager"%>
<%@page import="java.util.HashMap"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="connect.jsp"%>
<%@page import="net.sf.jasperreports.engine.JRException,net.sf.jasperreports.engine.JasperCompileManager,net.sf.jasperreports.engine.JasperExportManager,net.sf.jasperreports.engine.JasperFillManager,net.sf.jasperreports.engine.JasperPrint,net.sf.jasperreports.engine.JasperReport" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bonafie</title>
    </head>
    <body>
        
         <%
             session = request.getSession(false);
             String id = request.getParameter("id");
             String user_name = request.getParameter("name");
             System.out.println(id);
     
            
        JasperReport report;
        JasperPrint print;
        
//        String user_name ="lakhan";
        int i = Integer.parseInt(id);//id
            
//        String sql1 = "select * from academic_record where exam='FE' and sid="+i;
//        pst = connection.prepareStatement(sql1);
//        ResultSet rs1 = pst.executeQuery();
//        while(rs1.next()){
//             marks_ob1 = rs1.getString("marks_ob");
//             marks_total1 = rs1.getString("marks_total");
//             percentage1 = rs1.getString("percentage");
//             year1 = rs1.getString("year");
//        }
//        String sql2 = "select * from academic_record where exam='SE' and sid="+i;
//        pst = connection.prepareStatement(sql2);
//        ResultSet rs2 = pst.executeQuery();
//        while(rs2.next()){
//             marks_ob2 = rs2.getString("marks_ob");
//             marks_total2 = rs2.getString("marks_total");
//             percentage2 = rs2.getString("percentage");
//             year2 = rs2.getString("year");
//        }
        String sql3 = "update bonafide_data set status =0 where sid="+id;
        pst = connection.prepareStatement(sql3);
        int count = pst.executeUpdate();
        if(count>0){
        
        try{
        HashMap jasperParameter = new HashMap();
        jasperParameter.put("session", i);
        
        
        report = JasperCompileManager.compileReport("E:\\ORS\\Bonafide\\Bonafide.jrxml");
        print = JasperFillManager.fillReport(report,jasperParameter, connection);
        JasperExportManager.exportReportToPdfFile(print,"E:\\ORS\\Student_doc\\"+user_name+"_bonafide.pdf");
//        System.out.println(marks_ob1);
//        System.out.println(marks_ob2);
//        System.out.println(marks_ob3);
        }
        catch(JRException e){
           System.out.println(e);
        }
        String path = request.getContextPath();
        response.sendRedirect(path+"/Download_bonafide?user_name="+user_name);
        }
        %>
        
    </body>
</html>
