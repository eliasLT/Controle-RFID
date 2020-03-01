function titleCase(str) {
    var splitStr = str.toLowerCase().split(' ');
    for (var i = 0; i < splitStr.length; i++) {
        // You do not need to check if i is larger than splitStr length, as your for does that for you
        // Assign it back to the array
        splitStr[i] = splitStr[i].charAt(0).toUpperCase() + splitStr[i].substring(1);     
    }
    // Directly return the joined string
    return splitStr.join(' '); 
 }
 

$(document).ready( function () {
    var heure = document.getElementById("heure");
    heure.innerHTML = moment().format("hh:mm");
    setInterval(function(){
        heure.innerHTML = moment().format("hh:mm:ss");
    },1000);
    var date = document.getElementById("date");
    var dateString = titleCase(moment().lang("fr").format("dddd DD MMMM YYYY"));
    date.innerHTML = dateString;
    // $("heure").html(moment().format("hh:mm"));
})
