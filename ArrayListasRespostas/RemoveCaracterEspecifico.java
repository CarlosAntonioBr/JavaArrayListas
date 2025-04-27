package ArrayListasRespostas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class RemoveCaracterEspecifico {

	public static void main(String[] args) {
		        
        Scanner sc = new Scanner(System.in);

        List<String> palavras = new ArrayList<>();
        palavras.add("Banana");
        palavras.add("Maçã");
        palavras.add("Abacate");
        palavras.add("Manga");

        System.out.println("Palavras originais: " + palavras);

        System.out.print("Digite uma letra: ");
        String letra = sc.nextLine();

        List<String> novaLista = new ArrayList<>();

        for (String palavra : palavras) {
            boolean temLetra = false;

            for (int i = 0; i < palavra.length(); i++) {
                char letraDaPalavra = palavra.charAt(i);

                if (letraDaPalavra == letra.charAt(0)) {
                    temLetra = true;
                    break;
                }
            }

            if (temLetra == false) {
                novaLista.add(palavra);
            }
        }


        System.out.println("Palavras depois da filtragem: " + novaLista);
        
        sc.close();


	}

}
