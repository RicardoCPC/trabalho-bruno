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

public class Teste_Categorias {
    
    public Teste_Categorias() {
    }
    
    Avaliação Aval = new Avaliação();
   
    //caso para uma média menor que 2,5, assim sendo deletado
    @Test
    public void categoria_DELETADO(){
        //entrada para o código
        int[] notas = new int[5];
        notas[0]=4;
        notas[1]=2;
        notas[2]=2;
        notas[3]=1;
        notas[4]=1;
        
         //tira média das notas
        double media = Aval.media(notas[0],notas[1],notas[2],notas[3],notas[4]);
        
        //encaixa em uma categoria de acordo com a média
        String result=Aval.categorias(media);
        
        
        assertEquals("ERRO: PRODUTO SERÁ DESOSPEDADO", result);
    }
    
    //caso para uma média entre que 2,5 e 3,5, assim sendo categorizado como "bom"
    @Test
    public void categoria_bom(){
        //entrada para o código
        int[] notas = new int[5];
        notas[0]=1;
        notas[1]=2;
        notas[2]=3;
        notas[3]=2;
        notas[4]=2;
        
         //tira média das notas
        double media = Aval.media(notas[0],notas[1],notas[2],notas[3],notas[4]);
        
        //encaixa em uma categoria de acordo com a média
        String result=Aval.categorias(media);
        
        
        assertEquals("Categoria: Bom", result);
    }
    
    
    //caso para uma média entre que 3,5 e 4,5, assim sendo categorizado como "muito bom"
    @Test
    public void categoria_muito_bom(){
        //entrada para o código
        int[] notas = new int[5];
        notas[0]=1;
        notas[1]=0;
        notas[2]=2;
        notas[3]=3;
        notas[4]=4;
        
         //tira média das notas
        double media = Aval.media(notas[0],notas[1],notas[2],notas[3],notas[4]);
        
        //encaixa em uma categoria de acordo com a média
        String result=Aval.categorias(media);
        
        
        assertEquals("Categoria: Muito bom", result);
    }
    
    //caso para uma média entre que 4,5 e 5, assim sendo categorizado como "excelente"
    @Test
    public void categoria_excelente(){
        //entrada para o código
        int[] notas = new int[5];
        notas[0]=0;
        notas[1]=0;
        notas[2]=1;
        notas[3]=2;
        notas[4]=7;
        
        //tira média das notas
        double media = Aval.media(notas[0],notas[1],notas[2],notas[3],notas[4]);
        
        //encaixa em uma categoria de acordo com a média
        String result=Aval.categorias(media);
        
        
        assertEquals("Categoria: Excelente", result);
    }
    
    //caso para uma média entre que 2,5 e 3,5, assim sendo categorizado como "bom"
    @Test
    public void categoria_bom_2(){
        //entrada para o código
        int[] notas = new int[5];
        notas[0]=0;
        notas[1]=4;
        notas[2]=3;
        notas[3]=2;
        notas[4]=1;
        
         //tira média das notas
        double media = Aval.media(notas[0],notas[1],notas[2],notas[3],notas[4]);
        
        //encaixa em uma categoria de acordo com a média
        String result=Aval.categorias(media);
        
        
        assertEquals("Categoria: Bom", result);
    }
    
    //caso para uma média entre que 3,5 e 4,5, assim sendo categorizado como "muito bom"
    @Test
    public void categoria_muito_bom_2(){
        //entrada para o código
        int[] notas = new int[5];
        notas[0]=1;
        notas[1]=0;
        notas[2]=3;
        notas[3]=4;
        notas[4]=2;
        
         //tira média das notas
        double media = Aval.media(notas[0],notas[1],notas[2],notas[3],notas[4]);
        
        //encaixa em uma categoria de acordo com a média
        String result=Aval.categorias(media);
        
        
        assertEquals("Categoria: Muito bom", result);
    }
    
    //caso para uma média entre que 4,5 e 5, assim sendo categorizado como "excelente"
    @Test
    public void categoria_excelente_2(){
        //entrada para o código
        int[] notas = new int[5];
        notas[0]=0;
        notas[1]=0;
        notas[2]=0;
        notas[3]=1;
        notas[4]=9;
        
        //tira média das notas
        double media = Aval.media(notas[0],notas[1],notas[2],notas[3],notas[4]);
        
        //encaixa em uma categoria de acordo com a média
        String result=Aval.categorias(media);
        
        
        assertEquals("Categoria: Excelente", result);
    }

}
