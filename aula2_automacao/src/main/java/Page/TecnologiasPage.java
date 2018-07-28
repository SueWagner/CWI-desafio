package Page;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import Elements.TecnologiasPageElements;
import Setup.TestRule;

public class TecnologiasPage extends TecnologiasPageElements{
	
	public TecnologiasPage() {
		driver = TestRule.getDriver();
		PageFactory.initElements(TestRule.getDriver(), this);
	}
	
	public void validaAcessoMenuTecnologias() {
		String texto = acessouMenuTecnologias.getText();
		Assert.assertTrue(texto.contains("tecnologia"));
	}
}
