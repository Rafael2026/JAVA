<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Dibujar calendario</title>
  </head>

  <body>

    <h1>Calendario</h1>

    <%

      String year;
      String day;
      String month;
      String text;
      int numday = 0;
      
      year = request.getParameter ("year");
      day = request.getParameter ("day");
      month = request.getParameter ("month");
      text = request.getParameter ("text");
      
      out.println (year);
      out.println (day);
      out.println (month);
      out.println (text);
    
      String[] meses = {" ", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
                        "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
      
      int i = 0;

      while (i < meses.length && meses [i] != month) {
        i++;
      }
      
      switch (i){
        
        case 1:
          numday = 31;
        break;
        
        case 2:
          numday = 28;
        break;
        
        case 3:
          numday = 31;
        break;
        
        case 4:
          numday = 30;
        break;
        
        case 5:
          numday = 31;
        break;
        
        case 6:
          numday = 30;
        break;
        
        case 7:
          numday = 31;
        break;
        
        case 8:
          numday = 31;
        break;
        
        case 9:
          numday = 30;
        break;
        
        case 10:
          numday = 31;
        break;
        
        case 11:
          numday = 30;
        break;
        
        case 12:
          numday = 31;
        break;
      }
      
    %>
    
  </body>
  
</html>