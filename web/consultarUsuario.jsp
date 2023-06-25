<%-- 
    Document   : consultarUsuario
    Created on : 27/03/2023, 09:11:21 AM
    Author     : juans
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDao.usuarioDao"%>
<%@page import="ModeloVo.usuarioVo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar usuarios</title>
        <link href="css/Main.css" rel="stylesheet" type="text/css"/>
        <link href="css/logoV.png" rel='icon' />
        <style>    
            .circle-button.bottom-right {
                position: fixed;
                bottom: 20px;
                right: 20px;
                z-index: 9999;
            }
            
            .circle-button form {
                display: inline-block;
                margin-bottom: 10px;
            }

            .circle-button button {
                background-color: #3CB371;
                color: #FFFFFF;
                border: none;
                padding: 10px 20px;
                border-radius: 0;
                font-size: 14px;
                font-weight: bold;
                cursor: pointer;
            }

            .circle-button button:hover {
                background-color: #2E8B57;
            }

            .circle-button input[type="hidden"] {
                display: none;
            }
            
            body {
                font-family: Arial, sans-serif;
            }

            header {
                background-color: #f3f3f3;
                padding: 20px;
                text-align: center;
            }

            h1 {
                color: #245d28;
                margin: 0;
            }

            .form-group {
                margin-bottom: 20px;
            }

            table {
                width: 100%;
                border-collapse: collapse;
            }

            th, td {
                padding: 10px;
                text-align: left;
                border-bottom: 1px solid #ccc;
            }

            th {
                background-color: #f3f3f3;
                font-weight: bold;
                color: #245d28;
            }

            .mensaje {
                margin-bottom: 20px;
                padding: 10px;
                background-color: #cde9cc;
                color: #245d28;
            }

            .my-button {
                position: absolute;
                top: 0;
                left: 0;
                margin: 10px;
                padding: 10px;
                background-color: #cde9cc;
                border: none;
                color: #245d28;
                font-size: 20px;
                cursor: pointer;
            }
            a {
                font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
                text-decoration: none;
                transition: box-shadow 0.3s ease;
            }

            a:hover {
                box-shadow: 0 0 5px rgba(144, 238, 144, 0.5);
            }
            .input-field {
                padding: 10px;
                border: 1px solid #ccc;
                border-radius: 4px;
                font-size: 14px;
            }

            .submit-button {
                padding: 10px 20px;
                background-color: #3d8f37;
                color: #fff;
                border: none;
                border-radius: 4px;
                cursor: pointer;
                font-size: 14px;
            }
            .submit-button:hover {
                background-color: #36842f;
            }
        </style>
    </head>
    <body>

        <div id="mySidebar" class="sidebar">
            <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">×</a>
            <a href="Inicio_1_1.jsp">Inicio</a>
            <a href="registroUsuario.jsp">Volver</a>
        </div>
        
        <script>
            function openNav() {
                document.getElementById("mySidebar").style.width = "250px";
                document.getElementById("main").style.marginLeft = "250px";
            }
            function closeNav() {
                document.getElementById("mySidebar").style.width = "0";
                document.getElementById("main").style.marginLeft = "0";
            }
        </script>
        <header> 
            <div id="main">
                <a href="https://www.sena.edu.co/es-co/Paginas/default.aspx">
                    <img class="my-logo" src="css/Logo-de-SENA-png-verde-300x300-1.png" />
                </a>
                <img class="my-lin" src="css/line.png" alt=""/>
                <img class="my-ban" src="css/BannerV.png" alt=""/>
                <br>
                <button class="my-button openbtn" onclick="openNav()">☰</button>
                <header>              
                    <h1>Consultar Usuario</h1>
                </header>
                <div class="form-group">
                    <form method="post" action="usuario">
                        <table>
                            <tr>
                                <th>
                                    <label for="numDoc">Numero De Documento:</label>
                                    <input type="text" name="numDoc" id="numDoc" class="input-field">
                                    <input type="submit" value="Consultar" class="submit-button">
                                </th>
                            </tr>
                        </table>
                        <input type="hidden" name="opcion" value="3">      
                    </form>
                </div>
                <div>
                    <% if (request.getAttribute("mensajeError") != null) { %>
                    <div class="mensaje">
                        ${mensajeError}
                    </div>
                    <% } else { %>
                    <div class="mensaje">
                        ${mensajeExito}
                    </div>
                    <% } %>
                    <table>
                        <tr>    
                            <th>Documento</th>
                            <th>Nombre</th>
                            <th>Apellido</th>
                            <th>Correo</th>
                            <th>Dirección</th>
                            <th>Teléfono</th>
                            <th>ID Tipo Documento</th> 
                            <th>Documento</th> 
                            <th>ID Rol</th>    
                            <th>Rol</th>                         
                            <th>Estado</th>
                        </tr>

                        <% usuarioVo usuVo = new usuarioVo();
                            usuarioDao usuDao = new usuarioDao();
                            ArrayList<usuarioVo> ListarUsuarios = usuDao.Listar();
                            for (int i = 0; i < ListarUsuarios.size(); i++) {
                                usuVo = ListarUsuarios.get(i);
                        %>
                        <tr>  
                            <td><%= usuVo.getNumDoc()%></td>
                            <td><%= usuVo.getNomUsu()%></td>                    
                            <td><%= usuVo.getApeUsu()%></td>
                            <td><%= usuVo.getMail()%></td>
                            <td><%= usuVo.getDirec()%></td>
                            <td><%= usuVo.getTelefo()%></td>
                            <td><%= usuVo.getIdTipoDoc()%></td>
                            <td><%= usuVo.getDescripcionTipoDoc()%></td>
                            <td><%= usuVo.getIdTipoRol()%></td>
                            <td><%= usuVo.getNomRol()%></td>                    
                            <td><%= usuVo.getEstado()%></td>
                        </tr>
                        <% }%>
                    </table>
                </div>
            </div>
                                 
            <div class="circle-button bottom-left">
                <form action="GeneradorReportes.jsp" method="post">
                    <button type="submit">Aprendices</button>
                    <input type="hidden" value="aprendices" name="reportName">                    
                </form>
                <form action="GeneradorReportes.jsp" method="post">
                    <button type="submit">Instructores</button>
                    <input type="hidden" value="Instructores" name="reportName">
                </form>
            </div>      
        </header>
    </body>
</html>
