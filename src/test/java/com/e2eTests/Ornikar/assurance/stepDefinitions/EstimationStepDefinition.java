package com.e2eTests.Ornikar.assurance.stepDefinitions;

import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.e2eTests.Ornikar.assurance.pages.EstimationPage;
import com.e2eTests.Ornikar.utils.CommonMethods;
import com.e2eTests.Ornikar.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EstimationStepDefinition extends CommonMethods {

	public WebDriver driver;
	private EstimationPage Estimation = new EstimationPage();
	private static CommonMethods commonMethods = new CommonMethods();

	// les deux lignes por les wait et le (0) dans la premier ligne c lindex de la
	// des declaration des wait
	static JSONObject object = commonMethods.JsonData(0);
	public static long shortwait = Long.valueOf((String) object.get("shortwait"));

	// appel pour le classe setup
	public EstimationStepDefinition() {
		driver = Setup.driver;
	}

	@Given("^Je me connecte sur lapplication Ornikar$")
	public void jeMeConnecteSurLapplicationOrnikar() throws Throwable {
		PageFactory.initElements(driver, EstimationPage.class);
		commonMethods.readFromConfigFile("url");
		logger.info("Je me connecte sur l'application Ornikar");
	}

	@Given("^J accepte les cookies$")
	public void jAccepteLesCookies() throws Throwable {
		Estimation.AccepterLesCookies();
		logger.info("");
	}

	@When("^Je saisie \"([^\"]*)\"$")
	public void jeSaisie(String MAT) throws Throwable {
		Estimation.SaisirLimmatriculation(MAT);
		logger.info("");
	}

	@When("^Je clique sur le bouton Rechercher$")
	public void jeCliqueSurLeBoutonRechercher() throws Throwable {
		Estimation.CliquerSurRechercherBTN();
		logger.info("");
	}

	@When("^je verifie immatriculation$")
	public void jeVerifieImmatriculation() throws Throwable {
		Estimation.VerifierLimmatriculation();
		logger.info("");
	}

	@When("^je verifie Marque du véhicule$")
	public void jeVerifieMarqueDuVéhicule() throws Throwable {
		Estimation.VerifierMarqueDuVéhicule();
		logger.info("");
	}

	@When("^je verifie Modèle du véhicule$")
	public void jeVerifieModèleDuVéhicule() throws Throwable {
		Estimation.VerifierModèleDuVéhicule();
		logger.info("");
	}

	@When("^je verifie Puissance Fiscale$")
	public void jeVerifiePuissanceFiscale() throws Throwable {
		Estimation.VerifierPuissanceFiscale();
		logger.info("");
	}

	@When("^je verifie Carburant$")
	public void jeVerifieCarburant() throws Throwable {
		Estimation.VerifierLeCarburant();
		logger.info("");
	}

	@When("^je verifie Date de mise en circulation$")
	public void jeVerifieDateDeMiseEnCirculation() throws Throwable {
		Estimation.VerifierLaDateDeMiseEnCirculation();
		logger.info("");
	}

	@When("^je clique sur la liste  Version$")
	public void jeCliqueSurLaListeVersion() throws Throwable {
		Estimation.CliquerSurLaListeVersion();
		logger.info("");
	}

	@When("^je selectionne  la version$")
	public void jeSelectionneLaVersion() throws Throwable {
		Estimation.SelectionnerLaVersion();
		logger.info("");
	}

	@When("^je clique sur le bouton Commencer$")
	public void jeCliqueSurLeBoutonCommencer() throws Throwable {
		Estimation.CliquerSurLeBoutonCommencer();
		logger.info("");
	}

	@When("^je saisis \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"dachat$")
	public void jeSaisisDachat(String jour, String mois, String annee) throws Throwable {
		Estimation.SaisirLaDateDachat( jour,mois,annee);
		logger.info("");
	}

	@When("^je clique sur le bouton Achat comptant$")
	public void jeCliqueSurLeBoutonAchatComptant() throws Throwable {
		Estimation.CliquerSurLeBoutonAchatComptant();
		logger.info("");
	}

	@When("^je clique sur le bouton Non si la vehicule est assure$")
	public void jeCliqueSurLeBoutonNonSiLaVehiculeEstAssure() throws Throwable {
		Estimation.CliquerSurLeBoutonNonSiLaVehiculeEstAssure();
		logger.info("");
	}

	@When("^je clique sur le bouton continuer$")
	public void jeCliqueSurLeBoutonContinuer() throws Throwable {
		Estimation.CliquerSurLeBoutonContinuer();
		logger.info("");
	}
	@When("^je clique sur le bouton  privé$")
	public void jeCliqueSurLeBoutonPrivé() throws Throwable {
		Estimation.CliquerSurLeBoutonPrive();
		logger.info("");
	}

	@When("^je mets le max comme kilometrage annuelle$")
	public void jeMetsLeMaxCommeKilometrageAnnuelle() throws Throwable {
		Estimation.mettreLeMaxDeKilometrage();
		logger.info("");
	}

	@When("^je clique sur le bouton Dans la rue ou dans un parking public$")
	public void jeCliqueSurLeBoutonDansLaRueOuDansUnParkingPublic() throws Throwable {
		Estimation.CliquerSurLeBoutonDansLaRueOuDansUnParkingPublic();
		logger.info("");
	}

	@When("^je saisis le \"([^\"]*)\"$")
	public void jeSaisisLe(String Post) throws Throwable {
		Estimation.parkingCodePostal_TEXT_BOX(Post);
		logger.info("");
		
	}
	@When("^je clique sur la liste des communes$")
	public void jeCliqueSurLaListeDesCommunes() throws Throwable {
		Estimation.CliquerSurLaListeDesCommunes();
		logger.info("");
	}

	@When("^je selectionne sannois$")
	public void jeSelectionneSannois() throws Throwable {
		Estimation.SelectionnerSannois();
		logger.info("");
	}

	@When("^je clique sur le bouton le votre$")
	public void jeCliqueSurLeBoutonLeVotre() throws Throwable {
		Estimation.CliquerSurLeBoutonLeVotre();
		logger.info("");
	}

	@When("^je saisis le Prenom \"([^\"]*)\"$")
	public void jeSaisisLePrenom (String Prenom) throws Throwable {
		Estimation.SaisirLePrenom(Prenom);
		logger.info("");
	}

	@When("^je saisis le nom\"([^\"]*)\"$")
	public void jeSaisisLeNom(String Nom) throws Throwable {
		Estimation.SaisirLeNom(Nom);
		logger.info("");
	}
	@When("^je clique sur M come civilite$")
	public void jeCliqueSurMComeCivilite() throws Throwable {
		Estimation.CliquerSurMComeCivilite();
		logger.info("");
	}
	@When("^je saisis la Date de naissance\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void jeSaisisLaDateDeNaissance(String jourN,String moisN,String anneeN) throws Throwable {
		Estimation.SaisirLaDateDeNaissance(jourN,moisN,anneeN);
		logger.info("");
	}

	@When("^je saisis la Date d obtention du permis\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void jeSaisisLaDateDObtentionDuPermis(String jourP,String moisP,String anneeP) throws Throwable {
		Estimation.SaisirLaDateDObtentionDuPermis(jourP,moisP,anneeP);
		logger.info("");
	}
	@When("^je clique sur le bouton oui$")
	public void jeCliqueSurLeBoutonOui() throws Throwable {
		Estimation.CliquerSurLeBoutonOui();
		logger.info("");
	}
	@When("^je clique sur la liste  des profissions$")
	public void jeCliqueSurLaListeDesProfissions() throws Throwable {
		Estimation.CliquerSurLaListeDesProfissions();
		logger.info("");
	}

	@When("^je selectionne salarié comme profission$")
	public void jeSelectionneSalariéCommeProfission() throws Throwable {
		Estimation.SelectionnerSalariéCommeProfission();
		logger.info("");
	}
	@When("^je clique sur le bouton je vis en couple$")
	public void jeCliqueSurLeBoutonJeVisEnCouple() throws Throwable {
		Estimation.CliquerSurLeBoutonJeVisEnCouple();
		logger.info("");
	}

	@When("^je clique sur le bouton jamais$")
	public void jeCliqueSurLeBoutonJamais() throws Throwable {
		Estimation.CliquerSurLeBoutonJamais();
		logger.info("");
	}
	
	@When("^je clique sur le bouton Non$")
	public void jeCliqueSurLeBoutonNon() throws Throwable {
		Estimation.CliquerSurLeBoutonNon();
		logger.info("");
	}

	@When("^je saisis la date souhaite pour assurer le véhicule\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void jeSaisisLaDateSouhaitePourAssurerLeVéhicule(String jourV,String moisV,String anneeV) throws Throwable {
		Estimation.SaisirLaDateDacha(jourV,moisV,anneeV);
		logger.info("");
	}

	@When("^je clique sur le nom du visiteur$")
	public void jeCliqueSurLeNomDuVisiteur() throws Throwable {
		Estimation.CliquerLeNomDuVisiteur();
		logger.info("");
	}
	@When("^je saisis l adresse mail\"([^\"]*)\"$")
	public void jeSaisisLAdresseMail(String mail) throws Throwable {
		Estimation.SaisisLAdresseMail(mail);
		logger.info("");
	}

	@When("^je saisis le numero de \"([^\"]*)\"$")
	public void jeSaisisLeNumeroDe(String phone) throws Throwable {
		Estimation.SaisirLeNumeroDeTelephone(phone);
		logger.info("");
	}
	@When("^je saisis l adresse postale\"([^\"]*)\"$")
	public void jeSaisisLAdressePostale(String postale) throws Throwable {
		Estimation.SaisisLAdressePostale(postale);
		logger.info("");
	}
	@When("^je clique sur le bouton terminer$")
	public void jeCliqueSurLeBoutonTerminer() throws Throwable {
		Estimation.CliquerSurLeBoutonTerminer();
		logger.info("");
	}

	@Then("^Je verifie la Véhicule$")
	public void jeVerifieLaVéhicule() throws Throwable {
		Estimation.VerifierLaVéhicule();
		logger.info("");
	}

	@Then("^je verifie Utilisation$")
	public void jeVerifieUtilisation() throws Throwable {
		Estimation.VerifierLUtilisation();
		logger.info("");
	}

	@Then("^je verifie Informations du titulaire$")
	public void jeVerifieInformationsDuTitulaire() throws Throwable {
		Estimation.VerifierInformationsDuTitulaire();
		logger.info("");
	}

	@Then("^je verifie Conducteurs - conductrices$")
	public void jeVerifieConducteursConductrices() throws Throwable {
		Estimation.VerifierConducteursConductrices();
		logger.info("");
	}

	@Then("^je clique sur le bouton Découvrir mes offres$")
	public void jeCliqueSurLeBoutonDécouvrirMesOffres() throws Throwable {
		Estimation.CliquerLeBoutonDécouvrirMesOffres();
		logger.info("");
	}

	@Then("^je verifie la formule recomandée$")
	public void jeVerifieLaFormuleRecomandée() throws Throwable {
		Estimation.VerifierLaFormuleRecomandée();
		logger.info("");
	}

	

}
