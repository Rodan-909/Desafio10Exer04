/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio10exer04;

import java.util.Scanner;

/**
 *
 * @author odavi
 */
public class Desafio10Exer04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int ordem = 1, razao, a1, aN, termo = -1, n = 0;
        
        System.out.println("Digite o valor N (OBS: Um número inteiro e positivo.)");
        n = teclado.nextInt();
        
        for(int cont = 1; cont < n; cont++){
            if(ordem % 2 == 0){
                termo = termo + 5;
            }else{
                termo++;
            }
            ordem++;
        }
        System.out.println("O termo do número "+ n +" é:"+termo);
    }
    
}
