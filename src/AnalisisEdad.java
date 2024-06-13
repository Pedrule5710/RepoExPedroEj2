import java.util.*;

public class AnalisisEdad {
	private ArrayList<Integer> edades = new ArrayList<Integer>();
	public AnalisisEdad(ArrayList<Integer> edades) {
		edades.add(15);
		edades.add(20);
		edades.add(12);
		edades.add(13);
		edades.add(9);
		edades.add(11);

	}
	
	public String comprobar(ArrayList<Integer> edades) {
		int suma=0, cuenta=0;
		for(int i =0; i<edades.size();i++) {
			if(edades.get(i)%2 == 0){
				suma=suma + edades.get(i);
			}else if(edades.get(i)%2 != 0) {
				cuenta = cuenta + 1;
			}
		}
		System.out.println("Suma de pares: " + suma + " ,recuento de impares: " + cuenta);
		
		
		return ("Suma de pares: " + suma + " ,recuento de impares: " + cuenta);
	}

}
