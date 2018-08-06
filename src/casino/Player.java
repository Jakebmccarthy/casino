/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casino;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jake
 */
public class Player {
        String[] deck = {
            "As", "Ac", "Ah", "Ad",
            "2s", "2c", "2h", "2d",
            "3s", "3c", "3h", "3d",
            "4s", "4c", "4h", "4d",
            "5s", "5c", "5h", "5d",
            "6s", "6c", "6h", "6d",
            "7s", "7c", "7h", "7d",
            "8s", "8c", "8h", "8d",
            "9s", "9c", "9h", "9d",
            "10s", "10c", "10h", "10d",
            "Js", "Jc", "Jh", "Jd",
            "Qs", "Qc", "Qh", "Qd",
            "Ks", "Kc", "Kh", "Kd" };
    
    int[] deckpoints = {
            1, 1, 1, 1,
            2, 2, 2, 2,
            3, 3, 3, 3,
            4, 4, 4, 4,
            5, 5, 5, 5,
            6, 6, 6, 6,
            7, 7, 7, 7,
            8, 8, 8, 8,
            9, 9, 9, 9,
            10, 10, 10, 10,
            10, 10, 10, 10,
            10, 10, 10, 10,
            10, 10, 10, 10 };
    
    Random rand = new Random();
    int playerHandCounter = 0;
    int playerTotal = 0; 
    int[] playerHand = new int[10];
    
    Player() {
        
        
        
    	/*
        System.out.println("_____________________________");
        
        for (int i = 0; i < 2; i++) {
           
            int n = rand.nextInt(51) + 0;
            playerTotal += deckpoints[n];
            System.out.println("Card: " + deck[n] + "  || Value : " + deckpoints[n]);
        }
        
        System.out.println("Player Total: " + playerTotal);
        System.out.println("_____________________________");
               
        Scanner reader = new Scanner(System.in);  
        System.out.println("1 to HIT || 0 to STAY: ");
        int n = reader.nextInt(); 
        
        
        if(n==1){
            //Random rand = new Random();
            //int n = rand.nextInt(51) + 0;
            playerTotal += deckpoints[n];
            System.out.println("_____________________________");
            System.out.println("Card: " + deck[n] + "  || Value : " + deckpoints[n]);
            System.out.println("Player Total: " + playerTotal);
            System.out.println("_____________________________");
            System.out.println("1 to HIT || 0 to STAY: ");
            n = reader.nextInt(); 
        }
        
        if(n==0){
            System.out.println("END GAME");
        }
        
        
        reader.close();
    */
    	
    }
    
    public void firstDraw() {
        System.out.println("_____________________________");
        for(int i = 0; i < 2; i++){
        	int l = rand.nextInt(51) + 0;
            playerTotal += deckpoints[l];
            playerHand[playerHandCounter] = deckpoints[l];
            System.out.println("Card: " + deck[l] + "  || Value : " + deckpoints[l] );
            playerHandCounter++;
        }
        
        System.out.println("Player Total: " + playerTotal);
        System.out.println("_____________________________");
    }

    public void hit(){
    	System.out.println("____________HIT______________");
        	int l = rand.nextInt(51) + 0;
            playerTotal += deckpoints[l];
            playerHand[playerHandCounter] = deckpoints[l];
            System.out.println("Card: " + deck[l] + "  || Value : " + deckpoints[l] );
            playerHandCounter++;    
        System.out.println("Player Total: " + playerTotal);
        System.out.println("_____________________________");
    }  	
    
    public void stay(){
	    System.out.println("____________STAY______________");
	    System.out.println("Player Total: " + playerTotal);
	    System.out.println("_____________________________");   	
    	
    }
}
