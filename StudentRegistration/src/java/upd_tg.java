import java.io.IOException;
import java.sql.*;
import java.io.PrintWriter;
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
@WebServlet(urlPatterns = {"/upd_tg"})
public class upd_tg extends HttpServlet {

    
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
      
        String id=null;
        String name=null;
        String email=null;
        String mobile=null;
        String username=null;
        String password=null;
        PrintWriter out1 = response.getWriter(); // printing object
        
        //////////name
        
         id = request.getParameter("id");
         name = request.getParameter("name");
        
        if(name!=null){
     
      String sql1 = "update master_tg set name='"+name+"' where id='"+id+"'";
        try {
            conn = connectDB();
            pst = conn.prepareStatement(sql1);
                 pst.executeUpdate();
             // response.sendRedirect("/StudentRegistration/add_tg.jsp");
              
        } catch (Exception e) {
            out1.print(e);
        }
    }
        ////////////////////email
        
        id = request.getParameter("id");
         email = request.getParameter("email");
        
        if(email!=null){
     
      String sql1 = "update master_tg set email='"+email+"' where id='"+id+"'";
        try {
            conn = connectDB();
            pst = conn.prepareStatement(sql1);
                 pst.executeUpdate();
             // response.sendRedirect("/StudentRegistration/add_tg.jsp");
              
        } catch (Exception e) {
            out1.print(e);
        }
    }
        
        /////////// mobile
        
          id = request.getParameter("id");
         mobile = request.getParameter("mobile");
        
        if(mobile!=null){
     
      String sql1 = "update master_tg set mobile='"+mobile+"' where id='"+id+"'";
        try {
            conn = connectDB();
            pst = conn.prepareStatement(sql1);
                 pst.executeUpdate();
             // response.sendRedirect("/StudentRegistration/add_tg.jsp");
              
        } catch (Exception e) {
            out1.print(e);
        }
    }
        
        /////Username
        
          id = request.getParameter("id");
         username = request.getParameter("username");
        
        if(username!=null){
     
      String sql1 = "update master_tg set username='"+username+"' where id='"+id+"'";
        try {
            conn = connectDB();
            pst = conn.prepareStatement(sql1);
                 pst.executeUpdate();
             // response.sendRedirect("/StudentRegistration/add_tg.jsp");
              
        } catch (Exception e) {
            out1.print(e);
        }
    }
        
        ////////////// password
        
          id = request.getParameter("id");
         password = request.getParameter("password");
        
        if(password!=null){
     
      String sql1 = "update master_tg set password='"+password+"' where id='"+id+"'";
        try {
            conn = connectDB();
            pst = conn.prepareStatement(sql1);
                 pst.executeUpdate();
             // response.sendRedirect("/StudentRegistration/add_tg.jsp");
              
        } catch (Exception e) {
            out1.print(e);
        }
    }
        ////end ajax query
        
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
