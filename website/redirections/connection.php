<?php

// check if connection is authorized
require("../connexion/connexion.php");
require("../connexion/request.php");



$conn = Connexion::getMySQLConnexion();

$user = $_POST["login"];
$password = $_POST["password"];

$authorized = isUser($conn, $user, $password);
if ($authorized){
    insertConnection($conn, $user, $password);
    // redirect to dashboard.php
    header("Location: /dashboard.php");
} else {
    // redirect to login.php with error
    header("Location: /login.php?error=true");
}