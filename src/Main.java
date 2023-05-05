import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("=========================================================");
        System.out.println("Exemplo do calculo do retangulo com funções");
        System.out.println("=========================================================");

        calcularSomaAreas();


        System.out.println("=========================================================");
        System.out.println("Exemplo de mostrar lista de números com funções");
        System.out.println("=========================================================");
        mostrarTodosOsValoresListaNumero(retornarListaNumeros());


        System.out.println("=========================================================");
        List<Integer> listaNumerosArray = retornarListaNumeros();
        mostrarTodosOsValoresListaNumero(listaNumerosArray);


        System.out.println("=========================================================");
        System.out.println("Exemplo de mostrar lista de quantidade de nomes com funções");


        System.out.println("=========================================================");
        List<String> listaNomesComQuantidade = mostrarNomesComPosicao(retornarListaNumeros());
        System.out.println("Exemplo de array = " + listaNomesComQuantidade);
    }

    public static double calcularAreaRetanguloComInputUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base: ");
        double base = scanner.nextDouble();

        System.out.println("Digite a altura: ");
        double altura = scanner.nextDouble();

        double areaRetangulo = base * altura;
        System.out.println("O valor da área é de " + areaRetangulo);

        return areaRetangulo;
    }
    public static void calcularSomaAreas() {

        double somaAreas = calcularAreaRetanguloComInputUsuario() + calcularAreaRetanguloComInputUsuario();
        System.out.println("A somatoria da area total é de: " + somaAreas);
    }
    public static List<Integer> retornarListaNumeros() {
        List<Integer> listaNumero = new ArrayList<>();
        listaNumero.add(1);
        listaNumero.add(2);
        listaNumero.add(3);
        return listaNumero;
    }

    public static void mostrarTodosOsValoresListaNumero(List<Integer> numeros) {
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
    }
    public static List<String> mostrarNomesComPosicao(List<Integer> quantidade) {
        List<String> nomesExibir = new ArrayList<>();
        for (int i = 0; i < quantidade.size(); i++) {
            nomesExibir.add(quantidade.get(i) +" nomes");
            System.out.println(nomesExibir.get(i));
        }
        return nomesExibir;
    }
}