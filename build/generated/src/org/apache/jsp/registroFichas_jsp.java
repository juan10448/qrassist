package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVo.formacionVo;
import ModeloDao.formacionDao;

public final class registroFichas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Registro Fichas</title>\n");
      out.write("        <link href=\"css/Main.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/logoV.png\" rel='icon' />\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            header {\n");
      out.write("                background-color: #f3f3f3;\n");
      out.write("                padding: 20px;\n");
      out.write("                text-align: center;\n");
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
      out.write("            th,\n");
      out.write("            td {\n");
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
      out.write("                display: block;\n");
      out.write("                margin: 10px auto;\n");
      out.write("                padding: 10px;\n");
      out.write("                background-color: #cde9cc;\n");
      out.write("                border: none;\n");
      out.write("                color: #245d28;\n");
      out.write("                font-size: 20px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .register-button {\n");
      out.write("                display: block;\n");
      out.write("                margin: 10px auto;\n");
      out.write("                padding: 10px;\n");
      out.write("                background-color: #245d28;\n");
      out.write("                border: none;\n");
      out.write("                color: #cde9cc;\n");
      out.write("                font-size: 20px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container-1 {\n");
      out.write("                max-width: 800px;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("            a:hover {\n");
      out.write("                box-shadow: 0 0 5px rgba(144, 238, 144, 0.5);\n");
      out.write("            }\n");
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
      out.write("            .submit-button:hover {\n");
      out.write("                background-color: #36842f;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div id=\"mySidebar\" class=\"sidebar\">\n");
      out.write("            <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">×</a>\n");
      out.write("            <a href=\"Inicio_1_1.jsp\">Inicio</a>\n");
      out.write("            <a href=\"consultarFicha.jsp\">Volver</a>     \n");
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
      out.write("\n");
      out.write("\n");
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
      out.write("                <header>\n");
      out.write("                    <h1>Registro De Fichas</h1>\n");
      out.write("                </header>\n");
      out.write("                <div class=\"container-1\">\n");
      out.write("                    <form method=\"post\" action=\"fichas\">\n");
      out.write("                        <table>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Numero Ficha</label><br>\n");
      out.write("                                <input type=\"numeric\" name=\"idFicha\" minlength=\"2\" maxlength=\"11\" required><br>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Formacion</label>\n");
      out.write("                                <select class=\"my-select\" name=\"idFor\">\n");
      out.write("                                    <option>Seleccione...</option>\n");
      out.write("                                    ");
 formacionDao forDao = new formacionDao();
                                        for (formacionVo forVo : forDao.Listar()) {
      out.write("\n");
      out.write("                                    <option value=\"");
      out.print(forVo.getIdFor());
      out.write('"');
      out.write('>');
      out.print(forVo.getNomFor());
      out.write("</option>\n");
      out.write("                                    ");
 } 
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Fecha Inicio</label><br>\n");
      out.write("                                <input type=\"date\" name=\"feIni\" minlength=\"2\" required><br>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Fecha Fin</label><br>\n");
      out.write("                                <input type=\"date\" name=\"feFin\" minlength=\"2\" required><br>\n");
      out.write("                            </div>\n");
      out.write("                        </table>\n");
      out.write("                        <button class=\"register-button\" type=\"submit\">Registrar</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");

            if (request.getAttribute("mensajeError") != null) {
      out.write("\n");
      out.write("        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("        ");
} else {
      out.write("\n");
      out.write("        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("        ");
 }
        
      out.write("\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("</body>\n");
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
