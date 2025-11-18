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
public class Teste_Desospedar {
    
    public Teste_Desospedar() {
    }
    
    Avaliação Aval = new Avaliação();
    //testes para checar se o produto se desospedará ou não
    
    //caso para false onde o produto deverá continuar hospedado
    @Test
    public void desospedar(){
        //entrada para o código
        int[] notas = new int[5];
        notas[0]=0;
        notas[1]=2;
        notas[2]=1;
        notas[3]=4;
        notas[4]=3;
        
        
        //execução das funções
        double media= Aval.media(notas[0],notas[1],notas[2],notas[3],notas[4]);
        
        
        
        boolean result=Aval.desospedar(media);
        
        
        assertEquals(false, result);
        
    }
    
    //caso para true onde o produto deverá ser desospedado
    @Test
    public void desospedar_2(){
        //entrada para o código
        int[] notas = new int[5];
        notas[0]=4;
        notas[1]=2;
        notas[2]=2;
        notas[3]=1;
        notas[4]=1;
        
        
        //execução das funções
        double media= Aval.media(notas[0],notas[1],notas[2],notas[3],notas[4]);
       
        
        
        boolean result=Aval.desospedar(media);
        
        
        assertEquals(true, result);
    }
    
    
}
