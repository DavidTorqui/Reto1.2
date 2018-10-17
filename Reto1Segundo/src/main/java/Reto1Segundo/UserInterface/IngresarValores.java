package Reto1Segundo.UserInterface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class IngresarValores {

	public static final Target BOTON_MENU = Target.the("INGRESA AL MENU ")
			.located(By.xpath("//*[@id=\"menu\"]/li[6]/a"));
	public static final Target BOTON_SUBMENU = Target.the("INGRESA AL SUB MENU BLOCKVALIDATION")
			.located(By.xpath("//*[@id=\"menu\"]/li[6]/ul/li[2]/a"));
	public static final Target CODIGO = Target.the("INGRESA EL CODIGO AL FORMULARIO ")
			.located(By.xpath("//*[@id=\"required\"]"));
	public static final Target CORREO = Target.the("INGRESA EL CORREO AL FORMULARIO")
			.located(By.xpath("//*[@id=\"email\"]"));
	public static final Target CONTRASEÑA = Target.the("INGRESA LA CONTRASEÑA AL FORMULARIO ")
			.located(By.xpath("//*[@id=\"password\"]"));
	public static final Target CONFIRMAR_CONTRASEÑA = Target.the("INGRESA LA CONFIRMACION DE LA CONTRASEÑA AL FORMULARIO")
			.located(By.xpath("//*[@id=\"confirm_password\"]"));
	public static final Target FECHA = Target.the("INGRESALA FECHA AL FORMULARIO ")
			.located(By.xpath("//*[@id=\"date\"]"));
	public static final Target URL = Target.the("INGRESA LA URL AL FORMULARIO")
			.located(By.xpath("//*[@id=\"url\"]"));
	public static final Target CHECK = Target.the("SELECCIONA EL CHECK ")
			.located(By.xpath("//*[@id=\"agree\"]"));
	public static final Target MINIMO_CARACTER = Target.the("INGRESA LOS DIGITOS AL FORMULARIO ")
			.located(By.xpath("//*[@id=\"minsize\"]"));
	public static final Target MAXIMO_CARACTER = Target.the("INGRESA EL RANGO AL FORMULARIO")
			.located(By.xpath("//*[@id=\"maxsize\"]"));
	public static final Target MINIMO_VALORES = Target.the("INGRESA LOS DIGITOS AL FORMULARIO ")
			.located(By.xpath("//*[@id=\"minNum\"]"));
	public static final Target MAXIMO_VALORES = Target.the("INGRESA EL RANGO AL FORMULARIO")
			.located(By.xpath("//*[@id=\"maxNum\"]"));
	public static final Target BOTON_VALIDAR = Target.the("BOTON DE VALIDACION ")
			.located(By.xpath("//*[@id=\"inline-validate\"]/div[12]/input"));
	public static final Target MENSAJE_ERROR = Target.the("MENSAJE DE ERROR EN FORMULARIO")
			.located(By.xpath("//*[@class='help-block col-lg-6']"));
}
