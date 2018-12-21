/* MENU */

var voituresMenu = document.getElementById("voituresMenu");

var sousMenu = document.createElement("ul");
sousMenu.id = "sousMenu";

var categoryCars = document.getElementsByClassName("titre");
var typeVoiture = document.getElementsByClassName("emplacement");
var afficherSousMenu = 0;

window.addEventListener("load", function() {

    for (var i = 0; i < categoryCars.length; i++) {
        var typeOfCar = document.createElement("li");
        typeOfCar.setAttribute("class", "typeOfCar");
        var linkTo = document.createElement("a");

        linkTo.href = "#" + typeVoiture[i].id;
        linkTo.innerHTML = categoryCars[i].innerHTML;
        afficherSousMenu = 1;
        typeOfCar.appendChild(linkTo);
        sousMenu.appendChild(typeOfCar);
    }

    var divSousMenu = document.createElement("div");
    divSousMenu.appendChild(sousMenu);
    document.getElementById("header").appendChild(divSousMenu);

});





