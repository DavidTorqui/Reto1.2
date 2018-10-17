package Reto1Segundo.Tasks;

import java.util.List;

import Reto1Segundo.Model.ValoresFormulario;
import Reto1Segundo.UserInterface.IngresarValores;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.type.Type;

public class DiligenciarFormulario implements Task{
	
	private List<ValoresFormulario> valoresformulario;

	public DiligenciarFormulario(List<ValoresFormulario> valoresformulario) {
		this.valoresformulario = valoresformulario;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(IngresarValores.BOTON_MENU));
		actor.attemptsTo(Click.on(IngresarValores.BOTON_SUBMENU));
		actor.attemptsTo(Enter.theValue(valoresformulario.get(0).getCodigo()).into(IngresarValores.CODIGO));
		actor.attemptsTo(Enter.theValue(valoresformulario.get(0).getCorreo()).into(IngresarValores.CORREO));
		actor.attemptsTo(Enter.theValue(valoresformulario.get(0).getContraseña()).into(IngresarValores.CONTRASEÑA));
		actor.attemptsTo(Enter.theValue(valoresformulario.get(0).getConfirmarcontraseña()).into(IngresarValores.CONFIRMAR_CONTRASEÑA));
		actor.attemptsTo(Type.theValue(valoresformulario.get(0).getFecha()).into(IngresarValores.FECHA));
		actor.attemptsTo(Enter.theValue(valoresformulario.get(0).getUrl()).into(IngresarValores.URL));
		actor.attemptsTo(Click.on(IngresarValores.CHECK));
		actor.attemptsTo(Enter.theValue(valoresformulario.get(0).getMinimocaracteres()).into(IngresarValores.MINIMO_CARACTER));
		actor.attemptsTo(Enter.theValue(valoresformulario.get(0).getMaximocaracteres()).into(IngresarValores.MAXIMO_CARACTER));
		actor.attemptsTo(Enter.theValue(valoresformulario.get(0).getValormenor()).into(IngresarValores.MINIMO_VALORES));
		actor.attemptsTo(Enter.theValue(valoresformulario.get(0).getValormayor()).into(IngresarValores.MAXIMO_VALORES));
		actor.attemptsTo(Click.on(IngresarValores.BOTON_VALIDAR));
	}
	
	public static DiligenciarFormulario valores(List<ValoresFormulario> valoresformulario) {
		return Tasks.instrumented(DiligenciarFormulario.class, valoresformulario);		
	}
}