<?php
global $mysql;

class Connexion{
               
    public static function getMySQLConnexion(){
        global $mysql;
        if($mysql == NULL){
            $mysql = new PDO('mysql:host=localhost;dbname=controle_acces', 'newton', 'azertyuioP789!');
        }
        return $mysql;
    }
}

?>