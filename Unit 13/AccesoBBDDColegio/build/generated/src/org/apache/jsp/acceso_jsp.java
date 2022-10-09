package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class acceso_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/css\\\n");
      out.write("/materialize.min.css\">\n");
      out.write("  <link href=\"http://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  <div class=\"container\">\n");
      out.write("\n");
      out.write("    <div class=\"row\"></div>\n");
      out.write("\n");
      out.write("    <div class=\"row\">\n");
      out.write("\n");
      out.write("      <div class=\"row col m3\"></div>\n");
      out.write("\n");
      out.write("      <div class=\"col m6 card-panel grey lighten-5\">\n");
      out.write("\n");
      out.write("        <h5 class=\"center\">Control de acceso</h5>\n");
      out.write("\n");
      out.write("        <form method=\"POST\" action=\"index.jsp\">\n");
      out.write("\n");
      out.write("          <div class=\"input-field\">\n");
      out.write("\n");
      out.write("            <i class=\"material-icons prefix\">account_circle</i>\n");
      out.write("\n");
      out.write("            <input type=\"text\" name=\"usuario\" id=\"usuario\" required>\n");
      out.write("            <label for=\"usuario\">Usuario</label>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"input-field\">\n");
      out.write("\n");
      out.write("            <i class=\"material-icons prefix\">lock</i>\n");
      out.write("\n");
      out.write("            <input type=\"password\" name=\"clave\" id=\"clave\" required>\n");
      out.write("            <label for=\"clave\">Contraseña</label>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <p class=\"center\">\n");
      out.write("            \n");
      out.write("            <button class=\"btn waves-effect waves-light center\" type=\"submit\" name=\"aceptar\">\n");
      out.write("              Aceptar\n");
      out.write("              <i class=\"material-icons\">check_circle</i>\n");
      out.write("            </button>\n");
      out.write("            \n");
      out.write("          </p>\n");
      out.write("\n");
      out.write("          <br>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <script type=\"text/javascript\" src=\"Jquery/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/js/materialize.mi\\\n");
      out.write("n.js\"></script>\n");
      out.write("\n");
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
