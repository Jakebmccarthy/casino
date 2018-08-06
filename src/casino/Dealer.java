/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casino;

import java.util.Random;

/**
 *
 * @author Jake
 */


public class Dealer {

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
    
    int dealerHandCounter = 0;
    int dealerTotal = 0; 
    int[] dealerHand = new int[10];
    
    Random rand = new Random();
       
    
Dealer() {
    
   
    
    
    

    
    /*//WHILE LOOP FOR DEALER
   
    
    */
    
   
    
    /*
    if (dealerTotal > 21 ){
        System.out.println("Dealer Bust");
    }
    
    if (dealerTotal == 21 ){
        System.out.println("Dealer Blackjack");
    }
    */
    
    
    //Edge case incorrect search temp array instead
    //if (dealerTotal > 17 && (deck[n].equals("As") || deck[n].equals("Ac") || deck[n].equals("Ah") || deck[n].equals("Ad"))){
    //    System.out.println("Ace is now 1");
    //}
}

public void firstDraw() {
	
    System.out.println("_____________________________");
    
    int n = rand.nextInt(51) + 0;
    dealerTotal += deckpoints[n];
    dealerHand[dealerHandCounter] = deckpoints[n];
    System.out.println("Card: " + deck[n] + "  || Value : " + deckpoints[n] );
    dealerHandCounter++;
    System.out.println("Dealer Total: " + dealerTotal);
    System.out.println("_____________________________");
}

public void deal(){
	 do {   

		    int n = rand.nextInt(51) + 0; 
		    dealerTotal += deckpoints[n];
		    dealerHand[dealerHandCounter] = deckpoints[n];
		    System.out.println("Card: " + deck[n] + "  || Value : " + deckpoints[n] );
		    dealerHandCounter++;
		    } while (dealerTotal < 17);
	 System.out.println("Dealer Total: " + dealerTotal);
	 System.out.println("_____________________________");
	 
	
}

}
