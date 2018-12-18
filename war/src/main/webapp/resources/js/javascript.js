/* MENU */

var voituresMenu = document.getElementById("voituresMenu");
var sousMenu = document.createElement("ul");
	sousMenu.id = "sousMenu";
var categoryCars = document.getElementsByClassName("titre");
var typeVoiture = document.getElementsByClassName("emplacement");
var afficherSousMenu = 0;

voituresMenu.addEventListener("mouseover", function() {

	if (afficherSousMenu) {
		return 0
	} else {
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
	}

	var divSousMenu = document.createElement("div");
	divSousMenu.appendChild(sousMenu);
	document.getElementById("header").appendChild(divSousMenu);

});

/* Infos Voitures */

var boutonInfos = document.getElementsByClassName("buttonInfos");

function Voiture(name, brand, color, nbPortes, price) {
	this.name = name;
	this.brand = brand;
	this.color = color;
	this.nbPortes = nbPortes;
	this.price = price;
}

var caracteristiques = [

	new Voiture("Model 3", "Tesla",["Rouge", "Bleu", "Blanc"], 5, 35000),
	new Voiture("508", "Peugeot", ["Rouge", "Bleu", "Blanc", "Gris"], 5, 38000),
	new Voiture("Classe C", "Mercedes", ["Rouge", "Bleu", "Blanc", "Gris"], 5, 55000),
	new Voiture("Model X", "Tesla", ["Rouge", "Bleu", "Blanc", "Noir"], 5, 100000),
	new Voiture("X6", "BMW", ["Rouge", "Bleu", "Blanc", "Gris", "Noir"], 5, 75000),
	new Voiture("Q8", "Audi", ["Rouge", "Bleu", "Blanc", "Orange"], 5, 80000),
	new Voiture("Model S", "Tesla", ["Rouge", "Bleu", "Blanc", "Noir"], 5, 90000),
	new Voiture("718 Cayman GTS", "Porsche", ["Rouge", "Bleu", "Blanc", "Noir"], 3, 80000),
	new Voiture("M4", "BMW", ["Rouge", "Bleu", "Blanc"], 3, 95000)
];

for (var i = 0; i < boutonInfos.length; i++) {

	boutonInfos[i].value = i;
	console.log(caracteristiques[i].name)

	boutonInfos[i].addEventListener("click", function(e) {

		var couleurs = caracteristiques[this.value].color;
		var listeCouleur = "";

		for (var i = 0; i < couleurs.length; i++) {
			couleurs[i].split(",");

			if (i === couleurs.length - 1) {
				listeCouleur += couleurs[i];
			} else {
			listeCouleur += couleurs[i] +" / ";
			}
		}

		var description = e.path[2].firstElementChild.lastElementChild;
		description.innerHTML = "Couleurs disponibles : " +listeCouleur
		+"<br>Modèle " +caracteristiques[this.value].nbPortes +" portes"
		+" - Prix : " +caracteristiques[this.value].price;

	})
}





