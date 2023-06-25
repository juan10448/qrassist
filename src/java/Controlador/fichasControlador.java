/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDao.fichasDao;
import ModeloVo.fichasVo;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author juans
 */
@WebServlet(name = "fichasControlador", urlPatterns = {"/fichas"})
public class fichasControlador extends HttpServlet {

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
        
        String idFicha = request.getParameter("idFicha");
        String idFor = request.getParameter("idFor");
        String feIni = request.getParameter("feIni");
        String feFin = request.getParameter("feFin");
        
        int opcion = Integer.parseInt(request.getParameter("opcion"));
      
              
        fichasVo ficVo = new fichasVo(idFicha, idFor, feIni, feFin );
        fichasDao ficDao = new fichasDao(ficVo);
   
        switch(opcion){
            case 1:
                if (ficDao.agregar()) {
                    request.setAttribute("mensajeExito", "¡La Ficha se registro correctamente!");
                    
                }else{
                    request.setAttribute("mensajeError", "¡La Ficha NO se registro correctamente");
                }
                request.getRequestDispatcher("registroFichas.jsp").forward(request, response);
                break;
            case 2: 
                if (ficDao.actualizar()) {
                    request.setAttribute("mensajeExito", "¡La Ficha se actualizo correctamente");
                }else{
                    request.setAttribute("mensajeError", "¡La Ficha NO se actualizo correctamente");
                }
                request.getRequestDispatcher("consultarFicha.jsp").forward(request, response);
                
            case 3: //Consultar Id  
                   ficVo = ficDao.consultarFicha(idFicha);
                   if(ficVo != null){ 
                   request.setAttribute("FichaEncontrada", ficVo);
                   request.getRequestDispatcher("actualizarFicha.jsp").forward(request, response);
                   break;
                   }else{
                   request.setAttribute("MensajeError", "La Ficha No existe");
                   request.getRequestDispatcher("consultarFicha.jsp").forward(request, response);
                   } break;        
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
