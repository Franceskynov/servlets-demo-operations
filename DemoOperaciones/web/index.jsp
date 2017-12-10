<%@page contentType="text/html" pageEncoding="UTF-8"%><!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Demo operaciones</title>
        <link rel="stylesheet" href="./assets/css/style.css">
    </head>
    <body>
        <div class="sty">
            <form method="post" name="frmOperacioes" id="frmOperaciones" action="operaciones">
                <fieldset>
                    <legend><span class="number">1</span> Operaciones</legend>
                    <input type="number" name="txtNumA" placeholder="N&uacute;mero a" step="any" id="txtNumA" value="0">
                    <input type="number" name="txtNumB" placeholder="N&uacute;mero b" step="any" id="txtNumB" value="0">
                    <input type="number" name="txtNumC" placeholder="N&uacute;mero c" step="any" id="txtNumC" value="0" style="display: none;">

                    <label for="sltOperacion">Operaci&oacute;n :</label>
                    <select id="sltOperacion" name="sltOperacion">
                        <optgroup label="Operaciones b&aacute;sicas:">
                            <option value="-1">Seleccione</option>
                            <option value="0">Suma</option>
                            <option value="1">Resta</option>
                            <option value="2">Multiplicaci&oacute;n</option>
                            <option value="3">Divisi&oacute;n</option>
                            <option value="4">Exponeciaci&oacute;n</option>
                            <option value="5">Radicaci&oacute;n</option>
                            <option value="6">Factorial</option>
                            <option value="7">Ecuaci&oacute;n Cuadr&aacute;tica</option>
                        </optgroup>
                    </select>      
                </fieldset>
                <input type="submit" value="Calcular" />
            </form>
        </div>
        <script>
            var sltOperacion = document.getElementById("sltOperacion"),
                    txtNumB  = document.getElementById("txtNumB");
                    txtNumC  = document.getElementById("txtNumC");

            sltOperacion.addEventListener("change", function (e) {
                if (sltOperacion.value == 6) {

                    if (txtNumB.style.display === "none") {

                        txtNumB.style.display = "block";

                    } else {

                        txtNumB.style.display = "none";
                    }
                }

                if (sltOperacion.value == 7) {
                    
                    
                    if (txtNumC.style.display === "none") {
                        
                        txtNumC.style.display = "block";
                        
                    } else {
                        
                        txtNumC.style.display = "none";
                    }

                } else {
                    
                    txtNumC.style.display = "none";
                }
            });
        </script>
    </body>
</html>