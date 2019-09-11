package exercicio1;


import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20181cmq.ads0239
 */
public class Aluno {
    
    private String nome;
    private String cpf;
    private int matricula;
    private LocalDate dataNacimento;
    private int idade;
    private double notas[];
    
    
    public Aluno() {
        this.nome = "";
        this.cpf = "00.000.000-00";
        this.matricula = 0;
        this.idade = 0;
        this.notas = new double[4];
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

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(LocalDate dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    public void alteraNome (String nome) {
        this.nome = nome;
    }
  
    public double media() {
        double soma = 0.0;
        
        for (double nota : this.notas){
            soma += nota;
        }
        double media = soma / this.notas.length;
        
        return media;
        
        }
    }
