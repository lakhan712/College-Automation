package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
import java.sql.*;

public final class hod_005fhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
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
      out.write("        <title>Home :: HOD Dashboard</title>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("* {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myInput {\n");
      out.write("  background-image: url('/css/searchicon.png');\n");
      out.write("  background-position: 10px 10px;\n");
      out.write("  background-repeat: no-repeat;\n");
      out.write("  width: 100%;\n");
      out.write("  font-size: 16px;\n");
      out.write("  padding: 12px 20px 12px 40px;\n");
      out.write("  border: 1px solid #ddd;\n");
      out.write("  margin-bottom: 12px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myTable {\n");
      out.write("  border-collapse: collapse;\n");
      out.write("  width: 100%;\n");
      out.write("  border: 1px solid #ddd;\n");
      out.write("  font-size: 18px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myTable th, #myTable td {\n");
      out.write("  text-align: left;\n");
      out.write("  padding: 12px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myTable tr {\n");
      out.write("  border-bottom: 1px solid #ddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myTable tr.header, #myTable tr:hover {\n");
      out.write("  background-color: #f1f1f1;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("             ");

      String name="";
      String bid="";
      String branch="";
//        out.print(id);
        
        PrintWriter out1=response.getWriter();
        
        String sql2 = "select * from master_hod where id='"+id+"'";
    try{
        pst = connection.prepareStatement(sql2);
       rs = pst.executeQuery();
       if(rs.next()){
        name  = rs.getString("name");
         bid  = rs.getString("bid");

     session.setAttribute("bid", bid);
       }
    }
    catch(Exception e){
        System.out.print(e);
    }
    
//    new for getting bid

String sql3 = "select * from master_branch where id='"+bid+"'";
 try{
     pst=connection.prepareStatement(sql3);
     rs=pst.executeQuery();
     if(rs.next()){
         branch = rs.getString("branch_name");
          session.setAttribute("branch", rs.getString("branch_name"));
     }
 }catch(Exception e){
     System.out.print(e);
 }
        
//    new for getting all students of department....

String sql5 = "select * from student_login where branch ='"+bid+"'";
 try{
     pst=connection.prepareStatement(sql5);
     rs=pst.executeQuery();
    
 }catch(Exception e){
     System.out.print(e);
 }

 
      out.write("\n");
      out.write("        \n");
      out.write("      <nav class=\"navbar navbar-expand-md navbar-dark fixed-top bg-dark p-2\">\n");
      out.write("      <a class=\"navbar-brand ml-3\" href=\"#\"><img src=\"pic/dpcoe.jpg\" height=\"60\" width=\"60\" class=\"img-rounded\" alt=\"dpcoe\"></a>\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsExampleDefault\" aria-controls=\"navbarsExampleDefault\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("      </button>\n");
      out.write("\n");
      out.write("     <div class=\"collapse navbar-collapse\" id=\"navbarsExampleDefault\">\n");
      out.write("        <ul class=\"navbar-nav mr-auto\">\n");
      out.write("          <li class=\"nav-item \">\n");
      out.write("              <a href=\"hod_home.jsp\">  <button type=\"button\" class=\"btn btn-info m-2 fa fa-home active\"> Home</button></a>\n");
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
      out.write("         <a href=\"/StudentRegistration/logout\"><button type=\"button\" class=\"btn btn-danger float-right fa fa-sign-out\"> Logout</button></a>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <main role=\"main\">\n");
      out.write("\n");
      out.write("      <!-- Main jumbotron for a primary marketing message or call to action -->\n");
      out.write("      <div class=\"jumbotron mt-5\">\n");
      out.write("          <p class=\"fa fa-mortar-board\"><kbd><span class=\"text-primary\">HOD </span>");
      out.print(branch);
      out.write(" Department</kbd></p>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <h1 class=\"display-3 \">");
      out.print(name);
      out.write("</h1>\n");
      out.write("          <div class=\"fa fa-check-circle\" style=\"color:red; font-size: 20px\" data-toggle=\"tooltip\" data-placement=\"left\" title=\"You are verified HOD of DPCOE\"></div>\n");
      out.write("            </div>\n");
      out.write("            <p> Welcome to DPCOE Registration HOD DashBoard.</p>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("\n");
      out.write("     <div class=\"container\">\n");
      out.write("         \n");
      out.write("  <h2>All Students Summary:</h2>\n");
      out.write("          \n");
      out.write("  <input type=\"text\" id=\"myInput\" onkeyup=\"myFunction()\" placeholder=\"Search for names..\" title=\"Type in a name\">\n");
      out.write("  <label for=\"year\">Select Year:</label>\n");
      out.write("  <select name=\"year\" id=\"year\" style=\"display:inline-block;\">\n");
      out.write("      <option value=\"\">Select Year</option>\n");
      out.write("  ");

    String year = "select * from master_year";
    pst = connection.prepareStatement(year);
    ResultSet rs1 = pst.executeQuery();
    while(rs1.next()){
    
      out.write("\n");
      out.write("    <option value=\"");
      out.print(rs1.getString("year"));
      out.write('"');
      out.write('>');
      out.print(rs1.getString("year"));
      out.write("</option>\n");
      out.write("    ");
  
    }
  
      out.write("\n");
      out.write("  </select>\n");
      out.write("  <table id=\"myTable\">\n");
      out.write("  <tr class=\"header\">\n");
      out.write("      \n");
      out.write("    <th style=\"width:35%;\">Name</th>\n");
      out.write("    <th style=\"width:35%;\">Mobile</th>\n");
      out.write("    <th style=\"width:30%;\">Department</th>\n");
      out.write("  </tr>\n");
      out.write("  <tbody id=\"data\">\n");
      out.write("      ");
      out.write("\n");
      out.write("   ");

            while(rs.next()){
                
            String st_id = rs.getString("id");
            
            
      out.write("\n");
      out.write("  <tr>\n");
      out.write("      \n");
      out.write("      <td>");
      out.print(rs.getString("fname"));
      out.write(' ');
      out.print(rs.getString("mname"));
      out.write(' ');
      out.print(rs.getString("lname"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("mobile"));
      out.write("</td>\n");
      out.write("    \n");
      out.write("    ");

  String bid1= rs.getString("branch");
    
     String sqlbr="select * from master_branch where id="+bid1;
     PreparedStatement pst1= connection.prepareStatement(sqlbr);
     ResultSet rs2 = pst1.executeQuery();
     while(rs2.next()){
   
  
      out.write("\n");
      out.write("   <td>");
      out.print(rs2.getString("branch_name"));
      out.write("</td>\n");
      out.write("   ");

          }
          
      out.write("\n");
      out.write("  </tr>\n");
      out.write("   ");
 a++; }  
      out.write("\n");
      out.write("     \n");
      out.write("   ");
 a=1;
      out.write("\n");
      out.write("  </tbody>\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    </main>\n");
      out.write("\n");
      out.write("        \n");
      out.write("      <footer class=\"container mt-5 text-center\" align=\"center\">\n");
      out.write("      <p><i class=\"fa fa-copyright\"></i> Design and Developed by Lakhan, Rahul & Prof. Varsha</p>\n");
      out.write("    </footer>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("function myFunction() {\n");
      out.write("  var input, filter, table, tr, td, i;\n");
      out.write("  input = document.getElementById(\"myInput\");\n");
      out.write("  filter = input.value.toUpperCase();\n");
      out.write("  table = document.getElementById(\"myTable\");\n");
      out.write("  tr = table.getElementsByTagName(\"tr\");\n");
      out.write("  for (i = 0; i < tr.length; i++) {\n");
      out.write("    td = tr[i].getElementsByTagName(\"td\")[0];\n");
      out.write("    if (td) {\n");
      out.write("      if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {\n");
      out.write("        tr[i].style.display = \"\";\n");
      out.write("      } else {\n");
      out.write("        tr[i].style.display = \"none\";\n");
      out.write("      }\n");
      out.write("    }       \n");
      out.write("  }\n");
      out.write("}\n");
      out.write("$(\"#year\").change(function() {\n");
      out.write("           var id1 = $(this).val();\n");
      out.write("        console.log(id1);\n");
      out.write("        \n");
      out.write("       $.ajax({\n");
      out.write("            type : \"POST\",\n");
      out.write("            url : \"/StudentRegistration/StudentYear\",\n");
      out.write("           \n");
      out.write("           data: {year: id1},\n");
      out.write("            success : function(data) {\n");
      out.write("                console.log(data);\n");
      out.write("                $(\"#data\").html(data);\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("     \n");
      out.write("});\n");
      out.write("</script>\n");

}
}
catch(Exception e){
    response.sendRedirect("hod_login.jsp");
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
