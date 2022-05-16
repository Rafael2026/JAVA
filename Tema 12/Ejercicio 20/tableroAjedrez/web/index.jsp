<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejercicio 20</title>
    <link href="css/estilos.css" rel="stylesheet" type="text/css" />
  </head>

  <body>

    <h1>Ejercicio 20</h1>

    <div id="principal">

      <table>

        <tr>
          
          <td></td>
          <td>a</td>
          <td>b</td>
          <td>c</td>
          <td>d</td>
          <td>e</td>
          <td>f</td>
          <td>g</td>
          <td>h</td>
          <td></td>
        </tr>

        <%

          int filaAlfil;
          int columnaAlfil;
          int filaCaballo;
          int columnaCaballo;
          String[][] tablero = new String [8][8];
          
          do {
            
            // Coordenadas del alfil
            filaAlfil = (int)(Math.random () * 8) + 1;
            columnaAlfil = (int)(Math.random () * 8);

            // Coordenadas del caballo
            filaCaballo = (int)(Math.random () * 8) + 1;
            columnaCaballo = (int)(Math.random () * 8);
          } while ((filaAlfil == filaCaballo) || (columnaAlfil == columnaCaballo));
          

          for (int fila = 0; fila < 8; fila++) {

            out.print("<tr><td>" + (8 - fila) + "</td>");

            for (int columna = 0; columna < 8; columna++) {

              // Opcion 1
              if (((fila%2) == 1) && ((columna%2) == 0)) {
                
                if ((fila == filaAlfil) && (columna == columnaAlfil)) {
                  tablero [fila][columna] = "♝";
                }
                
                else if ((fila == filaCaballo) && (columna == columnaCaballo)) {
                  tablero [fila][columna] = "♘";
                }
                
                else {
                  tablero [fila][columna] = "██";
                }
              }

              // Opcion 2
              else if (((fila%2) == 1) && ((columna%2) == 1)) {
                
                // Determina la imagen que se inserta en la casilla
                if ((fila == filaAlfil) && (columna == columnaAlfil)) {
                  tablero [fila][columna] = "♝";
                }
                
                else if ((fila == filaCaballo) && (columna == columnaCaballo)) {
                  tablero [fila][columna] = "♘";
                }
                
                else {
                  tablero [fila][columna] = "  ";
                }
              }

              // Opcion 3
              else if (((fila%2) == 0) && ((columna%2) == 0)) {
                
                // Determina la imagen que se inserta en la casilla
                if ((fila == filaAlfil) && (columna == columnaAlfil)) {
                  tablero [fila][columna] = "♝";
                }
                
                else if ((fila == filaCaballo) && (columna == columnaCaballo)) {
                  tablero [fila][columna] = "♘";
                }
                
                else {
                  tablero [fila][columna] = "  ";
                }
              }

              // Opcion 4
              else if (((fila%2) == 0) && ((columna%2) == 1)) {
                
                // Determina la imagen que se inserta en la casilla
                if ((fila == filaAlfil) && (columna == columnaAlfil)) {
                  tablero [fila][columna] = "♝";
                }
                
                else if ((fila == filaCaballo) && (columna == columnaCaballo)) {
                  tablero [fila][columna] = "♘";
                }
                
                else {
                  tablero [fila][columna] = "██";
                }
              }

              out.print ("<td>" + tablero [fila][columna] + "</td>");
            }

            out.print ("<td>" + (8 - fila) + "</td></tr>");

          }

        %>

        <tr>
          <td></td>
          <td>a</td>
          <td>b</td>
          <td>c</td>
          <td>d</td>
          <td>e</td>
          <td>f</td>
          <td>g</td>
          <td>h</td>
          <td></td>
        </tr>

      </table>

    </div>

  </body>
  
</html>