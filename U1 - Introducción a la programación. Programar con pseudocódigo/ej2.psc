Algoritmo ej2
	Definir posicion Como Entero;
	Escribir "Por favor introduzca un numero entero positivo";
	Leer num; //Pido al usuario el numero.
	Escribir "El numero introducido es :" num;
	Escribir "Introduzca la posicion dentro del numero";
	Leer posicion; //Pido al usuario la posicion.
	Escribir "La posicion introducida es: " posicion; 
	Escribir "Escribe el numero a sustituir";
	Leer nuevoNum; //Pido al usuario el numero nuevo.
	Escribir "El numero a sutituir es: " nuevoNum;
	
	Para i<-0 Hasta Longitud(num) Con Paso 1 Hacer //Bucle para que escriba el numero sin saltar.
		Si (i <> posicion) Entonces //Si la iteracion no coincide con la posicion escribe el numero como hasta ahora.
			Escribir Sin Saltar Subcadena(num, i, i);
		Fin Si
		Si (i == posicion) Entonces // Si la iteracion coincide con la posicion, escribe en esa posicion el numero nuevo.
			Escribir Sin Saltar nuevoNum;
		Fin Si
	Fin Para
	
	
FinAlgoritmo
