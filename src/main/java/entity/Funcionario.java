package entity;

import java.util.List;

import enums.NivelProfissional;
import enums.Setor;

public class Funcionario {
    private String nome;
    private List<String> telefones;
    private String endereco;
    private double salario;
    private Setor setor;
    private NivelProfissional nivelProfissional;

    // Constructor
    public Funcionario(String nome, List<String> telefones, String endereco, double salario, Setor setor, NivelProfissional nivelProfissional) {
        this.nome = nome;
        this.telefones = telefones;
        this.endereco = endereco;
        this.salario = salario;
        this.setor = setor;
        this.nivelProfissional = nivelProfissional;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public List<String> getTelefones() { return telefones; }
    public void setTelefones(List<String> telefones) { this.telefones = telefones; }
    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
    public Setor getSetor() { return setor; }
    public void setSetor(Setor setor) { this.setor = setor; }
    public NivelProfissional getCargo() { return nivelProfissional; }
    public void setCargo(NivelProfissional nivelProfissional) { this.nivelProfissional = nivelProfissional; }
}