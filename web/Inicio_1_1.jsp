<%-- 
    Document   : Inicio
    Created on : 24/03/2023, 09:26:04 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
        <link href="css/Main.css" rel="stylesheet" type="text/css"/>
        <link href="css/logoV.png" rel='icon' />
        <style>
            
            
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
            <a href="consultarUsuario.jsp"> Consultar Usuarios</a>             
            <a href="registroFichas.jsp">Registro Ficha</a>       
            <a href="registroUsuario.jsp">Registro Usuarios</a>    
            <a href="consultarFicha.jsp">Consulta Usuarios</a>       
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
    <center>



    </center>
</body>
</html>
