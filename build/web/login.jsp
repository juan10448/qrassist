<%-- 
    Document   : login
    Created on : 4/06/2023, 12:00:17 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title><link href="css/Main.css" rel="stylesheet" type="text/css"/>
        <link href="css/logoV.png" rel='icon' />

    </head>
    <body>
        <div id="mySidebar" class="sidebar">
            <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">×</a>

            <a href="InicioI.jsp">Acerca de</a>
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
                          
                <a href="registroUsuario.jsp" ><button  style="float: right" class="my-button"  >Registrarse</button></a>      
                <br>
                <br>
                <a href="registroUsuario.jsp"></a>
                <div class="container">
                    <h1>Login</h1>
                    <form action="usuario" method="POST">
                        <div class="form-group">
                            <label for="numDoc">Documento</label>
                            <input type="text" id="numDoc" name="numDoc" required>
                        </div>
                        <div class="form-group">
                            <label for="pass">Contraseña</label>
                            <input type="password" id="pass" name="pass" required >
                        </div>
                        <div class="form-group">
                            <input type="hidden" value="4" name="opcion">
                            <button class="my-button" type="submit">Entrar</button>
                        </div>
                        
                    </form>
                </div>
            </div>
        </header>
    </body>
</html>
