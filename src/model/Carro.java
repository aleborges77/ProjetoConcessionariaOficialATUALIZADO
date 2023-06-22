package model;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private double preco;
    private int quantidadeEmEstoque;
    private int codigo;


    public Carro(String marca, String modelo, int ano, String cor, double preco, int quantidadeEmEstoque, int codigo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;

    }

    public Carro(String marca, String modelo, int ano, String preto, double preco, int quantidadeEmEstoque) {
    }

    public static void add(Carro carro1) {
    }

    // Getters e setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public int getCodigo() {
        int codigo = 1;
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    // Método toString()

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", cor='" + cor + '\'' +
                ", preco=" + preco +
                ", quantidadeEmEstoque=" + quantidadeEmEstoque +
                ", codigo=" + codigo +
                '}';
    }
}
