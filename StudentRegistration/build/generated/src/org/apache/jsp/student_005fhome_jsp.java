package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class student_005fhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    try{
        session = request.getSession(false);
    String id = session.getAttribute("st_id").toString();
    if(session != null && !session.isNew()) {
    } else {
    response.sendRedirect("/login.jsp");
    }
    if(id.equals("")){
        response.sendRedirect("index.jsp");
    }
    else{
 
      out.write("\n");
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
      out.write("        <title>Home :: Student Dashboard</title>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("      .dropdown:hover .dropdown-menu {\n");
      out.write("    display: block;\n");
      out.write("    margin-top: 0; \n");
      out.write(" }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

        session = request.getSession(false);
        //String id=session.getAttribute("st_id").toString();
        String fname="";
        String mname="";
        String lname="";
        String mobile="";
        String email="";
        String gender="";
        String tg_id="";
        String name1="";
        String email1="";
        String mobile1="";
        String b_id="";
        String dep="";
        out.print(id);
        
        
        
        String sql = "select * from student_login where id='"+id+"'";
    try{
       pst = connection.prepareStatement(sql);
        rs = pst.executeQuery();
       if(rs.next()){
        fname = rs.getString("fname");
        mname = rs.getString("mname");
        lname = rs.getString("lname");
        mobile = rs.getString("mobile");
        email = rs.getString("email");
        gender = rs.getString("gender");
       tg_id = rs.getString("tg_id");
       b_id = rs.getString("branch");
//      session.setAttribute("fname", fname);
       }
    }
    catch(Exception e){
        System.out.print(e);
    }
    
// tg info

       String sql2 = "select * from master_tg where id='"+tg_id+"'";
    try{
       pst = connection.prepareStatement(sql2);
        rs = pst.executeQuery();
       if(rs.next()){
        name1 = rs.getString("name");
        email1 = rs.getString("email");
        mobile1 = rs.getString("mobile");
     
//      session.setAttribute("fname", fname);
       }
    }
    catch(Exception e){
        System.out.print(e);
    }
    
// department info

       String sql3 = "select * from master_branch where id='"+b_id+"'";
    try{
       pst = connection.prepareStatement(sql3);
        rs = pst.executeQuery();
       if(rs.next()){
        dep = rs.getString("branch_name");
        
       
//      session.setAttribute("fname", fname);
       }
    }
    catch(Exception e){
        System.out.print(e);
    }
        
 
      out.write("\n");
      out.write("            \n");
      out.write("           \n");
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
      out.write("          <li class=\"nav-item\">\n");
      out.write("              <button type=\"button\" class=\"btn btn-info m-2 fa fa-home active\"> Home</button>\n");
      out.write("            \n");
      out.write("          </li>\n");
      out.write("          \n");
      out.write("<!--          Original code\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              <a href=\"registration.jsp\">  <button type=\"button\" class=\"btn btn-info m-2 fa fa-id-card-o\"> Registration</button> </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              <a href=\"requestForm.jsp\"><button type=\"button\" class=\"btn btn-info m-2 fa fa-download\"> Download</button></a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              end-->\n");
      out.write("              \n");
      out.write("              \n");
      out.write("<!--             <div class=\"dropdown\">\n");
      out.write("  <button class=\"btn btn-secondary dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("    Task button\n");
      out.write("  </button>\n");
      out.write("  <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\">\n");
      out.write("    <a class=\"dropdown-item\" href=\"#\">Apply for Bonafide</a>\n");
      out.write("    <button type=\"button\" class=\"btn btn-primary dropdown-item\" data-toggle=\"modal\" data-target=\"#exampleModal\">\n");
      out.write("  Apply for Bonafide\n");
      out.write("</button>\n");
      out.write("    <a class=\"dropdown-item\" href=\"#\">Apply for LC</a>\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</div>-->\n");
      out.write("\n");
      out.write("        <!--          Edited-->\n");
      out.write("               <li class=\"nav-item dropdown\">\n");
      out.write("            <a class=\"nav-link dropdown-toggle\" id=\"dropdown01\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Registration</a>\n");
      out.write("            <div class=\"dropdown-menu\" aria-labelledby=\"dropdown01\">\n");
      out.write("             \n");
      out.write("        <a class=\"dropdown-item\" href=\"registration.jsp\">  <button type=\"button\" class=\"btn btn-info m-2 fa fa-id-card-o\"> Apply for Registration form</button> </a>\n");
      out.write("              \n");
      out.write("                <a class=\"dropdown-item\" href=\"requestForm.jsp\"><button type=\"button\" class=\"btn btn-info m-2 fa fa-download\"> Download Registration form</button></a>\n");
      out.write("        </div>\n");
      out.write("          </li>\n");
      out.write("<!--          End Edited-->\n");
      out.write("\n");
      out.write("\n");
      out.write("          </li>\n");
      out.write("<!--          Edited-->\n");
      out.write("               <li class=\"nav-item dropdown\">\n");
      out.write("            <a class=\"nav-link dropdown-toggle\" id=\"dropdown01\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Actions</a>\n");
      out.write("            <div class=\"dropdown-menu\" aria-labelledby=\"dropdown01\">\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">  <button type=\"button\" class=\"btn btn-info m-2 fa fa-id-card-o\" data-toggle=\"modal\" data-target=\"#exampleModal\"> Apply for Bonafide</button> </a>\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">  <button type=\"button\" class=\"btn btn-info m-2 fa fa-id-card-o\"> Apply for LC</button> </a>\n");
      out.write(" \n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("          </li>\n");
      out.write("<!--          End Edited-->\n");
      out.write("        </ul>\n");
      out.write("          <a href=\"/StudentRegistration/logout\"><button type=\"button\" class=\"btn btn-danger float-right fa fa-sign-out\"> Logout </button></a>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <main role=\"main\">\n");
      out.write("\n");
      out.write("      <!-- Main jumbotron for a primary marketing message or call to action -->\n");
      out.write("      <div class=\"jumbotron mt-5\">\n");
      out.write("          <p class=\"fa fa-mortar-board\"> <kbd>");
      out.print(dep);
      out.write(" Department</kbd></p>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <h1 class=\"display-3 \">");
      out.print(fname);
      out.write(" </h1>\n");
      out.write("                <script>\n");
      out.write("                    \n");
      out.write("                </script>\n");
      out.write("          <div class=\"fa fa-check-circle\" style=\"color:green; font-size: 20px\" data-toggle=\"tooltip\" data-placement=\"left\" title=\"You are verified Student of DPCOE\"></div>\n");
      out.write("            </div>\n");
      out.write("            <p> Welcome to DPCOE Registration.</p>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <!-- Example row of columns -->\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-4\">\n");
      out.write("            <h2>Your Data:</h2>\n");
      out.write("            <p>Name: ");
      out.print(fname);
      out.write(' ');
      out.print(mname);
      out.write(' ');
      out.print(lname);
      out.write(" </p>\n");
      out.write("            <p>Email-ID: ");
      out.print(email);
      out.write(" </p>\n");
      out.write("            <p>Mobile: ");
      out.print(mobile);
      out.write(" </p>\n");
      out.write("            <p>Gender: ");
      out.print(gender);
      out.write(" </p>\n");
      out.write("            <p>Department: ");
      out.print(dep);
      out.write(" </p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-4\">\n");
      out.write("            <h2>TG Data:</h2>\n");
      out.write("            <p>Name: ");
      out.print(name1);
      out.write(" </p>\n");
      out.write("            <p>Email-ID: ");
      out.print(email1);
      out.write(" </p>\n");
      out.write("            <p>Mobile: ");
      out.print(mobile1);
      out.write(" </p>\n");
      out.write("            \n");
      out.write("           \n");
      out.write("          </div>\n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("      </div> <!-- /container -->\n");
      out.write("\n");
      out.write("    </main>\n");
      out.write("\n");
      out.write("        \n");
      out.write("     <footer class=\"container mt-5 text-center\" align=\"center\">\n");
      out.write("      <p><i class=\"fa fa-copyright\"></i> Design and Developed by Lakhan, Rahul & Prof. Varsha</p>\n");
      out.write("    </footer>\n");
      out.write("            \n");
      out.write("<!--            Modal form for Bonafide Start -->\n");
      out.write("            \n");
      out.write("  <!-- Modal -->\n");
      out.write("<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Please Enter data.</h5>\n");
      out.write("       \n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">         \n");
      out.write("          <form onsubmit=\"return msg();\" action=\"Request_Bonafide\" method=\"post\">\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("      <div class=\"input-group mb-3\">\n");
      out.write("  <div class=\"input-group-prepend\">\n");
      out.write("    <label class=\"input-group-text\" for=\"inputGroupSelect01\">Select Current year type</label>\n");
      out.write("  </div>\n");
      out.write("          \n");
      out.write("  <select class=\"custom-select\" id=\"c_year_type\" name=\"c_year_type\">\n");
      out.write("    <option value=\"First Year\">First Year</option>\n");
      out.write("  <option value=\"Second Year\">Second Year</option>\n");
      out.write("  <option value=\"Third Year\">Third Year</option>\n");
      out.write("  <option value=\"Fourth Year\">Fourth Year</option>\n");
      out.write("  </select>\n");
      out.write("</div>\n");
      out.write("      <div class=\"input-group mb-3\">\n");
      out.write("  <div class=\"input-group-prepend\">\n");
      out.write("    <label class=\"input-group-text\" for=\"inputGroupSelect01\">Select Admission year type</label>\n");
      out.write("  </div>\n");
      out.write("  <select class=\"custom-select\" id=\"admission_year_type\" name=\"admission_year_type\">\n");
      out.write("      <option value=\"First Year\">First Year</option>\n");
      out.write("  <option value=\"Direct Second Year\">Direct Second Year</option>\n");
      out.write("  <option value=\"M.E.\">M.E.</option>\n");
      out.write("  <option value=\"M.B.A.\">M.B.A.</option>\n");
      out.write("  </select>\n");
      out.write("</div>\n");
      out.write("    <input type=\"text\" class=\"form-control\" name=\"A_year\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"Enter Year of Admission eg. 2018\">\n");
      out.write("    <div class=\"row\"><br></div>\n");
      out.write("    <input type=\"text\" class=\"form-control\" name=\"purpose\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"Enter purpose/subject for bonafide.\">\n");
      out.write("    <input type=\"text\" name=\"id\" value=\"");
      out.print(id);
      out.write("\" hidden>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("</form>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("function msg() {\n");
      out.write("\n");
      out.write("    alert(\"Go to Admin Department to Collect your Bonafide\");\n");
      out.write("\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("    \n");
      out.write("</html>\n");

}
}
catch(Exception e){
    response.sendRedirect("index.jsp");
}

      out.write('\n');
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
