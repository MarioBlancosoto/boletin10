
package ejerciciocontabanco;

import javax.swing.JOptionPane;

/**
 *
 * @author Brais
 */
public class Banco {
    
    private String nome;
    private double saldo;
    private String numConta;
   
    public Banco(){
        
    }
    public Banco (String n, double s, String conta){
        this.nome = n;
        this.saldo = s;
        this.numConta = conta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingresar (double cartos){
        if (cartos>0){
        saldo = saldo + cartos;
       }
        else {
            System.out.println("O importe a ingresar non pode ser negativo ");
        }
    }
        public void retirar (double cartos){
        if (saldo>0){
        saldo = saldo - cartos;
        }
        else {
                System.out.println("Non dispón de cartos para retirar");
    }
    }
    public void visualizarSaldo (){
        System.out.println(("O seu saldo é de ")+ saldo + " euros");
        }
    
    public void transferencia(String contaDestino, double importe){
        if (saldo>0){
            System.out.println("Transfírense " + importe + " euros á " + contaDestino);
        }
        else {
            System.out.println("Non dispón de cartos para transferir");
        }
    
}

}    

    

    
    

