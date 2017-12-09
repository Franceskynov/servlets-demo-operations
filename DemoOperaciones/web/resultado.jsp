<%@page contentType="text/html" pageEncoding="UTF-8"%><!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado</title>
        <link rel="stylesheet" href="./assets/css/style.css">
    </head>
    <body>

        <%
            String respuesta = (String) request.getAttribute("operacion");
            if (!respuesta.equals("cuadratica")){
        %>

        <div class="sty">
            <h1 style="text-align: center;">P&aacute;gina de resultados</h1>
            <br>
            <h3 style="text-align: center;">X1 es: <b><%=(String) request.getAttribute("x1")%></b> </h3>
            <br>
            <h3 style="text-align: center;">X2 es: <b><%=(String) request.getAttribute("x2")%></b> </h3>
            <br>
            <a style="text-align: center;" href="#" id="regresar">Regresar</a>
        </div>

        <%
            }else{
        %>

        <div class="sty">
            <h1 style="text-align: center;">P&aacute;gina de resultados</h1>
            <br>
            <h3 style="text-align: center;">El resultado de la operaci&oacute;n es: <b><%=(String) request.getAttribute("todo")%></b> </h3>
            <br>
            <a style="text-align: center;" href="#" id="regresar">Regresar</a>
        </div>

        <%
            }
        %>

        <script>
            function regresarPagina()
            {
                window.history.back();
            }

            var regresar = document.getElementById("regresar");
            regresar.addEventListener("click", regresarPagina);
        </script>
    </body>
</html>