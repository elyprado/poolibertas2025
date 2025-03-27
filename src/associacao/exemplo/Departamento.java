package associacao.exemplo;

import java.util.ArrayList;

public class Departamento {
    private String nome;
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
}
