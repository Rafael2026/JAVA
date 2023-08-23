<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css" rel="stylesheet">
  <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>

<body>

  <div class="container">

    <div class="row"></div>

    <div class="row">

      <div class="row col m3"></div>

      <div class="col m6 card-panel grey lighten-5">

        <h5 class="center">Control de acceso</h5>

        <form method="POST" action="index.jsp">

          <div class="input-field">

            <i class="material-icons prefix">account_circle</i>

            <input type="text" name="usuario" id="usuario" required>
            <label for="usuario">Usuario</label>

          </div>

          <div class="input-field">

            <i class="material-icons prefix">lock</i>

            <input type="password" name="clave" id="clave" required>
            <label for="clave">Contraseña</label>

          </div>

          <p class="center">
            
            <button class="btn waves-effect waves-light center" type="submit" name="aceptar">
              Aceptar
              <i class="material-icons">check_circle</i>
            </button>
            
          </p>

          <br>

        </form>

      </div>

    </div>

  </div>

  <script src="https://code.jquery.com/jquery-3.7.0.min.js" defer></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js" defer></script>

</body>

</html>