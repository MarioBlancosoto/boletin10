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
    
int adivinar,num,valorM,acu=0; 
     
      num = Integer.parseInt(JOptionPane.showInputDialog("Xogador 1 introduce o número a adiviñar,debe ser entre 1 e 50 ")); 
    do{
      
       
    
               if(num>0&&num<=50)
             adivinar = Integer.parseInt(JOptionPane.showInputDialog("Xogador 2 introduce o número,tes 3 intentos"));  
             valorM = Math.abs(num-adivinar);
          acu++;
        if(valorM>=20)
        JOptionPane.showMessageDialog(null," Demasiado lonxe,volve intentalo ");
        else if(valorM>=9)
             JOptionPane.showMessageDialog(null," case ,volve intentalo ");
        else if(valorM>5)
            JOptionPane.showMessageDialog(null," Estiveche moy preto ");
       
        else if(valorM==0){
            
            JOptionPane.showMessageDialog(null," Acertache!,noraboa ");
           break;}
    }while(acu<3);
    
    
    
    }
 
    }



