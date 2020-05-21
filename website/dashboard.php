<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/static/css/dashboard.css">
    <title>Document</title>
</head>

<body>
<ul>
  <li><a class="active" href="#home">Dashboard</a></li>
  <li><a href="recherche.php">Recherche</a></li>
  <li><a href="#contact">Contact</a></li>
  <li><a href="#about">About</a></li>
</ul>
<button id="connect">
            Connecter
        </button>
    <div class="wrapper">
        <div class="content">
            <div class="text_zone">
                <h2>Nom :   <span id="nom" name="nom" class="text"></span> </h2>
                <!-- <span id="nom" name="nom" class="text"></span> -->
            </div>
            <div class="text_zone">
                <h2>Prenom :   <span id="prenom" name="prenom" class="text"></span> </h2>
                <!-- <span id="prenom" name="prenom" class="text"></span> -->
            </div>
            <div class="text_zone">
                <h2>Classe : <span id="classe" name="classe" class="text"></span> </h2>
                <!-- <span name="classe" class="text"></span> -->
            </div>

            <div id="image_eleve">
                <img id="photo" src="https://via.placeholder.com/340"></img>
            </div>
            <div id="schedule">
            <table>
  <tr id= "jour">
    <td>Horaires</td>
    <td id="Lundi">Lundi</td>
    <td id ="mardi">Mardi</td>
    <td id="mercredi">Mercredi</td>
    <td id= "jeudi">Jeudi</td>
    <td id="vendredi"></td>
  </tr >
  <tr id="C8">
    <td>8h-9h</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr id="C9">
    <td>9h-10h</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr id="C10">
    <td>10h-11h</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr id="C11">
  <td>11h-12h</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr id="C12">
  <td>12h-13h</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>  
  <tr id="C13">
  <td>13h-14h</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>  
  <tr id="C14">
  <td>14h-15h</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr> 
   <tr id="C15">
   <td>15h-16h</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr> 
   <tr id="C16">
   <td>16h-17h</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr id="C17">
   <td>17h-18h</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  

</table>
        
            </div>
          
        </div>
    </div>
    <p id="result">
    </p>
    <button id="test">test</button>

 <script src="static/js/test.js"></script>
</body>

</html>


