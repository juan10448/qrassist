package Controlador;

import ModeloDao.usuarioDao;
import ModeloVo.usuarioVo;
import ModeloDao.tipoRolDao;
import ModeloVo.tipoRolVo;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "usuarioControlador", urlPatterns = {"/usuario"})
public class usuarioControlador extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        String numDoc = request.getParameter("numDoc");
        String nomUsu = request.getParameter("nomUsu");
        String apeUsu = request.getParameter("apeUsu");
        String pass = request.getParameter("pass");
        String mail = request.getParameter("mail");
        String direc = request.getParameter("direc");
        String telefo = request.getParameter("telefo");
        String idTipoDoc = request.getParameter("idTipoDoc");
        String idTipoRol = request.getParameter("idTipoRol");
        String descripcionTipoDoc = request.getParameter("descripcionTipoDoc");
        String nomRol = request.getParameter("nomRol");
        String estado = request.getParameter("estado");
        int opcion = Integer.parseInt(request.getParameter("opcion"));

        //2. Quien tiene los datos de forma segura? el VEO 
        usuarioVo usuVo = new usuarioVo(numDoc, nomUsu, apeUsu, pass, mail, direc, telefo, idTipoDoc, idTipoRol, descripcionTipoDoc, nomRol, estado);
        //3. quien hace las operaciones?  el DAO
        usuarioDao usuDao = new usuarioDao(usuVo);

        tipoRolDao rolDao = new tipoRolDao();
        tipoRolVo rolVo = new tipoRolVo();

        switch (opcion) {
            case 1: //agregar Usuario

                if (usuDao.agregar()) {
                    request.setAttribute("mensajeExito", "El usuario se registro correctamente");

                } else {
                    request.setAttribute("mensajeError", "El usuario NO se registro correctamente");
                }
                request.getRequestDispatcher("registroUsuario.jsp").forward(request, response);
                break;

            case 2: //actualizar Usuario
                if (usuDao.actualizar()) {
                    request.setAttribute("mensajeExito", "El usuario se actualizo Correctamente");

                } else {
                    request.setAttribute("mensajeError", "El usuario NO se actualizo correctamente");
                }
                request.getRequestDispatcher("consultarUsuario.jsp").forward(request, response);
                break;

            case 3: //Consultar usuario  
                usuVo = usuDao.consultarPorDocumento(numDoc);
                if (usuVo != null) {
                    request.setAttribute("UsuarioEncontrado", usuVo);
                    request.getRequestDispatcher("actualizarUsuario.jsp").forward(request, response);
                    break;
                } else {
                    request.setAttribute("MensajeError", "El Usuario NO existe");
                    request.getRequestDispatcher("consultarUsuario.jsp").forward(request, response);
                }
                break;
                
            case 4://iniciar sesion
                if (usuDao.iniciarSecion(numDoc, pass)) {
                    HttpSession miSesion = request.getSession(true);
                    usuVo = usuDao.consultarPorDocumento(numDoc);
                    miSesion.setAttribute("datosUsuario", usuVo);
                    request.getRequestDispatcher("Inicio_1_1.jsp").forward(request, response);
                } else {
                    request.setAttribute("mensajeError", "¡Datos incorrectos!");
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                }
                break;
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
