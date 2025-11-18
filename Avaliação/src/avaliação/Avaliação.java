/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avaliação;

/**
 *
 * @author Enzo M.
 */
public class Avaliação {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    /** 
     * @param notas1 para pessoas que avaliaram em uma estrela
     * @param notas2 para pessoas que avaliaram em duas estrelas
     * @param notas3 para pessoas que avaliaram em três estrelas
     * @param notas4 para pessoas que avaliaram em quatro estrelas
     * @param notas5 para pessoas que avaliaram em cinco estrelas
 * @return devolve o valor da média de estrelas de um produto
 */
    public double media(int notas1, int notas2, int notas3, int notas4, int notas5){
        int nota1 = notas1*1, nota2 = notas2*2, nota3 = notas3*3;
        int nota4 = notas4*4, nota5 = notas5*5;
        int notaTot=notas1+notas2+notas3+notas4+notas5;
        
        return ((nota1+nota2+nota3+nota4+nota5) / (double)notaTot);
    }
    
    /**função que puxa caso o produto deva ser desospedado, assim retornando só um valor positivo
    * @param media para entrar com a média do produto
    * @return devolverá o valor da deshospedagem
    */
    public boolean desospedar(double media){
       boolean Hosp=false;
        
       if(media>=2.5){
           Hosp=false;
       }
       else{
           Hosp=true;
       }
       
        return Hosp;
        
    }
    
    public String categorias(double media){
        String categ="ERRO: PRODUTO SERÁ DESOSPEDADO";
        
        if(media>=2.5 && media<3.5){
            categ="Categoria: Bom";
        }
        else if(media>=3.5 && media<4.5){
            categ="Categoria: Muito bom";
        }
        else if(media>=4.5 && media<=5){
            categ="Categoria: Excelente";
        }
        
        return categ;
    }
    
}
