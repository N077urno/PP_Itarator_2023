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

public class ListaNomesMapIterator implements Iterator<String> {
    private Map<Integer,String> nomesMap;
    private Iterator<Integer> iterator;
    

    ListaNomesMapIterator(Map<Integer, String> nomesMap) {
        this.nomesMap = nomesMap;
        this.iterator = nomesMap.keySet().iterator();
    }

    
    @Override
    public boolean hasNext(){
        return iterator.hasNext();
    }
    
    @Override
    public String next(){
        int key = iterator.next();
        return nomesMap.get(key);
    }
}
