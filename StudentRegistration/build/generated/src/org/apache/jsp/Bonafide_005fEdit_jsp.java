package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Bonafide_005fEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("              <a href=\"admin_dash.jsp\"><button type=\"button\" class=\"btn btn-info m-2 fa fa-home\"> Home</button> </a>\n");
      out.write("            \n");
      out.write("          </li>\n");
      out.write("          \n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a href=\"admin_pending.jsp\">  <button type=\"button\" class=\"btn btn-info m-2 fa fa-id-card-o\"> Approve Pending</button> </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              <a href=\"request_lc.jsp\">  <button type=\"button\" class=\"btn btn-info m-2 fa fa-sticky-note-o active\"> LC Request</button> </a>\n");
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
      out.write("\n");
      out.write("    <main role=\"main\">\n");
      out.write("\n");
      out.write("      <div style=\"margin-top: 7%;\">\n");
      out.write("      \n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row clearfix\">\n");
      out.write("                <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                    <div class=\"card p-2\">\n");
      out.write("                        <div class=\"header\">\n");
      out.write("                            <h2><p class=\"text-center text-danger text-uppercase\">Leaving Certificate</p></h2>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"body\">\n");
      out.write("                            <form id=\"form_validation\" method=\"POST\" action=\"getLc.jsp\">\n");
      out.write("                                <div class=\"form-group form-float\">\n");
      out.write("                                    <div class=\"form-line\">\n");
      out.write("                                        <label class=\"form-label\">Name:</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"name\" value=\"\" disabled>\n");
      out.write("                                        <input type=\"text\" value=\"\" name=\"id\" hidden>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group form-float\">\n");
      out.write("                                    <div class=\"form-line\">\n");
      out.write("                                        <label class=\"form-label\">Birth Date:</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"birth_date\" value=\"\" disabled>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group form-float\">\n");
      out.write("                                    <div class=\"form-line\">\n");
      out.write("                                        <label class=\"form-label\">Birth in Words:</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"birth_words\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    Status:\n");
      out.write("                                    <input type=\"radio\" name=\"status\" id=\"pass\" value=\"Passed\" class=\"with-gap ml-2\">\n");
      out.write("                                    <label for=\"pass\" class=\"ml-2\">Passed</label>\n");
      out.write("\n");
      out.write("                                    <input type=\"radio\" name=\"status\" id=\"fail\" value=\"Failed\" class=\"with-gap ml-2\">\n");
      out.write("                                    <label for=\"fail\" class=\"ml-2\">Failed</label>\n");
      out.write("                                </div>\n");
      out.write("                                 <div class=\"form-group form-float\">\n");
      out.write("                                    <div class=\"form-line\">\n");
      out.write("                                        <label class=\"form-label\">Examination:</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"exam\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    JULY to NOV Attendance:\n");
      out.write("                                    <input type=\"radio\" name=\"july_attendance\" id=\"july_sat\" value=\"Satisfactory\" class=\"with-gap ml-2\">\n");
      out.write("                                    <label for=\"july_sat\" class=\"ml-2\">Satisfactory</label>\n");
      out.write("\n");
      out.write("                                    <input type=\"radio\" name=\"july_attendance\" id=\"july_not_sat\" value=\"Non-Satisfactory\" class=\"with-gap ml-2\">\n");
      out.write("                                    <label for=\"july_not_sat\" class=\"ml-2\">Non-Satisfactory</label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    JAN to MAY Attendance:\n");
      out.write("                                    <input type=\"radio\" name=\"jan_attendance\" id=\"jan_sat\" value=\"Satisfactory\" class=\"with-gap ml-2\">\n");
      out.write("                                    <label for=\"jan_sat\" class=\"ml-2\">Satisfactory</label>\n");
      out.write("\n");
      out.write("                                    <input type=\"radio\" name=\"jan_attendance\" id=\"jan_not_sat\" value=\"Non-Satisfactory\" class=\"with-gap ml-2\">\n");
      out.write("                                    <label for=\"jan_not_sat\" class=\"ml-2\">Non-Satisfactory</label>\n");
      out.write("                                </div>\n");
      out.write("                                <h4><p class=\"text-center text-danger\">University Examination Performance :</p></h4>\n");
      out.write("                                <div class=\"form-group form-float\">\n");
      out.write("                                    <div class=\"form-line\">\n");
      out.write("                                        <label class=\"form-label\">Examination Held:</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"exam_held\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group form-float\">\n");
      out.write("                                    <div class=\"form-line\">\n");
      out.write("                                        <label class=\"form-label\">Passed Class:</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"passed_class\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group form-float\">\n");
      out.write("                                    <div class=\"form-line\">\n");
      out.write("                                        <label class=\"form-label\">Seat No:</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"seat_no\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group form-float\">\n");
      out.write("                                    <div class=\"form-line\">\n");
      out.write("                                        <label class=\"form-label\">Last College Attended:</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"last_college\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group form-float\">\n");
      out.write("                                    <div class=\"form-line\">\n");
      out.write("                                        <label class=\"form-label\">Admission Date:</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"admission_date\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group form-float\">\n");
      out.write("                                    <div class=\"form-line\">\n");
      out.write("                                        <label class=\"form-label\">Reason for leaving the college:</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"reason_leave\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group form-float\">\n");
      out.write("                                    <div class=\"form-line\">\n");
      out.write("                                        <label class=\"form-label\">Remarks:</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"remark\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-12 text-center\">\n");
      out.write("                                <button class=\"btn btn-primary btn-lg btn-center\" type=\"submit\">SUBMIT</button>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("</div>\n");
      out.write("      </div>\n");
      out.write("    </main>\n");
      out.write("\n");
      out.write("        \n");
      out.write("      <footer class=\"container mt-5 text-center\" align=\"center\">\n");
      out.write("      <p><i class=\"fa fa-copyright\"></i> Design and Developed by Lakhan, Rahul & Prof. Varsha</p>\n");
      out.write("    </footer>    \n");
      out.write("    </body>\n");
      out.write("    <script src=\"js/popper.min.js\"></script>\n");
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
