<%-- 
    Document   : menuAdministrador
    Created on : 22/06/2023, 07:26:02 PM
    Author     : juans
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/Main.css" rel="stylesheet" type="text/css"/>
        <link href="css/logoV.png" rel='icon' />
    </head>
    <body>   
        <div id="mySidebar" class="sidebar">
        <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">×</a>
            <a href="registroUsuario.jsp"> Registro Usuarios</a> 
            <a href="registroFichas.jsp">Registro Ficha</a>
            <a href="registroCompetencias.jsp">Registro competencia</a>
            <a href="registroAsociacionUsuarios.jsp">Registro Asosciacion Usuarios</a>
            <a href="registroAsociacionCompetencias.jsp">Registro Asociacion Competencias</a>
            <a href="registrosolicitudNovedad.jsp">Registro Solicitud Novedad </a>
            <a href="registroactividadAprendizaje.jsp">Registro Actividad Aprendizaje</a>
            <a href="registroNovedad.jsp"> Registro novedad</a>
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

                <h1 class="my-text" > Bienvenido a la pagina principal de QRASSIST </h1>
                <br>
                <h1 class="my-text" > En la barra de navegacion podra encontrar toda la informacion acerca del sistema </h3>
                    <h1 class="my-text" > Puede desplegar la barra dando click sobre el icono "☰"  </h1>
            </div>
        </header>
    </body>
</html>
