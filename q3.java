import java.util.ArrayList; 
import java.util.Collections; 

/* Algoritmo de manipulação de Arraylist implementado em Java
Questão 03 da prova prática SERPRO 2023 */

public class q3 { 
    public static void main(String args[]) { 
        ArrayList<String> lista = new ArrayList<>(); 
        lista.add("VERDE"); 
        lista.add("AZUL"); 
        lista.add("VERMELHO"); 
        lista.add("AMARELO"); 
        lista.add("CINZA"); 
        
        // Insira na linha imediatamente a seguir a linha de código que atenda ao requisito 1. 
        lista.remove(2);
        System.out.println("Lista após exclusão: " + lista); 
        
        // Insira na linha imediatamente a seguir a linha de código que atenda ao requisito 2.
        Collections.sort(lista);
        System.out.println("Lista após da ordenação: " + lista); 
        
        alterar(lista,2,"BRANCO"); 
        System.out.println("Lista após a atualização: " + lista);
    }
    
    // A partir da próxima linha, crie o método alterar(lista, indice, novaCor).
    public static void alterar(ArrayList<String> lista, int indice, String novaCor){ 
        if(indice < lista.size()){
            lista.set(indice, novaCor);
        }
    }
}