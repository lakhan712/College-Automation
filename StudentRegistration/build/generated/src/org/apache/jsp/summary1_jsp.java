package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class summary1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write('\n');

  try{
      session = request.getSession(false);
 String ad_id = session.getAttribute("ad_id").toString();
 
 if(ad_id.equals("")){
     response.sendRedirect("admin_login.jsp");
 }
 else{

      out.write('\n');
      out.write('\n');

   String id = request.getParameter("id");
    //String id = "3";
    String sql = "SELECT sl.fname,sl.mname,sl.lname,sl.branch,cd.sid,cd.state,cd.city"
            + ",cd.hometown,cd.pin,g.sid,g.fname,g.mname,g.lname,g.mobile,g.relation,g.state,g.city,"
            + "g.hometown,g.pin,pd.sid,pd.state,pd.city,pd.hometown,pd.pin,s.category,s.branch,s.year,"
            + "s.blood,s.DOB,s.bplace,s.nationality,s.caste,s.pan_no,s.adhar_no,s.status,s.sid,sl.gender,"
            + "sl.email,sl.mobile,sl.id,p.sid,p.fname,p.mname,p.lname,p.mobile,p.mother_name,p.education ,"
            + "p.occupation,p.designation,s.religion,p.email ,master_branch.id,"
            + "master_branch.branch_name FROM student_login sl INNER JOIN master_branch master_branch ON "
            + "sl.branch = master_branch.id,c_address cd,guardian g,p_address pd,students s,parent p "
            + "WHERE sl.id = '"+id+"' and cd.sid = '"+id+"' and g.sid = '"+id+"' and pd.sid = '"+id+"' and s.sid = '"+id+"' and p.sid = '"+id+"' and sl.branch = master_branch.id";
    try{
    pst = connection.prepareStatement(sql);
    rs = pst.executeQuery();
    if(rs.next()){
         // = rs.getString("branch_name");
    //System.out.print(rs.getString("sl.fname"));

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>:: Student Detail</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     <nav class=\"navbar navbar-expand-md navbar-dark fixed-top bg-dark p-2\">\n");
      out.write("      <a class=\"navbar-brand ml-3\" href=\"#\"><img src=\"pic/dpcoe.jpg\" height=\"60\" width=\"60\" class=\"img-rounded\" alt=\"dpcoe\"></a>\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsExampleDefault\" aria-controls=\"navbarsExampleDefault\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("      </button>\n");
      out.write("\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarsExampleDefault\">\n");
      out.write("        <ul class=\"navbar-nav mr-auto\">\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              <a href=\"admin_dash.jsp\"><button type=\"button\" class=\"btn btn-info m-2 fa fa-home\"> Home</button> </a>\n");
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
      out.write("        </div>\n");
      out.write("          </li>\n");
      out.write("      </ul>\n");
      out.write("          <a href=\"/StudentRegistration/logout\"><button type=\"button\" class=\"btn btn-danger float-right fa fa-sign-out\"> Logout</button></a>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("  <main role=\"main\">\n");
      out.write("        <div style=\"margin-top: 7%;\">\n");
      out.write("             <div class=\"container\">\n");
      out.write("  <h2>Student Details:</h2>\n");
      out.write("  <div id=\"accordion\">\n");
      out.write("    <div class=\"card\">\n");
      out.write("      <div class=\"card-header\">\n");
      out.write("        <a class=\"card-link\" data-toggle=\"collapse\" href=\"#collapseOne\">\n");
      out.write("          Personal Details :\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"collapseOne\" class=\"collapse\" data-parent=\"#accordion\">\n");
      out.write("        <div class=\"card-body\">\n");
      out.write("            <h6 style=\"display: inline-block\">Name:</h6> &nbsp;<div style=\"display: inline-block\">");
      out.print(rs.getString("sl.lname"));
      out.write("&nbsp;");
      out.print(rs.getString("sl.fname"));
      out.write("&nbsp;");
      out.print(rs.getString("sl.mname"));
      out.write("</div>\n");
      out.write("        \n");
      out.write("            <h6 class=\"ml-5\" style=\"display: inline-block\">DOB: </h6> &nbsp;<div style=\"display: inline-block\">");
      out.print(rs.getString("s.DOB"));
      out.write("</div>\n");
      out.write("        \n");
      out.write("            <h6 class=\"ml-5\" style=\"display: inline-block\">Nationality: </h6> &nbsp;<div style=\"display: inline-block\">");
      out.print(rs.getString("s.nationality"));
      out.write("</div>\n");
      out.write("       \n");
      out.write("            <h6 class=\"ml-5\" style=\"display: inline-block\">Category: </h6> &nbsp;<div style=\"display: inline-block\">");
      out.print(rs.getString("s.category"));
      out.write("</div><br/>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("<!--        break -->\n");
      out.write("        \n");
      out.write("        <div class=\"card-body\">\n");
      out.write("            <h6 style=\"display: inline-block\">Year: </h6> &nbsp;<div style=\"display: inline-block\">");
      out.print(rs.getString("s.year"));
      out.write("</div>\n");
      out.write("        \n");
      out.write("            <h6  class=\"ml-5\" style=\"display: inline-block\">Blood Group: </h6> &nbsp;<div style=\"display: inline-block\">");
      out.print(rs.getString("s.blood"));
      out.write("</div>\n");
      out.write("        \n");
      out.write("            <h6 class=\"ml-5\" style=\"display: inline-block\">Caste: </h6> &nbsp;<div style=\"display: inline-block\">");
      out.print(rs.getString("s.caste"));
      out.write("</div>\n");
      out.write("       \n");
      out.write("            <h6 class=\"ml-5\"  style=\"display: inline-block\">Religion: </h6> &nbsp;<div style=\"display: inline-block\">");
      out.print(rs.getString("s.religion"));
      out.write("</div><br/>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("<!--        break-->\n");
      out.write("        \n");
      out.write("        <div class=\"card-body\">\n");
      out.write("            <h6 style=\"display: inline-block\">Gender: </h6> &nbsp;<div style=\"display: inline-block\">");
      out.print(rs.getString("sl.gender"));
      out.write("</div>\n");
      out.write("       \n");
      out.write("            <h6 class=\"ml-5\" style=\"display: inline-block\">Birthplace: </h6> &nbsp;<div style=\"display: inline-block\">");
      out.print(rs.getString("s.bplace"));
      out.write("</div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("        </div>    \n");
      out.write("        \n");
      out.write("<!--         Next Page  -->\n");
      out.write("            \n");
      out.write("    \n");
      out.write("    <div class=\"card\">\n");
      out.write("      <div class=\"card-header\">\n");
      out.write("        <a class=\"collapsed card-link\" data-toggle=\"collapse\" href=\"#collapseTwo\">\n");
      out.write("        Contact Details:\n");
      out.write("      </a>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"collapseTwo\" class=\"collapse\" data-parent=\"#accordion\">\n");
      out.write("        <div class=\"card-body\">\n");
      out.write("            <h6 style=\"display: inline-block\">Email-ID:</h6> &nbsp;<div style=\"display: inline-block\">");
      out.print(rs.getString("sl.email"));
      out.write("</div>\n");
      out.write("        \n");
      out.write("            <h6 class=\"ml-5\" style=\"display: inline-block\">Mobile: </h6> &nbsp;<div style=\"display: inline-block\">");
      out.print(rs.getString("sl.mobile"));
      out.write("</div><br>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"card-body\">\n");
      out.write("            <h6  style=\"display: inline-block\">Present Address: </h6><br>\n");
      out.write("            <h6  style=\"display: inline-block\"> State: </h6> &nbsp;<div style=\"display: inline-block\">");
      out.print(rs.getString("cd.state"));
      out.write("</div>\n");
      out.write("       \n");
      out.write("            <h6 class=\"ml-5\" style=\"display: inline-block\">City: </h6> &nbsp;<div style=\"display: inline-block\">");
      out.print(rs.getString("cd.city"));
      out.write("</div>\n");
      out.write("            <h6 class=\"ml-5\" style=\"display: inline-block\">Hometown: </h6> &nbsp;<div style=\"display: inline-block\">");
      out.print(rs.getString("cd.hometown"));
      out.write("</div>\n");
      out.write("            <h6 class=\"ml-5\" style=\"display: inline-block\">Pin Code: </h6> &nbsp;<div style=\"display: inline-block\">");
      out.print(rs.getString("cd.pin"));
      out.write("</div><br>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("<!--        break -->\n");
      out.write("        \n");
      out.write("        <div class=\"card-body\">\n");
      out.write("            <h6  style=\"display: inline-block\">Permanent Address: </h6><br>\n");
      out.write("              <h6  style=\"display: inline-block\"> State: </h6> &nbsp;<div style=\"display: inline-block\">");
      out.print(rs.getString("pd.state"));
      out.write("</div>\n");
      out.write("       \n");
      out.write("            <h6 class=\"ml-5\" style=\"display: inline-block\">City: </h6> &nbsp;<div style=\"display: inline-block\">");
      out.print(rs.getString("pd.city"));
      out.write("</div>\n");
      out.write("            <h6 class=\"ml-5\" style=\"display: inline-block\">Hometown: </h6> &nbsp;<div style=\"display: inline-block\">");
      out.print(rs.getString("pd.hometown"));
      out.write("</div>\n");
      out.write("            <h6 class=\"ml-5\" style=\"display: inline-block\">Pin Code: </h6> &nbsp;<div style=\"display: inline-block\">");
      out.print(rs.getString("pd.pin"));
      out.write("</div><br>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("<!--        break-->\n");
      out.write("        \n");
      out.write("        <div class=\"card-body\">\n");
      out.write("            <h6 style=\"display: inline-block\">Adhaar No: </h6> &nbsp;<div style=\"display: inline-block\">");
      out.print(rs.getString("s.adhar_no"));
      out.write("</div>\n");
      out.write("       \n");
      out.write("            <h6 class=\"ml-5\" style=\"display: inline-block\">Pan No: </h6> &nbsp;<div style=\"display: inline-block\">");
      out.print(rs.getString("s.pan_no"));
      out.write("</div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("        <!--         Next Page  -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"card\">\n");
      out.write("      <div class=\"card-header\">\n");
      out.write("        <a class=\"collapsed card-link\" data-toggle=\"collapse\" href=\"#collapseThree\">\n");
      out.write("          Parent Details:\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"collapseThree\" class=\"collapse\" data-parent=\"#accordion\">\n");
      out.write("        <div class=\"card-body\">\n");
      out.write("            <h6 style=\"display: inline-block\">Name:</h6> &nbsp;<div style=\"display: inline-block\">");
      out.print(rs.getString("p.lname"));
      out.write("&nbsp;");
      out.print(rs.getString("p.fname"));
      out.write("&nbsp;");
      out.print(rs.getString("p.mname"));
      out.write("</div>\n");
      out.write("        \n");
      out.write("            <h6 class=\"ml-5\" style=\"display: inline-block\">Mother Name: </h6> &nbsp;<div style=\"display: inline-block\">");
      out.print(rs.getString("p.mother_name"));
      out.write("</div>\n");
      out.write("        \n");
      out.write("            <h6 class=\"ml-5\" style=\"display: inline-block\">Mobile No: </h6> &nbsp;<div style=\"display: inline-block\">");
      out.print(rs.getString("p.mobile"));
      out.write("</div><br>\n");
      out.write("       \n");
      out.write("            <h6 class=\"\" style=\"display: inline-block\">Email Id: </h6> &nbsp;<div style=\"display: inline-block\">");
      out.print(rs.getString("p.email"));
      out.write("</div><br/>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("<!--        break-->\n");
      out.write("        \n");
      out.write("        <div class=\"card-body\">\n");
      out.write("            <h6 style=\"display: inline-block\">Education:</h6> &nbsp;<div style=\"display: inline-block\">");
      out.print(rs.getString("p.education"));
      out.write("</div>\n");
      out.write("        \n");
      out.write("            <h6 class=\"ml-5\" style=\"display: inline-block\">Occupation: </h6> &nbsp;<div style=\"display: inline-block\">");
      out.print(rs.getString("p.occupation"));
      out.write("</div>\n");
      out.write("        \n");
      out.write("            <h6 class=\"ml-5\" style=\"display: inline-block\">Designation: </h6> &nbsp;<div style=\"display: inline-block\">");
      out.print(rs.getString("p.designation"));
      out.write("</div>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("        <!--         Next Page  -->\n");
      out.write("        \n");
      out.write("      <div class=\"card\">\n");
      out.write("      <div class=\"card-header\">\n");
      out.write("        <a class=\"collapsed card-link\" data-toggle=\"collapse\" href=\"#collapseFour\">\n");
      out.write("          Guardian Details:\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"collapseFour\" class=\"collapse\" data-parent=\"#accordion\">\n");
      out.write("         <div class=\"card-body\">\n");
      out.write("            <h6 style=\"display: inline-block\">Name:</h6> &nbsp;<div style=\"display: inline-block\">");
      out.print(rs.getString("g.lname"));
      out.write("&nbsp;");
      out.print(rs.getString("g.fname"));
      out.write("&nbsp;");
      out.print(rs.getString("g.mname"));
      out.write("</div>\n");
      out.write("               \n");
      out.write("            <h6 class=\"ml-5\" style=\"display: inline-block\">Mobile No: </h6> &nbsp;<div style=\"display: inline-block\">");
      out.print(rs.getString("g.mobile"));
      out.write("</div>\n");
      out.write("       \n");
      out.write("            <h6 class=\"ml-5\" style=\"display: inline-block\">Relation with Gardian: </h6> &nbsp;<div style=\"display: inline-block\">");
      out.print(rs.getString("g.relation"));
      out.write("</div><br/>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("<!--        break-->\n");
      out.write("        \n");
      out.write("        <div class=\"card-body\">\n");
      out.write("                        <h6  style=\"display: inline-block\">Address: </h6><br>\n");
      out.write("            <h6  style=\"display: inline-block\"> State: </h6> &nbsp;<div style=\"display: inline-block\">");
      out.print(rs.getString("g.state"));
      out.write("</div>\n");
      out.write("            <h6 class=\"ml-5\" style=\"display: inline-block\">City: </h6> &nbsp;<div style=\"display: inline-block\">");
      out.print(rs.getString("g.city"));
      out.write("</div>\n");
      out.write("            <h6 class=\"ml-5\" style=\"display: inline-block\">Hometown: </h6> &nbsp;<div style=\"display: inline-block\">");
      out.print(rs.getString("g.hometown"));
      out.write("</div>\n");
      out.write("            <h6 class=\"ml-5\" style=\"display: inline-block\">Pin Code: </h6> &nbsp;<div style=\"display: inline-block\">");
      out.print(rs.getString("g.pin"));
      out.write("</div><br>\n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      ");
 }
      }catch(Exception e){
         System.out.println(e);
      }
      
      out.write("\n");
      out.write("      \n");
      out.write("     \n");
      out.write("      \n");
      out.write("      <div class=\"card\">\n");
      out.write("      <div class=\"card-header\">\n");
      out.write("        <a class=\"collapsed card-link\" data-toggle=\"collapse\" href=\"#collapseFive\">\n");
      out.write("          Academic Details:\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"collapseFive\" class=\"collapse\" data-parent=\"#accordion\">\n");
      out.write("       <div class=\"container\">\n");
      out.write("              \n");
      out.write("  <table class=\"table table-bordered\">\n");
      out.write("    <thead>\n");
      out.write("      <tr>\n");
      out.write("        <th>Exam</th>\n");
      out.write("        <th>Month & Year</th>\n");
      out.write("        <th>Marks Obtained</th>\n");
      out.write("        <th>Marks Total</th>\n");
      out.write("        <th>Percentage/ATKT/Provisional</th>\n");
      out.write("      </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody>\n");
      out.write("         ");

           String sq2 = "select * from academic_record where sid='"+id+"'";
    try{
    pst = connection.prepareStatement(sq2);
    ResultSet rs1 = pst.executeQuery();
    while(rs1.next()){
          
          
      out.write("\n");
      out.write("      <tr>\n");
      out.write("        <td>");
      out.print(rs1.getString("exam"));
      out.write("</td>\n");
      out.write("        <td>");
      out.print(rs1.getString("year"));
      out.write("</td>\n");
      out.write("        <td>");
      out.print(rs1.getString("marks_ob"));
      out.write("</td>\n");
      out.write("        <td>");
      out.print(rs1.getString("marks_total"));
      out.write("</td>\n");
      out.write("        <td>");
      out.print(rs1.getString("percentage"));
      out.write("</td>\n");
      out.write("      </tr>\n");
      out.write("       ");
 }
      }catch(Exception e){
         System.out.println(e);
      }
      
      out.write("\n");
      out.write("      </tbody>\n");
      out.write("  </table>\n");
      out.write("</div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("     \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("  </main>     \n");
      out.write("        <footer class=\"container mt-5 text-center\" align=\"center\">\n");
      out.write("      <p><i class=\"fa fa-copyright\"></i> Design and Developed by Lakhan, Rahul & Prof. Varsha</p>\n");
      out.write("    </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");

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
