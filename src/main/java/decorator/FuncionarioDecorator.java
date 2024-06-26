package decorator;

import entity.Funcionario;

public abstract class FuncionarioDecorator extends Funcionario {
    protected Funcionario funcionario;

    public FuncionarioDecorator(Funcionario funcionario) {
        super(funcionario.getNome(), funcionario.getTelefones(), funcionario.getEndereco(), funcionario.getSalario(), funcionario.getSetor(), funcionario.getCargo());
        this.funcionario = funcionario;
    }
}