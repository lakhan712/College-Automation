
import java.io.IOException;
import java.sql.*;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lakhan Mnae
 */
@WebServlet(urlPatterns = {"/get_tg"})
public class get_tg extends HttpServlet {

  
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
    catch(ClassNotFoundException | SQLException e){
        System.out.println("There is problem in Database Connection");
    }
    return conn;
  }
 
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
                String bid = request.getParameter("bid");// ajax request

                 // ajax request handeling....---> hawa ajax bhavachi huehue
        
        String sql1 = "select * from master_tg where bid="+bid+"";
        try {
            conn = connectDB();
            
                pst = conn.prepareStatement(sql1);
             ResultSet   rs1 = pst.executeQuery();
                try (PrintWriter out = response.getWriter()) {
                while (rs1.next()) {
                    /* TODO output your page here. You may use following sample code. */
                    out.println("<option value='"+rs1.getString("id")+"'>" + rs1.getString("name") + "</option>");
                }
                }
              
        } catch (Exception e) {

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
