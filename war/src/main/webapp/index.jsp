<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//FR"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
	  xmlns:ui="http://java.sun.com/jsf/facelets"
	  xmlns:h="http://java.sun.com/jsf/html"
	  xmlns:f="http://java.sun.com/jsf/core"
	  xmlns:c="http://java.sun.com/jsp/jstl/core">
	<head>
		<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
		<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
		<link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
		<link href="https://fonts.googleapis.com/css?family=Unlock" rel="stylesheet">
		<link rel="stylesheet" type="text/css" href="resources/css/styles.css">
		<script src="resources/js/javascript.js"></script>
		<title>Cars Commerce</title>
	</head>
	<body>
		<header id="header">
			<div class="logoMenu">
				<h1><span class="orange">C</span>ars <span class="orange">C</span>ommerce</h1>
				<nav>
					<ul>
						<li><a href="#voitures" id="voituresMenu">Voitures</a></li>
						<li><a href="#utilisateur" id="userMenu">Mon Espace</a></li>
					</ul>
				</nav>
			</div>
		</header>
		<hr/>
		<div id="preCars">
			<div>	
				<p id="preP"><span class="orange">V</span>otre voiture n'est plus très loin.</p>
			</div>
			<div class="dropdown">
					<div id="cart">
					<p><span id="in-cart-items-num">0</span> Articles</p>
					</div>
                          
					<ul id="cart-dropdown" hidden>
					<li id="empty-cart-msg"><a>Votre panier est vide</a></li>
						<li class="go-to-cart hidden"><a href="#">Voir le panier</a></li>
					</ul>
			</div>
		</div>

		<section id="voitures">
	
			<div class="emplacement" id="berlines">
				<p class="titre">Nos Berlines</p>

				<div id="listeVoiture">
					<article id="berline1">
						<div class="overlay">
							<h3 class="nomVoiture"><span class="orange">Tesla</span> Model 3 ${carController.name()}</h3>
							<p class="descriptionVoiture">La Tesla Model 3 est une berline électrique, simple et abordable.</p>
						</div>
						<div id="posBoutonInfos">
							<a href="#" class="buttonInfos">Plus d'infos</a>
						</div>
					</article>
					<article id="berline2">
						<div class="overlay">
							<h3 class="nomVoiture"><span class="orange">Peugeot</span> 508</h3>
							<p class="descriptionVoiture">La 508 dispose d'un extérieur plus affirmé et un contenu technologique renforcé.</p>
						</div>
						<div id="posBoutonInfos">
							<a href="#" class="buttonInfos">Plus d'infos</a>
						</div>
					</article>	
					<article id="berline3">
						<div class="overlay">
							<h3 class="nomVoiture"><span class="orange">Mercedes</span> Classe C</h3>
							<p class="descriptionVoiture">La Nouvelle Classe C est prête à prendre le départ.</p>
						</div>
						<div id="posBoutonInfos">
							<a href="#" class="buttonInfos">Plus d'infos</a>
						</div>
					</article>
				</div>
			</div>

			<div class="emplacement" id="suv">
				<p class="titre">Nos SUV</p>

				<div id="listeVoiture">
					<article id="suv1">
						<div class="overlay">
							<h3 class="nomVoiture"><span class="orange">Tesla</span> Model X</h3>
							<p class="descriptionVoiture">La Tesla Model 3 est une berline électrique, simple et abordable.</p>
						</div>
						<div id="posBoutonInfos">
							<a href="#" class="buttonInfos">Plus d'infos</a>
						</div>
					</article>
					<article id="suv2">
						<div class="overlay">
							<h3 class="nomVoiture"><span class="orange">BMW</span> X6</h3>
							<p class="descriptionVoiture">Prenez les rênes : la BMW X6 est faite pour ceux qui aiment le mouvement.</p>
						</div>
						<div id="posBoutonInfos">
							<a href="#" class="buttonInfos">Plus d'infos</a>
						</div>
					</article>	
					<article id="suv3">
						<div class="overlay">
							<h3 class="nomVoiture"><span class="orange">AUDI</span> Q8</h3>
							<p class="descriptionVoiture">La Audi Q8 adopte un tempérament de baroudeur.</p>
						</div>
						<div id="posBoutonInfos">
							<a href="#" class="buttonInfos">Plus d'infos</a>
						</div>
					</article>
				</div>
			</div>

			<div class="emplacement" id="sportive">
				<p class="titre">Nos Sportives</p>

				<div id="listeVoiture">
					<article id="sport1">
						<div class="overlay">
							<h3 class="nomVoiture"><span class="orange">Tesla</span> Model S</h3>
							<p class="descriptionVoiture">La Model S a été conçue pour être la berline la plus sûre et la plus exaltante</p>
						</div>
						<div id="posBoutonInfos">
							<a href="#" class="buttonInfos">Plus d'infos</a>
						</div>
					</article>
					<article id="sport2">
						<div class="overlay">
							<h3 class="nomVoiture"><span class="orange">PORSCHE</span> 718 Cayman GTS</h3>
							<p class="descriptionVoiture">La BMW X6 est faite pour ceux qui aiment le mouvement.</p>
						</div>
						<div id="posBoutonInfos">
							<a href="#" class="buttonInfos">Plus d'infos</a>
						</div>
					</article>	
					<article id="sport3">
						<div class="overlay">
							<h3 class="nomVoiture"><span class="orange">BMW</span> M4</h3>
							<p class="descriptionVoiture">La nouvelle BMW M4 CS est un modèle spécial haute performances</p>
						</div>
						<div id="posBoutonInfos">
							<a href="#" class="buttonInfos">Plus d'infos</a>
						</div>
					</article>
				</div>
			</div>
		</section>

		<footer>
			<div class="copyright">Copyright 2018. Tous droits réservés - Romain Pamart/Maxime Devallez - M2 TNSI FA</div>
		</footer>
	</body>
</html>