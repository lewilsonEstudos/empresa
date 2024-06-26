package com.example.builderFuncionario;


import java.util.List;

import entity.Funcionario;
import enums.NivelProfissional;
import enums.Setor;

public class FuncionarioBuilder {
    private String nome;
    private List<String> telefones;
    private String endereco;
    private double salario;
    private Setor setor;
    private NivelProfissional nivelProfissional;

    public FuncionarioBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public FuncionarioBuilder setTelefones(List<String> telefones) {
        this.telefones = telefones;
        return this;
    }

    public FuncionarioBuilder setEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public FuncionarioBuilder setSalario(double salario) {
        this.salario = salario;
        return this;
    }

    public FuncionarioBuilder setSetor(Setor setor) {
        this.setor = setor;
        return this;
    }

    public FuncionarioBuilder setCargo(NivelProfissional nivelProfissional) {
        this.nivelProfissional = nivelProfissional;
        return this;
    }

    public Funcionario build() {
        return new Funcionario(nome, telefones, endereco, salario, setor, nivelProfissional);
    }
}
