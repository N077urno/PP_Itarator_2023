/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pp_iterator_2023;

import java.util.List;

/**
 *
 * @author nando
 */
import java.util.Iterator;
public class PP_Iterator_2023 {

    public static void main(String[] args) {
        String nome;
        Agregado<String> listaNomes = new ListaNomes();
        
        listaNomes.adicionarNome("Joao");
        listaNomes.adicionarNome("Maria");
        listaNomes.adicionarNome("Jose");
        
        Iterator<String> iterator = listaNomes.criarIterator();
        
        while(iterator.hasNext()){
            nome = iterator.next();
            System.out.println("Nomes no ArrayList: "+nome);
        }
        
        Agregado<String> listaNomes2 = new ListaNomesMap();
        
        listaNomes2.adicionarNome("Joao");
        listaNomes2.adicionarNome("Maria");
        listaNomes2.adicionarNome("Jose");
        
        Iterator<String> iterator2 = listaNomes2.criarIterator();
        
        while(iterator2.hasNext()){
            nome = iterator2.next();
            System.out.println("Nomes no HashMap: "+nome);
        }
    }
}
