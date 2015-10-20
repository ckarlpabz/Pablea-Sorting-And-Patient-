/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author c'karlpabz17
 */
public class InsertionSort extends Sort {
    
    public InsertionSort(int[] num){
        super(num);
    }
    
    public void sortAscending(){
        int i, k, temp, c;
        for(i = 0; i < this.num.length - 1; i++){
            k = i + 1;
            c = k;
            temp = this.num[k];
            while(k > 0 && this.num[k - 1] > this.num[k]){
                    this.num[k] = this.num[k - 1];
                    k--;
                    this.num[k] = temp;
          }
      }
  }
    
    public void sortDescending(){
        int i, k, temp;
        for(i = 0; i < this.num.length - 1; i++){
            k = i + 1;
            while(k > 0 && this.num[k - 1] < this.num[k]){
                temp = this.num[k - 1];
                this.num[k - 1] = this.num[k];
                k--;
                this.num[k + 1] = temp;
            }
        }
    }
}

