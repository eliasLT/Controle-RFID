// un button qui on click sur url: listen;
console.log("serveur.js loaded");
var data = `{
    "id": 1,
    "nom": "lotfi",
    "prenom": "elias",
    "classe": "SNIR 2",
    "photo": "./static/images/elias.JPG",
    "heureArrive": "22:00:00",
    "emploidutemps": {
        "emploidutemps": {
            "vendredi": [{
                "classe": "SNIR 2",
                "HD": "08:00:00",
                "HF": "09:00:00",
                "prof": "Vincent",
                "jour": "vendredi"
            }, {
                "classe": "SNIR 2",
                "HD": "09:00:00",
                "HF": "10:00:00",
                "prof": "Vincent",
                "jour": "vendredi"
            }, {
                "classe": "SNIR 2",
                "HD": "10:00:00",
                "HF": "11:00:00",
                "prof": "Vincent",
                "jour": "vendredi"
            }, {
                "classe": "SNIR 2",
                "HD": "11:00:00",
                "HF": "12:00:00",
                "prof": "Vincent",
                "jour": "vendredi"
            }, {
                "classe": "SNIR 2",
                "HD": "13:00:00",
                "HF": "14:00:00",
                "prof": "Vincent",
                "jour": "vendredi"
            }, {
                "classe": "SNIR 2",
                "HD": "14:00:00",
                "HF": "15:00:00",
                "prof": "Vincent",
                "jour": "vendredi"
            }, {
                "classe": "SNIR 2",
                "HD": "15:00:00",
                "HF": "16:00:00",
                "prof": "Vincent",
                "jour": "vendredi"
            }, {
                "classe": "SNIR 2",
                "HD": "16:00:00",
                "HF": "17:00:00",
                "prof": "Vincent",
                "jour": "vendredi"
            }, {
                "classe": "SNIR 2",
                "HD": "08:00:00",
                "HF": "09:00:00",
                "prof": "Vincent",
                "jour": "vendredi"
            }, {
                "classe": "SNIR 2",
                "HD": "09:00:00",
                "HF": "10:00:00",
                "prof": "Vincent",
                "jour": "vendredi"
            }, {
                "classe": "SNIR 2",
                "HD": "10:00:00",
                "HF": "11:00:00",
                "prof": "Vincent",
                "jour": "vendredi"
            }, {
                "classe": "SNIR 2",
                "HD": "11:00:00",
                "HF": "12:00:00",
                "prof": "Vincent",
                "jour": "vendredi"
            }, {
                "classe": "SNIR 2",
                "HD": "13:00:00",
                "HF": "14:00:00",
                "prof": "Vincent",
                "jour": "vendredi"
            }, {
                "classe": "SNIR 2",
                "HD": "14:00:00",
                "HF": "15:00:00",
                "prof": "Vincent",
                "jour": "vendredi"
            }, {
                "classe": "SNIR 2",
                "HD": "15:00:00",
                "HF": "16:00:00",
                "prof": "Vincent",
                "jour": "vendredi"
            }, {
                "classe": "SNIR 2",
                "HD": "16:00:00",
                "HF": "17:00:00",
                "prof": "Vincent",
                "jour": "vendredi"
            }],
            "mercredi": [{
                "classe": "SNIR 2",
                "HD": "08:00:00",
                "HF": "09:00:00",
                "prof": "Wassime",
                "jour": "mercredi"
            }, {
                "classe": "SNIR 2",
                "HD": "09:00:00",
                "HF": "10:00:00",
                "prof": "Wassime",
                "jour": "mercredi"
            }, {
                "classe": "SNIR 2",
                "HD": "10:00:00",
                "HF": "11:00:00",
                "prof": "Wassime",
                "jour": "mercredi"
            }, {
                "classe": "SNIR 2",
                "HD": "11:00:00",
                "HF": "12:00:00",
                "prof": "Wassime",
                "jour": "mercredi"
            }, {
                "classe": "SNIR 2",
                "HD": "13:00:00",
                "HF": "14:00:00",
                "prof": "Wassime",
                "jour": "mercredi"
            }, {
                "classe": "SNIR 2",
                "HD": "14:00:00",
                "HF": "15:00:00",
                "prof": "Wassime",
                "jour": "mercredi"
            }, {
                "classe": "SNIR 2",
                "HD": "15:00:00",
                "HF": "16:00:00",
                "prof": "Wassime",
                "jour": "mercredi"
            }, {
                "classe": "SNIR 2",
                "HD": "16:00:00",
                "HF": "17:00:00",
                "prof": "Wassime",
                "jour": "mercredi"
            }, {
                "classe": "SNIR 2",
                "HD": "08:00:00",
                "HF": "09:00:00",
                "prof": "Wassime",
                "jour": "mercredi"
            }, {
                "classe": "SNIR 2",
                "HD": "09:00:00",
                "HF": "10:00:00",
                "prof": "Wassime",
                "jour": "mercredi"
            }, {
                "classe": "SNIR 2",
                "HD": "10:00:00",
                "HF": "11:00:00",
                "prof": "Wassime",
                "jour": "mercredi"
            }, {
                "classe": "SNIR 2",
                "HD": "11:00:00",
                "HF": "12:00:00",
                "prof": "Wassime",
                "jour": "mercredi"
            }, {
                "classe": "SNIR 2",
                "HD": "13:00:00",
                "HF": "14:00:00",
                "prof": "Wassime",
                "jour": "mercredi"
            }, {
                "classe": "SNIR 2",
                "HD": "14:00:00",
                "HF": "15:00:00",
                "prof": "Wassime",
                "jour": "mercredi"
            }, {
                "classe": "SNIR 2",
                "HD": "15:00:00",
                "HF": "16:00:00",
                "prof": "Wassime",
                "jour": "mercredi"
            }, {
                "classe": "SNIR 2",
                "HD": "16:00:00",
                "HF": "17:00:00",
                "prof": "Wassime",
                "jour": "mercredi"
            }],
            "jeudi": [{
                "classe": "SNIR 2",
                "HD": "08:00:00",
                "HF": "09:00:00",
                "prof": "Malik",
                "jour": "jeudi"
            }, {
                "classe": "SNIR 2",
                "HD": "09:00:00",
                "HF": "10:00:00",
                "prof": "Malik",
                "jour": "jeudi"
            }, {
                "classe": "SNIR 2",
                "HD": "10:00:00",
                "HF": "11:00:00",
                "prof": "Malik",
                "jour": "jeudi"
            }, {
                "classe": "SNIR 2",
                "HD": "11:00:00",
                "HF": "12:00:00",
                "prof": "Malik",
                "jour": "jeudi"
            }, {
                "classe": "SNIR 2",
                "HD": "13:00:00",
                "HF": "14:00:00",
                "prof": "Malik",
                "jour": "jeudi"
            }, {
                "classe": "SNIR 2",
                "HD": "14:00:00",
                "HF": "15:00:00",
                "prof": "Malik",
                "jour": "jeudi"
            }, {
                "classe": "SNIR 2",
                "HD": "15:00:00",
                "HF": "16:00:00",
                "prof": "Malik",
                "jour": "jeudi"
            }, {
                "classe": "SNIR 2",
                "HD": "16:00:00",
                "HF": "17:00:00",
                "prof": "Malik",
                "jour": "jeudi"
            }, {
                "classe": "SNIR 2",
                "HD": "08:00:00",
                "HF": "09:00:00",
                "prof": "Malik",
                "jour": "jeudi"
            }, {
                "classe": "SNIR 2",
                "HD": "09:00:00",
                "HF": "10:00:00",
                "prof": "Malik",
                "jour": "jeudi"
            }, {
                "classe": "SNIR 2",
                "HD": "10:00:00",
                "HF": "11:00:00",
                "prof": "Malik",
                "jour": "jeudi"
            }, {
                "classe": "SNIR 2",
                "HD": "11:00:00",
                "HF": "12:00:00",
                "prof": "Malik",
                "jour": "jeudi"
            }, {
                "classe": "SNIR 2",
                "HD": "13:00:00",
                "HF": "14:00:00",
                "prof": "Malik",
                "jour": "jeudi"
            }, {
                "classe": "SNIR 2",
                "HD": "14:00:00",
                "HF": "15:00:00",
                "prof": "Malik",
                "jour": "jeudi"
            }, {
                "classe": "SNIR 2",
                "HD": "15:00:00",
                "HF": "16:00:00",
                "prof": "Malik",
                "jour": "jeudi"
            }, {
                "classe": "SNIR 2",
                "HD": "16:00:00",
                "HF": "17:00:00",
                "prof": "Malik",
                "jour": "jeudi"
            }],
            "mardi": [{
                "classe": "SNIR 2",
                "HD": "08:00:00",
                "HF": "09:00:00",
                "prof": "Elias",
                "jour": "mardi"
            }, {
                "classe": "SNIR 2",
                "HD": "09:00:00",
                "HF": "10:00:00",
                "prof": "Elias",
                "jour": "mardi"
            }, {
                "classe": "SNIR 2",
                "HD": "10:00:00",
                "HF": "11:00:00",
                "prof": "Elias",
                "jour": "mardi"
            }, {
                "classe": "SNIR 2",
                "HD": "11:00:00",
                "HF": "12:00:00",
                "prof": "Elias",
                "jour": "mardi"
            }, {
                "classe": "SNIR 2",
                "HD": "13:00:00",
                "HF": "14:00:00",
                "prof": "Elias",
                "jour": "mardi"
            }, {
                "classe": "SNIR 2",
                "HD": "14:00:00",
                "HF": "15:00:00",
                "prof": "Elias",
                "jour": "mardi"
            }, {
                "classe": "SNIR 2",
                "HD": "15:00:00",
                "HF": "16:00:00",
                "prof": "Elias",
                "jour": "mardi"
            }, {
                "classe": "SNIR 2",
                "HD": "16:00:00",
                "HF": "17:00:00",
                "prof": "Elias",
                "jour": "mardi"
            }, {
                "classe": "SNIR 2",
                "HD": "08:00:00",
                "HF": "09:00:00",
                "prof": "Elias",
                "jour": "mardi"
            }, {
                "classe": "SNIR 2",
                "HD": "09:00:00",
                "HF": "10:00:00",
                "prof": "Elias",
                "jour": "mardi"
            }, {
                "classe": "SNIR 2",
                "HD": "10:00:00",
                "HF": "11:00:00",
                "prof": "Elias",
                "jour": "mardi"
            }, {
                "classe": "SNIR 2",
                "HD": "11:00:00",
                "HF": "12:00:00",
                "prof": "Elias",
                "jour": "mardi"
            }, {
                "classe": "SNIR 2",
                "HD": "13:00:00",
                "HF": "14:00:00",
                "prof": "Elias",
                "jour": "mardi"
            }, {
                "classe": "SNIR 2",
                "HD": "14:00:00",
                "HF": "15:00:00",
                "prof": "Elias",
                "jour": "mardi"
            }, {
                "classe": "SNIR 2",
                "HD": "15:00:00",
                "HF": "16:00:00",
                "prof": "Elias",
                "jour": "mardi"
            }, {
                "classe": "SNIR 2",
                "HD": "16:00:00",
                "HF": "17:00:00",
                "prof": "Elias",
                "jour": "mardi"
            }],
            "Lundi": [{
                "classe": "SNIR 2",
                "HD": "08:00:00",
                "HF": "09:00:00",
                "prof": "Karim",
                "jour": "Lundi"
            }, {
                "classe": "SNIR 2",
                "HD": "09:00:00",
                "HF": "10:00:00",
                "prof": "Karim",
                "jour": "Lundi"
            }, {
                "classe": "SNIR 2",
                "HD": "10:00:00",
                "HF": "11:00:00",
                "prof": "Karim",
                "jour": "Lundi"
            }, {
                "classe": "SNIR 2",
                "HD": "11:00:00",
                "HF": "12:00:00",
                "prof": "Karim",
                "jour": "Lundi"
            }, {
                "classe": "SNIR 2",
                "HD": "13:00:00",
                "HF": "14:00:00",
                "prof": "Karim",
                "jour": "Lundi"
            }, {
                "classe": "SNIR 2",
                "HD": "14:00:00",
                "HF": "15:00:00",
                "prof": "Karim",
                "jour": "Lundi"
            }, {
                "classe": "SNIR 2",
                "HD": "15:00:00",
                "HF": "16:00:00",
                "prof": "Karim",
                "jour": "Lundi"
            }, {
                "classe": "SNIR 2",
                "HD": "16:00:00",
                "HF": "17:00:00",
                "prof": "Karim",
                "jour": "Lundi"
            }, {
                "classe": "SNIR 2",
                "HD": "08:00:00",
                "HF": "09:00:00",
                "prof": "Karim",
                "jour": "Lundi"
            }, {
                "classe": "SNIR 2",
                "HD": "09:00:00",
                "HF": "10:00:00",
                "prof": "Karim",
                "jour": "Lundi"
            }, {
                "classe": "SNIR 2",
                "HD": "10:00:00",
                "HF": "11:00:00",
                "prof": "Karim",
                "jour": "Lundi"
            }, {
                "classe": "SNIR 2",
                "HD": "11:00:00",
                "HF": "12:00:00",
                "prof": "Karim",
                "jour": "Lundi"
            }, {
                "classe": "SNIR 2",
                "HD": "13:00:00",
                "HF": "14:00:00",
                "prof": "Karim",
                "jour": "Lundi"
            }, {
                "classe": "SNIR 2",
                "HD": "14:00:00",
                "HF": "15:00:00",
                "prof": "Karim",
                "jour": "Lundi"
            }, {
                "classe": "SNIR 2",
                "HD": "15:00:00",
                "HF": "16:00:00",
                "prof": "Karim",
                "jour": "Lundi"
            }, {
                "classe": "SNIR 2",
                "HD": "16:00:00",
                "HF": "17:00:00",
                "prof": "Karim",
                "jour": "Lundi"
            }]
        }
    }
}
`;
var error = `{"error" : "internal error"}`;
var joursdelasemaine = ["Lundi","mardi","mercredi","jeudi","vendredi"];

function getHDtrFromJson(cours){
    var HD = cours.HD.substring(0,2);
    switch(HD){
        case "08" : 
            return document.getElementById("C8");
        case "09" : 
            return document.getElementById("C9");
        case "10" : 
            return document.getElementById("C10");
        case "11" : 
            return document.getElementById("C11");
        case "12" : 
            return document.getElementById("C12");
        case "13" : 
            return document.getElementById("C13");
        case "14" : 
            return document.getElementById("C14");
        case "15" : 
            return document.getElementById("C15");
        case "16" : 
            return document.getElementById("C16");
        case "17" : 
            return document.getElementById("C17");
    }
}

(function(){


    var onmessagelisten = function(eventMessage) {
        try{
            
            var reponse = JSON.parse(eventMessage.data);
            // var reponse = JSON.parse(data);
            if(!reponse.nom){
                alert("internal error");
                return;
            }
            var nomdiv = document.getElementById("nom");
            var prenomdiv = document.getElementById("prenom");
            var classediv = document.getElementById("classe");
            var photodiv = document.getElementById("photo");
            
            
            


            nomdiv.innerHTML = reponse.nom;
            prenomdiv.innerHTML = reponse.prenom;
            classediv.innerHTML = reponse.classe;
            photodiv.src = reponse.photo;
            // cours maths 8h-9h mardi 
            var emploidutemps = reponse.emploidutemps.emploidutemps;
            for(var i = 0 ; i<joursdelasemaine.length;i++){
                var jour = emploidutemps[joursdelasemaine[i]];
                for(var j = 0;j<jour.length; j++){
                    var cours = jour[j];
                    var H = getHDtrFromJson(cours);
                    var cell = H.children[i+1];
                    cell.innerHTML = cours.prof;
                }
            }

            // var cell = coursexemple.children[2];
            // cell.innerHTML = "maths";
            // console.log(cell);


            // console.log("message recieved : ",eventMessage.data);
        } catch (error){

        }
    }

    document.getElementById("test").addEventListener("click", onmessagelisten);
    

    function initWebSocket(event){
        if(isConnected) {
            message = {
                url : "/exit"
            }
            webSocket.send(JSON.stringify(message));
        }
        webSocket = new WebSocket('ws://localhost:5555/');
        webSocket.onopen = function(){
            isConnected = true;
            alert("connection etablie");
        }
        webSocket.onmessage = onmessagelisten;
        webSocket.onclose = function() {
            isConnected = false;
        }
    }

    var webSocket;
    var isConnected = false;
    var connect = document.getElementById("connect");
    var result = document.getElementById("result");

    // initWebSocket(null);


    connect.addEventListener("click",function(event){
        event.preventDefault();
        var message = {
            url : "/listen",
            message : {

            }

        }
        webSocket.send(JSON.stringify(message));
    });

}());
