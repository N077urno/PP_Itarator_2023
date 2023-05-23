/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pp_iterator_2023;

/**
 *
 * @author nando
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaNomes implements Agregado<String> {
    private List<String> nomes;
    
    public ListaNomes(){
        nomes = new ArrayList<>();
    }
    
    @Override
    public void adicionarNome(String nome){
        nomes.add(nome);
    }

  
    @Override
    public Iterator<String> criarIterator() {
        return nomes.iterator();
    }
    
    
}
