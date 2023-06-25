<%-- 
    Document   : InicioI
    Created on : 28/05/2023, 04:53:13 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Acerca de</title>
        <link href="css/Main.css" rel="stylesheet" type="text/css"/>
        <link href="css/logoV.png" rel='icon' />
    </head>
    <body>

        <div id="mySidebar" class="sidebar">
            <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">×</a>
            <a href="home.jsp">Inicio</a>

            <a href="somos.jsp">Quienes somos</a>
            <a href="contacto.jsp">Contacto</a>
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
                <button style="float: right" class="my-button" > Registrarse </button>
                <button style="float: right"  class="my-button" > Iniciar Sesión </button>


                <button class="my-button openbtn"  onclick="openNav()">☰</button>  

                <h1 class="my-text" > ¿Que es QRASSIST? </h1>
                <br>
                <p class="my-text" > QRASSIST es el sistema para la toma de asistencias mediante QR para ADSI y ADSO. <br> 
                    El sistema fue creado para agilizar la toma de asistencia al momento de iniciar clases
                    ya que el instructor no debera tomar asistencia llamando uno a uno a los aprendices </p>
                
                
                
            </div>
        </header>


    </body>
</html>
