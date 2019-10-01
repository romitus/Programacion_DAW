Algoritmo ej3
	Definir altura Como Entero;
	Leer altura;
	
	Mientras (altura % 2) =  0 o altura < 3 Hacer
		Escribir "Error el numero ha de ser mayor que 2 e impar"
		Leer altura; //Pido altura.
	Fin Mientras
	fila= altura;
	Para j<-1 Hasta altura /2 Con Paso 1 Hacer //Soy consciente que podra haber usado un solo bucle que vaya bajando,
		Para i<-1 Hasta fila Con Paso 1 Hacer  //he usado esta solucion por falta de tiempo ya que me suponia menor tiempo hacer
			Escribir Sin Saltar "*";           //los arreglos que borrar y poner un solo bucle.
		Fin Para                               //Este bucle hace la mitad del reloj de arena.
		fila = fila - 2;
		Escribir "";
	Fin Para
	
	Para j<- 1 Hasta (altura /2) + 1 Con Paso 1 Hacer //Este bucle hace la otra mitad del reloj.
		Para i<-1 Hasta fila Con Paso 1 Hacer
			Escribir Sin Saltar "*"
		Fin Para
		fila = fila + 2;
		Escribir "";
	Fin Para
	
FinAlgoritmo
