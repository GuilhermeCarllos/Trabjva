import java.util.Scanner;

public class Main2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        Retangulo[] vetRetangulos = new Retangulo[5];

        for (int i = 0; i < vetRetangulos.length; i++) {
            System.out.println("Digite as dimensões do retângulo " + (i + 1) + ":");

            System.out.print("Largura: ");
            double largura = scanner.nextDouble();

            System.out.print("Altura: ");
            double altura = scanner.nextDouble();

            vetRetangulos[i] = new Retangulo(largura, altura);
        }

        System.out.println("\nInformações dos Retângulos:");
        for (int i = 0; i < vetRetangulos.length; i++) {
            System.out.println("\nRetângulo " + (i + 1) + ":");
            vetRetangulos[i].exibirInformacoes();
        }

        Retangulo maiorAreaRetangulo = vetRetangulos[0];
        for (Retangulo retangulo : vetRetangulos) {
            if (retangulo.calcularArea() > maiorAreaRetangulo.calcularArea()) {
                maiorAreaRetangulo = retangulo;
            }
        }
        System.out.println("\nRetângulo maior área:");
        maiorAreaRetangulo.exibirInformacoes();

        Retangulo menorPerimetroRetangulo = vetRetangulos[0];
        for (Retangulo retangulo : vetRetangulos) {
            if (retangulo.calcularPerimetro() < menorPerimetroRetangulo.calcularPerimetro()) {
                menorPerimetroRetangulo = retangulo;
            }
        }
        System.out.println("\nRetângulo menor perímetro:");
        menorPerimetroRetangulo.exibirInformacoes();

        scanner.close();
    }
}
