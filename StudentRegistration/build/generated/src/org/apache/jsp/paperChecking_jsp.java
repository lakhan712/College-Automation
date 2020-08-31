package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.FileInputStream;

public final class paperChecking_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

    try{
        session = request.getSession(false);
  String bid = session.getAttribute("bid").toString();
  String tg_id = session.getAttribute("tg_id").toString();
  String fileName = session.getAttribute("filename").toString();
  String filePath = "E:/villain/"+fileName;
  
  
  //FileInputStream fileInputStream = new FileInputStream(filePath);
 
  
if(tg_id.equals("")) {
    System.out.print("session id is not found");
    //response.sendRedirect("tg_login.jsp");
    } else {

   


      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t<title>Online Paper Checking</title>\n");
      out.write("\n");
      out.write("<!-- <link href = \"/boost/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("      <script src = \"/boost/js/jquery-3.2.1.min.js\"></script>\n");
      out.write("      <script src = \"/boost/js/bootstrap.min.js\"></script> -->\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("\t\n");
      out.write("\t#parent_div_1, #parent_div_2, #parent_div_3{\n");
      out.write("    width:100%;\n");
      out.write("    height:1120px;\n");
      out.write("    border:1px solid red;\n");
      out.write("   /* margin-right:10px;*/\n");
      out.write("    /*float:left;*/\n");
      out.write("}\n");
      out.write(".child_div_1{\n");
      out.write("\twidth:60%;\n");
      out.write("    float:left;\n");
      out.write("    margin-right:5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".child_div_2{\n");
      out.write("\twidth:38%;\n");
      out.write("    float:right;\n");
      out.write("    margin-left:5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div id=\"parent_div_1\">\n");
      out.write("\n");
      out.write("<div  class=\"child_div_1\">\n");
      out.write("\t\n");
      out.write("    <embed src=\"C:\\Users\\Lakhan Mnae\\Documents\\NetBeansProjects\\StudentRegistration\\paper.pdf\" type=\"application/pdf\" width=\"100%\" height=\"950px\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"child_div_2\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"GenerateMarksheet\">\n");
      out.write("\n");
      out.write("\t<H3>Name: <input type=\"text\" name=\"student name\" size=\"50\" placeholder=\"student name\"> </H3>\n");
      out.write("\t<h4>Roll No: <input type=\"text\" name=\"roll\" size=\"10\" placeholder=\"student roll no\"></h4>\n");
      out.write("        <h4>Subject: <input type=\"text\" name=\"subject\" size=\"30\" placeholder=\"paper subject\"></h4>\n");
      out.write("<TABLE BORDER=\"1\">\n");
      out.write("\t<p>Question 1:</p>\n");
      out.write("\t<th>a</th>\n");
      out.write("\t<th>b</th>\n");
      out.write("\t<th>c</th>\n");
      out.write("\t<th>Total</th>\n");
      out.write("  <TR>\n");
      out.write("    \n");
      out.write("    <TD><INPUT TYPE=\"TEXT\" NAME=\"a1\" SIZE=\"10\"></TD>\n");
      out.write("  \t<TD><INPUT TYPE=\"TEXT\" NAME=\"b1\" SIZE=\"10\"></TD>\n");
      out.write("  \t<TD><INPUT TYPE=\"TEXT\" NAME=\"c1\" SIZE=\"10\"></TD>\n");
      out.write("  \t<TD><INPUT TYPE=\"TEXT\" NAME=\"t1\" SIZE=\"10\"></TD>\n");
      out.write("  </TR>\n");
      out.write("</TABLE>\n");
      out.write("        <p style=\"color:red;\"><strong> OR </strong></p>\n");
      out.write("\n");
      out.write("<TABLE BORDER=\"1\">\n");
      out.write("\t<p>Question 2:</p>\n");
      out.write("\t<th>a</th>\n");
      out.write("\t<th>b</th>\n");
      out.write("\t<th>c</th>\n");
      out.write("\t<th>Total</th>\n");
      out.write("  <TR>\n");
      out.write("    \n");
      out.write("    <TD><INPUT TYPE=\"TEXT\" NAME=\"a2\" SIZE=\"10\"></TD>\n");
      out.write("  \t<TD><INPUT TYPE=\"TEXT\" NAME=\"b2\" SIZE=\"10\"></TD>\n");
      out.write("  \t<TD><INPUT TYPE=\"TEXT\" NAME=\"c2\" SIZE=\"10\"></TD>\n");
      out.write("  \t<TD><INPUT TYPE=\"TEXT\" NAME=\"t2\" SIZE=\"10\"></TD>\n");
      out.write("  </TR>\n");
      out.write("</TABLE>\n");
      out.write("\n");
      out.write("\n");
      out.write("<TABLE BORDER=\"1\">\n");
      out.write("\t<p>Question 3:</p>\n");
      out.write("\t<th>a</th>\n");
      out.write("\t<th>b</th>\n");
      out.write("\t<th>c</th>\n");
      out.write("\t<th>Total</th>\n");
      out.write("  <TR>\n");
      out.write("    \n");
      out.write("    <TD><INPUT TYPE=\"TEXT\" NAME=\"a3\" SIZE=\"10\"></TD>\n");
      out.write("  \t<TD><INPUT TYPE=\"TEXT\" NAME=\"b3\" SIZE=\"10\"></TD>\n");
      out.write("  \t<TD><INPUT TYPE=\"TEXT\" NAME=\"c3\" SIZE=\"10\"></TD>\n");
      out.write("  \t<TD><INPUT TYPE=\"TEXT\" NAME=\"t3\" SIZE=\"10\"></TD>\n");
      out.write("  </TR>\n");
      out.write("</TABLE>\n");
      out.write("\n");
      out.write("        <p style=\"color:red;\"><strong> OR </strong></p>\n");
      out.write("\n");
      out.write("<TABLE BORDER=\"1\">\n");
      out.write("\t<p>Question 4:</p>\n");
      out.write("\t<th>a</th>\n");
      out.write("\t<th>b</th>\n");
      out.write("\t<th>c</th>\n");
      out.write("\t<th>Total</th>\n");
      out.write("  <TR>\n");
      out.write("    \n");
      out.write("    <TD><INPUT TYPE=\"TEXT\" NAME=\"a4\" SIZE=\"10\"></TD>\n");
      out.write("  \t<TD><INPUT TYPE=\"TEXT\" NAME=\"b4\" SIZE=\"10\"></TD>\n");
      out.write("  \t<TD><INPUT TYPE=\"TEXT\" NAME=\"c4\" SIZE=\"10\"></TD>\n");
      out.write("  \t<TD><INPUT TYPE=\"TEXT\" NAME=\"t4\" SIZE=\"10\"></TD>\n");
      out.write("  </TR>\n");
      out.write("</TABLE>\n");
      out.write("\n");
      out.write("<TABLE BORDER=\"1\">\n");
      out.write("\t<p>Question 5:</p>\n");
      out.write("\t<th>a</th>\n");
      out.write("\t<th>b</th>\n");
      out.write("\t<th>c</th>\n");
      out.write("\t<th>Total</th>\n");
      out.write("  <TR>\n");
      out.write("    \n");
      out.write("    <TD><INPUT TYPE=\"TEXT\" NAME=\"a5\" SIZE=\"10\"></TD>\n");
      out.write("  \t<TD><INPUT TYPE=\"TEXT\" NAME=\"b5\" SIZE=\"10\"></TD>\n");
      out.write("  \t<TD><INPUT TYPE=\"TEXT\" NAME=\"c5\" SIZE=\"10\"></TD>\n");
      out.write("  \t<TD><INPUT TYPE=\"TEXT\" NAME=\"t5\" SIZE=\"10\"></TD>\n");
      out.write("  </TR>\n");
      out.write("</TABLE>\n");
      out.write("\n");
      out.write("        <p style=\"color:red;\"><strong> OR </strong></p>\n");
      out.write("\n");
      out.write("<TABLE BORDER=\"1\">\n");
      out.write("\t<p>Question 6:</p>\n");
      out.write("\t<th>a</th>\n");
      out.write("\t<th>b</th>\n");
      out.write("\t<th>c</th>\n");
      out.write("\t<th>Total</th>\n");
      out.write("  <TR>\n");
      out.write("    \n");
      out.write("    <TD><INPUT TYPE=\"TEXT\" NAME=\"a6\" SIZE=\"10\"></TD>\n");
      out.write("  \t<TD><INPUT TYPE=\"TEXT\" NAME=\"b6\" SIZE=\"10\"></TD>\n");
      out.write("  \t<TD><INPUT TYPE=\"TEXT\" NAME=\"c6\" SIZE=\"10\"></TD>\n");
      out.write("  \t<TD><INPUT TYPE=\"TEXT\" NAME=\"t6\" SIZE=\"10\"></TD>\n");
      out.write("  </TR>\n");
      out.write("</TABLE>\n");
      out.write("\n");
      out.write("<TABLE BORDER=\"1\">\n");
      out.write("\t<p>Question 7:</p>\n");
      out.write("\t<th>a</th>\n");
      out.write("\t<th>b</th>\n");
      out.write("\t<th>c</th>\n");
      out.write("\t<th>Total</th>\n");
      out.write("  <TR>\n");
      out.write("    \n");
      out.write("    <TD><INPUT TYPE=\"TEXT\" NAME=\"a7\" SIZE=\"10\"></TD>\n");
      out.write("  \t<TD><INPUT TYPE=\"TEXT\" NAME=\"b7\" SIZE=\"10\"></TD>\n");
      out.write("  \t<TD><INPUT TYPE=\"TEXT\" NAME=\"c7\" SIZE=\"10\"></TD>\n");
      out.write("  \t<TD><INPUT TYPE=\"TEXT\" NAME=\"t7\" SIZE=\"10\"></TD>\n");
      out.write("  </TR>\n");
      out.write("</TABLE>\n");
      out.write("\n");
      out.write("        <p style=\"color:red;\"><strong> OR </strong></p>\n");
      out.write("        \n");
      out.write("<TABLE BORDER=\"1\">\n");
      out.write("\t<p>Question 8:</p>\n");
      out.write("\t<th>a</th>\n");
      out.write("\t<th>b</th>\n");
      out.write("\t<th>c</th>\n");
      out.write("\t<th>Total</th>\n");
      out.write("  <TR>\n");
      out.write("    \n");
      out.write("    <TD><INPUT TYPE=\"TEXT\" NAME=\"a8\" SIZE=\"10\"></TD>\n");
      out.write("  \t<TD><INPUT TYPE=\"TEXT\" NAME=\"b8\" SIZE=\"10\"></TD>\n");
      out.write("  \t<TD><INPUT TYPE=\"TEXT\" NAME=\"c8\" SIZE=\"10\"></TD>\n");
      out.write("  \t<TD><INPUT TYPE=\"TEXT\" NAME=\"t8\" SIZE=\"10\"></TD>\n");
      out.write("  </TR>\n");
      out.write("</TABLE>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<P><INPUT TYPE=\"SUBMIT\" VALUE=\"Submit\" NAME=\"submit\"></P>\n");
      out.write("</FORM>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

}
}
catch(Exception e){

    System.out.println("exception"+e);
    //response.sendRedirect("tg_login.jsp");
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
