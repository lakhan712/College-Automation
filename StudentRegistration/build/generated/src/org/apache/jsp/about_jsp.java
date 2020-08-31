package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/boost.jsp");
    _jspx_dependants.add("/connect.jsp");
    _jspx_dependants.add("/title.jsp");
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

      out.write('\n');
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
      out.write("\n");
      out.write("<link href=\"css/title.css\" rel=\"stylesheet\">\n");
      out.write("<h1 style=\"display:inline;\"><img src=\"pic/dpcoe_logo.png\"><p style=\"display: inline-block;\"> Dhole Patil College Of Engineering, Pune</p></h1>\n");
      out.write("<div id='cssmenu'>\n");
      out.write("<ul>\n");
      out.write("   <li><a href='index.jsp'><span>Login</span></a></li>\n");
      out.write("   <li><a href='tg_login.jsp'><span>TG Login</span></a></li>\n");
      out.write("   <li><a href='hod_login.jsp'><span>HOD Login</span></a></li>\n");
      out.write("   <li><a href='admin_login.jsp'><span>Registrar Login</span></a></li>\n");
      out.write("   <li class=\"pull-right\">\n");
      out.write("       <a href=\"about.jsp\">About</a>\n");
      out.write("   </li>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("<div align=\"center\">\n");
      out.write("<h2>Welcome to Online Registration System</h2> \n");
      out.write("</div>");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>About</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("         <div class=\"jumbotron\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1 class=\"display-3\" align='center'><kbd>Computer Department</kbd></h1>\n");
      out.write("          <h3 align='center'>All Credit goes to... </h3>\n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <!-- Example row of columns -->\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-4\">\n");
      out.write("              <h2><span class=\"text-danger\">Lakhan Mane</span></h2>\n");
      out.write("            <p>Student from BE Computer </p>\n");
      out.write("            <p>Mobile: <a href=\"tel:+919890291420\">+91 9890291420</a></p>\n");
      out.write("            <p>Email-ID: <a href=\"mailto:mlakhan1638@gmail.com\">mlakhan1638@gmail.com</a></p>\n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-4\">\n");
      out.write("              <h2><span class=\"text-primary\">Prof. Varsha Dange</span></h2>\n");
      out.write("            <p>Assistant Professor & CEO</p>\n");
      out.write("            <p>Mobile: <a href=\"tel:+919552547248\">+91 9552547248</a></p>\n");
      out.write("            <p>Email-ID: <a href=\"mailto:dange.varshar@gmail.com\">dange.varshar@gmail.com</a></p>\n");
      out.write("           \n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-4\">\n");
      out.write("              <h2><span class=\"text-warning\">Rahul Hajare</span></h2>\n");
      out.write("                <p>Student from BE Computer</p>\n");
      out.write("            <p>Mobile: <a href=\"tel:+917745857654\">+91 7745857654</a></p>\n");
      out.write("            <p>Email-ID: <a href=\"mailto:hajarer8@gmail.com\">hajarer8@gmail.com</a></p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("      </div> <!-- /container -->\n");
      out.write("      \n");
      out.write("      <footer class=\"container mt-5 text-center\" align=\"center\">\n");
      out.write("      <p><i class=\"fa fa-copyright\"></i> Design and Developed by Lakhan, Rahul & Prof. Varsha</p>\n");
      out.write("    </footer>\n");
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
