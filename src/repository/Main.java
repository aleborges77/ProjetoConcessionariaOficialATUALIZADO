package repository;

import model.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static Concessionaria concessionaria;
    private static List<Cliente> clientes;
    private static List<Carro> carros;
    private static List<Funcionario> funcionarios;
    private static Serasa serasa;

    public static void main(String[] args) {
        exibirMensagemBoasVindas();

        concessionaria = new Concessionaria("Concessionária de Luxo");
        clientes = new ArrayList<>();
        carros = new ArrayList<>();
        List<Servicos> servicos = new ArrayList<>();
        funcionarios = new ArrayList<>();
        serasa = new Serasa();

        // Criando alguns carros
        CarroDAO carroDAO = new CarroDAO();

        Carro carro1 = new Carro("BMW", "Série 7", 2022, "Preto", 550000.00, 1);
        Carro carro2 = new Carro("Mercedes-Benz", "Classe S", 2023, "Branco", 580000.00, 2);
        Carro carro3 = new Carro("Audi", "A8", 2023, "Prata", 350000.00, 4);
        Carro carro4 = new Carro("Lamborghini", "Aventador", 2022, "Amarelo", 5000000.00, 2);
        Carro carro5 = new Carro("Ferrari", "488 GTB", 2018, "Vermelho", 3500000.00, 1);
        Carro carro6 = new Carro("Porsche", "911 Turbo S", 2021, "Azul", 1800000.00, 3);
        Carro carro7 = new Carro("Rolls-Royce", "Phantom", 2023, "Branco", 3900000.00, 1);
        Carro carro8 = new Carro("Bentley", "Continental GT", 2022, "Cinza", 4400000.00, 1);

        carroDAO.add(carro1);
        carroDAO.add(carro2);
        carroDAO.add(carro3);
        carroDAO.add(carro4);
        carroDAO.add(carro5);
        carroDAO.add(carro6);


                carros.add(carro1);
        carros.add(carro2);
        carros.add(carro3);
        carros.add(carro4);
        carros.add(carro5);
        carros.add(carro6);
        carros.add(carro7);
        carros.add(carro8);

        // Criando alguns funcionários
        Funcionario funcionario1 = new Funcionario("João", "Vendedor", 5000.00);
        Funcionario funcionario2 = new Funcionario("Maria", "Gerente", 8000.00);
        Funcionario funcionario3 = new Funcionario("Pedro", "Vendedor", 4500.00);
        Funcionario funcionario4 = new Funcionario("Ana", "Vendedor", 4800.00);
        Funcionario funcionario5 = new Funcionario("Lucas", "Financeiro", 6000.00);
        Funcionario funcionario6 = new Funcionario("Juliana", "Marketing", 5500.00);
        Funcionario funcionario7 = new Funcionario("Gustavo", "Vendedor", 4700.00);
        Funcionario funcionario8 = new Funcionario("Carolina", "Vendedor", 4900.00);

        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);
        funcionarios.add(funcionario3);
        funcionarios.add(funcionario4);
        funcionarios.add(funcionario5);
        funcionarios.add(funcionario6);
        funcionarios.add(funcionario7);
        funcionarios.add(funcionario8);

        // Criando alguns clientes
        Cliente cliente1 = new Cliente("Pedro", "Rua A, 123", "123456789");
        Cliente cliente2 = new Cliente("Ana", "Rua B, 456", "987654321");
        Cliente cliente3 = new Cliente("Mariana", "Rua C, 789", "654987321");
        Cliente cliente4 = new Cliente("Rafael", "Rua D, 987", "789654321");
        Cliente cliente5 = new Cliente("Isabela", "Rua E, 654", "321456987");
        Cliente cliente6 = new Cliente("Thiago", "Rua F, 321", "987123456");
        Cliente cliente7 = new Cliente("Amanda", "Rua G, 951", "456789321");
        Cliente cliente8 = new Cliente("Gabriel", "Rua H, 159", "321789654");

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        clientes.add(cliente5);
        clientes.add(cliente6);
        clientes.add(cliente7);
        clientes.add(cliente8);

        // Criando alguns serviços
        Servicos servico1 = new Servicos("Lavação", 50.00);
        Servicos servico2 = new Servicos("Polimento", 100.00);
        Servicos servico3 = new Servicos("Troca de óleo", 80.00);

        servicos.add(servico1);
        servicos.add(servico2);
        servicos.add(servico3);

        exibirMenu();
    }

    private static void exibirMensagemBoasVindas() {
        JOptionPane.showMessageDialog(null, "Bem-vindo a Premium Cars",
                "Mensagem de Boas-vindas", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void exibirMenu() {
        boolean sair = false;

        while (!sair) {
            String opcao = JOptionPane.showInputDialog(
                    "Selecione uma opção:\n" +
                            "1 - Cadastrar Cliente\n" +
                            "2 - Adicionar Carro ao Estoque\n" +
                            "3 - Exibir Estoque\n" +
                            "4 - Realizar Venda\n" +
                            "5 - Sair");

            switch (opcao) {
                case "1":
                    cadastrarCliente();
                    
                    
                    break;
                case "2":
                    adicionarCarroEstoque();
                    break;
                case "3":
                    exibirEstoque();
                    exibirCarros();
                    
                    break;
                case "4":
                    realizarVenda();
                    break;
                case "5":
                    sair = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        }
    }

    private static void exibirCarros() {
    }

    private static void cadastrarCliente() {
        String nome = JOptionPane.showInputDialog("Informe o nome do cliente:");
        String endereco = JOptionPane.showInputDialog("Informe o endereço do cliente:");
        String telefone = JOptionPane.showInputDialog("Informe o telefone do cliente:");

        Cliente cliente = new Cliente(nome, endereco, telefone);
        clientes.add(cliente);

        JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
    }

    private static void adicionarCarroEstoque() {
        String marca = JOptionPane.showInputDialog("Informe a marca do carro:");
        String modelo = JOptionPane.showInputDialog("Informe o modelo do carro:");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do carro:"));
        String cor = JOptionPane.showInputDialog("Informe a cor do carro:");
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do carro:"));
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do carro:"));

        Carro carro = new Carro(marca, modelo, ano, cor, preco, codigo);
        carros.add(carro);

        JOptionPane.showMessageDialog(null, "Carro adicionado ao estoque com sucesso!");
    }

    private static void exibirEstoque() {
        StringBuilder estoque = new StringBuilder();
        estoque.append("Estoque:\n");

        for (Carro carro : carros) {
            estoque.append(carro.toString()).append("\n");
        }

        JOptionPane.showMessageDialog(null, estoque.toString());
    }

    private static void realizarVenda() {
        int codigoCarro = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do carro que deseja vender:"));
        Carro carro = buscarCarroPorCodigo(codigoCarro);

        if (carro != null) {
            String cpfCliente = JOptionPane.showInputDialog("Informe o CPF do cliente:");
            Cliente cliente = buscarClientePorCPF(cpfCliente);

            if (cliente != null) {
                if (!serasa.verificarClienteNegativado(cliente)) {
                    Funcionario vendedor = selecionarVendedor();

                    if (vendedor != null) {
                        double valorVenda = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da venda:"));

                        Venda venda = new Venda(carro, cliente, vendedor, valorVenda);
                        concessionaria.registrarVenda(venda);

                        carros.remove(carro);

                        JOptionPane.showMessageDialog(null, "Venda realizada com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Nenhum vendedor disponível.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Cliente negativado no SPC. Venda não autorizada.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Carro não encontrado.");
        }
    }

    private static Carro buscarCarroPorCodigo(int codigo) {
        for (Carro carro : carros) {
            if (carro.getCodigo() == codigo) {
                return carro;
            }
        }
        return null;
    }

    private static Cliente buscarClientePorCPF(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    private static Funcionario selecionarVendedor() {
        String[] vendedores = new String[funcionarios.size()];
        for (int i = 0; i < funcionarios.size(); i++) {
            vendedores[i] = funcionarios.get(i).getNome();
        }

        String nomeVendedor = (String) JOptionPane.showInputDialog(null, "Selecione o vendedor:",
                "Selecionar Vendedor", JOptionPane.QUESTION_MESSAGE, null, vendedores, vendedores[0]);

        for (Funcionario vendedor : funcionarios) {
            if (vendedor.getNome().equals(nomeVendedor)) {
                return vendedor;
            }
        }

        return null;
    }
}