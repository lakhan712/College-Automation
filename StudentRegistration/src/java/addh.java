
import java.io.IOException;
import java.sql.*;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(urlPatterns = {"/addh"})
public class addh extends HttpServlet {

Connection conn;
PreparedStatement pst;
ResultSet rs;

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
      
        
//         HttpSession session = request.getSession();
//        String bid = session.getAttribute("bid").toString();
         PrintWriter out = response.getWriter(); // printing object
        String name = request.getParameter("name");
        System.out.print(name);
        String email = request.getParameter("email");
       System.out.print(email);
      String mobile= request.getParameter("mobile");
     System.out.print(mobile);
      String username = request.getParameter("username");
      System.out.print(username);
      String password = request.getParameter("password");
     System.out.print(password);
     String depid = request.getParameter("depid");
     System.out.println(depid);
   
        String sqladd = "insert into master_hod(bid,name,email,mobile,username,password) values('"+depid+"','"+name+"','"+email+"','"+mobile+"','"+username+"','"+password+"')";
        try {
            conn = connectDB();
            
                pst = conn.prepareStatement(sqladd);
                 pst.executeUpdate();
              // response.sendRedirect("/StudentRegistration/add_tg.jsp");
              
        } catch (Exception e) {
           System.out.println(e);
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
