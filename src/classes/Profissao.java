package classes;

import java.math.BigDecimal;

public class Profissao {
    private String nome;
    private String empresa;
    private BigDecimal salario;

    public Profissao(String nome, String empresa, BigDecimal salario) {
        this.nome = nome;
        this.empresa = empresa;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

}
