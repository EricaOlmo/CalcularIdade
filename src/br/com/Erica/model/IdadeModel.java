package br.com.Erica.model;

/**
 *
 * @author Erica
 */
public class IdadeModel {
    
    private double nascimento; 
    private double atual; 

    public double getNascimento() {
        return nascimento;
    }

    public void setNascimento(double nascimento) {
        this.nascimento = nascimento;
    }

    public double getAtual() {
        return atual;
    }

    public void setAtual(double atual) {
        this.atual = atual;
    }

   public double getIdadeModel(){
       return atual - nascimento;
   }     
}
