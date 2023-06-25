<%@page import="ModeloDao.tipoRolDao"%>
<%@page import="ModeloVo.tipoRolVo"%>
<%@page import="ModeloVo.documentoVo"%>
<%@page import="ModeloDao.documentoDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro Usuario</title>
        <link href="css/Main.css" rel="stylesheet" type="text/css"/>
        <link href="css/logoV.png" rel='icon' />
        <style>
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

            th,
            td {
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
                display: block;
                margin: 10px auto;
                padding: 10px;
                background-color: #cde9cc;
                border: none;
                color: #245d28;
                font-size: 20px;
                cursor: pointer;
            }

            .register-button {
                display: block;
                margin: 10px auto;
                padding: 10px;
                background-color: #245d28;
                border: none;
                color: #cde9cc;
                font-size: 20px;
                cursor: pointer;
            }

            .container-1 {
                max-width: 800px;
                margin: 0 auto;
                padding: 20px;
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
                        <h1>Registrar Usuario</h1>
                    </header>
                    <div class="container-1">
                        <form method="post" action="usuario">
                            <table>
                                <div class="form-group">
                                    <label>Nombre:</label><br>
                                    <input type="text" name="nomUsu" minlength="2" maxlength="30" required><br>
                                </div>
                                <div class="form-group">
                                    <label>Apellido:</label><br>
                                    <input type="text" name="apeUsu" minlength="2" maxlength="30" required><br>
                                </div>
                                <div class="form-group">
                                    <label>Tipo de Documento:</label>
                                    <select class="my-select" name="idTipoDoc" required>
                                        <option>Seleccione...</option>
                                        <% documentoDao docDao = new documentoDao();
                                            for (documentoVo docVO : docDao.DespregarDocumento()) {%>
                                        <option value="<%=docVO.getIdTipoDOc()%>"><%=docVO.getDescripcion()%></option>
                                        <% } %>
                                    </select>
                                </div>
                                <br>
                                <br>
                                <div class="form-group">
                                    <label>Numero de Documento:</label><br>
                                    <input type="numeric" name="numDoc" minlength="8" maxlength="11" required><br>
                                </div>
                                <div class="form-group">
                                    <label>Contraseña:</label><br>
                                    <input type="password" name="pass" minlength="5" maxlength="20" required><br>
                                </div>
                                <div class="form-group">
                                    <label>Correo Electronico:</label><br>
                                    <input type="email" name="mail" minlength="11" maxlength="100" required><br>
                                </div>
                                <div class="form-group">
                                    <label>Direccion residencial:</label><br>
                                    <input type="text" name="direc" minlength="7" maxlength="60" required><br>
                                </div>
                                <div class="form-group">
                                    <label>Numero Telefonico:</label><br>
                                    <input type="numeric" name="telefo" minlength="7" maxlength="11" required><br>
                                </div>
                            </table>
                            <input type="hidden" name="opcion" value="1"><br>
                            <button class="register-button" type="submit">Registrar</button>
                        </form>
                    </div>
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
