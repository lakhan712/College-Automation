import java.io.IOException;
import java.sql.*;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/delete_st"})
public class delete_st extends HttpServlet {

    
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
         String sid = request.getParameter("id");
         
         String sql1 = "delete from student_login where id = '"+sid+"'";
         String sql2 = "delete from students where sid = '"+sid+"'";
           String sql3 = "delete from academic_record where sid = '"+sid+"'";
         String sql4 = "delete from c_address where sid = '"+sid+"'";
          String sql5 = "delete from guardian where sid = '"+sid+"'";
          String sql6 = "delete from parent where sid = '"+sid+"'";
          String sql7 = "delete from p_address where sid = '"+sid+"'";

        try {
            conn = connectDB();
            
                Statement pst = conn.createStatement();
               pst.addBatch(sql1);
               pst.addBatch(sql2);
               pst.addBatch(sql3);
               pst.addBatch(sql4);
               pst.addBatch(sql5);
               pst.addBatch(sql6);
               pst.addBatch(sql7);

                 pst.executeBatch();
              // response.sendRedirect("/StudentRegistration/jsps/add_tg.jsp");
              
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
