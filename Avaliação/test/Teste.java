/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;
import avaliação.Avaliação;
/**
 *
 * @author Enzo M.
 */
public class Teste {
    
    public Teste() {
    }
    
    Avaliação Aval = new Avaliação();
    //teste para tirar a media da avaliação de um produto negativo
    @Test
    public void mediaAval(){       
        //entrada para o código
        int[] notas = new int[5];
        notas[0]=4;
        notas[1]=2;
        notas[2]=2;
        notas[3]=1;
        notas[4]=1;
                  
        //execução da função para calcular a média
        double result= Aval.media(notas[0],notas[1],notas[2],notas[3],notas[4]);
        
        
        assertEquals(2.3, result, 0.0001);
    }
    //teste para tirar a media da avaliação de um produto positivo
    @Test
    public void mediaAval_2(){       
        int[] notas = new int[5];
        notas[0]=0;
        notas[1]=2;
        notas[2]=1;
        notas[3]=4;
        notas[4]=3;
        
        //execução da função para calcular a média                      
        double result= Aval.media(notas[0],notas[1],notas[2],notas[3],notas[4]);
        
        
        assertEquals(3.8, result, 0.0001);
    }
    
    
    
}
