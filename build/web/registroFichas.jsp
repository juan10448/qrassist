<%-- 
    Document   : registroFichas
    Created on : 26/03/2023, 02:15:30 PM
    Author     : juans
--%>

<%@page import="ModeloVo.formacionVo"%>
<%@page import="ModeloDao.formacionDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro Fichas</title>
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
                <header>
                    <h1>Registro De Fichas</h1>
                </header>
                <div class="container-1">
                    <form method="post" action="fichas">
                        <table>
                            <div class="form-group">
                                <label>Numero Ficha</label><br>
                                <input type="numeric" name="idFicha" minlength="2" maxlength="11" required><br>
                            </div>
                            <div class="form-group">
                                <label>Formacion</label>
                                <select class="my-select" name="idFor">
                                    <option>Seleccione...</option>
                                    <% formacionDao forDao = new formacionDao();
                                        for (formacionVo forVo : forDao.Listar()) {%>
                                    <option value="<%=forVo.getIdFor()%>"><%=forVo.getNomFor()%></option>
                                    <% } %>
                                </select>
                            </div>
                            <br>
                            <br>
                            <div class="form-group">
                                <label>Fecha Inicio</label><br>
                                <input type="date" name="feIni" minlength="2" required><br>
                            </div>
                            <div class="form-group">
                                <label>Fecha Fin</label><br>
                                <input type="date" name="feFin" minlength="2" required><br>
                            </div>
                        </table>
                        <button class="register-button" type="submit">Registrar</button>
                    </form>
                </div>
            </div>
        </div>
        <%
            if (request.getAttribute("mensajeError") != null) {%>
        ${mensajeError}
        <%} else {%>
        ${mensajeExito}
        <% }
        %>
    </header>

</body>
</html>
