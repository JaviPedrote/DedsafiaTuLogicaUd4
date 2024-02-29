import java.util.*;
public class Gestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			 
		Piloto piloto1 = new Piloto(1,"Pete Maverick",10000, "Capitán");
		
		Piloto piloto2 = new Piloto(2,"Natasha Phoenix",3000, "Teniente");
		
		Piloto piloto3 = new Piloto(3,"Bradley Rooster",3500, "Teniente");
		
		
		int pilot4=4;
		int pilot5=5;
		
		Scanner usuario=new Scanner(System.in);
		
		System.out.println("Introduce el nombre del piloto número 4 por favor");
		String nom4 = usuario.nextLine();
		
		System.out.println("Introduce las horas de vuelo del piloto número 4 por favor");
		int vuelo4= usuario.nextInt();
		usuario.nextLine();
		
		System.out.println("Introduce el rango para el piloto número 4 por favor");
		String rango4=usuario.nextLine();
		
		System.out.println("Introduce el nombre del piloto número 5 por favor");
	
		String nom5=usuario.nextLine();
		
		System.out.println("Introduce las horas de vuelo del piloto número 5 por favor");
		int vuelo5= usuario.nextInt();
		usuario.nextLine();
		
		System.out.println("Introduce el rango para el piloto número 5 por favor");
		String rango5=usuario.nextLine();
		
		Piloto piloto4 = new Piloto(pilot4,nom4,vuelo4,rango4);
		Piloto piloto5 = new Piloto(pilot5,nom5,vuelo5,rango5);
		
		piloto1.mostrarPiloto();
		piloto3.mostrarPiloto();
		piloto4.mostrarPiloto();
		piloto5.mostrarPiloto();
		
		
		Combate av1 = new Combate(1,2,piloto3,true);
		Combate av2 = new Combate(2,2,piloto5,true);
		Entrenamiento av3 = new Entrenamiento(3,3,piloto1,true);
		
		int avi4=4;
		int avi5=5;
		

		System.out.println("Introduce la capacidad para el avión numero 4");
		int cap4 = usuario.nextInt();
		usuario.nextLine();
		
		System.out.println("Escriba true si el avión4 dispone de doble mando, de lo contrario escriba false");
		boolean dob4= usuario.nextBoolean();
		
		System.out.println("Introduce la capacidad para el avión numero 5");
		int cap5 = usuario.nextInt();
		usuario.nextLine();
		
		System.out.println("Escriba true si el avión 5 dispone de doble mando, de lo contrario escriba false");
		boolean dob5= usuario.nextBoolean();
	
		
		Entrenamiento av4 = new Entrenamiento (avi4,cap4,piloto4,dob4);
		Entrenamiento av5 = new Entrenamiento (avi5,cap5,piloto2,dob5);
		
		av1.mostrarAvion();
		av2.mostrarAvion();
		av3.mostrarAvion();
		av4.mostrarAvion();
		av5.mostrarAvion();
	
	
		
		
		
		
		
		
	
		
		

	}

}

