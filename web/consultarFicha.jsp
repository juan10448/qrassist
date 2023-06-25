<%-- 
    Document   : consultarFicha
    Created on : 27/03/2023, 09:30:00 AM
    Author     : juans
--%>

<%@page import="ModeloDao.formacionDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDao.fichasDao"%>
<%@page import="ModeloVo.fichasVo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar Fichas</title>
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
            <a href="registroFichas.jsp">Volver</a>     
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
                    <h1>Consultar Ficha</h1>
                </header>
                <div class="form-group">
                    <form method="post" action="fichas">
                        <table>
                            <tr>
                                <th>
                                    <label for="idFicha">Numero De Ficha:</label>
                                    <input type="text" name="idFicha" id="idFicha" class="input-field">
                                    <input type="submit" value="Consultar" class="submit-button">
                                </th>
                            </tr>
                        </table>
                        <input type="hidden" name="opcion" value="3">      
                    </form>
                </div>

                <% if (request.getAttribute("mensajeError") != null) { %>
                <div class="mensaje">
                    ${mensajeError}
                </div>
                <% } else { %>
                <div class="mensaje">
                    ${mensajeExito}
                </div>
                <% } %>
                <div>
                    <table>
                        <tr>
                            <th>NumeroFicha</th>
                            <th>Formación</th>
                            <th>FechaInicio</th>
                            <th>FechaFin</th>
                        </tr>
                        <% fichasVo ficVo = new fichasVo();
                            fichasDao ficDao = new fichasDao();
                            ArrayList<fichasVo> listarFichas = ficDao.Listar();
                            for (int i = 0; i < listarFichas.size(); i++) {
                                ficVo = listarFichas.get(i);
                        %>
                        <tr>
                            <td><%= ficVo.getIdFicha()%></td>
                            <td><%= ficVo.getNomFor()%></td>
                            <td><%= ficVo.getFeIni()%></td>
                            <td><%= ficVo.getFeFin()%></td>                   
                        </tr>    
                        <% }%>
                    </table>   
                </div>
            </div>
        </header>
    </body>
</html>
