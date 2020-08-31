
import java.io.IOException;
import java.sql.*;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lakhan Mnae
 */
@WebServlet(urlPatterns = {"/Getdata"})
public class Getdata extends HttpServlet {

Connection conn;
PreparedStatement pst;
ResultSet rs;

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
 
 ////email validate
 
     public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
        return matcher.find();
}
 
 // various operation....
 
        
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
         try{
        response.setContentType("text/html;charset=UTF-8");
        String bid = request.getParameter("bid");// ajax request
      
        PrintWriter out1 = response.getWriter(); // printing object
        String fname = request.getParameter("fname").toUpperCase();
        System.out.print(fname);//1

        
        String mname = request.getParameter("mname").toUpperCase();
       
      String lname= request.getParameter("lname").toUpperCase();
     
      String email = request.getParameter("email");
      
      String mobile = request.getParameter("mobile");
     
      String uname = request.getParameter("uname");

      String password1 = request.getParameter("password1");
      String password2 = request.getParameter("password2");
      
     String gender = request.getParameter("radio").toUpperCase();
     
      String branch1 = request.getParameter("br");  // local
      
      String tg = request.getParameter("tg");
      
      if(fname.isEmpty() || mname.isEmpty() || lname.isEmpty() || email.isEmpty() || mobile.isEmpty() || uname.isEmpty() || password1.isEmpty() || gender.isEmpty() || branch1.isEmpty() || tg.isEmpty())
      {
          
          response.sendRedirect("/StudentRegistration/SignUp.jsp?fail=All field required..");
      }else{
          
            if (validate(email)) {

                if (mobile.length() == 10) {
                    String check = "select * from student_login where username = '" + uname + "' or email = '"+email+"'";
                    try {
                        conn = connectDB();
                        pst = conn.prepareStatement(check);
                        rs = pst.executeQuery();
                        if (rs.next()) {
                            response.sendRedirect("/StudentRegistration/SignUp.jsp?fail=username or email already exist..");
                        } else {
                            if (password1.equals(password2)) {
                                String sql2 = "insert into student_login(fname,mname,lname,gender,email,mobile,username,password,tg_id,branch) values('" + fname + "','" + mname + "','" + lname + "','" + gender + "','" + email + "','" + mobile + "','" + uname + "',md5('" + password1 + "'),'" + tg + "','" + branch1 + "')";
                                try {
                                    System.out.print(fname);//3

                                    conn = connectDB();

                                    pst = conn.prepareStatement(sql2);
                                    pst.executeUpdate();
                                    System.out.print(fname);
                                    session.setAttribute("signup", "1");   
                                    response.sendRedirect("/StudentRegistration/index.jsp?success=Signup Success");

                                } catch (IOException | SQLException e) {
                                    out1.print(e);
                                }
                            }else{
                                response.sendRedirect("/StudentRegistration/SignUp.jsp?fail=Password and confirm password not match");
                            }
                        }

                    } catch (IOException | SQLException e) {

                    }
                } else {
                    response.sendRedirect("/StudentRegistration/SignUp.jsp?fail=mobile not valid");

                }

            } else {
                response.sendRedirect("/StudentRegistration/SignUp.jsp?fail=mail not valid");

            }

        }
      }catch(Exception e){
          response.sendRedirect("/StudentRegistration/SignUp.jsp?fail=All field required..");
      }
      
      
      
      
      /////end
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
