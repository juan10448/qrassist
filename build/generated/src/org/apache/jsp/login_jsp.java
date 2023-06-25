package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title><link href=\"css/Main.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/logoV.png\" rel='icon' />\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"mySidebar\" class=\"sidebar\">\n");
      out.write("            <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">×</a>\n");
      out.write("\n");
      out.write("            <a href=\"InicioI.jsp\">Acerca de</a>\n");
      out.write("            <a href=\"somos.jsp\">Quienes somos</a>\n");
      out.write("            <a href=\"contacto.jsp\">Contacto</a>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            function openNav() {\n");
      out.write("                document.getElementById(\"mySidebar\").style.width = \"250px\";\n");
      out.write("                document.getElementById(\"main\").style.marginLeft = \"250px\";\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function closeNav() {\n");
      out.write("                document.getElementById(\"mySidebar\").style.width = \"0\";\n");
      out.write("                document.getElementById(\"main\").style.marginLeft = \"0\";\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <header> \n");
      out.write("            <div id=\"main\">\n");
      out.write("                <a href=\"https://www.sena.edu.co/es-co/Paginas/default.aspx\">\n");
      out.write("                    <img class=\"my-logo\" src=\"css/Logo-de-SENA-png-verde-300x300-1.png\" />\n");
      out.write("                </a>\n");
      out.write("                <img class=\"my-lin\" src=\"css/line.png\" alt=\"\"/>\n");
      out.write("                <img class=\"my-ban\" src=\"css/BannerV.png\" alt=\"\"/>\n");
      out.write("\n");
      out.write("                <br>\n");
      out.write("                          \n");
      out.write("                <a href=\"registroUsuario.jsp\" ><button  style=\"float: right\" class=\"my-button\"  >Registrarse</button></a>      \n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <a href=\"registroUsuario.jsp\"></a>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <h1>Login</h1>\n");
      out.write("                    <form action=\"usuario\" method=\"POST\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"numDoc\">Documento</label>\n");
      out.write("                            <input type=\"text\" id=\"numDoc\" name=\"numDoc\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"pass\">Contraseña</label>\n");
      out.write("                            <input type=\"password\" id=\"pass\" name=\"pass\" required >\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"hidden\" value=\"4\" name=\"opcion\">\n");
      out.write("                            <button class=\"my-button\" type=\"submit\">Entrar</button>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
