import java.sql.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
@WebServlet(urlPatterns = {"/send_mail_pass"})
public class send_mail_pass extends HttpServlet {
    
Connection conn;
PreparedStatement pst;
ResultSet rs;

    private String host;
	private String port;
	private String user;
	private String pass;

	public void init() {
		// reads SMTP server setting from web.xml file
		ServletContext context = getServletContext();
		host = context.getInitParameter("host");
		port = context.getInitParameter("port");
		user = context.getInitParameter("user");
		pass = context.getInitParameter("pass");
	}
        

//Connection servlet to mysql

 public Connection connectDB(){
    try{
       Class.forName("com.mysql.jdbc.Driver");
       conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college_registration","root","root123");
      
      System.out.println("Database Connected");
      
      return conn;
    }
    catch(Exception e){
        System.out.println("There is problem in Database Connection");
    }
    return conn;
  }
    
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
                PrintWriter out = response.getWriter();
                String recipient = request.getParameter("mail");
		String subject = "Forgot Password Request";
                
                
                String check_valid = "select * from student_login where email = '"+recipient+"'";
                
                try{
                    conn = connectDB();
                    PreparedStatement pst_check = conn.prepareStatement(check_valid);
                    ResultSet rs_check = pst_check.executeQuery();
                    if(rs_check.next()){
                 
                
                
                
                
                
                
                
                
           String  pass1 = "";
           String  username = "";
           String Hash = UUID.randomUUID().toString();
           
                String sql2 = "select * from student_login where email ='"+recipient+"'";
                String update = "update student_login set hash ='"+Hash+"' where email = '"+recipient+"'";
        try {
            conn = connectDB();
            
                pst = conn.prepareStatement(sql2);
                
               rs = pst.executeQuery();
               pst = conn.prepareStatement(update);
               pst.executeUpdate();
               if(rs.next()){
//                   pass1 = rs.getString("password");
                   username = rs.getString("username");
               }
              
        } catch (Exception e) {
            out.print(e);
        }
                
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
		
//                String link = "<a herf='192.168.3.222:8080/StudentRegistration/reset_pass.jsp?email"+recipient+"&&"+Hash+"'></a>";
//                 String link = new String("<A HREF=\"http://localhost:8080/StudentRegistration/reset_pass.jsp?email='"+recipient+"'&hash='"+Hash+"'\">link</A>");
                 String link = new String("http://localhost:8080/StudentRegistration/reset_pass.jsp?email="+recipient+"&hash="+Hash);
		String resultMessage = "";
                String content = " Your Username : " + username;
                content = content+"\n\n\n Click on this link to reset password   "
                        + "\n\n"+link;
                
		try {
			EmailUtility.sendEmail(host, port, user, pass, recipient, subject,
					content);
			resultMessage = "</b>The e-mail was sent successfully</b></br>Plase check your e-mail in spam folder too!!";
                        out.print(resultMessage);
//                        response.sendRedirect("/StudentRegistration/");
		} catch (Exception ex) {
			ex.printStackTrace();
			resultMessage = "There were an error: " + ex.getMessage();
                        out.print(ex);
//                       response.sendRedirect("/StudentRegistration/forgot_pass.jsp?fail=Please Enter Valid Mail");
                           out.print("Please Enter Valid Mail");

		} finally {
//			request.setAttribute("Message", resultMessage);
//			getServletContext().getRequestDispatcher("/Result.jsp").forward(
//					request, response);
		}
                
                
                       
                    }else{
                        out.print("Invalid mail is");
                    }
                }catch(Exception e){
                    out.print(e);
                }
                
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
