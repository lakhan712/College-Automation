package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class student_005ftransfer_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");

try{
        session = request.getSession(false);
  String bid = session.getAttribute("bid").toString();

 String tg_id = session.getAttribute("tg_id").toString();
if(tg_id.equals("")) {
    response.sendRedirect("tg_login.jsp");
    } else {

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>TG :: Transfer Student</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("         <nav class=\"navbar navbar-expand-md navbar-dark fixed-top bg-dark p-2\">\n");
      out.write("      <a class=\"navbar-brand ml-3\" href=\"#\"><img src=\"pic/dpcoe.jpg\" height=\"60\" width=\"60\" class=\"img-rounded\" alt=\"dpcoe\"></a>\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsExampleDefault\" aria-controls=\"navbarsExampleDefault\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("      </button>\n");
      out.write("\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarsExampleDefault\">\n");
      out.write("        <ul class=\"navbar-nav mr-auto\">\n");
      out.write("          <li class=\"nav-item \">\n");
      out.write("            <a href=\"tg_home.jsp\"> <button type=\"button\" class=\"btn btn-info m-2 fa fa-home\">Home </button></a>\n");
      out.write("            \n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              <a href=\"ap_pending.jsp\">  <button type=\"button\" class=\"btn btn-info m-2 fa fa-id-card-o\"> Approve Pending </button> </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              <a href=\"s_pending.jsp\"><button type=\"button\" class=\"btn btn-info m-2 fa fa-user-plus\"> SignUp Approve Pending </button></a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              <a href=\"student_transfer.jsp\">  <button type=\"button\" class=\"btn btn-info m-2 fa fa-info-circle active\"> Transfer Students</button> </a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("          <a href=\"/StudentRegistration/logout\"> <button type=\"button\" class=\"btn btn-danger float-right fa fa-sign-out\"> Logout</button> </a>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("         <div class=\"jumbotron mt-5\">\n");
      out.write("          \n");
      out.write("        <div class=\"container\">\n");
      out.write("            \n");
      out.write("            <p> Transfer Student to another TG..</p>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("      </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <form class=\"form-horizontal\" action=\"/StudentRegistration/transfer\" method=\"post\">\n");
      out.write("            <div class=\"form-group\" align=\"center\">\n");
      out.write("              <label class=\"control-label col-sm-2\" for=\"text\"></label>\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("               <div class=\"form-group\" align=\"center\">\n");
      out.write("              <label for=\"sel1\">Select Student:</label>\n");
      out.write("              <select class=\"form-control col-sm-3\"  id=\"student\" name=\"std_id\">\n");
      out.write("                  <option value=\"\">Select</option>\n");
      out.write("                ");

                                        String sql7 = "select * from student_login where tg_id='"+tg_id+"' and allow='1'";
                                        try {
                                            pst = connection.prepareStatement(sql7);
                                             rs = pst.executeQuery();
                                            while (rs.next()) {
                                                out.print("<option value='" + rs.getInt("id") + "'>" + rs.getString("fname")  +" "+ rs.getString("mname") + " " + rs.getString("lname") + "</option>");
                                            }
                                        } catch (Exception e) {

                                        }
                                    
      out.write("\n");
      out.write("              </select>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("                  <div class=\"form-group\" align=\"center\">\n");
      out.write("              <label for=\"sel1\">Select TG:</label>\n");
      out.write("              <select class=\"form-control col-sm-3\"  id=\"student\" name=\"tg_id\">\n");
      out.write("                  <option value=\"\">Select</option>\n");
      out.write("                ");

                    
                                 
                                        String sql8 = "select * from  master_tg where bid='"+bid+"'";
                                        try {
                                            pst = connection.prepareStatement(sql8);
                                             rs = pst.executeQuery();
                                            while (rs.next()) {
                                                out.print("<option value='" + rs.getInt("id") + "'>" + rs.getString("name") + "</option>");
                                            }
                                        } catch (Exception e) {

                                        }
                                    
      out.write("\n");
      out.write("              </select>\n");
      out.write("              </div>\n");
      out.write("          \n");
      out.write("            <div class=\"form-group\" align=\"center\">        \n");
      out.write("              <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("\n");
      out.write("                 <button type=\"submit\" id=\"transefer\" class=\"btn btn-success fa-registered\"> Transfer</button> \n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("          </form>\n");
      out.write("        \n");
      out.write("       <footer class=\"container mt-5 text-center\" align=\"center\">\n");
      out.write("      <p><i class=\"fa fa-copyright\"></i> Design and Developed by Lakhan, Rahul & Prof. Varsha</p>\n");
      out.write("    </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");

}
}
catch(Exception e){
    response.sendRedirect("tg_login.jsp");
}

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
