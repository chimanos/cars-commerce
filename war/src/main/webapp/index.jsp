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
					${carController.getCarsHtml("BERLINE")}
				</div>
			</div>

			<div class="emplacement" id="suv">
				<p class="titre">Nos SUV</p>

				<div id="listeVoiture">
					${carController.getCarsHtml("SUV")}
				</div>
			</div>

			<div class="emplacement" id="sportive">
				<p class="titre">Nos Sportives</p>

				<div id="listeVoiture">
					${carController.getCarsHtml("SPORTIVE")}
				</div>
			</div>

			<div class="emplacement" id="user">
				<p class="titre">Utilisateur</p>

				<div id="userAction">
					<article id="connexion">
						<h3 class="userDiv"><span class="orange">C</span>onnexion</h3>
						<form class="userP" action="/action_page.php">
							<p>Pseudo:</p>
							<input type="text" name="pseudo"><br>
							<p>Mot de Passe:</p>
							<input type="password" name="password"><br>
							<div id="posUserButton">
								<input class="userButton" type="submit" value="Connexion">
							</div>
						</form>
					</article>
					<article id="inscription">
						<h3 class="userDiv"><span class="orange">I</span>nscription</h3>
						<form class="userP" action="/action_page.php">
							<p>Pseudo:</p>
							<input type="text" name="pseudo"><br>
							<p>Email:</p>
							<input type="text" name="email"><br>
							<p>Nom:</p>
							<input type="text" name="name"><br>
							<p>Prénom:</p>
							<input type="text" name="firstname"><br>
							<p>Mot de Passe:</p>
							<input type="password" name="password"><br>
							<div id="posUserButton">
								<input class="userButton" type="submit" value="Inscription">
							</div>
						</form>
					</article>
				</div>
				<div id="userInfo">
					<article id="info">
						<h3 class="userDiv"><span class="orange">I</span>nformations</h3>
						<p>Pseudo: <span id="userPseudo">userPseudo</span></p>
						<p>Email:<span id="userEmail">userEmail</span></p>
						<p>Nom:<span id="userLastname">userLastname</span></p>
						<p>Prénom:<span id="userFirstname">userFirstname</span></p>
						<p>Historique des commandes:</p>
						<table id="orderHistory" style="width:100%">
							<tr>
								<th>Modèle</th>
								<th>Quantité</th>
								<th>Prix</th>
							</tr>
							<tr>
								<td>car.carName</td>
								<td>quantity</td>
								<td>quantity*car.price</td>
							</tr>
						</table>
					</article>
				</div>
			</div>
		</section>

		<footer>
			<div class="copyright">Copyright 2018. Tous droits réservés - Romain Pamart/Maxime Devallez - M2 TNSI FA</div>
		</footer>
	</body>
</html>