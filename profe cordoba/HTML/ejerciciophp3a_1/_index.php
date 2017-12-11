<?php 
include_once './procesar.php';
$p = new Procesar();
if ($p->existeSession()){
    $p->redireccionar("admin.php");
}
if( $p->autentificar()){
    $p->redireccionar("admin.php");
}
?>
<html>
    <head>
        <link rel="stylesheet" href="estilo.css">
    </head>
    <body>
        <div class="contenedor">
            <form method="post" action="index.php">
                Email: <input type="email" name="email">
                <br>
                Password: <input type="password" name="passw">
                <br>
                <input type="submit" value="Entrar">
            </form>
            
        </div>
    </body>
</html>