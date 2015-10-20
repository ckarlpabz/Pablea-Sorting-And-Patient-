/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author c'karlpabz17
 */
public class Test{

    public static void main(String[] args){
        Patient[] patient = new Patient[4];
        patient[0] = new Patient("Mark Jefferson", "Pablea", 19, "Alauli Pampanga");
        patient[1] = new Patient("Avenir", "Manalastas", 20, "Macabebe Pampanga");
        patient[2] = new Patient("Sarah Mae", "Ponce", 18, "Quezon");
        patient[3] = new Patient("Noella Amor", "Napilot", 17, "Rizal");
        
        System.out.println("Unsorted Patient");
            for(int count = 0; count < patient.length; count++){
              System.out.println((count + 1) + ". " + patient[count]);
        }

        int[] ages = new int[patient.length];
            for(int a = 0; a < patient.length; a++){
              ages[a] = patient[a].getAge();
        }

        InsertionSort sort = new InsertionSort(ages);
        sort.sortAscending();
        
        System.out.println("\nSorted Patients Ascending");
            for(int r = 0; r < patient.length; r++){
                for(int c = 0; c < patient.length; c++){
                    if(sort.getValue(r) == patient[c].getAge()){
                     System.out.println((r + 1) + ". " + patient[c]);
                }
            }
        } 
        BubbleSort sorted = new BubbleSort(ages);
        sort.sortDescending();

        System.out.println("\nSorted Patients Descending");
            for(int r = 0; r < patient.length; r++){
                for(int c = 0; c < patient.length; c++){
                    if(sort.getValue(r) == patient[c].getAge()){
                     System.out.println((r + 1) + ". " + patient[c]);
                }
            }
        } 
    
    }
}

