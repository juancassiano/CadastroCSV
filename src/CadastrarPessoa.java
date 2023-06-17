import classes.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class CadastrarPessoa {


    private static String getValorOuPadrao(String valor, String padrao) {
        return (valor != null && !valor.isEmpty()) ? valor : padrao;
    }

    public static void main(String[] args) {

        try{

        LocalDate dataNascimento = LocalDate.of(1993,10,11);

        Endereco endereco = new Endereco("Rua Cruz das Almas", "208",null,"Nova Iguaçu","Nova Iguaçu", Estado.RJ);

        Contato contato = new Contato("juancassiano@hotmail.com",null, "21983015177", Boolean.TRUE);

        Profissao profissao = new Profissao("Desenvolvedor Java", "Oracle", new BigDecimal(3570));

        List<String> habilidades = new ArrayList<>();
        habilidades.add("Java 8");
        habilidades.add("Spring");
        habilidades.add("API");
        habilidades.add("Github");

        Pessoa cassiano = new Pessoa("Cassiano","11111111111",dataNascimento, Sexo.MASCULINO, "Estudante",endereco, contato, profissao, habilidades, new BigDecimal(2000), new BigDecimal(7000));
        List<Pessoa> candidatos = new ArrayList<>();
        candidatos.add(cassiano);


        Path arquivoDestino = Paths.get("/home/juancassiano/Documentos/cadastro.csv");
        boolean arquivoExiste = Files.exists(arquivoDestino);

        if(!arquivoExiste){
            Files.createFile(arquivoDestino);
        }
        StringBuilder cadastroCandidato = new StringBuilder();

        if (!arquivoExiste) {
            cadastroCandidato.append("Nome;CPF;Data de Nascimento;Sexo;Emprego Atual;Logradouro;Número;Complemento;Bairro;Cidade;Estado;Nome Profissão;Empresa;Salário;E-mail;Telefone Residencial;Telefone Celular;Whatsapp;Pretensão Salarial Mínima;Pretensão Salarial Máxima;Habilidade 1;Habilidade 2;Habilidade 3;Habilidade 4;");
            cadastroCandidato.append(System.lineSeparator());
        }

        for(Pessoa candidato: candidatos){
            cadastroCandidato.append(candidato.getNome()).append(";");
            cadastroCandidato.append(candidato.getCpf()).append(";");
            cadastroCandidato.append(candidato.getDataNascimento()).append(";");
            cadastroCandidato.append(candidato.getSexo()).append(";");
            cadastroCandidato.append(candidato.getEmpregoAtual()).append(";");

            cadastroCandidato.append(candidato.getEndereco().getLogradouro()).append(";");
            cadastroCandidato.append(getValorOuPadrao(candidato.getEndereco().getNumero(), "S/N")).append(";");
            cadastroCandidato.append(getValorOuPadrao(candidato.getEndereco().getComplemento(), "SEM COMPLEMENTO")).append(";");
            cadastroCandidato.append(candidato.getEndereco().getBairro()).append(";");
            cadastroCandidato.append(candidato.getEndereco().getCidade()).append(";");
            cadastroCandidato.append(candidato.getEndereco().getEstado()).append(";");

            cadastroCandidato.append(candidato.getProfissao().getNome()).append(";");
            cadastroCandidato.append(candidato.getProfissao().getEmpresa()).append(";");
            cadastroCandidato.append("R$").append(candidato.getProfissao().getSalario()).append(";");

            cadastroCandidato.append(candidato.getContato().getEmail()).append(";");
            cadastroCandidato.append(getValorOuPadrao(candidato.getContato().getTelefone(),"SEM RESIDENCIAL")).append(";");
            cadastroCandidato.append(candidato.getContato().getCelular()).append(";");
            cadastroCandidato.append(candidato.getContato().getCelularEWhatsapp()).append(";");


            cadastroCandidato.append("R$").append(candidato.getPretensaoSalarialMinimo()).append(";");

            cadastroCandidato.append("R$").append(candidato.getPretensaoSalarialMaximo()).append(";");

            List<String> habilidadesCSV = candidato.getHabilidades();
            for(String habilidade: habilidadesCSV){
                cadastroCandidato.append(habilidade).append(";");
            }
            cadastroCandidato.append(";");
            cadastroCandidato.append(System.lineSeparator());

        }

        Files.writeString(arquivoDestino, cadastroCandidato.toString(), StandardCharsets.UTF_8, StandardOpenOption.APPEND);


        }catch (IOException ex){
            throw new RuntimeException(ex);
        }

    }
}