/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pp_iterator_2023;

import java.util.List;

/**
 *
 * @author nando
 */
public class ListaNomesIterator implements Iteratorf<String> {
   private Iteratorf<String> iterator;
   
   public ListaNomesIterator(Iteratorf<String> iterator){
       this.iterator = iterator;
   }
   
   @Override
   public boolean hasNext(){
       return(iterator.hasNext());
   }
   
   @Override
   public String next(){
       return(iterator.next());
   }
}
