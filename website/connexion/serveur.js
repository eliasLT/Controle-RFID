(function(){
    

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
        webSocket.onmessage = function(eventMessage) {
            try{
                JSON.parse(eventMessage.data);
                console.log("message recieved : ",eventMessage.data);
            } catch (error){

            }
        }
        webSocket.onclose = function() {
            isConnected = false;
        }
    }

    var webSocket;
    var isConnected = false;
    var connect = document.getElementById("connect");
    var nom = document.getElementById("nom");
    var prenom = document.getElementById("prenom");
    var button = document.getElementById("submit");
    var result = document.getElementById("result");


    connect.addEventListener("click", initWebSocket);

    button.addEventListener("click", function(event){
        event.preventDefault();
        if(! isConnected){
            alert("not connected");
            return ;
        }
        var message = {
            message : {
                "nom"       : nom.value,
                "prenom"    : prenom.value
            },
            url : "/eleve"
        }
        webSocket.send(JSON.stringify(message));
    });
}());
