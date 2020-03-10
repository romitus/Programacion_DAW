package com.romitus;

public class Main {

    public static void main(String[] args) {
        //Hay 3 razas que serian grifon doberman y labradores.
        Propietarios pr1 = new Propietarios("Carlos","Munoz","1111111A","Espana");
        Propietarios pr2 = new Propietarios("Francisco","Perianez","2222222A","Espana");
        Propietarios pr3 = new Propietarios("Ilona","Koslak","3333333A","Polonia");
        Perros p1 = new Perros("Laly",3,3,true, pr1,"grifon");
        Perros p2 = new Perros("Tobi",4,4,true, pr2,"doberman");
        Perros p3 = new Perros("Larsy",2,2,true, pr3,"labrador");
        Perros p4 = new Perros("Luna",8,4,true, pr1,"grifon");
        Perros p5 = new Perros("Sol",3,3,true, pr2,"doberman");
        Perros p6 = new Perros("Ares",5,4,true, pr3,"labrador");
        Perros p7 = new Perros("Thor",1,2,true, pr1,"grifon");
        Perros p8 = new Perros("Kronos",6,4,true, pr2,"doberman");
        Perros p9 = new Perros("Atenea",4,3,true, pr3,"labrador");
        Perros p10 = new Perros("Poseidon",2,4,true, pr1,"grifon");
	    Concurso c1 = new Concurso("NombreEjemplo", "Castilleja");

	    c1.addDog("grifon",p1);
	    c1.addDog("doberman",p2);
        c1.addDog("labrador",p3);
        c1.addDog("grifon",p4);
        c1.addDog("doberman",p5);
        c1.addDog("labrador",p6);
        c1.addDog("grifon",p7);
        c1.addDog("doberman",p8);
        c1.addDog("labrador",p9);
        c1.addDog("grifon",p10);
	    c1.disqualifyDog(p5);
        c1.ownerDogs("1111111A");
        c1.guardarPerros();
        c1.cargarPerros();
    }
}
