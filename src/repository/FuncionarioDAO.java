package repository;

import model.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {
    private List<Funcionario> funcionarios;

    public FuncionarioDAO() {
        this.funcionarios = new ArrayList<>();
    }

    public void salvar(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void atualizar(Funcionario funcionario) {
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getNome().equals(funcionario.getNome())) {
                funcionarios.set(i, funcionario);
                break;
            }
        }
    }

    public void excluir(Funcionario funcionario) {
        funcionarios.removeIf(f -> f.getNome().equals(funcionario.getNome()));
    }

    public List<Funcionario> listar() {
        return new ArrayList<>(funcionarios);
    }
}
