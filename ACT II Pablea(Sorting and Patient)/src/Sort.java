/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author c'karlpabz17
 */
public class Sort {
    
    protected int[] num;
    
    public Sort(int[] num){
        this.num = num; }
    
    public void swap(int i , int b){
        int temp = this.num[i];
        this.num[i] = this.num[b];
        this.num[b] = temp;}
    
    public int compare(int indexC, int indexK){
        if(this.num[indexC] > this.num[indexK]){
            return indexC;
        }
         else if(this.num[indexC] < this.num[indexK]){
            return indexK;
        }
        else{
            return -1;
        }
    } 
    public void displayArray(){
        for(int a = 0; a < this.num.length; a++){
            System.out.print(this.num[a] + " ");
        }
    }
    
    public int getValue(int x){
        return this.num[x];
    }
}
