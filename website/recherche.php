
<!DOCTYPE html>
<html>
<head>
  <!-- Standard Meta -->
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">

  <!-- Site Properties -->
  <title>Login Example - Semantic</title>
  <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.4.1/semantic.min.css">
  <link rel="stylesheet" href="/static/css/recherche.css">


</head>
<body>
    



<div class="background">
<div class="menu">
<ul>
  <li><a  href="dashboard.php">Dashboard</a></li>
  <li><a class="active" href="recherche.php">Recherche</a></li>
  <li><a href="#contact">Contact</a></li>
  <li><a href="#about">About</a></li>
</ul>

</div>
</div>
<div class="ui middle aligned center aligned grid">
    
  <div class="column">
<div class="connection">
        <button id="connect">
            Connecter
        </button>
    <h2 class="ui teal image header">
      <img src="static/images/logo.jpg" class="image">
      <div class="content">
        Recherche eleves
      </div>
    </h2>
    <form  class="ui large form">
      <div class="ui stacked segment">
        <div class="field">
          <div class="ui left icon input">
            <i class="user icon"></i>
            <input id="nom" type="text" name="nom" placeholder="Nom">
          </div>
        </div>
        <div class="field">
          <div class="ui left icon input">
            <i class="user icon"></i>
            <input id="prenom" type="text" name="prenom" placeholder="Prenom">
          </div>
        </div>
        <button type="submit" id="submit"    class="ui fluid large teal submit button">Rechercher</button>
      </div>

      <div class="ui error message"></div>

    </form>

    <p id="result">
    </p>

    <script src="static/js/serveur.js"></script>

  </div>
</div>

</body>

</html>
