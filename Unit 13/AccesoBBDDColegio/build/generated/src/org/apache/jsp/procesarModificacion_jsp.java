package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class procesarModificacion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css\" integrity=\"sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r\" crossorigin=\"anonymous\">\n");
      out.write("  <title>Modificar datos de los alumnos</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  \n");
      out.write("  ");
 request.setCharacterEncoding("UTF-8"); 
      out.write("\n");
      out.write("  \n");
      out.write("  <div class=\"container\">\n");
      out.write("  \n");
      out.write("    <br><br>\n");
      out.write("    \n");
      out.write("    <div class=\"panel panel-info\">\n");
      out.write("      \n");
      out.write("      <div class=\"panel-heading text-center\">Modificación de socio</div>\n");
      out.write("      \n");
      out.write("      <form method=\"POST\" action=\"guardarAlumnoModificado.jsp\">\n");
      out.write("      \n");
      out.write("        <div class=\"form-group\"> \n");
      out.write("          <label>Codigo</label>\n");
      out.write("          <input type=\"number\" name=\"cod_alu\" value=\"");
      out.print( Integer.parseInt (request.getParameter("cod_alu")) );
      out.write("\">\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <label>Nombre</label>\n");
      out.write("          <input type=\"text\" name=\"nom_alu\" value=\"");
      out.print(request.getParameter("nom_alu"));
      out.write("\">\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <label>Apellidos</label>\n");
      out.write("          <input type=\"text\" name=\"ape_alu\" value=\"");
      out.print(request.getParameter("ape_alu"));
      out.write("\">\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <hr>\n");
      out.write("          \n");
      out.write("          <a href=\"index.jsp\" class=\"btn btn-danger\">\n");
      out.write("            <span class=\"glyphicon glyphicon-remove\"></span>\n");
      out.write("            Cancelar\n");
      out.write("          </a>\n");
      out.write("          \n");
      out.write("          <button type=\"submit\" class=\"btn btn-success\">\n");
      out.write("            <span class=\"glyphicon glyphicon-ok\"></span>\n");
      out.write("            Aceptar\n");
      out.write("          </button>\n");
      out.write("          \n");
      out.write("          <br><br>\n");
      out.write("          \n");
      out.write("      </form>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("  <script src=\"Jquery/jquery.min.js\"></script>\n");
      out.write("  \n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
