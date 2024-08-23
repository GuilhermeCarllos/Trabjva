public class Retangulo3 {
    // Atributos da classe
    private double largura;
    private double altura;

    // Construtor
    public Retangulo3(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    // Método para calcular a área
    public double calcularArea() {
        return largura * altura;
    }

    // Método para calcular o perímetro
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    // Método para exibir as informações
    public void exibirInformacoes() {
        System.out.println("Largura: " + largura);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }

    // Método para obter a área (utilizado para ordenação)
    public double getArea() {
        return calcularArea();
    }

    // Método para obter o perímetro (utilizado para ordenação)
    public double getPerimetro() {
        return calcularPerimetro();
    }
}
