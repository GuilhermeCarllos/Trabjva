import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {

        Retangulo3[] vetRetangulos = new Retangulo3[5];


        vetRetangulos[0] = new Retangulo3(6.0, 12.0);
        vetRetangulos[1] = new Retangulo3(9.0, 37.0);
        vetRetangulos[2] = new Retangulo3(4.0, 36.0);
        vetRetangulos[3] = new Retangulo3(8.0, 24.0);
        vetRetangulos[4] = new Retangulo3(3.0, 10.0);


        System.out.println("Informações dos Retângulos antes da ordenação:");
        exibirInformacoes(vetRetangulos);


        Arrays.sort(vetRetangulos, (a, b) -> Double.compare(a.getArea(), b.getArea()));


        System.out.println("\nInformações dos Retângulos após a ordenação por área:");
        exibirInformacoes(vetRetangulos);


        Retangulo3[] vetRetangulosExpandido = new Retangulo3[vetRetangulos.length * 2];
        System.arraycopy(vetRetangulos, 0, vetRetangulosExpandido, 0, vetRetangulos.length);


        vetRetangulosExpandido[5] = new Retangulo3(3.0, 5.0);
        vetRetangulosExpandido[6] = new Retangulo3(9.0, 4.0);
        vetRetangulosExpandido[7] = new Retangulo3(2.0, 8.0);
        vetRetangulosExpandido[8] = new Retangulo3(7.0, 5.0);
        vetRetangulosExpandido[9] = new Retangulo3(6.0, 9.0);


        System.out.println("\nInformações dos Retângulos após a expansão do vetor:");
        exibirInformacoes(vetRetangulosExpandido);
    }


    public static void exibirInformacoes(Retangulo3[] vetRetangulos) {
        for (int i = 0; i < vetRetangulos.length; i++) {
            if (vetRetangulos[i] != null) {
                System.out.println("\nRetângulo " + (i + 1) + ":");
                vetRetangulos[i].exibirInformacoes();
            }
        }
    }
}
