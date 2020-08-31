package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/connect.jsp");
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
    String id = session.getAttribute("st_id").toString();
    if(id.equals("")){
        response.sendRedirect("index.jsp");
    }
    else{ 
    String check = "select * from students where sid="+id;
    pst = connection.prepareStatement(check);
    rs = pst.executeQuery();
    if(rs.next()){
       
      out.write("\n");
      out.write("       ");
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
      out.write("       <nav class=\"navbar navbar-expand-md navbar-dark fixed-top bg-dark p-2\">\n");
      out.write("      <a class=\"navbar-brand ml-3\" href=\"#\"><img src=\"pic/dpcoe.jpg\" height=\"60\" width=\"60\" class=\"img-rounded\" alt=\"dpcoe\"></a>\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsExampleDefault\" aria-controls=\"navbarsExampleDefault\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("      </button>\n");
      out.write("\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarsExampleDefault\">\n");
      out.write("        <ul class=\"navbar-nav mr-auto\">\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              <a href=\"student_home.jsp\">  <button type=\"button\" class=\"btn btn-info m-2 fa fa-home\"> Home</button> </a>\n");
      out.write("            \n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              <a href=\"registration.jsp\">  <button type=\"button\" class=\"btn btn-info m-2 fa fa-id-card-o active\"> Registration</button> </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              <a href=\"requestForm.jsp\"><button type=\"button\" class=\"btn btn-info m-2 fa fa-download\"> Download</button></a>          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("        </ul>\n");
      out.write("          <a href=\"/StudentRegistration/logout\"><button type=\"button\" class=\"btn btn-danger float-right fa fa-sign-out\"> Logout</button></a>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("       <div class=\"\" style=\"margin-top: 7%;\">\n");
      out.write("    <h1 class=\"text-success\">You already filled form..</h1>\n");
      out.write("        <p class=\"text-info\">Please wait or complete next process..</p>\n");
      out.write("    </div>\n");

    } else {

      out.write("\n");
      out.write("<html lang=\"en\" >\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Registration</title>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/jquery-ui.css\">\n");
      out.write("        <link rel='stylesheet prefetch' href='css/boot.3.3.min.css'>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-6 col-md-offset-3\">\n");
      out.write("                <form id=\"msform\" action=\"/StudentRegistration/RegistrationStudent\" method=\"post\" class=\"form-register\" role=\"form\">\n");
      out.write("                    <!-- progressbar -->\n");
      out.write("                    <ul id=\"progressbar\">\n");
      out.write("                        <li class=\"active\">Personal Details</li>\n");
      out.write("                        <li>Contact Detail</li>\n");
      out.write("                        <li>Parents Detail</li>\n");
      out.write("                        <li>Guardian Detail</li>\n");
      out.write("                        <li>Academic Detail</li>\n");
      out.write("                    </ul>\n");
      out.write("                    <!-- fieldsets -->\n");
      out.write("                    <fieldset>\n");
      out.write("                        <h2 class=\"fs-title\">Personal Details</h2>\n");
      out.write("                        <h3 class=\"fs-subtitle\"> <span class='text-danger'>*</span> Fields are mandatory...</h3>\n");
      out.write("                        <h3 class=\"fs-subtitle\">Please fill all details correctly..</h3>\n");
      out.write("                        ");

                            
                            String f="",m="",l="",gender="",email="",mobile="",branch="";
                           String sql_name = "select * from student_login where id='"+id+"'";
                               try {
                                   pst = connection.prepareStatement(sql_name);
                                    rs = pst.executeQuery();
                                   while (rs.next()) {
                                        f = rs.getString("fname");
                                        m = rs.getString("mname");
                                        l = rs.getString("lname");
                                        gender = rs.getString("gender");
                                        email = rs.getString("email");
                                        mobile = rs.getString("mobile");
                                        branch = rs.getString("branch");
                                   }
                               } catch (Exception e) {

                               }
                        
      out.write("\n");
      out.write("                        <input type=\"text\" name=\"branch\" value=\"");
      out.print(branch);
      out.write("\" hidden>\n");
      out.write("                        <input type=\"text\" name=\"name\" value=\"");
      out.print(f);
      out.write("&nbsp;");
      out.print(m);
      out.write("&nbsp;");
      out.print(l);
      out.write("\" readonly>\n");
      out.write("                        <div>\n");
      out.write("                        <label for=\"DOB\">Enter Birth Date<span class='text-danger'>*</span>:-</lable>    \n");
      out.write("                        <input type=\"text\" name=\"DOB\" id=\"DOB\"/>\n");
      out.write("                        <span class=\"DOB_error\"></span>\n");
      out.write("                        </div>\n");
      out.write("                        <hr class=\"row\">\n");
      out.write("                        <div>\n");
      out.write("                            <label for=\"nationality\">Nationality<span class='text-danger'>*</span>:-</label>\n");
      out.write("                            <select class=\"form-control\" id=\"nationality\" name=\"nationality\">\n");
      out.write("                                <option value=\"\">Select Nationality</option>\n");
      out.write("                                <option value=\"Indian\">Indian</option>\n");
      out.write("                                <option value=\"Other\">Other</option>\n");
      out.write("                            </select>\n");
      out.write("                            <span class=\"nationality_error\"></span>\n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                            <label for=\"category\">Category<span class='text-danger'>*</span>:-</label>\n");
      out.write("                            <select class=\"form-control\" id=\"category\" name=\"category\">\n");
      out.write("                                <option value=\"\">Select Category</option>\n");
      out.write("                                ");

                                String sql = "select * from master_category";
                                try {
                                        pst = connection.prepareStatement(sql);
                                         rs = pst.executeQuery();
                                        while(rs.next()) {
                                            out.print("<option value='"+rs.getString("cat_name")+"'>"+rs.getString("cat_name")+"</option>");
                                        }
                                    } catch (Exception e) {

                                    }
                                
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                            <span class=\"category_error\"></span>\n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                            <label for=\"year\">Year<span class='text-danger'>*</span>:-</label>\n");
      out.write("                            <select class=\"form-control\" id=\"year\" name=\"year\">\n");
      out.write("                                <option value=\"\">Select Year</option>\n");
      out.write("                                ");

                                String sql2 = "select * from master_year";
                                try {
                                        pst = connection.prepareStatement(sql2);
                                         rs = pst.executeQuery();
                                        while(rs.next()) {
                                            out.print("<option value='"+rs.getString("year")+"'>"+rs.getString("year")+"</option>");
                                        }
                                    } catch (Exception e) {

                                    }
                                
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                            <span class=\"year_error\"></span>\n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                            <label for=\"blood_group\">Blood Group<span class='text-danger'>*</span>:-</label>\n");
      out.write("                            <select class=\"form-control\" id=\"blood_group\" name=\"blood_group\">\n");
      out.write("                                <option value=\"\">Blood Group</option>\n");
      out.write("                                <option value=\"O+\">O+</option>\n");
      out.write("                                <option value=\"O-\">O-</option>\n");
      out.write("                                <option value=\"AB+\">AB+</option>\n");
      out.write("                                <option value=\"AB-\">AB-</option>\n");
      out.write("                                <option value=\"B+\">B+</option>\n");
      out.write("                                <option value=\"B-\">B-</option>\n");
      out.write("                                <option value=\"A+\">A+</option>\n");
      out.write("                                <option value=\"A-\">A-</option>\n");
      out.write("                            </select>\n");
      out.write("                            <span class=\"blood_group_error\"></span>\n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                            <label for=\"caste_lable\">Caste<span class='text-danger'>*</span>:-</label>\n");
      out.write("                            <div id=\"caste_lable\">\n");
      out.write("                                <input type=\"text\" id=\"caste\" name=\"caste\">\n");
      out.write("                            </div>\n");
      out.write("                            <span class=\"caste_error\"></span>\n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                            <label for=\"religion_lable\">Religion<span class='text-danger'>*</span>:-</label>\n");
      out.write("                            <div id=\"religion_lable\">\n");
      out.write("                                <input type=\"text\" id=\"religion\" name=\"religion\">\n");
      out.write("                            </div>\n");
      out.write("                            <span class=\"religion_error\"></span>\n");
      out.write("                        </div><br/>\n");
      out.write("                        \n");
      out.write("                        <label for=\"gender_lable\">Gender<span class='text-danger'>*</span>:-</label>\n");
      out.write("                        <div class=\"form-group\" id=\"gender_lable\">\n");
      out.write("                            <input type=\"text\" name=\"stu_gender\" value=\"");
      out.print(gender);
      out.write("\" readonly/>\n");
      out.write("                        </div>\n");
      out.write("                        <lable for=\"birthplace_lable\">Birthplace<span class='text-danger'>*</span>:-</lable>\n");
      out.write("                        <div id=\"birthplace_lable\">\n");
      out.write("                            <input type=\"text\" id=\"birth_place\" name=\"birth_place\">\n");
      out.write("                            <span class=\"birth_place_error\"></span>\n");
      out.write("                        </div>\n");
      out.write("                        <br/>\n");
      out.write("                        <input type=\"button\" name=\"next\" id=\"p_next\" class=\"next action-button\" value=\"Next\"/>\n");
      out.write("                    </fieldset>\n");
      out.write("                    <fieldset>\n");
      out.write("                        <h2 class=\"fs-title\">Contact Detail</h2>\n");
      out.write("                        <h3 class=\"fs-subtitle\"> <span class='text-danger'>*</span> Fields are mandatory...</h3>\n");
      out.write("                        <input type=\"email\" name=\"email\" value=\"");
      out.print(email);
      out.write("\" readonly>\n");
      out.write("                        <input type=\"text\" name=\"mobile\" value=\"");
      out.print(mobile);
      out.write("\" readonly>\n");
      out.write("                         <div class=\"form-group\"><br/>\n");
      out.write("                        <label for=\"address\"><b>Present Address</b></label>\n");
      out.write("                        <div id=\"address\">\n");
      out.write("                        <div style=\"display:inline-block\">\n");
      out.write("                            <label for=\"state_lable\">State<span class='text-danger'>*</span>:-</label>\n");
      out.write("                            <div id=\"state_lable\">\n");
      out.write("                                <select class=\"form-control\" id=\"p_state\" name=\"p_state\">\n");
      out.write("                                    <option value=\"\">Select State</option>\n");
      out.write("                                    ");

                                        String sql1 = "select * from master_state";
                                        try {
                                            pst = connection.prepareStatement(sql1);
                                             rs = pst.executeQuery();
                                            while (rs.next()) {
                                                out.print("<option value='" + rs.getString("state") + "'>" + rs.getString("state") + "</option>");
                                            }
                                        } catch (Exception e) {

                                        }
                                    
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                                <span class=\"p_state_error\"></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                            <label for=\"city_lable\">City<span class='text-danger'>*</span>:-</label>\n");
      out.write("                            <div id=\"city_lable\">\n");
      out.write("                                <select class=\"form-control\" id=\"p_city\" name=\"p_city\">\n");
      out.write("                                    <option value=\"\">Select City</option>\n");
      out.write("                                    \n");
      out.write("                                </select>\n");
      out.write("                                <span class=\"p_city_error\"></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                            <label for=\"city_lable\">Pin Code<span class='text-danger'>*</span>:-</label>\n");
      out.write("                            <div id=\"city_lable\">\n");
      out.write("                                <input type=\"text\" id=\"p_pin\" name=\"p_pin\" maxlength=\"6\">\n");
      out.write("                                <span class=\"p_pin_error\"></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                            <label for=\"hometown\">Hometown<span class='text-danger'>*</span>:-</label>\n");
      out.write("                            <div id=\"hometown\">\n");
      out.write("                                <input type=\"text\" id=\"p_hometown\" name=\"p_hometown\">\n");
      out.write("                                <span class=\"p_hometown_error\"></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>    \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\"><br/>\n");
      out.write("                        <label for=\"permnant_address\"><b>Permnent Address</b></label>\n");
      out.write("                        <div id=\"permnant_address\">\n");
      out.write("                        <div>\n");
      out.write("                            <label for=\"state_lable\">State<span class='text-danger'>*</span>:-</label>\n");
      out.write("                            <div id=\"state_lable\">\n");
      out.write("                                <select class=\"form-control\" id=\"per_state\" name=\"per_state\">\n");
      out.write("                                    <option value=\"\">Select State</option>\n");
      out.write("                                    ");

                                        try {
                                            pst = connection.prepareStatement(sql1);
                                             rs = pst.executeQuery();
                                            while (rs.next()) {
                                                out.print("<option value='" + rs.getString("state") + "'>" + rs.getString("state") + "</option>");
                                            }
                                        } catch (Exception e) {

                                        }
                                    
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                                <span class=\"per_state_error\"></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                            <label for=\"city_lable\">City<span class='text-danger'>*</span>:-</label>\n");
      out.write("                            <div id=\"city_lable\">\n");
      out.write("                                <select class=\"form-control\" id=\"per_city\" name=\"per_city\">\n");
      out.write("                                    <option value=\"\">Select City</option>\n");
      out.write("                                </select>\n");
      out.write("                                <span class=\"per_city_error\"></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                            <label for=\"city_lable\">Pin Code<span class='text-danger'>*</span>:-</label>\n");
      out.write("                            <div id=\"city_lable\">\n");
      out.write("                                <input type=\"text\" id=\"per_pin\" name=\"per_pin\" maxlength=\"6\">\n");
      out.write("                                <span class=\"per_pin_error\"></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                            <label for=\"hometown\">Hometown<span class='text-danger'>*</span>:-</label>\n");
      out.write("                            <div id=\"hometown\">\n");
      out.write("                                <input type=\"text\" id=\"per_hometown\" name=\"per_hometown\">\n");
      out.write("                                <span class=\"per_hometown_error\"></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>    \n");
      out.write("                        </div>\n");
      out.write("                        <label for=\"adhaar_lable\">Adhaar No<span class='text-danger'>*</span>:</label>\n");
      out.write("                        <div class=\"form-group\" id=\"adhaar_lable\">\n");
      out.write("                            <input type=\"text\" data-type=\"adhaar-number\" name=\"adhaar\" id=\"adhaar\" maxLength=\"14\">\n");
      out.write("                            <span class=\"adhaar_error\"></span>\n");
      out.write("                        </div>\n");
      out.write("                        <label for=\"pan_lable\">Pan No:</label>\n");
      out.write("                        <div class=\"form-group\" id=\"pan_lable\">\n");
      out.write("                            <input type=\"text\" name=\"pan\" id=\"pan\" >\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"button\" name=\"previous\" class=\"previous action-button-previous\" value=\"Previous\"/>\n");
      out.write("                        <input type=\"button\" name=\"next\" class=\"next action-button\" id=\"c_next\" value=\"Next\"/>\n");
      out.write("                    </fieldset>\n");
      out.write("                    <fieldset>\n");
      out.write("                        <h2 class=\"fs-title\">Parents Detail</h2>\n");
      out.write("                        <h3 class=\"fs-subtitle\"> <span class='text-danger'>*</span> fields are mandatory...</h3>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"fname_lable\">First Name<span class='text-danger'>*</span>:-</label>\n");
      out.write("                            <div id=\"fname_lable\">\n");
      out.write("                                <input type=\"text\" name=\"p_fname\" id=\"p_fname\">\n");
      out.write("                                <span class=\"p_fname_error\"></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"mname_lable\">Middle Name<span class='text-danger'>*</span>:-</label>\n");
      out.write("                            <div id=\"mname_lable\">\n");
      out.write("                                <input type=\"text\" id=\"p_mname\" name=\"p_mname\">\n");
      out.write("                                <span class=\"p_mname_error\"></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"lname_lable\">Surname<span class='text-danger'>*</span>:-</label>\n");
      out.write("                            <div id=\"lname_lable\">\n");
      out.write("                                <input type=\"text\" id=\"p_sname\" name=\"p_sname\">\n");
      out.write("                                <span class=\"p_sname_error\"></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"text\" name=\"mother_name\" id=\"mother_name\" placeholder=\"Enter Your Mother Name\"/>\n");
      out.write("                        <label for=\"pmobile_lable\">Mobile No<span class='text-danger'>*</span>:-</label>\n");
      out.write("                        <div id=\"pmobile_lable\">\n");
      out.write("                            <input type=\"text\" id=\"p_mobile\" name=\"p_mobile\" maxlength=\"10\">\n");
      out.write("                            <span class=\"p_mobile_error\"></span>\n");
      out.write("                        </div>\n");
      out.write("                        <label for=\"pemail_lable\">Email Id:-</label>\n");
      out.write("                        <div id=\"pemail_lable\">\n");
      out.write("                            <input type=\"text\" id=\"p_email\" name=\"p_email\">\n");
      out.write("                            <span class=\"p_email_error\"></span>\n");
      out.write("                        </div>\n");
      out.write("                        <label for=\"edu_lable\">Education:-</label>\n");
      out.write("                        <div id=\"edu_lable\">\n");
      out.write("                            <input type=\"text\" name=\"p_edu\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"poccu_lable\">Occupation:-</label>\n");
      out.write("                            <div id=\"poccu_lable\">\n");
      out.write("                                <input type=\"text\" name=\"p_occu\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"pdesig_lable\">Designation:-</label>\n");
      out.write("                            <div id=\"pdesig_lable\">\n");
      out.write("                                <input type=\"text\" name=\"p_desig\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"button\" name=\"previous\" class=\"previous action-button-previous\" value=\"Previous\"/>\n");
      out.write("                        <input type=\"button\" name=\"next\" class=\"next action-button\" value=\"Next\"/>\n");
      out.write("                    </fieldset>\n");
      out.write("                    <fieldset>\n");
      out.write("                        <h2 class=\"fs-title\">Guardian Detail</h2>\n");
      out.write("                        <h3 class=\"fs-subtitle\">If guardian is not then enter parent details..</h3>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"gfname_lable\">First Name<span class='text-danger'>*</span>:-</label>\n");
      out.write("                            <div id=\"gfname_lable\">\n");
      out.write("                                <input type=\"text\" id=\"g_fname\" name=\"g_fname\">\n");
      out.write("                                <span class=\"g_fname_error\"></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"gmname_lable\">Middle Name<span class='text-danger'>*</span>:-</label>\n");
      out.write("                            <div id=\"gmname_lable\">\n");
      out.write("                                <input type=\"text\" id=\"g_mname\" name=\"g_mname\">\n");
      out.write("                                <span class=\"g_mname_error\"></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"glname_lable\">Surname<span class='text-danger'>*</span>:-</label>\n");
      out.write("                            <div id=\"glname_lable\">\n");
      out.write("                                <input type=\"text\" id=\"g_lname\" name=\"g_lname\">\n");
      out.write("                                <span class=\"g_lname_error\"></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <label for=\"gmobile_lable\">Mobile No<span class='text-danger'>*</span>:</label>\n");
      out.write("                        <div id=\"gmobile_lable\">\n");
      out.write("                            <input type=\"text\" id=\"gmobile\" name=\"gmobile\" maxlength=\"10\">\n");
      out.write("                            <span class=\"gmobile_error\"></span>\n");
      out.write("                        </div>\n");
      out.write("                        <label for=\"grelation_lable\">Relation with Guardian<span class='text-danger'>*</span>:-</label>\n");
      out.write("                        <div id=\"grelation_lable\">\n");
      out.write("                            <input type=\"text\" id=\"relation\" name=\"relation\"/>\n");
      out.write("                            <span class=\"relation_error\"></span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\"><br/>\n");
      out.write("                        <label for=\"permnant_address\"><b>Address<span class='text-danger'>*</span>:-</b></label>\n");
      out.write("                        <div id=\"permnant_address\">\n");
      out.write("                        <div style=\"display:inline-block\">\n");
      out.write("                            <label for=\"state_lable\">State:-</label>\n");
      out.write("                            <div id=\"state_lable\">\n");
      out.write("                                <select class=\"form-control\" id=\"g_state\" name=\"g_state\">\n");
      out.write("                                    <option value=\"\">Select State</option>\n");
      out.write("                                    ");

                                        try {
                                            pst = connection.prepareStatement(sql1);
                                             rs = pst.executeQuery();
                                            while (rs.next()) {
                                                out.print("<option value='" + rs.getString("state") + "'>" + rs.getString("state") + "</option>");
                                            }
                                        } catch (Exception e) {

                                        }
                                    
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                                <span class=\"g_state_error\"></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                            <label for=\"city_lable\">City:-</label>\n");
      out.write("                            <div id=\"city_lable\">\n");
      out.write("                                <select class=\"form-control\" id=\"g_city\" name=\"g_city\">\n");
      out.write("                                    <option value=\"\">Select City</option>\n");
      out.write("                                </select>\n");
      out.write("                                <span class=\"g_city_error\"></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                            <label for=\"city_lable\">Pin Code:-</label>\n");
      out.write("                            <div id=\"city_lable\">\n");
      out.write("                                <input type=\"text\" id=\"g_pin\" name=\"g_pin\" maxlength=\"6\">\n");
      out.write("                                <span class=\"g_pin_error\"></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                            <label for=\"hometown\">Hometown:-</label>\n");
      out.write("                            <div id=\"hometown\">\n");
      out.write("                                <input type=\"text\" id=\"g_hometown\" name=\"g_hometown\">\n");
      out.write("                                <span class=\"g_hometown_error\"></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"button\" name=\"previous\" class=\"previous action-button-previous\" value=\"Previous\"/>\n");
      out.write("                        <input type=\"button\" name=\"next\" class=\"next action-button\" value=\"Next\"/>\n");
      out.write("                    </fieldset>\n");
      out.write("                    <fieldset>\n");
      out.write("                        <h2 class=\"fs-title\">Academic Detail</h2>\n");
      out.write("                        <h3 class=\"fs-subtitle\">Enter Academic Detail</h3>\n");
      out.write("                        <div class=\"form-group\" style=\"display:inline-block;width: 10%;\">\n");
      out.write("                            <label for=\"exam_lable\">Exam</label>\n");
      out.write("                            <div id=\"exam_lable\">\n");
      out.write("                                <input type=\"text\" name=\"fe_exam\" value=\"FE\" readonly>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\" style=\"display:inline-block;width: 32%;margin-left: 2%;\">\n");
      out.write("                            <label for=\"year_lable\">Month & Year</label>\n");
      out.write("                            <div id=\"year_lable\">\n");
      out.write("                                <input type=\"month\" name=\"fe_year\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\" style=\"display:inline-block;width: 12%;margin-left: 2%;\">\n");
      out.write("                            <label for=\"marks_lable\">Marks Obtained</label>\n");
      out.write("                            <div id=\"marks_lable\">\n");
      out.write("                                <input type=\"text\" name=\"fe_marks_obtained\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\" style=\"display:inline-block;width: 12%;margin-left: 2%;\">\n");
      out.write("                            <label for=\"markst_lable\">Marks Total</label>\n");
      out.write("                            <div id=\"markst_lable\">\n");
      out.write("                                <input type=\"text\" name=\"fe_marks_total\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\" style=\"display:inline-block;width: 15%;margin-left: 2%;\">\n");
      out.write("                            <label for=\"per_lable\">Percentage/SGPA/Provisional</label>\n");
      out.write("                            <div id=\"per_lable\">\n");
      out.write("                                <input type=\"text\" name=\"fe_percentage\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                         <div class=\"form-group\" style=\"display:inline-block;width: 10%;\">\n");
      out.write("                            <div id=\"exam_lable\">\n");
      out.write("                                <input type=\"text\" name=\"se_exam\" value=\"SE\" readonly>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\" style=\"display:inline-block;width: 32%;margin-left: 2%;\">\n");
      out.write("                            <div id=\"year_lable\">\n");
      out.write("                                <input type=\"month\" name=\"se_year\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\" style=\"display:inline-block;width: 12%;margin-left: 2%;\">\n");
      out.write("                            <div id=\"marks_lable\">\n");
      out.write("                                <input type=\"text\" name=\"se_marks_obtained\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\" style=\"display:inline-block;width: 12%;margin-left: 2%;\">\n");
      out.write("                            <div id=\"markst_lable\">\n");
      out.write("                                <input type=\"text\" name=\"se_marks_total\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\" style=\"display:inline-block;width: 15%;margin-left: 2%;\">\n");
      out.write("                            <div id=\"per_lable\">\n");
      out.write("                                <input type=\"text\" name=\"se_percentage\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\" style=\"display:inline-block;width: 10%;\">\n");
      out.write("                            <div id=\"exam_lable\">\n");
      out.write("                                <input type=\"text\" name=\"te_exam\" value=\"TE\" readonly>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\" style=\"display:inline-block;width: 32%;margin-left: 2%;\">\n");
      out.write("                            <div id=\"year_lable\">\n");
      out.write("                                <input type=\"month\" name=\"te_year\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\" style=\"display:inline-block;width: 12%;margin-left: 2%;\">\n");
      out.write("                            <div id=\"marks_lable\">\n");
      out.write("                                <input type=\"text\" name=\"te_marks_obtained\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\" style=\"display:inline-block;width: 12%;margin-left: 2%;\">\n");
      out.write("                            <div id=\"markst_lable\">\n");
      out.write("                                <input type=\"text\" name=\"te_marks_total\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\" style=\"display:inline-block;width: 15%;margin-left: 2%;\">\n");
      out.write("                            <div id=\"per_lable\">\n");
      out.write("                                <input type=\"text\" name=\"te_percentage\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <br/>\n");
      out.write("                        <div>\n");
      out.write("                            <label for=\"nation\">Admission Type<span class='text-danger'>*</span>:-</label>\n");
      out.write("                            <select class=\"form-control\" id=\"admission\" name=\"admission\">\n");
      out.write("                                <option value=\"\">Select Admission</option>\n");
      out.write("                                <option value=\"CAP\">CAP</option>\n");
      out.write("                                <option value=\"MANAGEMENT\">MANAGEMENT</option>\n");
      out.write("                                <option value=\"TFWS\">TFWS</option>\n");
      out.write("                            </select>\n");
      out.write("                            <span class=\"admission_error\"></span>\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"button\" name=\"previous\" class=\"previous action-button-previous\" value=\"Previous\"/>\n");
      out.write("                        <input type=\"submit\" name=\"submit\" class=\"submit action-button\" onclick=\"return check();\" value=\"Submit\"/>\n");
      out.write("                    </fieldset>\n");
      out.write("                        \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src='js/jquey.2.1.min.js'></script>\n");
      out.write("        <script src=\"js/jquery-ui.js\"></script>\n");
      out.write("        <script src='js/boot.3.3.min.js'></script>\n");
      out.write("        <script src='js/jquery.easing.1.3.js'></script>\n");
      out.write("        <script src=\"js/register.js\"></script>\n");
      out.write("        <script src=\"js/index.js\"></script>\n");
      out.write("    </body>\n");
      out.write("    <style>\n");
      out.write("        .highlight-error {\n");
      out.write("             border-color: red;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <script>\n");
      out.write("        $('[data-type=\"adhaar-number\"]').keyup(function() {\n");
      out.write("  var value = $(this).val();\n");
      out.write("  value = value.replace(/\\D/g, \"\").split(/(?:([\\d]{4}))/g).filter(s => s.length > 0).join(\"-\");\n");
      out.write("  $(this).val(value);\n");
      out.write("});\n");
      out.write("\n");
      out.write("$('[data-type=\"adhaar-number\"]').on(\"change, blur\", function() {\n");
      out.write("  var value = $(this).val();\n");
      out.write("  var maxLength = $(this).attr(\"maxLength\");\n");
      out.write("  if (value.length != maxLength) {\n");
      out.write("    $(this).addClass(\"highlight-error\");\n");
      out.write("  } else {\n");
      out.write("    $(this).removeClass(\"highlight-error\");\n");
      out.write("  }\n");
      out.write("});\n");
      out.write("$(\"#p_state\").change(function() {\n");
      out.write("        state = $(this).val();\n");
      out.write("        console.log(state);\n");
      out.write("        $.ajax({\n");
      out.write("            type : \"POST\",\n");
      out.write("            url : \"/StudentRegistration/GetCity\",\n");
      out.write("            data : \"state=\" + state,\n");
      out.write("            success : function(data) {\n");
      out.write("                $(\"#p_city\").html(data);\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("});  \n");
      out.write("$(\"#per_state\").change(function() {\n");
      out.write("        state = $(this).val();\n");
      out.write("        console.log(state);\n");
      out.write("        $.ajax({\n");
      out.write("            type : \"POST\",\n");
      out.write("            url : \"/StudentRegistration/GetCity\",\n");
      out.write("            data : \"state=\" + state,\n");
      out.write("            success : function(data) {\n");
      out.write("                $(\"#per_city\").html(data);\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("});\n");
      out.write("$(\"#g_state\").change(function() {\n");
      out.write("        state = $(this).val();\n");
      out.write("        console.log(state);\n");
      out.write("        $.ajax({\n");
      out.write("            type : \"POST\",\n");
      out.write("            url : \"/StudentRegistration/GetCity\",\n");
      out.write("            data : \"state=\" + state,\n");
      out.write("            success : function(data) {\n");
      out.write("                $(\"#g_city\").html(data);\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("});   \n");
      out.write("$(\"#p_mobile\").keyup(function(){\n");
      out.write("    var p_mobile = $(\"#p_mobile\").val();\n");
      out.write("    len = p_mobile.length;\n");
      out.write("     var characterReg = \"/^\\d{10}$/\";\n");
      out.write("    if(p_mobile.match(characterReg)){\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    else {\n");
      out.write("        console.log(\"error\");\n");
      out.write("        $(\".mobile_error\").html(\"Please enter valid mobile no.\");\n");
      out.write("    }\n");
      out.write("    if(len==10){\n");
      out.write("           $(\".mobile_error\").empty();   \n");
      out.write("    }\n");
      out.write("});\n");
      out.write("  $( function() {\n");
      out.write("    $( \"#DOB\" ).datepicker({ dateFormat: 'dd-mm-yy', minDate: -10395\n");
      out.write(",maxDate: -4745,changeMonth: true,changeYear:true });\n");
      out.write("  } );\n");
      out.write("    </script>\n");
      out.write("</html>\n");

    }
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
