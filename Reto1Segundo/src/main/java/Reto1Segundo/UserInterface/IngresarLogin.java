package Reto1Segundo.UserInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl ("https://colorlib.com/polygon/metis/login.html")
public class IngresarLogin extends PageObject{
	public static final Target INGRESO_USUARIO = Target.the("INGRESA EL USUARIO").located(By.xpath("//*[@id=\"login\"]/form/input[1]"));
	public static final Target INGRESO_CONTRASEÑA = Target.the("INGRESA LA CONTRASEÑA").located(By.xpath("//*[@id=\"login\"]/form/input[2]"));
	public static final Target BOTON_INGRESAR = Target.the("BOTON DE INGRESAR").located(By.xpath("//*[@id=\"login\"]/form/button"));
}
