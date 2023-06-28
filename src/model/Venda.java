package model;

public class Venda {
    private Carro carro;
    private Cliente cliente;
    private Funcionario vendedor;
    private double valorVenda;

    public Venda(Carro carro, Cliente cliente, Funcionario vendedor, double valorVenda) {
        this.carro = carro;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.valorVenda = valorVenda;
    }

    public Venda(Carro carro, Cliente cliente, double valorVenda) {

    }

    public Carro getCarro() {
        return carro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Funcionario getVendedor() {
        return vendedor;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "carro=" + carro +
                ", cliente=" + cliente +
                ", vendedor=" + vendedor +
                ", valorVenda=" + valorVenda +
                '}';
    }
}
