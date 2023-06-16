package classes;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Pessoa {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private Sexo sexo;
    private String empregoAtual;
    private Endereco endereco;
    private Contato contato;
    private Profissao profissao;
    private List<String> habilidades;
    private BigDecimal pretensaoSalarialMinimo;
    private BigDecimal pretensaoSalarialMaximo;

    public Pessoa(String nome, String cpf, LocalDate dataNascimento, Sexo sexo, String empregoAtual, Endereco endereco, Contato contato, Profissao profissao, List<String> habilidades, BigDecimal pretencaoSalarialMinimo, BigDecimal pretencaoSalarialMaximo) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.empregoAtual = empregoAtual;
        this.endereco = endereco;
        this.contato = contato;
        this.profissao = profissao;
        this.habilidades = habilidades;
        this.pretensaoSalarialMinimo = pretencaoSalarialMinimo;
        this.pretensaoSalarialMaximo = pretencaoSalarialMaximo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getEmpregoAtual() {
        return empregoAtual;
    }

    public void setEmpregoAtual(String empregoAtual) {
        this.empregoAtual = empregoAtual;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    public BigDecimal getPretensaoSalarialMinimo() {
        return pretensaoSalarialMinimo;
    }

    public void setPretensaoSalarialMinimo(BigDecimal pretencaoSalarialMinimo) {
        this.pretensaoSalarialMinimo = pretencaoSalarialMinimo;
    }

    public BigDecimal getPretensaoSalarialMaximo() {
        return pretensaoSalarialMaximo;
    }

    public void setPretensaoSalarialMaximo(BigDecimal pretencaoSalarialMaximo) {
        this.pretensaoSalarialMaximo = pretencaoSalarialMaximo;
    }

}


