<?php
session_start();

class Procesar{
    
    public function redireccionar($url){
        header("Location: ". $url);
    }
    public function destruir(){
        session_destroy();
    }
    public function existeSession(){
        return isset($_SESSION["usuarioValido"]);
    }
    public function autentificar(){
        if(isset($_POST["email"]) && isset($_POST["passw"])){
        if($_POST["email"]=="christian@imageninsite.com" &&
                $_POST["passw"]=="123"){
            $_SESSION["usuarioValido"]=$_POST["email"];
            return true;
        }else{
            return false;
        }
    }
}
}


?>
