<%-- 
    Document   : actualizarUsuario
    Created on : 9/06/2023, 07:47:49 AM
    Author     : APRENDIZ
--%>

<%@page import="ModeloVo.usuarioVo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ACTUALIZAR USUARIO</title>
        <link href="css/Main.css" rel="stylesheet" type="text/css"/>
        <link href="css/logoV.png" rel='icon' />
        <style>
            body {
                font-family: Arial, sans-serif;
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
                padding: 10px;
                background-color: #cde9cc;
                border: none;
                color: #245d28;
                font-size: 16px;
                cursor: pointer;
            }

            .my-button:hover {
                background-color: #b3e6b3;
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
            a {
                font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
                text-decoration: none;
                transition: box-shadow 0.3s ease;
            }
            a:hover {
                box-shadow: 0 0 5px rgba(144, 238, 144, 0.5);
            }
        </style>
    </head>
    <body>
        <div id="mySidebar" class="sidebar">
            <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">×</a>
            <a href="Inicio_1_1.jsp">Inicio</a>
            <a href="consultarUsuario.jsp">Volver</a>
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
                <button class="my-button openbtn"  onclick="openNav()">☰</button>  
                <center>
                    <header>
                        <h1>Actualizar Usuario</h1>
                    </header>
                    <%
                        usuarioVo usuVO = (usuarioVo) request.getAttribute("UsuarioEncontrado");
                        if (usuVO != null) {
                    %>
                    <div class="container-1">
                        <form method = "post" action = "usuario">
                            <table>
                                <tr><div class="form-group">
                                    <label> Numero de documento del Usuario: </label><br>
                                    <input type = "number" name = "numDoc" value="<%=usuVO.getNumDoc()%>" minlength="8" maxlength="11" required><br>    </div><div class="form-group">
                                    <label> Nombre del Usuario: </label><br>
                                    <input type = "text" name = "nomUsu" value="<%=usuVO.getNomUsu()%>" minlength="2" maxlength="30" required><br></div><div class="form-group">
                                    <label> Apellido del Usuario: </label><br>
                                    <input type = "text" name = "apeUsu" value="<%=usuVO.getApeUsu()%>" minlength="2" maxlength="30" required><br>    </div><div class="form-group">    
                                    <label> Contraseña del Usuario:<br>
                                        <input type = "password" name = "pass" value="<%=usuVO.getPass()%>" minlength="5" maxlength="50" required><br></div><div class="form-group">    
                                            <label> Correo Electronico del Usuario:</label><br>
                                            <input type = "email" name = "mail" value="<%=usuVO.getMail()%>" minlength="11" maxlength="100" required><br></div> <div class="form-group">
                                            <label> Direccion del Usuario:</label><br>
                                            <input type = "text" name = "direc" value="<%=usuVO.getDirec()%>" minlength="7" maxlength="60" required><br></div> <div class="form-group">
                                            <label> Telefono del Usuario:</label><br>
                                            <input type = "number" name = "telefo" value="<%=usuVO.getTelefo()%>" minlength="7" maxlength="11" required><br></div><div class=" form-group">
                                            <label> Tipo de documento:</label><br>
                                            <input type = "text" name = "idTipoDoc" value="<%=usuVO.getIdTipoDoc()%>" required><br></div><div class=" form-group">
                                            <label> Tipo de Rol del Usuario: </label><br>
                                            <input type = "text" name = "idTipoRol" value="<%=usuVO.getIdTipoRol()%>" required><br></div><div class=" form-group">
                                            <label> Estado del Usuario: </label><br>
                                            <input type = "text" name = "estado" value="<%=usuVO.getEstado()%>" required><br></div>
                                        </tr><br>
                                        </table> 
                                        <button class="my-button" >actualizar</button>  
                                        <input type = "hidden" name = "opcion" value = "2">   
                                        </form>
                                        <% } %>
                                        <%
                        if (request.getAttribute("mensajeError") != null) {%>
                                        ${mensajeError}
                                        <%} else {%>
                                        ${mensajeExito}
                                        <% }
                                        %>
                </center>
            </div>
        </header>
    </body>
</html>
