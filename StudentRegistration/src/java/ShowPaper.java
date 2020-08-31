/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lakhan Mnae
 */
public class ShowPaper extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
            HttpSession session = request.getSession(false);
            String fileName = session.getAttribute("filename").toString();
            String path = "E:\\villain\\";
            response.setContentType("APPLICATION/PDF");
            response.setHeader("Content-Disposition", "inline; filename=\""+fileName+"\"");
            FileInputStream fi = new FileInputStream(path+fileName);
            int i;
            while((i=fi.read()) != -1)
                out.write(i);
            fi.close();
            out.close();

    
            
            
            

// 
//        ServletOutputStream stream = null;
//        BufferedInputStream buf = null;
//        try {
//            stream = response.getOutputStream();
//            // set response headers
//            response.setContentType("application/pdf");
//            response.setDateHeader("Expires", 0);
//            response.addHeader("Content-Disposition",
//                    "inline; filename="+fileName);
//            response.setContentLength((int) file.length());
//            buf = new BufferedInputStream(new FileInputStream(file));
//            int readBytes = 0;
//            while ((readBytes = buf.read()) != -1)
//                stream.write(readBytes);
//        } finally {
//            if (stream != null)
//                stream.flush();
//            stream.close();
//            if (buf != null)
//                buf.close();
//        }


       
        
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
