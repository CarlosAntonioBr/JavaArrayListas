package ArrayListasRespostas;
import java.util.ArrayList;
import java.util.List;
public class SomaMediaNumeros {

	public static void main(String[] args) {

		        List<Integer> numeros = new ArrayList<>();
		        numeros.add(10);
		        numeros.add(20);
		        numeros.add(30);
		        numeros.add(40);
		        numeros.add(50);
		        numeros.add(60);
		        numeros.add(70);
		        numeros.add(80);
		        numeros.add(90);
		        numeros.add(100);

		        int soma = 0;

		        for (int numero : numeros) {
		            soma += numero;
		        }

		        double media = (double) soma / numeros.size();

		        System.out.println("Lista de números: " + numeros);
		        System.out.println("Soma: " + soma);
		        System.out.println("Média: " + media);
		        System.out.println();
		    }


}
