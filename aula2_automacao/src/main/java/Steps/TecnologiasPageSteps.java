package Steps;

import Page.TecnologiasPage;
import cucumber.api.java.pt.Entao;

public class TecnologiasPageSteps {
	
	TecnologiasPage tecnologiasPage = new TecnologiasPage();
	
	@Entao("o menu Tecnologias e exibido")
	public void menuTecnologiasExibido() {
		tecnologiasPage.validaAcessoMenuTecnologias();
	}
}
