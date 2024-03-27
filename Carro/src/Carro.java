public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocAtual;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocAtual = 0;
    }

    public void acelerando(int i) {
        if(i > 0) {
            velocAtual += i;
        }
    }

    public void desacelerando(int i) {
        if(d > 0 && velocAtual - d >= 0) {
            velocAtual -= d;
        } else {
            System.out.println("Erro: Velocidade negativa");
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public int getVelocAtual() {
        return velocAtual;
    }
}
