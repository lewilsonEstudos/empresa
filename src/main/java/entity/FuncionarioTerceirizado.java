package entity;

import java.util.List;

import enums.NivelProfissional;
import enums.Setor;

public class FuncionarioTerceirizado extends Funcionario {
    private String empresaContratada;
    private int tempoPrevistoPermanencia;

    public FuncionarioTerceirizado(String nome, List<String> telefones, String endereco, double salario, Setor setor, NivelProfissional nivelProfissional, String empresaContratada, int tempoPrevistoPermanencia) {
        super(nome, telefones, endereco, salario, setor, nivelProfissional);
        this.empresaContratada = empresaContratada;
        this.tempoPrevistoPermanencia = tempoPrevistoPermanencia;
    }

    // Getters e Setters
    public String getEmpresaContratada() { return empresaContratada; }
    public void setEmpresaContratada(String empresaContratada) { this.empresaContratada = empresaContratada; }
    public int getTempoPrevistoPermanencia() { return tempoPrevistoPermanencia; }
    public void setTempoPrevistoPermanencia(int tempoPrevistoPermanencia) { this.tempoPrevistoPermanencia = tempoPrevistoPermanencia; }
}

