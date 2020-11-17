/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistmidterm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class ArrayListMidterm {

    static ArrayList<String> name = new ArrayList<>();
    static ArrayList<Integer> age = new ArrayList<>();
    static Scanner ton = new Scanner(System.in);
    
    public static void main(String[] args) {
        int option =0;
        end:
        
        while(true) {
            System.out.println("Options: \n1. add entry \n2. delete entry \n3. view entry \n4. update entry \n0. exit");
            option = ton.nextInt();
            switch (option) {
                case 1:
                    addEntry();
                    break;
                case 2:
                    deleteEntry();
                    break;
                case 3:
                    viewEntry();
                    break;
                case 4:
                    updateEntry();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("INVALID");
                    break;
            }
        }
    }
    static void addEntry() {
        System.out.print("Enter Name: ");
        name.add(ton.next());
        System.out.print("Enter Age: ");
        age.add(ton.nextInt());
    }
    
     static void deleteEntry() {
        System.out.print("Enter name to delete: ");
        name.remove(ton.next());
      
    }

    
    static void viewEntry() {
        System.out.println("Persons you have entered ");
            for(int i=0; i<name.size();i++){
                
            System.out.println(name.get(i)+" is "+ age.get(i));   
                     
        }
    }

    static void updateEntry() {
        System.out.print("Enter Index: ");
        int index = ton.nextInt();
        
        System.out.print("Enter New name: ");
        String newname = ton.next();
        
        System.out.print("Enter New age: ");
        int newage= ton.nextInt();
        
        name.set(index,newname);
        age.set(index,newage);
        
        
        }
     
    
    }
   

