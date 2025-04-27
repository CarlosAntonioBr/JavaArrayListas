package ArrayListasRespostas;
import java.util.ArrayList;
import java.util.List;
public class VerificarElementosDuplicados {

	public static void main(String[] args) {

		        List<Integer> numeros = new ArrayList<>();
		        numeros.add(10);
		        numeros.add(66);
		        numeros.add(5);
		        numeros.add(3);
		        numeros.add(9);
		        numeros.add(5);
		        numeros.add(7);
		        numeros.add(20);
		        numeros.add(23);
		        numeros.add(45);
		        
		        List<Integer> numerosPares = new ArrayList<>();

		        for (int numero : numeros) {
		            if (numero % 2 == 0) {
		                numerosPares.add(numero);
		            }
		        }
		        
		        System.out.println("Lista de números: " + numeros);
		        System.out.println("Números pares: " + numerosPares);
		        
		    }
}
