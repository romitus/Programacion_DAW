Algoritmo ej1
	Definir res, horas Como Entero;
	Escribir "Escribe las horas que trabajas";
	Leer horas;
	Si horas <= 40 Entonces //Si el trabajador trabaja hasta 40 horas se realizara este bloque.
		res= horas * 10;
		SiNo
			Si horas >= 41 Entonces //Si el trabajador trabaja mas de 40 horas se realizara este bloque.
				res= (40 * 10); //Se cuenta el sueldo hasta las 40 horas.
				
				Para i<-1 Hasta (horas-40) Con Paso 1 Hacer //Creamos un bucle que suma +15 a las horas restantes una vez superado 40.
					res = res + 15; 
				Fin Para
			FinSi
	Fin Si
	Escribir res; //Ejecutamos el resultado.
FinAlgoritmo
