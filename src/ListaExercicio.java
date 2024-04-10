
import Exercicio.RegistroDeNomes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaExercicio {
    public static void main(String[] args) {

        listaSimplesOrdenada();
    }

    private static void listaSimplesOrdenada() {
        List<RegistroDeNomes> listaDeNomes = new ArrayList<RegistroDeNomes>();

        RegistroDeNomes a = new RegistroDeNomes("Bernardo Ferreira de Almeida");
        RegistroDeNomes b = new RegistroDeNomes("Abílio Nascimento dos Santos");
        RegistroDeNomes c = new RegistroDeNomes("Cristóvão Cruz Oliveira");

        listaDeNomes.add(a);
        listaDeNomes.add(b);
        listaDeNomes.add(c);

        Collections.sort(listaDeNomes);
        System.out.println(listaDeNomes);
    }
        }
