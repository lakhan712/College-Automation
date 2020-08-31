package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class admin_005fdash_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    ");

    try{
        session = request.getSession(false);
        String id1 = session.getAttribute("id").toString();
    if(id1.equals("")){
        response.sendRedirect("admin_login.jsp");
    }
    else{
        String ad_id = session.getAttribute("id").toString();
          session.setAttribute("ad_id", ad_id);
 
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home :: Admin Dashboard</title>\n");
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
      out.write("<script src=\"js/tableExport.js\"></script>\n");
      out.write("<script src=\"js/jquery.base64.js\"></script>\n");
      out.write(" </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("      <nav class=\"navbar navbar-expand-md navbar-dark fixed-top bg-dark p-2\">\n");
      out.write("      <a class=\"navbar-brand ml-3\" href=\"#\"><img src=\"pic/dpcoe.jpg\" height=\"60\" width=\"60\" class=\"img-rounded\" alt=\"dpcoe\"></a>\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsExampleDefault\" aria-controls=\"navbarsExampleDefault\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("      </button>\n");
      out.write("\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarsExampleDefault\">\n");
      out.write("        <ul class=\"navbar-nav mr-auto\">\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              <a href=\"admin_dash.jsp\"><button type=\"button\" class=\"btn btn-info m-2 fa fa-home active\"> Home</button> </a>\n");
      out.write("            \n");
      out.write("          </li>\n");
      out.write("          \n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a href=\"admin_pending.jsp\">  <button type=\"button\" class=\"btn btn-info m-2 fa fa-id-card-o\"> Approve Pending</button> </a>\n");
      out.write("          </li>\n");
      out.write("             <li class=\"nav-item dropdown\">\n");
      out.write("            <a class=\"nav-link dropdown-toggle\" id=\"dropdown01\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Task</a>\n");
      out.write("            <div class=\"dropdown-menu\" aria-labelledby=\"dropdown01\">\n");
      out.write("              <a class=\"dropdown-item\" href=\"add_hod.jsp\">Add HOD</a>\n");
      out.write("        \n");
      out.write("              <a class=\"dropdown-item\" href=\"approve_bonafide.jsp\">Approve Bonafide</a>\n");
      out.write("        </div>\n");
      out.write("          </li>\n");
      out.write("      </ul>\n");
      out.write("          <a href=\"/StudentRegistration/logout\"><button type=\"button\" class=\"btn btn-danger float-right fa fa-sign-out\"> Logout</button></a>\n");
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
      out.write("\n");
      out.write("      <div class=\"container\">\n");
      out.write("          \n");
      out.write("         \n");
      out.write("  <h2>Summary</h2>\n");
      out.write(" \n");
      out.write(" \n");
      out.write("<input type=\"text\" id=\"myInput\" onkeyup=\"myFunction()\" placeholder=\"Search for names..\" title=\"Type in a name\">\n");
      out.write("<label for=\"year\">Select Year:</label>\n");
      out.write("  <select name=\"branch\" id=\"branch\" style=\"display:inline-block;\">\n");
      out.write("      <option value=\"\">Select Branch:</option>\n");
      out.write("  ");

    String year = "select * from master_branch";
    pst = connection.prepareStatement(year);
    ResultSet rs1 = pst.executeQuery();
    while(rs1.next()){
    
      out.write("\n");
      out.write("    <option value=\"");
      out.print(rs1.getString("id"));
      out.write('"');
      out.write('>');
      out.print(rs1.getString("branch_name"));
      out.write("</option>\n");
      out.write("    ");
  
    }
  
      out.write("\n");
      out.write("  </select>\n");
      out.write("  <div class=\"pull-right\" style=\" padding: 10px;\">\n");
      out.write("          <a href=\"#\" onclick=\"$('.excel').tableExport({type:'excel',escape:'false'});\">Export Excel</a>\n");
      out.write("  </div>\n");
      out.write("  <table id=\"myTable\" class=\"excel\">\n");
      out.write(" <thead>\n");
      out.write("    <th>Name</th>\n");
      out.write("    <th>Mobile</th>\n");
      out.write("    <th>Nationality</th>\n");
      out.write("    <th>DOB</th>\n");
      out.write("    <th>Category</th>\n");
      out.write("    <th>Year</th>\n");
      out.write("    <th>Blood Group</th>\n");
      out.write("    <th>Caste</th>\n");
      out.write("    <th>Religion</th>\n");
      out.write("    <th>Gender</th>\n");
      out.write("    <th>Birthplace</th>\n");
      out.write("    <th>Email-ID</th>\n");
      out.write("    <th>Admission Type</th>\n");
      out.write("    <th>Present Address</th>\n");
      out.write("    <th>Permanent Address</th>\n");
      out.write("    <th>Adhaar No</th>\n");
      out.write("    <th>Pan No</th>\n");
      out.write("    <th>Father Name</th>\n");
      out.write("    <th>Mother Name</th>\n");
      out.write("    <th>Parent Mobile</th>\n");
      out.write("    <th>Parent Email Id</th>\n");
      out.write("    <th>Education</th>\n");
      out.write("    <th>Occupation</th>\n");
      out.write("    <th>Designation</th>\n");
      out.write("    <th>Guardian Name</th>\n");
      out.write("    <th>Guardian Mobile No</th>\n");
      out.write("    <th>Relation with Guardian</th>\n");
      out.write("    <th>Guardian Address</th>\n");
      out.write("  </thead>\n");
      out.write("  <tbody id=\"data\">   \n");
      out.write("      ");

       String sql3 = "SELECT sl.fname,sl.mname,sl.lname,sl.branch,cd.sid,cd.state,cd.city,cd.hometown,"
             + "cd.pin,g.sid,g.fname,g.mname,g.lname,g.mobile,g.relation,g.state,g.city,g.hometown,g.pin,"
             + "pd.sid,pd.state,pd.city,pd.hometown,pd.pin,s.category,s.year,s.blood,s.DOB,s.bplace,s.nationality,"
             + "s.caste,s.pan_no,s.adhar_no,s.status,s.admission,s.sid,sl.gender,sl.email,sl.mobile,sl.id,p.sid,p.fname,"
             + "p.mname,p.lname,p.mobile,p.mother_name,p.education ,p.occupation,p.designation,s.religion,p.email FROM student_login sl,"
             + "c_address cd,guardian g,p_address pd,students s,parent p where s.status='2' and s.sid = sl.id and cd.sid = sl.id "
             + "and g.sid = sl.id and pd.sid = sl.id and s.sid = sl.id and p.sid = sl.id";
    try{
        pst = connection.prepareStatement(sql3);
       rs = pst.executeQuery();
       
    
            while(rs.next()){
            String id = rs.getString("id");
            
      out.write("\n");
      out.write("  <tr>     \n");
      out.write("    <td> <a href=\"summary1.jsp?id=");
      out.print(id);
      out.write('"');
      out.write('>');
      out.print(rs.getString("sl.fname"));
      out.write(' ');
      out.print(rs.getString("sl.mname"));
      out.write(' ');
      out.print(rs.getString("sl.lname"));
      out.write("</a></td>\n");
      out.write("    <td>");
      out.print(rs.getString("sl.mobile"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("s.nationality"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("s.DOB"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("s.category"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("s.year"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("s.blood"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("s.caste"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("s.religion"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("sl.gender"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("s.bplace"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("sl.email"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("s.admission"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("cd.hometown"));
      out.write(',');
      out.print(rs.getString("cd.city"));
      out.write(',');
      out.print(rs.getString("cd.state"));
      out.write(",Pin:");
      out.print(rs.getString("cd.pin"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("pd.hometown"));
      out.write(',');
      out.print(rs.getString("pd.city"));
      out.write(',');
      out.print(rs.getString("pd.state"));
      out.write(",Pin:");
      out.print(rs.getString("pd.pin"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("s.adhar_no"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("s.pan_no"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("p.lname"));
      out.write("&nbsp;");
      out.print(rs.getString("p.fname"));
      out.write("&nbsp;");
      out.print(rs.getString("p.mname"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("p.mother_name"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("p.mobile"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("p.email"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("p.education"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("p.occupation"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("p.designation"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("g.lname"));
      out.write("&nbsp;");
      out.print(rs.getString("g.fname"));
      out.write("&nbsp;");
      out.print(rs.getString("g.mname"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("g.mobile"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("g.relation"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("g.hometown"));
      out.write(',');
      out.print(rs.getString("g.city"));
      out.write(',');
      out.print(rs.getString("g.state"));
      out.write(",Pin:");
      out.print(rs.getString("g.pin"));
      out.write("</td>\n");
      out.write("  </tr>\n");
      out.write("  ");

      }
  
      out.write("\n");
      out.write("  </tbody>\n");
      out.write("  ");

  }
  catch(Exception e){
        System.out.print(e);
    }
  
      out.write("\n");
      out.write("</table>\n");
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
      out.write("$(\"#branch\").change(function() {\n");
      out.write("           var id1 = $(this).val();    \n");
      out.write("       $.ajax({\n");
      out.write("            type : \"POST\",\n");
      out.write("            url : \"/StudentRegistration/StudentBranch\",\n");
      out.write("           \n");
      out.write("           data: {branch: id1},\n");
      out.write("            success : function(data) {\n");
      out.write("                console.log(data);\n");
      out.write("                $(\"#data\").html(data);\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("     \n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    </main>\n");
      out.write("\n");
      out.write("        \n");
      out.write("      <footer class=\"container mt-5 text-center\" align=\"center\">\n");
      out.write("      <p><i class=\"fa fa-copyright\"></i> Design and Developed by Lakhan, Rahul & Prof. Varsha</p>\n");
      out.write("    </footer>\n");
      out.write("        \n");
      out.write("  \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("    <script src=\"js/popper.min.js\"></script>\n");
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
