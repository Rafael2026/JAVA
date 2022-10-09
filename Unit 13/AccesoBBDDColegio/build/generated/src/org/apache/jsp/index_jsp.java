package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css\" integrity=\"sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r\" crossorigin=\"anonymous\">\n");
      out.write("  <title>Página principal</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  \n");
      out.write("  <div class=\"container\">\n");
      out.write("    \n");
      out.write("    <br><br>\n");
      out.write("    \n");
      out.write("    <div class=\"panel panel-primary\">\n");
      out.write("      \n");
      out.write("      <div class=\"panel-heading text-center\">\n");
      out.write("        <h2>Colegio público</h2>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      ");

        Class.forName("com.mysql.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/colegio", "root", "");
        Statement s = conexion.createStatement();
        ResultSet listado = s.executeQuery ("SELECT * FROM alumno");
      
      out.write("\n");
      out.write("\n");
      out.write("      <table class=\"table table-striped\">\n");
      out.write("        \n");
      out.write("        <tr>\n");
      out.write("          <th>Codigo del alumno</th>\n");
      out.write("          <th>Nombre</th>\n");
      out.write("          <th>Apellidos</th>\n");
      out.write("        </tr>\n");
      out.write("          \n");
      out.write("          <form method=\"POST\" action=\"procesarAlta.jsp\">\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("              \n");
      out.write("              <td>\n");
      out.write("                <input type=\"number\" name=\"cod_alu\">\n");
      out.write("              </td>\n");
      out.write("              \n");
      out.write("              <td>\n");
      out.write("                <input type=\"text\" name=\"nom_alu\">\n");
      out.write("              </td>\n");
      out.write("              \n");
      out.write("              <td>\n");
      out.write("                <input type=\"text\" name=\"ape_alu\">\n");
      out.write("              </td>\n");
      out.write("              \n");
      out.write("              <td>\n");
      out.write("                <button type=\"submit\" value=\"Añadir\" class=\"btn btn-primary\">\n");
      out.write("                  <span class=\"glyphicon glyphicon-plus\"></span>\n");
      out.write("                  Añadir\n");
      out.write("                </button>\n");
      out.write("              </td>\n");
      out.write("            \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("          </form>\n");
      out.write("          \n");
      out.write("          ");

            
            while (listado.next()) {
              out.println("<tr><td>");
              out.println(listado.getString("cod_alu") + "</td>");
              out.println("<td>" + listado.getString("nom_alu") + "</td>");
              out.println("<td>" + listado.getString("ape_alu") + "</td>");
          
      out.write("\n");
      out.write("          <td>\n");
      out.write("            \n");
      out.write("            <form method=\"POST\" action=\"procesarModificacion.jsp\">\n");
      out.write("              \n");
      out.write("              <input type=\"hidden\" name=\"cod_alu\"\n");
      out.write("                     value=\"");
      out.print( Integer.parseInt (listado.getString("cod_alu")) );
      out.write("\">\n");
      out.write("              \n");
      out.write("              <input type=\"hidden\" name=\"nom_alu\" value=\"");
      out.print(listado.getString("nom_alu"));
      out.write("\">\n");
      out.write("              <input type=\"hidden\" name=\"ape_alu\" value=\"");
      out.print(listado.getString("ape_alu"));
      out.write("\">\n");
      out.write("              \n");
      out.write("              <button type=\"submit\" class=\"btn btn-info\">\n");
      out.write("                <span class=\"glyphicon glyphicon-pencil\"></span>\n");
      out.write("                Modificar\n");
      out.write("              </button>\n");
      out.write("              \n");
      out.write("            </form>\n");
      out.write("              \n");
      out.write("          </td>\n");
      out.write("          \n");
      out.write("          <td>\n");
      out.write("            \n");
      out.write("            <form method=\"POST\" action=\"procesarBorrado.jsp\">\n");
      out.write("              \n");
      out.write("              <input type=\"hidden\" name=\"cod_alu\"\n");
      out.write("                     value=\"");
      out.print( Integer.parseInt (listado.getString("cod_alu")) );
      out.write("\"/>\n");
      out.write("              \n");
      out.write("              <button type=\"submit\" class=\"btn btn-danger\">\n");
      out.write("                <span class=\"glyphicon glyphicon-remove\"></span>Eliminar\n");
      out.write("              </button>\n");
      out.write("              \n");
      out.write("            </form>\n");
      out.write("              \n");
      out.write("          </td>\n");
      out.write("      \n");
      out.write("      </tr>\n");
      out.write("      \n");
      out.write("          ");

            } // while
            conexion.close();
          
      out.write("\n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("  </div>\n");
      out.write("    \n");
      out.write("    <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"Jquery/jquery.min.js\"></script>\n");
      out.write("  \n");
      out.write("  </body>\n");
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
