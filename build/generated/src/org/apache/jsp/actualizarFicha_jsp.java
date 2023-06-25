package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVo.fichasVo;

public final class actualizarFicha_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Actualizar Ficha</title>\n");
      out.write("        <link href=\"css/Main.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/logoV.png\" rel='icon' />\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h1 {\n");
      out.write("                color: #245d28;\n");
      out.write("                margin: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-group {\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table {\n");
      out.write("                width: 100%;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            th, td {\n");
      out.write("                padding: 10px;\n");
      out.write("                text-align: left;\n");
      out.write("                border-bottom: 1px solid #ccc;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            th {\n");
      out.write("                background-color: #f3f3f3;\n");
      out.write("                font-weight: bold;\n");
      out.write("                color: #245d28;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .mensaje {\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("                padding: 10px;\n");
      out.write("                background-color: #cde9cc;\n");
      out.write("                color: #245d28;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .my-button {\n");
      out.write("                padding: 10px;\n");
      out.write("                background-color: #cde9cc;\n");
      out.write("                border: none;\n");
      out.write("                color: #245d28;\n");
      out.write("                font-size: 16px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .my-button:hover {\n");
      out.write("                background-color: #b3e6b3;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .input-field {\n");
      out.write("                padding: 10px;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                font-size: 14px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .submit-button {\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                background-color: #3d8f37;\n");
      out.write("                color: #fff;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                font-size: 14px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .submit-button:hover {\n");
      out.write("                background-color: #36842f;\n");
      out.write("            }\n");
      out.write("            a {\n");
      out.write("                font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;\n");
      out.write("                text-decoration: none;\n");
      out.write("                transition: box-shadow 0.3s ease;\n");
      out.write("            }\n");
      out.write("            a:hover {\n");
      out.write("                box-shadow: 0 0 5px rgba(144, 238, 144, 0.5);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div id=\"mySidebar\" class=\"sidebar\">\n");
      out.write("            <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">×</a>\n");
      out.write("            <a href=\"Inicio_1_1.jsp\">Inicio</a>\n");
      out.write("            <a href=\"consultarFicha.jsp\">Volver</a>\n");
      out.write("        </div>\n");
      out.write("\n");
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
      out.write("\n");
      out.write("            <div id=\"main\">\n");
      out.write("                <a href=\"https://www.sena.edu.co/es-co/Paginas/default.aspx\">\n");
      out.write("                    <img class=\"my-logo\" src=\"css/Logo-de-SENA-png-verde-300x300-1.png\" />\n");
      out.write("                </a>\n");
      out.write("                <img class=\"my-lin\" src=\"css/line.png\" alt=\"\"/>\n");
      out.write("                <img class=\"my-ban\" src=\"css/BannerV.png\" alt=\"\"/>\n");
      out.write("                <br>\n");
      out.write("                <button class=\"my-button openbtn\"  onclick=\"openNav()\">☰</button>  \n");
      out.write("                <center>\n");
      out.write("                    <h1>Actualizar Ficha</h1>\n");
      out.write("                    ");

                        fichasVo ficVo = (fichasVo) request.getAttribute("FichaEncontrada");
                        if (ficVo != null) {
                    
      out.write("\n");
      out.write("                    <div class=\"container-1\">\n");
      out.write("                        <form method = \"post\" action = \"fichas\">\n");
      out.write("                            <table>\n");
      out.write("                                <tr><div class=\"form-group\">\n");
      out.write("                                    <label>Numero De Ficha </label><br>\n");
      out.write("                                    <input type = \"text\" name = \"idFicha\" value=\"");
      out.print(ficVo.getIdFicha());
      out.write("\" readonly><br></div><div class=\"form-group\">\n");
      out.write("                                    <label>ID Formacion</label><br>\n");
      out.write("                                    <input type=\"text\" name=\"idFor\" value=\"");
      out.print(ficVo.getIdFor());
      out.write("\" readonly><br></div><div class=\"form-group\">\n");
      out.write("                                    <label>Inicio</label><br>\n");
      out.write("                                    <input type=\"date\" name=\"feIni\" value=\"");
      out.print(ficVo.getFeIni());
      out.write("\" readonly><br></div><div class=\"form-group\">\n");
      out.write("                                    <label>Fin</label><br>\n");
      out.write("                                    <input type = \"date\" name = \"feFin\" value=\"");
      out.print(ficVo.getFeFin());
      out.write("\"><br></div>\n");
      out.write("                                </tr><br>\n");
      out.write("                            </table> \n");
      out.write("                            <button class=\"my-button\" >actualizar</button>  \n");
      out.write("                            <input type = \"hidden\" name = \"opcion\" value = \"2\">   \n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                    ");

                            if (request.getAttribute("mensajeError") != null) {
      out.write("\n");
      out.write("                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                    ");
} else {
      out.write("\n");
      out.write("                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                    ");
 }
                    
      out.write("\n");
      out.write("                </center>\n");
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
