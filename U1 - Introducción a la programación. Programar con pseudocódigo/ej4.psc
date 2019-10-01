Algoritmo ej4
	Definir num, option Como Entero;
	Dimension num[20]; //Array de 20 numeros
	Para i<- 1 Hasta 20 Con Paso 1 Hacer //Introduzco en cada casilla del array un numero aleatorio entre 0 y 400
		num[i] = Aleatorio(0,400);
	Fin Para
	Escribir "Que multiplos queremos resaltar, los del 7 o los del 5"
	leer option // Leo del usuario la opcion elegida
	Segun option Hacer //Utilizo Switch  si bien es un menú pequeño es ideal para hacer elecciones de menu.
		5:
			Para i<-1 Hasta 20 Con Paso 1 Hacer //Resalta los multiplos del 5
				Si (num[i] % 5) == 0 Entonces
					Escribir Sin Saltar num[i] " ";
				Fin Si
			Fin Para
		7:
			Para i<-1 Hasta 20 Con Paso 1 Hacer //resalta los multiplos del 7
				Si (num[i] % 7) == 0 Entonces
					Escribir Sin Saltar num[i] " ";
				Fin Si
			Fin Para
		De Otro Modo: //Default en caso de que se ponga un numero diferente a 5 o 7
			Escribir "Error debes escribir 5 o 7";
	Fin Segun
FinAlgoritmo
