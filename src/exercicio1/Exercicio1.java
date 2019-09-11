/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;



/**
 *
 * @author 20181cmq.ads0239
 */
public class Exercicio1 {

   
    public static void main(String[] args) {
       Aluno aluno = new Aluno();
     
       aluno.setNome("Joao");
       aluno.setCpf("123.456.789-01");
       aluno.setMatricula(12345);
       
       double[] notas = {6.0, 7.5, 8.3, 9.2};
       aluno.setNotas(notas);
       
       System.out.println("A media do aluno "+
               aluno.getNome() +
               " é " + aluno.media());
    }
}
