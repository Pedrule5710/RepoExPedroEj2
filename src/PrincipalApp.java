import java.util.*;

public class PrincipalApp {
	public static void main(String args[]) {
		ArrayList<Integer> edades = new ArrayList<Integer>();
		edades.add(15);
		edades.add(44);
		edades.add(58);
		edades.add(68);
		edades.add(32);
		edades.add(74);
		edades.add(14);
		edades.add(147);
		edades.add(78);
		
		AnalisisEdad prueba = new AnalisisEdad(edades);
		prueba.comprobar(edades);

	}

}
