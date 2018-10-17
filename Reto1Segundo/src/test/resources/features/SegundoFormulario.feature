#language:es
#Author: your.email@your.domain.com

@tag
Característica: Diligenciar el formulario de la pagina InlineValidation
								Como usuario
								Quiero ingresar los datos al formulario
								Para validar que quede registrado

	@tag1
  Escenario: Verificar el diligenciamiento de la pagina InlineValidation
  		Dado que david necesita ingresar a la pagina con usuario demo y contraseña demo
  		Cuando el realiza el registro del mismo en el aplicativo
  		| codigo | correo 					| contraseña | confirmarcontraseña | fecha	 		| url 									 | minimocaracteres | maximocaracteres | valormenor | valormayor |
  		| 123 	 | adtq15@gmail.com	| 12345678   | 12345678						 | 03-04-1997	| https://www.google.com |	1234    				|   123456			   | 6					| 15				 |
  		Entonces valida que no tenga mensaje de error

	@tag1
  Escenario: Verificar el diligenciamiento de la pagina InlineValidation
  		Dado que david necesita ingresar a la pagina con usuario demo y contraseña demo
  		Cuando el realiza el registro del mismo en el aplicativo
  		| codigo | correo 					| contraseña | confirmarcontraseña | fecha	 		| url 									 | minimocaracteres | maximocaracteres | valormenor | valormayor |
  		| 		 	 | adtq15@gmail.com	| 12345678   | 12345678						 | 03-04-1997	| https://www.google.com |	1234    				|   123456			   | 6					| 15				 |
  		Entonces valida que tenga mensaje de error
