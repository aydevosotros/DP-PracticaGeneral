package AA;

import java.util.ArrayList;

/**
 * Tengo que implementar un metodo que sea getContorno(String) que me devuelva la
 *  categoría pertinente
 * @author antonio
 *
 */

public class Clasificadores {
	
	static ArrayList<Example> Editing(int k, ArrayList<Example> T){
		ArrayList<Example> S = new ArrayList<>(); // Subconjunto editado
		ArrayList<Example> R = new ArrayList<>(); // Mal clasificados por iteración
		
		Example pNN;
		
		for(Example p : S){
			if(!p.getClase().equals(p.getClasskNN(k, S)))
				R.add(p);
		}
		S.removeAll(R);
		return S;
	}
}
