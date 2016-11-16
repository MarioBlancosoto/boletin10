/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10;

import javax.swing.JOptionPane;

/**
 *
 * @author ytaly
 */
public class Xogo {
    
    public void Xogo(){
   
        
    }
    
    
public void unContraUn(){
    
int adivinar,num,valorAb,nIntentos; 
     
      num = Integer.parseInt(JOptionPane.showInputDialog("Xogador 1 introduce o número a adiviñar,debe ser entre 1 e 50 ")); 
      nIntentos = Integer.parseInt(JOptionPane.showInputDialog(" Introduce o número de intentos ")); 
    do{
       adivinar = Integer.parseInt(JOptionPane.showInputDialog("Xogador 2 introduce o número,tes "+nIntentos+ " intentos"));    
       if(nIntentos<0){
           
         JOptionPane.showMessageDialog(null," Quedache sen intentos");
          System.exit(nIntentos);
           }   
       nIntentos--;
        valorAb = Math.abs(num-adivinar);
     
        if(valorAb>=20){
        JOptionPane.showMessageDialog(null," Demasiado lonxe,volve intentalo ");
        }else if(valorAb>=9){
             JOptionPane.showMessageDialog(null," case ,volve intentalo ");
        }else if(valorAb>5){
            JOptionPane.showMessageDialog(null," Estiveche moy preto ");
        }           
    }while(num!=adivinar);
    JOptionPane.showMessageDialog(null," Acertache!,noraboa ");
    
    }
    

public void tiVsCpu(){


    int adivinar,num,valorAb,nIntentos; 
    int nAleatorio = (int) (Math.random()* (1-50)+50);
      
         
        nIntentos = Integer.parseInt(JOptionPane.showInputDialog(" Introduce o número de intentos "));
    do{       
      JOptionPane.showMessageDialog(null,"Te quedan "+nIntentos+ " Intentos");
      num = Integer.parseInt(JOptionPane.showInputDialog(" Adiviña o número ,debe ser entre 1 e 50 "));
        
       if(nIntentos<=0){         
         JOptionPane.showMessageDialog(null," Quedache sen intentos");
          System.exit(nIntentos);
           }   
       
         nIntentos--;
      
        valorAb = Math.abs(num-nAleatorio);
      if (valorAb>20){
          JOptionPane.showMessageDialog(null,"Demasiado lonxe");
      }else if(valorAb>=10&&valorAb<=20){
        JOptionPane.showMessageDialog(null," lonxe,volve intentalo ");
        }else if(valorAb>=10&&valorAb<=5){
             JOptionPane.showMessageDialog(null," preto ,volve intentalo ");
        }else if(valorAb<=5){
            JOptionPane.showMessageDialog(null," Estiveche moy preto,proba de novo ");
           }
              else
            JOptionPane.showMessageDialog(null,"Onde vas!");
    }while(num!=nAleatorio);
    JOptionPane.showMessageDialog(null," Acertache!,noraboa ");
    
    
}

}

