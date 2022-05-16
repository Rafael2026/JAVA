<!DOCTYPE html>
<html>
  
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Diseñar la estructura del calendario</title>
  </head>
  
  <body>
    
    <h1>Calendario</h1>

    <form method="post" action="calendario.jsp">

      <fieldset>
        
        <select name="month">
          <option>Enero</option>
          <option>Febrero</option>
          <option>Marzo</option>
          <option>Abril</option>
          <option>Mayo</option>
          <option>Junio</option>
          <option>Julio</option>
          <option>Agosto</option>
          <option>Septiembre</option>
          <option>Octubre</option>
          <option>Noviembre</option>
          <option>Diciembre</option>
        </select>

        <input type="number" name="year">
        <label>Introduce el año</label> <br>
        
        <input type="text" name="text">
        <label>Texto</label><br>

        <select name="day">
          <option>Lunes</option>
          <option>Martes</option>
          <option>Miercoles</option>
          <option>Jueves</option>
          <option>Viernes</option>
          <option>Sabado</option>
          <option>Domingo</option>
        </select>
        
        <input type="submit" value="Ok">

      </fieldset>
    
    </form> 
    
  </body>
  
</html>