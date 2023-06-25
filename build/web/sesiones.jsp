<%-- 
    Document   : sesiones
    Created on : 22/06/2023, 07:21:16 PM
    Author     : juans
--%>
<%@page import="ModeloVo.usuarioVo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-control", "no-cache,no-strore,must-revalidate");
        response.setDateHeader("Expires", 0);
    %>
    <body>
        <%
            // ...
            String usuNombre = "", usuId = "", usuRol = "";

            HttpSession buscarSesion = (HttpSession) request.getSession();

            if (buscarSesion.getAttribute("datosUsuario") != null) {
                usuarioVo usuVO = (usuarioVo) buscarSesion.getAttribute("datosUsuario");

                usuNombre = usuVO.getNomUsu();
                usuRol = usuVO.getIdTipoRol();
                usuId = usuVO.getNumDoc();

                // Condiciona la visualización del contenido según el ID del rol
                if (usuRol != null && usuRol.equals("1")) {
                    // Mostrar contenido para el rol 3 (por ejemplo, gerente)
        %>
        <!-- Aquí va el contenido para el rol 3 -->
        <%@include file="menuAprendiz.jsp" %>
        <%
        } else if (usuRol != null && usuRol.equals("2")) {
            // Mostrar contenido para el rol 2 (por ejemplo, administrador)
        %>
        <!-- Aquí va el contenido para el rol 2 -->
        <%@include file="menuAdministrador.jsp" %>
        <%
        } else if (usuRol != null && usuRol.equals("3")) {
            // Mostrar contenido para el rol 1 (por ejemplo, vendedor)
        %>
        <!-- Aquí va el contenido para el rol 1 -->
        <%@include file="menuInstructor.jsp" %>
        <%
        } else {
            // Mostrar contenido para otros roles o acceso denegado
        %>
        <!-- Aquí va el contenido para otros roles o mensaje de acceso denegado -->
        <p>Acceso denegado.</p>
        <%
                }
            } else {
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        %>
         </body>
</html>
