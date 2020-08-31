package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class spl_005fadmin_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/connect.jsp");
    _jspx_dependants.add("/boost.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Special Admin Login</title>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"text-center\">\n");
      out.write("       <div class=\"container mt-5\">\n");
      out.write("           <div class=\"panel-body\">\n");
      out.write("               <h2 class=\"shadow-none p-4 mb-4 bg-light\">Special Admin Login</h2>\n");
      out.write("               \n");
      out.write("<!--               form started-->\n");
      out.write("               \n");
      out.write("  <form class=\"form-horizontal\" action=\"\" method=\"post\">\n");
      out.write("    <div class=\"form-group\" align=\"center\">\n");
      out.write("      <label class=\"control-label col-sm-2\" for=\"email\"></label>\n");
      out.write("      <div class=\"col-sm-5\">\n");
      out.write("        <input type=\"text\" class=\"form-control\" id=\"email\" placeholder=\"Enter UserName\" name=\"username\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\" align=\"center\">\n");
      out.write("      <label class=\"control-label col-sm-2\" for=\"pwd\"></label>\n");
      out.write("      <div class=\"col-sm-5\">          \n");
      out.write("        <input type=\"password\" class=\"form-control\"  id=\"pwd\" placeholder=\"Enter Password\" name=\"password\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\" align=\"center\">        \n");
      out.write("      <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary mr-5 fa fa-sign-in\" name=\"login\"> Login</button>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("        </div>\n");
      out.write("      <br>\n");
      out.write("  </form>\n");
      out.write(" </div>\n");
      out.write("</div>\n");
      out.write("         <footer class=\"container mt-5 text-center\" align=\"center\">\n");
      out.write("      <p><i class=\"fa fa-copyright\"></i> Design and Developed by Lakhan, Rahul & Prof. Varsha</p>\n");
      out.write("    </footer>\n");
      out.write("</body>\n");

    String username = (String) request.getParameter("username");
    String password = (String) request.getParameter("password");

    String sql = "select * from spl_admin where username='"+username+"' and password='"+password+"'";
    try{
       pst = connection.prepareStatement(sql);
       rs = pst.executeQuery();
       
       if(rs.next()){
           session.setAttribute("ad_id", rs.getString("id"));
            response.sendRedirect("spl_admin_dash.jsp");
           
       }
       else if(rs.next() == false){
           
          //out.println("<p class='text-danger'>Username or password is invalid</p>");
       }
    }
    catch(Exception e){
       
    }

      out.write("\n");
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
