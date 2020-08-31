package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class requestForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/boost.jsp");
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


response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
response.setHeader("pragma", "no-cache");
response.setHeader("Expires", "0");
     session=request.getSession(false);
if(session.getAttribute("st_id") == null){
    response.sendRedirect("index.jsp");
}

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"cap.ico?\" type=\"image/x-icon\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src='js/jquery.easing.1.3.js'></script>\n");
      out.write("       <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write('\n');
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

      out.write('\n');
      out.write('\n');


    
 String st_id = session.getAttribute("st_id").toString();
 String username = session.getAttribute("username").toString();
 String id = "";
      System.out.println(st_id);
      String sql = "select * from students where sid='"+st_id+"'";
      try{
      pst = connection.prepareStatement(sql);
      rs = pst.executeQuery();
      
      while(rs.next()){
         id = rs.getString("status");
      }
      }catch(Exception e){
          System.out.println(e);
      }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>:: Download</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("             <nav class=\"navbar navbar-expand-md navbar-dark fixed-top bg-dark p-2\">\n");
      out.write("      <a class=\"navbar-brand ml-3\" href=\"#\"><img src=\"pic/dpcoe.jpg\" height=\"60\" width=\"60\" class=\"img-rounded\" alt=\"dpcoe\"></a>\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsExampleDefault\" aria-controls=\"navbarsExampleDefault\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("      </button>\n");
      out.write("\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarsExampleDefault\">\n");
      out.write("        <ul class=\"navbar-nav mr-auto\">\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              <a href=\"student_home.jsp\"> <button type=\"button\" class=\"btn btn-info m-2 fa fa-home\"> Home</button></a>\n");
      out.write("            \n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              <a href=\"registration.jsp\">  <button type=\"button\" class=\"btn btn-info m-2 fa fa-id-card-o\"> Registration</button> </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              <a href=\"requestForm.jsp\"><button type=\"button\" class=\"btn btn-info m-2 fa fa-download active\"> Download</button></a>\n");
      out.write("          </li>          \n");
      out.write("        </ul>\n");
      out.write("          <a href=\"/StudentRegistration/logout\"><button type=\"button\" class=\"btn btn-danger float-right fa fa-sign-out\"> Logout </button></a>\n");
      out.write("      </div>\n");
      out.write("    </nav><br/>\n");
      out.write("    ");

        if(id.equals("")){
    
      out.write("\n");
      out.write("    <div class=\"\" style=\"margin-top: 7%;\">\n");
      out.write("    <h1 class=\"text-success\">Please fill up form...</h1>\n");
      out.write("        <p class=\"text-info\">You don't have fill up any form....</p>\n");
      out.write("    </div>\n");
      out.write("    ");
  
       } else if(id.equals("0")){
    
      out.write("\n");
      out.write("<!--        <main role=\"main\">-->\n");
      out.write("<div class=\"\" style=\"margin-top: 7%;\">\n");
      out.write("    <h1 class=\"text-success\">Your form has been submitted...</h1>\n");
      out.write("        <p class=\"text-info\">Please wait for TG approval</p>\n");
      out.write("    </div>\n");
  }
    else if(id.equals("1")){
    
      out.write("\n");
      out.write("<!--        <main role=\"main\">-->\n");
      out.write("<div class=\"\" style=\"margin-top: 7%;\">\n");
      out.write("    <h1 class=\"text-success\">Your TG approval done......</h1>\n");
      out.write("        <p class=\"text-info\">Please wait for Registrar approval</p>\n");
      out.write("    </div>\n");
      out.write("    ");

        }
else if(id.equals("2")){
    
      out.write("  \n");
      out.write("    <div style=\"margin-top: 7%;\">\n");
      out.write("    ");
String path = request.getContextPath();
      out.write("\n");
      out.write("        <a href=\"");
      out.print(path);
      out.write("/getForm.jsp?id=");
      out.print(st_id);
      out.write("&user_name=");
      out.print(username);
      out.write("\">Click here</a> To download registration form...\n");
      out.write("</div>\n");

    }

      out.write("\n");
      out.write("<!--        </main>-->\n");
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
