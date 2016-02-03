package workshop.bdd.fruitshop;

import static org.assertj.core.api.Assertions.assertThat;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FruitShopSteps {

	private int nb1;
	private int nb2;
	private int resultat;

	@Given("^le premier nombre est (\\d+)$")
	public void le_premier_nombre_est(int nb) {
		this.nb1 = nb;
	}

	@Given("^le second nombre est (\\d+)$")
	public void le_second_nombre_est(int nb) {
		this.nb2 = nb;
	}

	@When("^la somme est calculée$")
	public void la_somme_est_calculee() {
		this.resultat = calculerLaSomme(nb1, nb2);
	}

	@Then("^le résultat est (\\d+)$")
	public void le_resultat_est(int sommeAttendue) {
		assertThat(resultat).isEqualTo(sommeAttendue);
	}

	// Stub de code métier
	private int calculerLaSomme(int nb1, int nb2) {
		return nb1 + nb2;
	}

}
