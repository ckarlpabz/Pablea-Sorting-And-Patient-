/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author c'karlpabz17
 */
public class BubbleSort extends Sort {

    public BubbleSort(int num[]) {
        super(num);
    }   
    public void sortAscending(){
        for(int i = 0; i < this.num.length; i++){
            for(int b = 0; b < this.num.length - 1; b++){
                if(this.compare(b, b + 1) == b){
                    this.swap(b, b + 1);
         }
       }
    }
 } 
    public void sortDescending(){
        for(int i = 0; i < this.num.length; i++){
            for(int b = 0; b < this.num.length - 1; b++){
                if(this.compare(b, b + 1) == b+1){
                    this.swap(b, b + 1);
     }
    }
  }
 }
}
