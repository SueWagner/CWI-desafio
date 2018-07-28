package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Utils.SeleniumUtils;

public class TecnologiasPageElements extends SeleniumUtils{
	
	@FindBy(css="[class='section-title']")
	public WebElement acessouMenuTecnologias;
}
