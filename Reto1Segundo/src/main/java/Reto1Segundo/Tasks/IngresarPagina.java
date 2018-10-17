package Reto1Segundo.Tasks;

import Reto1Segundo.UserInterface.IngresarLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarPagina implements Task{
	
	private String usuario;
	private String contraseña;
		
	public IngresarPagina(String usuario, String contraseña) {
		this.usuario = usuario;
		this.contraseña = contraseña;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(usuario).into(IngresarLogin.INGRESO_USUARIO));
		actor.attemptsTo(Enter.theValue(contraseña).into(IngresarLogin.INGRESO_CONTRASEÑA));
		actor.attemptsTo(Click.on(IngresarLogin.BOTON_INGRESAR));
	}
	
	public static IngresarPagina usuario(String usuario, String contraseña) {
		return Tasks.instrumented(IngresarPagina.class, usuario, contraseña);
	}
}