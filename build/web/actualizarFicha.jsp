<%-- 
    Document   : actualizarFicha
    Created on : 26/03/2023, 02:16:40 PM
    Author     : juans
--%>

<%@page import="ModeloVo.fichasVo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar Ficha</title>
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
            <a href="consultarFicha.jsp">Volver</a>
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
                    <h1>Actualizar Ficha</h1>
                    <%
                        fichasVo ficVo = (fichasVo) request.getAttribute("FichaEncontrada");
                        if (ficVo != null) {
                    %>
                    <div class="container-1">
                        <form method = "post" action = "fichas">
                            <table>
                                <tr><div class="form-group">
                                    <label>Numero De Ficha </label><br>
                                    <input type = "text" name = "idFicha" value="<%=ficVo.getIdFicha()%>" readonly><br></div><div class="form-group">
                                    <label>ID Formacion</label><br>
                                    <input type="text" name="idFor" value="<%=ficVo.getIdFor()%>" readonly><br></div><div class="form-group">
                                    <label>Inicio</label><br>
                                    <input type="date" name="feIni" value="<%=ficVo.getFeIni()%>" readonly><br></div><div class="form-group">
                                    <label>Fin</label><br>
                                    <input type = "date" name = "feFin" value="<%=ficVo.getFeFin()%>"><br></div>
                                </tr><br>
                            </table> 
                            <button class="my-button" >actualizar</button>  
                            <input type = "hidden" name = "opcion" value = "2">   
                        </form>
                    </div>
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
