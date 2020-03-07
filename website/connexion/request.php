<?php

    // function getConnexion($conne,$login ,$password){
    //     global $getConnexion_SQL;
    //     $req = $conne->prepare($getConnexion_SQL);
    //     $req->execute(array($login,$password));
    //     $donnees = $req->fetch();
    //     return $donnees;
    // }


    function disconnect($conn, $login){
        $disconnet_SQL = "DELETE FROM connexion WHERE idU IN (SELECT id FROM users WHERE login=?)";
        $req = $conn->prepare($disconnet_SQL);
        $req->execute(array($login));
        return $req->rowCount() == 1;
    }


    function isUser($conn, $login, $password){
        $isUser_SQL = "SELECT * FROM users WHERE login = ? AND mdp = ?";
        $req = $conn->prepare($isUser_SQL);
        $req->execute(array($login,$password));
        $donnees = $req->fetch();
        return $donnees != false;
    }


    function insertConnection($conn, $login, $password){
        $insertconnexion_SQL = "INSERT INTO users ('login' ,'mdp') VALUES(?,?)";
        $req = $conn->prepare($insertconnexion_SQL);
        $req->execute(array($login,$password));
        $donnees = $req->fetch();
        return $donnees;

    }  
?>