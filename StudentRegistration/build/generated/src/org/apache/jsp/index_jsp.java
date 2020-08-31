package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/connect.jsp");
    _jspx_dependants.add("/title.jsp");
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
    Throwable exception = org.apache.jasper.runtime.JspRuntimeLibrary.getThrowable(request);
    if (exception != null) {
      response.setStatus((Integer)request.getAttribute("javax.servlet.error.status_code"));
    }
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login Page</title>\n");
      out.write("        ");

            
            try{
        session = request.getSession(false);
     String signup = session.getAttribute("signup").toString();
    if(session != null && !session.isNew()) {
    } else {
    response.sendRedirect("/login.jsp");
    }
    if(signup == "1"){
       // response.sendRedirect("index.jsp");
    
    
      out.write("\n");
      out.write("                <script>\n");
      out.write("                    alert(\"Signup is successful, for TG approval go to your respective TG\");\n");
      out.write("                    </script>\n");
      out.write("                ");

                    session.removeAttribute("signup");
            }
    }catch(Exception e){
    
    }
            
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"text-center\">\n");
      out.write("       <div class=\"container mt-5\">\n");
      out.write("           <div class=\"panel-body\">\n");
      out.write("               <h2 class=\"shadow-none p-4 mb-4 bg-light\">Student Login</h2>\n");
      out.write("               <i class=\"text-primary\">If you are new here, please Sign-Up first</i><br>\n");
      out.write("               <i class=\"text-danger\">If you have already Signed-Up, please wait for approval from your respective TG.</i><br>\n");
      out.write("               <i class=\"text-danger\">You will be notified by E-mail. If no notification has popped up, please check your spam folder too! </i>\n");
      out.write("        \n");
      out.write("<!--               form started-->\n");
      out.write("               \n");
      out.write("  <form class=\"form-horizontal\" action=\"Login\" method=\"post\">\n");
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

    try{
   if(session.getAttribute("fail").toString().equals("2")){
       
      out.write("\n");
      out.write("       <p class=\"text-danger text-center\" id=\"error\">Username or Password is Invalid</p>  \n");

      session.removeAttribute("fail");
   }
  }
  catch(Exception e){
     
  }

      out.write("\n");
      out.write("<div class=\"form-group\" align=\"center\">\n");
      out.write("<a href=\"forgot_pass.jsp\" class=\"fa fa-lock mr-5\"><u> Forgot Password</u></a>\n");
      out.write("<a href=\"SignUp.jsp\"> <button type=\"submit\" class=\"btn btn-danger fa-registered\" name=\"signup\"> SignUp</button> </a>\n");
      out.write("</div>\n");
      out.write("   </div>\n");
      out.write("</div>\n");
      out.write("        </div>   \n");
      out.write("         <footer class=\"container mt-5 text-center\" align=\"center\">\n");
      out.write("      <p><i class=\"fa fa-copyright\"></i> Design and Developed by Lakhan, Rahul & Prof. Varsha</p>\n");
      out.write("    </footer>\n");
      out.write("</body>\n");
      out.write("<script>\n");
      out.write("    $(\"#email\").click(function(){\n");
      out.write("        $(\"#error\").empty();\n");
      out.write("        $(\"#error\").hide();\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("</html>");
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
