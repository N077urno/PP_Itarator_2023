/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pp_iterator_2023;

/**
 *
 * @author nando
 */
import java.util.Iterator;

public interface Agregado<T> {
    public void adicionarNome(String nome);
    Iterator<T> criarIterator();

    
}
