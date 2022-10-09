<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  
  <link rel="stylesheet" href="web/bootstrap/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
  

    <title>Guarda el alumno</title>
  </head>
  <body>
    <%
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/colegio","root", "");
      Statement s = conexion.createStatement();
      request.setCharacterEncoding("UTF-8");
      
      String consultaNumSocio = "SELECT * FROM alumno WHERE cod_alu=" + Integer.valueOf(request.getParameter("cod_alu"));
      
      ResultSet numeroDeSocios = s.executeQuery (consultaNumSocio);
      numeroDeSocios.last();
      
      if (numeroDeSocios.getRow() != 0) {
        out.println("Lo siento, no se ha podido dar de alta, ya existe un socio con el número " + request.getParameter("cod_alu") + ".");
      } else {
        String insercion = "INSERT INTO socio VALUES (" + Integer.valueOf(request.getParameter("cod_alu"))
        + ", '" + request.getParameter("nom_alu") + "', " + Integer.valueOf(request.getParameter("ape_alu"))
        + "')";
        s.execute(insercion);
        out.println("Alumno dado de alta correctamente.");
      }
      conexion.close();
    %>
    <br>
    <a href="index.jsp" class="btn btn-primary"><span class="glyphicon glyphicon-home"></span> Página principal</button>
    
    <script src="web/bootstrap/js/bootstrap.min.js"></script>
    <script src="Jquery/jquery-migrate-3.3.2.js"></script>
    <script src="Jquery/jquery.slim.js"></script>
  </body>
</html>