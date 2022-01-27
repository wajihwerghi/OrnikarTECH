@Assurence @Estimation
Feature: Estimation
  En tant que visiteur je souhaite estimer le prix de votre assurance par immatriculation
  
  Background:
  Given Je me connecte sur lapplication Ornikar
  And J accepte les cookies

  @Immatriculation
  Scenario Outline: je verifie lestimation le prix de mon assurance assurance
    When Je saisie "<immatriculation>"
    And Je clique sur le bouton Rechercher
    And je verifie immatriculation
    And je verifie Marque du véhicule
    And je verifie Modèle du véhicule
    And je verifie Puissance Fiscale
    And je verifie Carburant
    And je verifie Date de mise en circulation
    And je clique sur la liste  Version
    And je selectionne  la version
    And je clique sur le bouton Commencer
    And je saisis "<jour>""<mois>""<annee>"dachat
    And je clique sur le bouton Achat comptant
    And je clique sur le bouton Non si la vehicule est assure
    And je clique sur le bouton continuer
    And je clique sur le bouton  privé
    And je mets le max comme kilometrage annuelle
    And je clique sur le bouton Dans la rue ou dans un parking public
    And je saisis le "<code postal>"
    And je clique sur la liste des communes
    And je selectionne sannois
    And je clique sur le bouton continuer
    And je clique sur le bouton le votre
    And je clique sur le bouton continuer
    And je saisis le Prenom "<Prenom>" 
    And je saisis le nom"<Nom>"
    And je clique sur M come civilite
    And je saisis la Date de naissance"<jourN>""<moisN>""<anneeN>"
    And je saisis la Date d obtention du permis"<jourP>""<moisP>""<anneeP>"
    And je clique sur le bouton oui  
    And je clique sur le bouton continuer
    And je clique sur la liste  des profissions
    And je selectionne salarié comme profission
    And je clique sur le bouton je vis en couple
    And je clique sur le bouton continuer
    And je clique sur le bouton jamais
    And je clique sur le bouton continuer
    And je clique sur le bouton Non 
    And je clique sur le bouton continuer
    And je clique sur le bouton Non
    And je clique sur le bouton continuer
    And je saisis la date souhaite pour assurer le véhicule"<jourV>""<moisV>""<anneeV>"
    And je clique sur le nom du visiteur
    And je saisis l adresse mail"<mail>"
    And je saisis le numero de "<Mobile>"
    And je saisis l adresse postale"<postal>"
    And je clique sur le bouton terminer 
    Then Je verifie la Véhicule
    And je verifie Utilisation 
    And je verifie Informations du titulaire
    And je verifie Conducteurs - conductrices
    And je clique sur le bouton Découvrir mes offres
    And je verifie la formule recomandée
    
    
    Examples:
    
    |immatriculation|jour|mois|annee|code postal|Prenom|Nom   |jourN|moisN|anneeN|jourP|moisP|anneeP|jourV|moisV|anneeV|mail          |Mobile    |postal                     |
    |dy767RN        |01  |01  |2022 |95110      |wajih |werghi|  03 | 09  |1990  |01   |02   | 2012 |  02 |  02 | 2022 |test@gmail.com|0768832345|9 rue robert bellec sannois|

