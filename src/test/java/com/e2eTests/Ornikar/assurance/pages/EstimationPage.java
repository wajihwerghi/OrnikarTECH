package com.e2eTests.Ornikar.assurance.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.e2eTests.Ornikar.utils.CommonMethods;

public class EstimationPage extends CommonMethods {
	public WebDriverWait wait = new WebDriverWait(driver, 20);
	public JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions actions = new Actions(driver);

	final static String Cookies_BUTTON = "axeptio_btn_acceptAll";
	final static String LicensePlate_TEXT_BOX = "licensePlate";
	final static String Recherche_BUTTON = "(//div[@class='kitt_Content_oxWk7'])[3]";
	final static String VehiculeImmatriculation_TEXT_BOX = "vehiculeImmatriculation";
	final static String VehiculeMarque_TEXT_BOX = "vehiculeMarque";
	final static String VehiculeModele_TEXT_BOX = "vehiculeModele";
	final static String VehiculePuissanceFiscale_TEXT_BOX = "vehiculePuissanceFiscale";
	final static String VehiculeCarburant_TEXT_BOX = "vehiculeCarburant";
	final static String VehiculeMiseEnCirculation_day_TEXT_BOX = "vehiculeMiseEnCirculation-day";
	final static String VehiculeMiseEnCirculation_month_TEXT_BOX = "vehiculeMiseEnCirculation-month";
	final static String VehiculeMiseEnCirculation_year_TEXT_BOX = "vehiculeMiseEnCirculation-year";
	final static String Version_LIST = "downshift-0-input";
	final static String Version_BUTTON = "RENAULT TWINGO II 1.2 75 XV";
	final static String Commencer_BUTTON = "//button[@type='submit']//div[1]";
	final static String VehiculeAcquisition_day_TEXT_BOX = "vehiculeAcquisition-day";
	final static String VehiculeAcquisition_month_TEXT_BOX = "vehiculeAcquisition-month";
	final static String VehiculeAcquisition_year_TEXT_BOX = "vehiculeAcquisition-year";
	final static String VehiculeFinancement_1_BUTTON = "//div[contains(@class,'RadioContainer_2KQqzi Horizontal_1dKpuC')]";
	final static String VehiculeDejaAssure_0_BUTTON = "//input[@id='vehiculeDejaAssure-0']/following-sibling::div[1]";
	final static String Continuer_BUTTON = "//button[@type='submit']//div[1]";
	final static String Privé_BUTTON = "//div[@class='RadioContainer_2KQqzi Horizontal_1dKpuC']";
	final static String DansLaRueOuDansUnParkingPublic_BUTTON = "//input[@id='parkingLocation-1']/following-sibling::div[1]";
	final static String ParkingCodePostal_TEXT_BOX = "parkingCodePostal";
	final static String ChoisirLaCommune_BUTTON = "//*[@id=\"__next\"]/div[1]/div[3]/div[1]/div/form/div[4]/div/div[2]/div[2]/div/div";
	final static String SelectionnerLaCommune = "//div[@data-value='SANNOIS']";
	final static String LeVotre_BUTTON = "//input[@class='kitt_InputRadioHidden_2Vo35']/following-sibling::div";
	final static String Prenom_TEXT_BOX = "primaryFirstName";
	final static String Nom_TEXT_BOX = "primaryLastName";
	final static String Monsieur_BUTTON = "//div[@class='kitt_RadioButton_qzcRS']";
	final static String PrimaryBirthDate_day_TEXT_BOX = "primaryBirthDate-day";
	final static String PrimaryBirthDate_month_TEXT_BOX = "primaryBirthDate-month";
	final static String PrimaryBirthDate_year_TEXT_BOX = "primaryBirthDate-year";
	final static String PrimaryLicenceDate_day_TEXT_BOX = "primaryLicenceDate-day";
	final static String PrimaryLicenceDate_month_TEXT_BOX = "primaryLicenceDate-month";
	final static String PrimaryLicenceDate_year_TEXT_BOX = "primaryLicenceDate-year";
	final static String Oui_BUTTON = "//div[text()='Oui']";
	final static String Profession_LIST = "//div[contains(@class,'kitt_DropdownButton_39LV2 kitt_ResetButton_1dTnc')]//div";
	final static String Salarie_BUTTON = "//div[@class='kitt_DropdownItem_R6Ae0  ']";
	final static String JeVisEnCouple_BUTTON = "(//input[@class='kitt_InputRadioHidden_2Vo35']/following-sibling::div)[2]";
	final static String Jamais_BUTTON = "//input[@class='kitt_InputRadioHidden_2Vo35']/following-sibling::div";
	final static String Non_BUTTON = "(//div[@class='kitt_RadioButton_qzcRS'])[2]";
	final static String Assurance_day_TEXT_BOX = "//input[@class='kitt_Input_Xtb_b  ']";
	final static String Assurance_month_TEXT_BOX = "(//input[@class='kitt_Input_Xtb_b  '])[2]";
	final static String Assurance_year_TEXT_BOX = "(//input[@class='kitt_Input_Xtb_b  '])[3]";
	final static String Titulaire_BUTTON = "//input[@class='kitt_InputRadioHidden_2Vo35']/following-sibling::div";
	final static String Email_TEXT_BOX = "subscriberEmail";
	final static String Phone_TEXT_BOX = "subscriberPhone";
	final static String Adresse_TEXT_BOX = "downshift-1-input";
	final static String AdresseAutocomplet_Button = "downshift-1-item-1";
	final static String Terminer_BUTTON = "//button[@type='submit']//div[1]";
	final static String Véhicule_TEXT_BOX = "//span[contains(@class,'kitt_Reset_1HOMT kitt_black-regular_2_1Sz')]";
	final static String Utilisation_TEXT_BOX = "(//span[contains(@class,'kitt_Reset_1HOMT kitt_black-regular_2_1Sz')])[2]";
	final static String Informations_Du_Titulaire_TEXT_BOX = "(//span[contains(@class,'kitt_Reset_1HOMT kitt_black-regular_2_1Sz')])[3]";
	final static String Conducteurs_Conductrices_TEXT_BOX = "(//span[contains(@class,'kitt_Reset_1HOMT kitt_black-regular_2_1Sz')])[4]";
	final static String DécouvrirMesOffres_Button = "//div[@id='__next']/div[1]/div[3]/div[1]/div[1]/div[2]/div[6]/div[1]";
	final static String LaFormuleRecomandée_TEXT_BOX = "//div[contains(@class,'kitt_Reset_1HOMT kitt_white-bold_2a5zT')]";

	/* @FindBy */
	@FindBy(how = How.ID, using = Cookies_BUTTON)
	public static WebElement cookies_BUTTON;
	@FindBy(how = How.ID, using = LicensePlate_TEXT_BOX)
	public static WebElement licensePlate_TEXT_BOX;
	@FindBy(how = How.XPATH, using = Recherche_BUTTON)
	public static WebElement recherche_BUTTON;
	@FindBy(how = How.ID, using = VehiculeImmatriculation_TEXT_BOX)
	public static WebElement vehiculeImmatriculation_TEXT_BOX;
	@FindBy(how = How.ID, using = VehiculeMarque_TEXT_BOX)
	public static WebElement vehiculeMarque_TEXT_BOX;
	@FindBy(how = How.ID, using = VehiculeModele_TEXT_BOX)
	public static WebElement vehiculeModele_TEXT_BOX;
	@FindBy(how = How.ID, using = VehiculePuissanceFiscale_TEXT_BOX)
	public static WebElement vehiculePuissanceFiscale_TEXT_BOX;
	@FindBy(how = How.ID, using = VehiculeCarburant_TEXT_BOX)
	public static WebElement vehiculeCarburant_TEXT_BOX;
	@FindBy(how = How.ID, using = VehiculeMiseEnCirculation_day_TEXT_BOX)
	public static WebElement vehiculeMiseEnCirculation_day_TEXT_BOX;
	@FindBy(how = How.ID, using = VehiculeMiseEnCirculation_month_TEXT_BOX)
	public static WebElement vehiculeMiseEnCirculation_month_TEXT_BOX;
	@FindBy(how = How.ID, using = VehiculeMiseEnCirculation_year_TEXT_BOX)
	public static WebElement vehiculeMiseEnCirculation_year_TEXT_BOX;
	@FindBy(how = How.ID, using = Version_LIST)
	public static WebElement version_LIST;
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = Version_BUTTON)
	public static WebElement version_BUTTON;
	@FindBy(how = How.XPATH, using = Commencer_BUTTON)
	public static WebElement commencer_BUTTON;
	@FindBy(how = How.ID, using = VehiculeAcquisition_day_TEXT_BOX)
	public static WebElement vehiculeAcquisition_day_TEXT_BOX;
	@FindBy(how = How.ID, using = VehiculeAcquisition_month_TEXT_BOX)
	public static WebElement vehiculeAcquisition_month_TEXT_BOX;
	@FindBy(how = How.ID, using = VehiculeAcquisition_year_TEXT_BOX)
	public static WebElement vehiculeAcquisition_year_TEXT_BOX;
	@FindBy(how = How.XPATH, using = VehiculeFinancement_1_BUTTON)
	public static WebElement vehiculeFinancement_1_BUTTON;
	@FindBy(how = How.XPATH, using = VehiculeDejaAssure_0_BUTTON)
	public static WebElement vehiculeDejaAssure_0_BUTTON;
	@FindBy(how = How.XPATH, using = Continuer_BUTTON)
	public static WebElement continuer_BUTTON;
	@FindBy(how = How.XPATH, using = Privé_BUTTON)
	public static WebElement privé_BUTTON;
	@FindBy(how = How.XPATH, using = DansLaRueOuDansUnParkingPublic_BUTTON)
	public static WebElement dansLaRueOuDansUnParkingPublic_BUTTON;
	@FindBy(how = How.ID, using = ParkingCodePostal_TEXT_BOX)
	public static WebElement parkingCodePostal_TEXT_BOX;
	@FindBy(how = How.XPATH, using = ChoisirLaCommune_BUTTON)
	public static WebElement choisirLaCommune_BUTTON;
	@FindBy(how = How.XPATH, using = SelectionnerLaCommune)
	public static WebElement selectionnerLaCommune;
	@FindBy(how = How.XPATH, using = LeVotre_BUTTON)
	public static WebElement leVotre_BUTTON;
	@FindBy(how = How.ID, using = Prenom_TEXT_BOX)
	public static WebElement prenom_TEXT_BOX;
	@FindBy(how = How.ID, using = Nom_TEXT_BOX)
	public static WebElement nom_TEXT_BOX;
	@FindBy(how = How.XPATH, using = Monsieur_BUTTON)
	public static WebElement nonsieur_BUTTON;
	@FindBy(how = How.ID, using = PrimaryBirthDate_day_TEXT_BOX)
	public static WebElement primaryBirthDate_day_TEXT_BOX;
	@FindBy(how = How.ID, using = PrimaryBirthDate_month_TEXT_BOX)
	public static WebElement primaryBirthDate_month_TEXT_BOX;
	@FindBy(how = How.ID, using = PrimaryBirthDate_year_TEXT_BOX)
	public static WebElement primaryBirthDate_year_TEXT_BOX;
	@FindBy(how = How.ID, using = PrimaryLicenceDate_day_TEXT_BOX)
	public static WebElement primaryLicenceDate_day_TEXT_BOX;
	@FindBy(how = How.ID, using = PrimaryLicenceDate_month_TEXT_BOX)
	public static WebElement primaryLicenceDate_month_TEXT_BOX;
	@FindBy(how = How.ID, using = PrimaryLicenceDate_year_TEXT_BOX)
	public static WebElement primaryLicenceDate_year_TEXT_BOX;
	@FindBy(how = How.XPATH, using = Oui_BUTTON)
	public static WebElement oui_BUTTON;
	@FindBy(how = How.XPATH, using = Profession_LIST)
	public static WebElement profession_LIST;
	@FindBy(how = How.XPATH, using = Salarie_BUTTON)
	public static WebElement salarie_BUTTON;
	@FindBy(how = How.XPATH, using = JeVisEnCouple_BUTTON)
	public static WebElement jeVisEnCouple_BUTTON;
	@FindBy(how = How.XPATH, using = Jamais_BUTTON)
	public static WebElement jamais_BUTTON;
	@FindBy(how = How.XPATH, using = Non_BUTTON)
	public static WebElement nom_BUTTON;
	@FindBy(how = How.XPATH, using = Assurance_day_TEXT_BOX)
	public static WebElement assurance_day_TEXT_BOX;
	@FindBy(how = How.XPATH, using = Assurance_month_TEXT_BOX)
	public static WebElement assurance_month_TEXT_BOX;
	@FindBy(how = How.XPATH, using = Assurance_year_TEXT_BOX)
	public static WebElement assurance_year_TEXT_BOX;
	@FindBy(how = How.XPATH, using = Titulaire_BUTTON)
	public static WebElement titulaire_BUTTON;
	@FindBy(how = How.ID, using = Email_TEXT_BOX)
	public static WebElement email_TEXT_BOX;
	@FindBy(how = How.ID, using = Phone_TEXT_BOX)
	public static WebElement phone_TEXT_BOX;
	@FindBy(how = How.ID, using = Adresse_TEXT_BOX)
	public static WebElement adresse_TEXT_BOX;
	@FindBy(how = How.ID, using = AdresseAutocomplet_Button)
	public static WebElement adresseAutocomplet_Button;
	@FindBy(how = How.XPATH, using = Terminer_BUTTON)
	public static WebElement terminer_BUTTON;
	@FindBy(how = How.XPATH, using = Véhicule_TEXT_BOX)
	public static WebElement véhicule_TEXT_BOX;
	@FindBy(how = How.XPATH, using = Utilisation_TEXT_BOX)
	public static WebElement utilisation_TEXT_BOX;
	@FindBy(how = How.XPATH, using = Informations_Du_Titulaire_TEXT_BOX)
	public static WebElement informations_Du_Titulaire_TEXT_BOX;
	@FindBy(how = How.XPATH, using = Conducteurs_Conductrices_TEXT_BOX)
	public static WebElement conducteurs_Conductrices_TEXT_BOX;
	@FindBy(how = How.XPATH, using = DécouvrirMesOffres_Button)
	public static WebElement découvrirMesOffres_Button;
	@FindBy(how = How.XPATH, using = LaFormuleRecomandée_TEXT_BOX)
	public static WebElement laFormuleRecomandée_TEXT_BOX;

	/* Methods */
	public void AccepterLesCookies() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(cookies_BUTTON));
		Thread.sleep(1000);
		click(cookies_BUTTON);
	}

	public void SaisirLimmatriculation(String MAT) {
		writeText(licensePlate_TEXT_BOX, MAT);
	}

	public void CliquerSurRechercherBTN() {
		click(recherche_BUTTON);
	}

	public void VerifierLimmatriculation() {
		String expectedimmatriculation = "DY767RN";
		String actualimmatriculation = vehiculeImmatriculation_TEXT_BOX.getAttribute("value");
		Assert.assertEquals(expectedimmatriculation, actualimmatriculation);
	}

	public void VerifierMarqueDuVéhicule() {
		String expectedMarqueDuVéhicule = "RENAULT";
		String actualMarqueDuVéhicule = vehiculeMarque_TEXT_BOX.getAttribute("value");
		Assert.assertEquals(expectedMarqueDuVéhicule, actualMarqueDuVéhicule);
	}

	public void VerifierModèleDuVéhicule() {
		String expectedModèleDuVéhicule = "TWINGO";
		String actualModèleDuVéhicule = vehiculeModele_TEXT_BOX.getAttribute("value");
		Assert.assertEquals(expectedModèleDuVéhicule, actualModèleDuVéhicule);
	}

	public void VerifierPuissanceFiscale() {
		String expectedPuissanceFiscale = "5 CV";
		String actualPuissanceFiscale = vehiculePuissanceFiscale_TEXT_BOX.getAttribute("value");
		Assert.assertEquals(actualPuissanceFiscale, expectedPuissanceFiscale);
	}

	public void VerifierLeCarburant() {
		String expectedCarburant = "ESSENCE";
		String actualCarburant = vehiculeCarburant_TEXT_BOX.getAttribute("value");
		Assert.assertEquals(expectedCarburant, actualCarburant);
	}

	public void VerifierLaDateDeMiseEnCirculation() {
		String expectedDay = "09";
		String actualDay = vehiculeMiseEnCirculation_day_TEXT_BOX.getAttribute("value");
		String expectedMonth = "04";
		String actualMonth = vehiculeMiseEnCirculation_month_TEXT_BOX.getAttribute("value");
		String expectedYear = "2008";
		String actualyear = vehiculeMiseEnCirculation_year_TEXT_BOX.getAttribute("value");
		Assert.assertEquals(expectedDay, actualDay);
		Assert.assertEquals(expectedMonth, actualMonth);
		Assert.assertEquals(expectedYear, actualyear);
	}

	public void CliquerSurLaListeVersion() {
		js.executeScript("arguments[0].scrollIntoView();", version_LIST);
		click(version_LIST);
	}

	public void SelectionnerLaVersion() {
		version_LIST.sendKeys(Keys.DOWN);
		version_LIST.sendKeys(Keys.ENTER);
	}

	public void CliquerSurLeBoutonCommencer() {
		click(commencer_BUTTON);
	}

	public void SaisirLaDateDachat(String jour, String mois, String annee) throws InterruptedException {
		writeText(vehiculeAcquisition_day_TEXT_BOX, jour);
		writeText(vehiculeAcquisition_month_TEXT_BOX, mois);
		writeText(vehiculeAcquisition_year_TEXT_BOX, annee);
	}

	public void CliquerSurLeBoutonAchatComptant() {
		click(vehiculeFinancement_1_BUTTON);
	}

	public void CliquerSurLeBoutonNonSiLaVehiculeEstAssure() {
		click(vehiculeDejaAssure_0_BUTTON);
	}

	public void CliquerSurLeBoutonContinuer() {
		click(continuer_BUTTON);
	}

	public void CliquerSurLeBoutonPrive() {
		click(privé_BUTTON);
	}

	public void mettreLeMaxDeKilometrage() {
		WebElement slider = driver.findElement(By.xpath("//div[contains(@class,'Thumb_3WDPo3 Thumb_3WDPo3-0')]"));
		Action action = (Action) actions.dragAndDropBy(slider, 730, 0).build();
		action.perform();
	}

	public void CliquerSurLeBoutonDansLaRueOuDansUnParkingPublic() {
		click(dansLaRueOuDansUnParkingPublic_BUTTON);
	}

	public void parkingCodePostal_TEXT_BOX(String Post) {
		js.executeScript("arguments[0].scrollIntoView();", parkingCodePostal_TEXT_BOX);
		writeText(parkingCodePostal_TEXT_BOX, Post);
	}

	public void CliquerSurLaListeDesCommunes() {
		wait.until(ExpectedConditions.elementToBeClickable(choisirLaCommune_BUTTON));
		click(choisirLaCommune_BUTTON);
	}

	public void SelectionnerSannois() {
		wait.until(ExpectedConditions.elementToBeClickable(selectionnerLaCommune));
		click(selectionnerLaCommune);
	}

	public void CliquerSurLeBoutonLeVotre() {
		click(leVotre_BUTTON);
	}

	public void SaisirLePrenom(String Prenom) {
		writeText(prenom_TEXT_BOX, Prenom);
	}

	public void SaisirLeNom(String Nom) {
		writeText(nom_TEXT_BOX, Nom);
	}

	public void CliquerSurMComeCivilite() {
		click(nonsieur_BUTTON);
	}

	public void SaisirLaDateDeNaissance(String jourN, String moisN, String anneeN) throws InterruptedException {
		writeText(primaryBirthDate_day_TEXT_BOX, jourN);
		writeText(primaryBirthDate_month_TEXT_BOX, moisN);
		writeText(primaryBirthDate_year_TEXT_BOX, anneeN);
	}

	public void SaisirLaDateDObtentionDuPermis(String jourP, String moisP, String anneeP) throws InterruptedException {
		writeText(primaryLicenceDate_day_TEXT_BOX, jourP);
		writeText(primaryLicenceDate_month_TEXT_BOX, moisP);
		writeText(primaryLicenceDate_year_TEXT_BOX, anneeP);
	}

	public void CliquerSurLeBoutonOui() {
		click(oui_BUTTON);
	}

	public void CliquerSurLaListeDesProfissions() {
		wait.until(ExpectedConditions.elementToBeClickable(profession_LIST));
		click(profession_LIST);
	}

	public void SelectionnerSalariéCommeProfission() {
		wait.until(ExpectedConditions.elementToBeClickable(profession_LIST));
		click(salarie_BUTTON);
	}

	public void CliquerSurLeBoutonJeVisEnCouple() {
		click(jeVisEnCouple_BUTTON);
	}

	public void CliquerSurLeBoutonJamais() {
		click(jamais_BUTTON);
	}

	public void CliquerSurLeBoutonNon() {
		click(nom_BUTTON);
	}

	public void SaisirLaDateDacha(String jourV, String moisV, String anneeV) {
		writeText(assurance_day_TEXT_BOX, jourV);
		writeText(assurance_month_TEXT_BOX, moisV);
		writeText(assurance_year_TEXT_BOX, anneeV);
		assurance_year_TEXT_BOX.sendKeys(Keys.ESCAPE);
	}

	public void CliquerLeNomDuVisiteur() {
		click(titulaire_BUTTON);
	}

	public void SaisisLAdresseMail(String mail) {
		writeText(email_TEXT_BOX, mail);
	}

	public void SaisirLeNumeroDeTelephone(String phone) {
		writeText(phone_TEXT_BOX, phone);
	}

	public void SaisisLAdressePostale(String postale){
		writeText(adresse_TEXT_BOX, postale);
		wait.until(ExpectedConditions.elementToBeClickable(adresseAutocomplet_Button));
		click(adresseAutocomplet_Button);

	}

	public void CliquerSurLeBoutonTerminer(){
		wait.until(ExpectedConditions.elementToBeClickable(terminer_BUTTON));
		click(terminer_BUTTON);
	}

	public void VerifierLaVéhicule() {
		wait.until(ExpectedConditions.elementToBeClickable(véhicule_TEXT_BOX));
		String expectedVéhicule = "RENAULT · TWINGO · 09/04/2008";
		String actualVéhicule = véhicule_TEXT_BOX.getText();
		Assert.assertEquals(actualVéhicule, expectedVéhicule);
	}

	public void VerifierLUtilisation() {
		String expectedutilisation = "Privé · Parking public · 50000 km/an";
		String actualutilisation = utilisation_TEXT_BOX.getText();
		Assert.assertEquals(actualutilisation, expectedutilisation);
	}

	public void VerifierInformationsDuTitulaire() {
		String expectedinformations = "wajih werghi · 9 Rue Robert Bellec, 95110 Sannois, France · test@gmail.com · 0768832345";
		String actualinformations = informations_Du_Titulaire_TEXT_BOX.getText();
		Assert.assertEquals(actualinformations, expectedinformations);
	}

	public void VerifierConducteursConductrices() {
		String expectedconducteurs_Conductrices = "wajih werghi";
		String actualconducteurs_Conductrices = conducteurs_Conductrices_TEXT_BOX.getText();
		Assert.assertEquals(actualconducteurs_Conductrices, expectedconducteurs_Conductrices);
	}

	public void CliquerLeBoutonDécouvrirMesOffres() {
		click(découvrirMesOffres_Button);
	}

	public void VerifierLaFormuleRecomandée() {
		wait.until(ExpectedConditions.elementToBeClickable(laFormuleRecomandée_TEXT_BOX));
		String expectedlaFormuleRecomandée = "Nos recommandations";
		String actuallaFormuleRecomandée = laFormuleRecomandée_TEXT_BOX.getText();
		Assert.assertEquals(expectedlaFormuleRecomandée, actuallaFormuleRecomandée);
	}

}
