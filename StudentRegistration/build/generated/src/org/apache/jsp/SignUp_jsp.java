package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class SignUp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Student Sign-Up</title>\n");
      out.write("        \n");
      out.write("   </head>\n");
      out.write("    \n");
      out.write("<body>\n");
      out.write("    ");
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
      out.write("    <div class=\"text-center\">\n");
      out.write("     <div class=\"container mt-5\">\n");
      out.write("      <div class=\"panel-body\">\n");
      out.write("        <h2 class=\"shadow-none p-4 mb-4 bg-light\">Student Sign-Up</h2>\n");
      out.write("        <i class=\"text-danger\">If Sign-Up fail then this page will redirect you here and you have to Sign-Up again..</i>\n");
      out.write("        <i class=\"text-primary\">if Sign-Up success then this page will redirect you to login page..</i>\n");
      out.write("        <p id=\"show\"> </p>\n");
      out.write("        \n");
      out.write("<!--         form start of SignUp-->\n");
      out.write("        \n");
      out.write("<form class=\"form-horizontal\" action=\"/StudentRegistration/Getdata\" method=\"post\">\n");
      out.write("            <div class=\"form-group\" align=\"center\">\n");
      out.write("              <label class=\"control-label col-sm-2\" for=\"text\"></label>\n");
      out.write("              <div class=\"col-sm-5\">\n");
      out.write("                  <input type=\"text\" class=\"form-control\" id=\"fname\" placeholder=\"Enter First Name\" name=\"fname\" > <i id=\"f_name\"> </i>\n");
      out.write("              </div>\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("               <div class=\"form-group\" align=\"center\">\n");
      out.write("              <label class=\"control-label col-sm-2\" for=\"text\"></label>\n");
      out.write("              <div class=\"col-sm-5\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"mname\" placeholder=\"Enter Middle Name\" name=\"mname\" > <i id=\"m_name\"> </i>\n");
      out.write("              </div>\n");
      out.write("                            \n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("               <div class=\"form-group\" align=\"center\">\n");
      out.write("              <label class=\"control-label col-sm-2\" for=\"text\"></label>\n");
      out.write("              <div class=\"col-sm-5\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"lname\" placeholder=\"Enter Last Name\" name=\"lname\" > <i id=\"l_name\"> </i>\n");
      out.write("              </div>\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("               <div class=\"form-group\" align=\"center\">\n");
      out.write("              <label class=\"control-label col-sm-2\" for=\"email\"></label>\n");
      out.write("              <div class=\"col-sm-5\">\n");
      out.write("                  <input type=\"text\" class=\"form-control\" id=\"email\" placeholder=\"Enter Email-Id\" name=\"email\" > <i id=\"e_mail\"></i>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("               <div class=\"form-group\" align=\"center\">\n");
      out.write("              <label class=\"control-label col-sm-2\" for=\"text\"></label>\n");
      out.write("              <div class=\"col-sm-5\">\n");
      out.write("                <input type=\"number\" class=\"form-control\" id=\"mobile\" pattern=\"^([0|\\+[0-9]{1,5})?([7-9][0-9]{9})$\" placeholder=\"Enter Adhaar link Mobile Number\" name=\"mobile\" maxlength=\"10\" >\n");
      out.write("              </div>\n");
      out.write("              <i id=\"mobile1\"> </i>\n");
      out.write("            </div>\n");
      out.write("               <div class=\"form-group\" align=\"center\">\n");
      out.write("              <label class=\"control-label col-sm-2\" for=\"text\"></label>\n");
      out.write("              <div class=\"col-sm-5\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"uname\" placeholder=\"Enter User Name\" name=\"uname\" >\n");
      out.write("              </div>\n");
      out.write("              <p id=\"check_user\"> </p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\" align=\"center\">\n");
      out.write("              <label class=\"control-label col-sm-2\" for=\"pwd\"></label>\n");
      out.write("              <div class=\"col-sm-5\">          \n");
      out.write("                <input type=\"password\" class=\"form-control\"  id=\"pwd\" placeholder=\"Enter Password\" name=\"password1\" >\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("              <div class=\"form-group\" align=\"center\">\n");
      out.write("              <label class=\"control-label col-sm-2\" for=\"pwd\"></label>\n");
      out.write("              <div class=\"col-sm-5\">          \n");
      out.write("                <input type=\"password\" class=\"form-control\"  id=\"c_pwd\" placeholder=\"Confirm Password\" name=\"password2\" >\n");
      out.write("              </div>\n");
      out.write("              <i id=\"pass\"> </i>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("               <div class=\"form-group\" align=\"center\">\n");
      out.write("              <label for=\"sel1\">Select Your Department:</label>\n");
      out.write("              <select class=\"form-control col-sm-3\"  id=\"branch\" name=\"br\">\n");
      out.write("                  <option value=\"\">Select</option>\n");
      out.write("                  \n");
      out.write("                \n");
      out.write("                  ");

                                        String sql1 = "select * from master_branch";
                                        try {
                                            pst = connection.prepareStatement(sql1);
                                             rs = pst.executeQuery();
                                            while (rs.next()) {
                                                out.print("<option value='" + rs.getInt("id") + "'>" + rs.getString("branch_name") + "</option>");
                                            }
                                        } catch (Exception e) {

                                        }
                                    
      out.write("\n");
      out.write("              </select>\n");
      out.write("              </div>\n");
      out.write("              <i id=\"dep1\"> </i>\n");
      out.write("              <div class=\"form-group\" align=\"center\">\n");
      out.write("              <label for=\"sel1\">Select Your TG :</label>\n");
      out.write("              <select class=\"form-control col-sm-3\" id=\"tg\" name=\"tg\">\n");
      out.write("                  <option value=\"\">Select</option>\n");
      out.write("                 \n");
      out.write("              </select>\n");
      out.write("              <i id=\"tg1\"> </i>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\" >\n");
      out.write("                   Your Gender:\n");
      out.write("              <label class=\"radio-inline\">\n");
      out.write("              <input type=\"radio\" name=\"radio\" value=\"Male\">Male\n");
      out.write("            </label>\n");
      out.write("            <label class=\"radio-inline\">\n");
      out.write("                <input type=\"radio\" name=\"radio\" value=\"Female\">Female\n");
      out.write("            </label>\n");
      out.write("            </div>\n");
      out.write("              <i id=\"gender1\"> </i>\n");
      out.write("            <div class=\"form-group\" align=\"center\">        \n");
      out.write("              <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("\n");
      out.write("                  <button type=\"submit\"  id=\"signup\" class=\"btn btn-success fa-registered\" > SignUp </button>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("          </form>\n");
      out.write("   \n");
      out.write("   </div>\n");
      out.write("</div>\n");
      out.write("              \n");
      out.write("<!--              script for ajax request-->\n");
      out.write("\n");
      out.write(" <footer class=\"container mt-5 text-center\" align=\"center\">\n");
      out.write("      <p><i class=\"fa fa-copyright\"></i> Design and Developed by Lakhan, Rahul & Prof. Varsha</p>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("              <script>\n");
      out.write("                  \n");
      out.write("              \n");
      out.write("        $(\"#branch\").click(function() {\n");
      out.write("        bid = $(this).val();\n");
      out.write("        console.log(bid);\n");
      out.write("        $.ajax({\n");
      out.write("            type : \"POST\",\n");
      out.write("            url : \"/StudentRegistration/get_tg\",\n");
      out.write("            data : \"bid=\" + bid,\n");
      out.write("            success : function(data) {\n");
      out.write("                $(\"#tg\").html(data);\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("});  \n");
      out.write("\n");
      out.write("$(\"#uname\").keyup(function() {\n");
      out.write("        var uname = $(this).val();\n");
      out.write("        console.log(uname);\n");
      out.write("        $.ajax({\n");
      out.write("            type : \"POST\",\n");
      out.write("            url : \"/StudentRegistration/CheckUsername\",\n");
      out.write("            data : \"uname=\" + uname,\n");
      out.write("            success : function(data) {\n");
      out.write("                console.log(data);\n");
      out.write("                $(\"#check_user\").html(data);\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("});\n");
      out.write("\n");
      out.write("$(\"#fname\").keyup(function() {\n");
      out.write("        fname = $(this).val();\n");
      out.write("        console.log(fname);\n");
      out.write("        $.ajax({\n");
      out.write("            type : \"POST\",\n");
      out.write("            url : \"/StudentRegistration/validate\",\n");
      out.write("            data : \"fname=\" + fname,\n");
      out.write("            success : function(data) {\n");
      out.write("                $(\"#f_name\").html(data);\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("});\n");
      out.write("\n");
      out.write("$(\"#mname\").keyup(function() {\n");
      out.write("        mname = $(this).val();\n");
      out.write("        console.log(mname);\n");
      out.write("        $.ajax({\n");
      out.write("            type : \"POST\",\n");
      out.write("            url : \"/StudentRegistration/validate1\",\n");
      out.write("            data : \"mname=\" + mname,\n");
      out.write("            success : function(data) {\n");
      out.write("                $(\"#m_name\").html(data);\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("});\n");
      out.write("\n");
      out.write("\n");
      out.write("$(\"#lname\").keyup(function() {\n");
      out.write("        lname = $(this).val();\n");
      out.write("        console.log(lname);\n");
      out.write("        $.ajax({\n");
      out.write("            type : \"POST\",\n");
      out.write("            url : \"/StudentRegistration/validate2\",\n");
      out.write("            data : \"lname=\" + lname,\n");
      out.write("            success : function(data) {\n");
      out.write("                $(\"#l_name\").html(data);\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("});\n");
      out.write("//\n");
      out.write("$(\"#email\").keyup(function() {\n");
      out.write("        email = $(this).val();\n");
      out.write("        console.log(email);\n");
      out.write("        $.ajax({\n");
      out.write("            type : \"POST\",\n");
      out.write("            url : \"/StudentRegistration/validate3\",\n");
      out.write("            data : \"email=\" + email,\n");
      out.write("            success : function(data) {\n");
      out.write("                $(\"#e_mail\").html(data);\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("});\n");
      out.write("\n");
      out.write("$(\"#mobile\").keyup(function() {\n");
      out.write("        mobile = $(this).val();\n");
      out.write("        console.log(mobile);\n");
      out.write("        $.ajax({\n");
      out.write("            type : \"POST\",\n");
      out.write("            url : \"/StudentRegistration/validate4\",\n");
      out.write("            data : \"mobile=\" + mobile,\n");
      out.write("            success : function(data) {\n");
      out.write("                $(\"#mobile1\").html(data);\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("});\n");
      out.write("//\n");
      out.write("$(\"#c_pwd\").keyup(function() {\n");
      out.write("        pass2 = $(this).val();\n");
      out.write("        var pass1 =document.getElementById(\"pwd\").value;\n");
      out.write("       \n");
      out.write("\n");
      out.write("        $.ajax({\n");
      out.write("            type : \"POST\",\n");
      out.write("            url : \"/StudentRegistration/validate5\",\n");
      out.write("            data : {pass1: pass1, pass2: pass2},\n");
      out.write("            success : function(data) {\n");
      out.write("                $(\"#pass\").html(data);\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("});\n");
      out.write("\n");
      out.write("                 \n");
      out.write("              </script>\n");
      out.write("</div>              \n");
      out.write("</body>\n");
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
