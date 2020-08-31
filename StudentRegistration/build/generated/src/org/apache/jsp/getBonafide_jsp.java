package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import net.sf.jasperreports.engine.JasperFillManager;
import java.util.HashMap;
import java.sql.*;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

public final class getBonafide_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/connect.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
      out.write('\n');

    Connection connection = null;
    PreparedStatement pst = null;
    ResultSet rs=null;
    try{
       Class.forName("com.mysql.jdbc.Driver");
       connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college_registration","root","root123");
    }
    catch(Exception e){
        out.println("There is problem in Database Connection");
    }

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Bonafie</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("         ");

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
        
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
