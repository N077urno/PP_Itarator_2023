/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pp_iterator_2023;

/**
 *
 * @author nando
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ListaNomesMap implements Agregado<String> {
    private Map<Integer,String> nomesMap;
    private int nextIndex;
    
    public ListaNomesMap(){
        nomesMap = new HashMap<>();
        nextIndex = 0;
    }
    
    @Override
    public void adicionarNome(String nome){
        nomesMap.put(nextIndex, nome);
        nextIndex++;
    }
    
    @Override
    public Iterator<String> criarIterator(){
        return(new ListaNomesMapIterator(nomesMap));
    }
    
    
}
