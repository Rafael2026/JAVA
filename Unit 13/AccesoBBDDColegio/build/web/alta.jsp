<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap-theme.min.css" rel="stylesheet">
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
      String insercion = "INSERT INTO socio VALUES (" + Integer.valueOf(request.getParameter("cod_alu")) + ", '" + request.getParameter("nom_alu") + "', " + Integer.valueOf(request.getParameter("ape_alu")) + "')";
      s.execute(insercion);
      out.println("Alumno dado de alta correctamente.");
    }
    
    conexion.close();
  
  %>
  
  <br>
  
  <a href="index.jsp" class="btn btn-primary">
    <span class="glyphicon glyphicon-home"></span>Página principal
  </a>
  
  <script src="https://code.jquery.com/jquery-3.6.1.slim.min.js" defer></script>
  <script src="https://code.jquery.com/jquery-migrate-3.4.0.min.js" defer></script>
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" defer></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" defer></script>

</body>

</html>