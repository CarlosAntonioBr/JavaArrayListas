package ArrayListasRespostas;

import java.util.ArrayList;
import java.util.List;

public class FiltragemPersonalizadaDeNomes {

	public static void main(String[] args)  {
		
		List <String> listaNomes = new ArrayList <> (); 
		listaNomes.add("Carlos");
		listaNomes.add("Raph");
		listaNomes.add("Ronaldo");
		listaNomes.add("Guilherme");
		
		char NomesDesejados ='R';
		
	      for (String nome : listaNomes) {
	            if (nome.charAt(0) == NomesDesejados) {
	                System.out.println("Nome que começa com R: " + nome);
	            }
	        }
	    }
	}