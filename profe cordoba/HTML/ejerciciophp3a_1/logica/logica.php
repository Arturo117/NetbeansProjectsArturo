6<?php

class logica {

    private $bd;

    public function __construct() {
        $this->bd = new BD();
    }

    public function datos() {
        $sec = $this->bd->select("select * from datos");
        $datos = "";
        foreach ($sec as $fila) {
            $noticia = ' <tbody>
                            <tr>
                                <td><a href="gafetes.php?id=' . $fila["id"] . '" role="button">Mas..</a></td>
                                <td>' . $fila["nombre"] . '</td>
                                <td>' . $fila["paterno"] . '</td>
                                <td>' . $fila["materno"] . '</td>
                            </tr>
                        </tbody>';
        }
    }

    public function gafetes() {
        $sec = $this->bd->select("SELECT * FROM datos  where id= " . ($_GET["id"]) . "");
        $gafete = "";
        foreach ($sec as $fila) {
            $gafete = '<table class="table">
                    
                    <tr>
                        <td> NOMBRE:</td><td>' . $fila["nombre"] . ' ' . $fila["paterno"] . ' ' . $fila["materno"] . '.</td>
                    </tr>

                    <tr>
                        <td>EDAD:</td><td>' . $fila["edad"] . ' años.</td>
                    </tr>


                    <tr>
                        <td>SEXO:</td><td>' . $fila["sexo"] . '.</td>
                    </tr>

                    <tr>
                        <td>ESCUELA DE PROCEDENCIA:</td><td>' . $fila["escuela"] . '.</td>
                    </tr>   
                </table>';
        }
    }

}
