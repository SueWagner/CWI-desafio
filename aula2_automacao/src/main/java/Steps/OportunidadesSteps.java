package Steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import Page.OportunidadesPage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Entao;

public class OportunidadesSteps {

	OportunidadesPage oportunidadespage = new OportunidadesPage();
	
	@Entao ("verifico se a vaga esta disponivel")
	public void verificaExistenciaDaVaga(DataTable vaga) {
		System.out.println("Entao verifico se a vaga esta disponivel.");
		List<Map<String,String>> data = vaga.asMaps(String.class,String.class);
		Assert.assertTrue("", oportunidadespage.verificaDisponibilidadeDaVaga(data.get(0).get("vaga")));
	}
}
