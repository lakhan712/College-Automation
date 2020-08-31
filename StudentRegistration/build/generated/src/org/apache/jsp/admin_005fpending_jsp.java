package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class admin_005fpending_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

 try{
        session = request.getSession(false);
        String id1 = session.getAttribute("id").toString();
    if(id1.equals("")){
        response.sendRedirect("admin_login.jsp");
    }
    else{
     String ad_id = session.getAttribute("id").toString();
    String sql2 = "select * from student_login inner join students on student_login.id = students.sid where students.status='1'";
    try{
        pst = connection.prepareStatement(sql2);
       rs = pst.executeQuery();
      
    }
    catch(Exception e){
        System.out.print(e);
    }
    
 
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home :: Admin Pending Request</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-md navbar-dark fixed-top bg-dark p-2\">\n");
      out.write("      <a class=\"navbar-brand ml-3\" href=\"#\"><img src=\"pic/dpcoe.jpg\" height=\"60\" width=\"60\" class=\"img-rounded\" alt=\"dpcoe\"></a>\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsExampleDefault\" aria-controls=\"navbarsExampleDefault\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("      </button>\n");
      out.write("\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarsExampleDefault\">\n");
      out.write("        <ul class=\"navbar-nav mr-auto\">\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              <a href=\"admin_dash.jsp\"> <button type=\"button\" class=\"btn btn-info m-2 fa fa-home\"> Home</button> </a>\n");
      out.write("            \n");
      out.write("          </li>\n");
      out.write("          \n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a href=\"admin_pending.jsp\">  <button type=\"button\" class=\"btn btn-info m-2 fa fa-id-card-o active\"> Approve Pending</button> </a>\n");
      out.write("          </li>\n");
      out.write("             <li class=\"nav-item dropdown\">\n");
      out.write("            <a class=\"nav-link dropdown-toggle\" id=\"dropdown01\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Task</a>\n");
      out.write("            <div class=\"dropdown-menu\" aria-labelledby=\"dropdown01\">\n");
      out.write("              <a class=\"dropdown-item\" href=\"add_hod.jsp\">Add HOD</a>\n");
      out.write("             \n");
      out.write("        </div>\n");
      out.write("          </li>\n");
      out.write("      </ul>\n");
      out.write("          <a href=\"/StudentRegistration/logout\"><button type=\"button\" class=\"btn btn-danger float-right fa fa-sign-out\">Logout</button></a>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <main role=\"main\">\n");
      out.write("\n");
      out.write("      <!-- Main jumbotron for a primary marketing message or call to action -->\n");
      out.write("     <div class=\"jumbotron mt-5\">\n");
      out.write("          <p class=\"fa fa-mortar-board\"><kbd><span class=\"text-primary\">Admin </span> Department</kbd></p>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <h1 class=\"display-3 \">Admin</h1>\n");
      out.write("          <div class=\"fa fa-check-circle\" style=\"color:red; font-size: 20px\" data-toggle=\"tooltip\" data-placement=\"left\" title=\"You are verified Admin of DPCOE\"></div>\n");
      out.write("            </div>\n");
      out.write("            <p> Welcome to DPCOE Registration Admin DashBoard.</p>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("       <div class=\"container\">\n");
      out.write("  <h2>Pending Request:</h2>\n");
      out.write("           \n");
      out.write("  <table class=\"table table-striped\">\n");
      out.write("    <thead>\n");
      out.write("      <tr>\n");
      out.write("        <th>Name</th>\n");
      out.write("        <th>Mobile</th>\n");
      out.write("        <th>Email</th>\n");
      out.write("        <th>Approve</th>\n");
      out.write("        <th>Delete</th>\n");
      out.write("        \n");
      out.write("      </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody class=\"data\">\n");
      out.write("        ");

             String email = "";
            while(rs.next()){
         String id= rs.getString("id");
            email = rs.getString("email");
            
      out.write("\n");
      out.write("     <tr>\n");
      out.write("         <td><a href=\"summary1.jsp?id=");
      out.print(id);
      out.write('"');
      out.write('>');
      out.print(rs.getString("fname"));
      out.write(' ');
      out.print(rs.getString("mname"));
      out.write(' ');
      out.print(rs.getString("lname"));
      out.write("</a></td>\n");
      out.write("        <td>");
      out.print(rs.getString("mobile"));
      out.write("</td>\n");
      out.write("        <td>");
      out.print(rs.getString("email"));
      out.write("</td>\n");
      out.write("         <td><button id=\"");
      out.print(rs.getString("id"));
      out.write("\" type=\"button\" class=\"btn btn-primary fa fa-check accept\" style=\"font-size: 25px;\"></button></td>\n");
      out.write("        <td><button id=\"");
      out.print(rs.getString("id"));
      out.write("del\" type=\"button\" class=\"btn btn-danger fa fa-trash-o delete\" style=\"font-size: 25px;\"></button></td>\n");
      out.write("   \n");
      out.write("        </tr>\n");
      out.write("      ");
 } 
      out.write("\n");
      out.write("    </tbody>\n");
      out.write("  </table>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("    </main>\n");
      out.write("\n");
      out.write("        \n");
      out.write("      <footer class=\"container mt-5 text-center\" align=\"center\">\n");
      out.write("      <p><i class=\"fa fa-copyright\"></i> Design and Developed by Lakhan, Rahul & Prof. Varsha</p>\n");
      out.write("    </footer>\n");
      out.write("        \n");
      out.write("     <script>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("            $(\".accept\").click(function() {\n");
      out.write("    var id1 = $(this).attr('id');\n");
      out.write("            \n");
      out.write("       $.ajax({\n");
      out.write("            type : \"POST\",\n");
      out.write("            url : \"/StudentRegistration/app_pending_admin\",\n");
      out.write("           \n");
      out.write("           data: {ida: id1},\n");
      out.write("            success : function(data) {\n");
      out.write("                alert(\"You Accepted Student Register Pending Successfully !! \");\n");
      out.write("                location.reload();\n");
      out.write("                $.ajax({\n");
      out.write("                type : \"POST\",\n");
      out.write("                url : \"/StudentRegistration/EmailSendingServlet\",\n");
      out.write("           \n");
      out.write("            data: {email:\"");
      out.print(email);
      out.write("\" , subject: \"Your Registration Form is Approved !\", content: \"Hey !! NOW you can download registration form PDF.. Login to your profile to download PDF\"},\n");
      out.write("            success : function(data) {\n");
      out.write("               // console.log(data);\n");
      out.write("               // location.reload();\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("     \n");
      out.write("}); \n");
      out.write("\n");
      out.write("    \n");
      out.write("              $(\".delete\").click(function() {\n");
      out.write("    var idd = $(this).attr('id');\n");
      out.write("        var id2 = parseInt(idd);\n");
      out.write("        console.log(id2);\n");
      out.write("        if(confirm(\"Are you sure want to delete this data permanently ?\")){\n");
      out.write("       $.ajax({\n");
      out.write("            type : \"POST\",\n");
      out.write("            url : \"/StudentRegistration/del_pending_admin\",\n");
      out.write("           \n");
      out.write("           data: {id2: id2},\n");
      out.write("            success : function(data) {\n");
      out.write("                alert(\"You Deleted Student Register Request Successfully !! \");\n");
      out.write("                location.reload();\n");
      out.write("                     $.ajax({\n");
      out.write("                type : \"POST\",\n");
      out.write("                url : \"/StudentRegistration/EmailSendingServlet\",\n");
      out.write("           \n");
      out.write("            data: {email:\"");
      out.print(email);
      out.write("\" , subject: \"Your Registration Form is Deleted by Admin. !\", content: \"Hey !! Your Registration Form is Deleted by Admin. Contact Admin Department and fill registration form again \"},\n");
      out.write("            success : function(data) {\n");
      out.write("               // console.log(data);\n");
      out.write("               // location.reload();\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("        }\n");
      out.write("     \n");
      out.write("}); \n");
      out.write("\n");
      out.write("\n");
      out.write(" </script>\n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");

}
}
catch(Exception e){
    response.sendRedirect("admin_login.jsp");
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
