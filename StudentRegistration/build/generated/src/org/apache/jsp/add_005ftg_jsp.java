package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.*;

public final class add_005ftg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 int a=1;
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

   try{
        session = request.getSession(false);
  String id = session.getAttribute("id").toString();
if(id.equals("")) {
    response.sendRedirect("hod_login.jsp");
    } else {

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>HOD :: Add TG </title>\n");
      out.write("        \n");
      out.write("\n");
      out.write("     \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");

        String branch=session.getAttribute("branch").toString();
        String bid=session.getAttribute("bid").toString();

        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("      <nav class=\"navbar navbar-expand-md navbar-dark fixed-top bg-dark p-2\">\n");
      out.write("      <a class=\"navbar-brand ml-3\" href=\"#\"><img src=\"pic/dpcoe.jpg\" height=\"60\" width=\"60\" class=\"img-rounded\" alt=\"dpcoe\"></a>\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsExampleDefault\" aria-controls=\"navbarsExampleDefault\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("      </button>\n");
      out.write("\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarsExampleDefault\">\n");
      out.write("        <ul class=\"navbar-nav mr-auto\">\n");
      out.write("          <li class=\"nav-item \">\n");
      out.write("              <a href=\"hod_home.jsp\">  <button type=\"button\" class=\"btn btn-info m-2 fa fa-home\"> Home</button></a>\n");
      out.write("            \n");
      out.write("          </li>\n");
      out.write("            <li class=\"nav-item dropdown\">\n");
      out.write("            <a class=\"nav-link dropdown-toggle\" id=\"dropdown01\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Task</a>\n");
      out.write("            <div class=\"dropdown-menu\" aria-labelledby=\"dropdown01\">\n");
      out.write("              <a class=\"dropdown-item\" href=\"add_tg.jsp\">Add TG</a>\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("          <a href=\"/StudentRegistration/logout\"><button type=\"button\" class=\"btn btn-danger float-right fa fa-sign-out\"> Logout</button></a>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <main role=\"main\">\n");
      out.write("\n");
      out.write("      <!-- Main jumbotron for a primary marketing message or call to action -->\n");
      out.write("      <div class=\"jumbotron mt-5\">\n");
      out.write("          <p class=\"fa fa-mortar-board\"> <kbd><span class=\"text-primary\">HOD </span>");
      out.print(branch);
      out.write(" Department</kbd></p>\n");
      out.write("           <h2 class=\"shadow-none p-4 mb-4\" align=\"center\">Add TG of your department.</h2>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("  \n");
      out.write("       <div align=\"center\">  <h1>Add TG</h1></div><br><br>\n");
      out.write("<div class=\"container\">\n");
      out.write("    \n");
      out.write("  <div class=\"row\">\n");
      out.write("     \n");
      out.write("    <table class=\"table\" id=\"t1\">\n");
      out.write("      <thead>\n");
      out.write("        <tr>\n");
      out.write("       \n");
      out.write("          <th>Name</th>\n");
      out.write("          <th>Email</th>\n");
      out.write("          <th>Mobile</th>\n");
      out.write("          <th>Username</th>\n");
      out.write("          <th>Password</th>\n");
      out.write("          <th>Department</th>\n");
      out.write("          <th></th>\n");
      out.write("\n");
      out.write("          \n");
      out.write("        </tr>\n");
      out.write("      </thead>\n");
      out.write("      \n");
      out.write("      <tbody>\n");
      out.write("          \n");
      out.write("        <tr>\n");
      out.write("          \n");
      out.write("          <td> \n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"name\" name=\"name\" value=\"\">\n");
      out.write("          </td>\n");
      out.write("         <td>\n");
      out.write("             <input type=\"mail\" class=\"form-control\" id=\"email\" name=\"email\"  value=\"\">\n");
      out.write("          </td>\n");
      out.write("          <td>\n");
      out.write("            <input type=\"number\" class=\"form-control\" id=\"mobile\" name=\"mobile\" size=\"10\" value=\"\">\n");
      out.write("          </td>\n");
      out.write("          <td>\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"username\" name=\"username\">\n");
      out.write("          </td>\n");
      out.write("          <td>\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"password\" name=\"password\">\n");
      out.write("          </td>\n");
      out.write("          <td>\n");
      out.write("              <input type=\"text\" class=\"form-control\" name=\"department\" value=\"");
      out.print(branch);
      out.write("\"  disabled>\n");
      out.write("          </td>\n");
      out.write("          <td><button type=\"button\" id=\"add\" class=\"btn btn-info m-2 fa fa-plus\"> Add</button>\n");
      out.write("             \n");
      out.write("        </tr> \n");
      out.write("   </tbody>\n");
      out.write("   \n");
      out.write("    </table>\n");
      out.write("     \n");
      out.write("  </div>\n");
      out.write("   \n");
      out.write("</div>\n");
      out.write("      \n");
      out.write(" \n");
      out.write("      \n");
      out.write("      \n");
      out.write("<!-- show all tg summary-->\n");
      out.write("\n");
  String id2="";
    String name2="";
    String email2="";
    String mobile2="";
    String username2="";
    String password2="";
    
    String sql6 = "select * from master_tg where bid='"+bid+"'";
    try{
        pst = connection.prepareStatement(sql6);
       rs = pst.executeQuery();

    }
    catch(Exception e){
        System.out.print(e);
    }

    
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("      <div align=\"center\">  <h1>TG Summary</h1></div><br><br>\n");
      out.write("      \n");
      out.write("<div class=\"container\">\n");
      out.write("    <p class=\"bg-info\"><strong>NOTE:</strong> Be careful on clicking summary data, it will Auto updated in database. Click outside of box anywhere to update.</p>\n");
      out.write("  <div class=\"row\">\n");
      out.write("     \n");
      out.write("          <table class=\"table\" id=\"t2\">\n");
      out.write("        \n");
      out.write("      <thead>\n");
      out.write("        <tr>\n");
      out.write("            <th>No.</th>\n");
      out.write("          <th>Name</th>\n");
      out.write("          <th>Email</th>\n");
      out.write("          <th>Mobile</th>\n");
      out.write("          <th>Username</th>\n");
      out.write("          <th>Password</th>\n");
      out.write("          <th>Department</th>\n");
      out.write("          \n");
      out.write("        </tr>\n");
      out.write("      </thead>\n");
      out.write("      <tbody>\n");
      out.write("          ");

            while(rs.next()){
                
            
            
      out.write("\n");
      out.write("        <tr id=\"");
      out.print(rs.getString("name"));
      out.write("\">\n");
      out.write("      \n");
      out.write("            <td>");
 out.print(a); 
      out.write("</td>\n");
      out.write("     <td contenteditable id=\"");
      out.print(rs.getString("id"));
      out.write("\" onblur=\"update('#");
      out.print(rs.getString("id"));
      out.write("','");
      out.print(rs.getString("id"));
      out.write("')\">");
      out.print(rs.getString("name"));
      out.write("</td>\n");
      out.write("         \n");
      out.write("     <td contenteditable id=\"1");
      out.print(rs.getString("id"));
      out.write("\" onblur=\"update1('#1");
      out.print(rs.getString("id"));
      out.write("','");
      out.print(rs.getString("id"));
      out.write("')\">");
      out.print(rs.getString("email"));
      out.write("</td>\n");
      out.write("\n");
      out.write("     <td contenteditable id=\"2");
      out.print(rs.getString("id"));
      out.write("\" onblur=\"update2('#2");
      out.print(rs.getString("id"));
      out.write("','");
      out.print(rs.getString("id"));
      out.write("')\">");
      out.print(rs.getString("mobile"));
      out.write("</td>\n");
      out.write("\n");
      out.write("     <td contenteditable id=\"3");
      out.print(rs.getString("id"));
      out.write("\" onblur=\"update3('#3");
      out.print(rs.getString("id"));
      out.write("','");
      out.print(rs.getString("id"));
      out.write("')\">");
      out.print(rs.getString("username"));
      out.write("</td>\n");
      out.write("\n");
      out.write("     <td contenteditable id=\"4");
      out.print(rs.getString("id"));
      out.write("\" onblur=\"update4('#4");
      out.print(rs.getString("id"));
      out.write("','");
      out.print(rs.getString("id"));
      out.write("')\">");
      out.print(rs.getString("password"));
      out.write("</td>\n");
      out.write("\n");
      out.write("          <td>\n");
      out.write("            <input type=\"text\"  class=\"form-control\"  value=\"");
      out.print(branch);
      out.write("\"  disabled>\n");
      out.write("          </td>\n");
      out.write("      </tr>\n");
      out.write("     \n");
      out.write("   ");
 a++; } 
      out.write("\n");
      out.write("   ");
 a=1;
      out.write("\n");
      out.write("      </tbody>\n");
      out.write("    </table>\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write(" \n");
      out.write("</div>\n");
      out.write("   \n");
      out.write("      \n");
      out.write("    </main>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("      <footer class=\"container mt-5 text-center\" align=\"center\">\n");
      out.write("      <p><i class=\"fa fa-copyright\"></i> Design and Developed by Lakhan, Rahul & Prof. Varsha</p>\n");
      out.write("    </footer>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("   <script type=\"text/javascript\">\n");
      out.write("       \n");
      out.write("       function update(id,rid){\n");
      out.write("           var id = id;\n");
      out.write("           var name = $(id).html();\n");
      out.write("           $.ajax({\n");
      out.write("            type : \"POST\",\n");
      out.write("            url : \"/StudentRegistration/upd_tg\",\n");
      out.write("           // data : \"name=\" + name, \"email=\" + email, \"mobile=\" + mobile, \"username=\" + username, \"password=\" + password  \n");
      out.write("           data: {id: rid, name: name},\n");
      out.write("            success : function(data) {\n");
      out.write("                alert(\"You Successfully Edited TG DATA !! \");\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("       }\n");
      out.write("       \n");
      out.write("          function update1(id,rid){\n");
      out.write("           var id = id;\n");
      out.write("           var email = $(id).html();\n");
      out.write("           $.ajax({\n");
      out.write("            type : \"POST\",\n");
      out.write("            url : \"/StudentRegistration/upd_tg\",\n");
      out.write("           // data : \"name=\" + name, \"email=\" + email, \"mobile=\" + mobile, \"username=\" + username, \"password=\" + password  \n");
      out.write("           data: {id: rid, email: email},\n");
      out.write("            success : function(data) {\n");
      out.write("                alert(\"You Successfully Edited TG DATA !! \");\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("       }\n");
      out.write("       \n");
      out.write("          function update2(id,rid){\n");
      out.write("           var id = id;\n");
      out.write("           var mobile = $(id).html();\n");
      out.write("           $.ajax({\n");
      out.write("            type : \"POST\",\n");
      out.write("            url : \"/StudentRegistration/upd_tg\",\n");
      out.write("           // data : \"name=\" + name, \"email=\" + email, \"mobile=\" + mobile, \"username=\" + username, \"password=\" + password  \n");
      out.write("           data: {id: rid, mobile: mobile},\n");
      out.write("            success : function(data) {\n");
      out.write("                alert(\"You Successfully Edited TG DATA !! \");\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("       }\n");
      out.write("       \n");
      out.write("          function update3(id,rid){\n");
      out.write("           var id = id;\n");
      out.write("           var username = $(id).html();\n");
      out.write("           $.ajax({\n");
      out.write("            type : \"POST\",\n");
      out.write("            url : \"/StudentRegistration/upd_tg\",\n");
      out.write("           // data : \"name=\" + name, \"email=\" + email, \"mobile=\" + mobile, \"username=\" + username, \"password=\" + password  \n");
      out.write("           data: {id: rid, username: username},\n");
      out.write("            success : function(data) {\n");
      out.write("                alert(\"You Successfully Edited TG DATA !! \");\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("       }\n");
      out.write("       \n");
      out.write("       \n");
      out.write("          function update4(id,rid){\n");
      out.write("           var id = id;\n");
      out.write("           var password = $(id).html();\n");
      out.write("           $.ajax({\n");
      out.write("            type : \"POST\",\n");
      out.write("            url : \"/StudentRegistration/upd_tg\",\n");
      out.write("           // data : \"name=\" + name, \"email=\" + email, \"mobile=\" + mobile, \"username=\" + username, \"password=\" + password  \n");
      out.write("           data: {id: rid, password: password},\n");
      out.write("            success : function(data) {\n");
      out.write("                alert(\"You Successfully Edited TG DATA !!  \");\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("       }\n");
      out.write("       \n");
      out.write("$('#add').click(function(){\n");
      out.write("    //declare\n");
      out.write("    var name = $('input[name=\"name\"]').val();\n");
      out.write("    var email = $('input[name=\"email\"]').val();\n");
      out.write("    var mobile = $('input[name=\"mobile\"]').val();\n");
      out.write("    var username = $('input[name=\"username\"]').val();\n");
      out.write("    var password = $('input[name=\"password\"]').val();\n");
      out.write("   \n");
      out.write("   if(name == \"\" || email == \"\" || mobile == \"\" || username == \"\" || password == \"\"){ \n");
      out.write("   \n");
      out.write("   alert(\"Please Fill all fields !!\");\n");
      out.write("        }\n");
      out.write("        else{\n");
      out.write("      $.ajax({\n");
      out.write("            type : \"POST\",\n");
      out.write("            url : \"/StudentRegistration/addt\",\n");
      out.write("           // data : \"name=\" + name, \"email=\" + email, \"mobile=\" + mobile, \"username=\" + username, \"password=\" + password  \n");
      out.write("           data: {name: name, email: email, mobile: mobile, username: username, password: password},\n");
      out.write("            success : function(data) {\n");
      out.write("                alert(\"You Add TG Successfully !! \");\n");
      out.write("                location.reload();\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("    </body>\n");
      out.write("</html>\n");

}
}
catch(Exception e){
    System.out.println(e);
    response.sendRedirect("hod_login.jsp?error");
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
