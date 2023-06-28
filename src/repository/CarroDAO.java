package repository;

import model.Carro;
import java.util.ArrayList;
import java.util.List;

public class CarroDAO {
    private List<Carro> carros;
    private Carro carro1;

    public CarroDAO() {
        this.carros = new ArrayList<>();
    }

    public void adicionarCarro(Carro carro) {
        carros.add(carro);
    }

    public void removerCarro(Carro carro) {
        carros.remove(carro);
    }

    public Carro buscarCarroPorCodigo(int codigo) {
        for (Carro carro : carros) {
            if (carro.getCodigo() == codigo) {
                return carro;
            }
        }
        return null;
    }

    public List<Carro> buscarCarrosPorMarca(String marca) {
        List<Carro> carrosPorMarca = new ArrayList<>();
        for (Carro carro : carros) {
            if (carro.getMarca().equalsIgnoreCase(marca)) {
                carrosPorMarca.add(carro);
            }
        }
        return carrosPorMarca;
    }

    public List<Carro> buscarCarrosPorAno(int ano) {
        List<Carro> carrosPorAno = new ArrayList<>();
        for (Carro carro : carros) {
            if (carro.getAno() == ano) {
                carrosPorAno.add(carro);
            }
        }
        return carrosPorAno;
    }

    public List<Carro> buscarCarrosPorPreco(double preco) {
        List<Carro> carrosPorPreco = new ArrayList<>();
        for (Carro carro : carros) {
            if (carro.getPreco() <= preco) {
                carrosPorPreco.add(carro);
            }
        }
        return carrosPorPreco;
    }

    // Outros métodos de busca e manipulação de carros

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    public void add(Carro carro1) {
    }

    public Carro getCarroByCodigo(int codigoCarro) {
        return carro1;

    }
}
