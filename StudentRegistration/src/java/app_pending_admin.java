import java.io.IOException;
import java.sql.*;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/app_pending_admin"})
public class app_pending_admin extends HttpServlet {

        Connection conn;
PreparedStatement pst,pst2;
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
        
        
        PrintWriter out1= response.getWriter();
         
         ////// accept pending
         
         String sid = request.getParameter("ida");
         //System.out.print(ida);
        
       
         
         String sql1 = "update students set status = '2' where sid = '"+sid+"'";
        try {
            conn = connectDB();
            
                pst = conn.prepareStatement(sql1);
                 pst.executeUpdate();
              // response.sendRedirect("/StudentRegistration/add_tg.jsp");
              
        } catch (Exception e) {
            out1.print(e);
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
