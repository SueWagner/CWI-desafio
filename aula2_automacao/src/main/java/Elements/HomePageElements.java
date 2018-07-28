package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Utils.SeleniumUtils;

public class HomePageElements extends SeleniumUtils{
//criando e mapeando elementos
	@FindBy(css="[class='oportunidades']")
	public WebElement MENU_OPORTUNIDADES;
	
	@FindBy(css="[class='tecnologia']")
	public WebElement menuTecnologias;
}
