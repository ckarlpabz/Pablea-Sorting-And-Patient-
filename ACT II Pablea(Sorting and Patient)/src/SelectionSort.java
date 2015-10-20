/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author c'karlpabz17
 */
public class SelectionSort extends Sort {
    
    public SelectionSort(int num[]){
        super(num);
    }
    
    public void sortAscending(){
        for(int i = 0; i < this.num.length - 1; i++){
            for(int b = i + 1; b < this.num.length; b++){
                if(this.compare(i, b) == i){
                    this.swap(i, b);
           }
        }
    }
 }
    
    public void sortDescending(){
        for(int i = 0; i < this.num.length - 1; i++){
            for(int b = i + 1; b < this.num.length; b++){
                if(this.compare(i, b) == b){
                    this.swap(i, b);
                }
            }
        }
    }
}

