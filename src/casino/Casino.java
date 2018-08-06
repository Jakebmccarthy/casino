/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casino;

import java.util.Scanner;

/**
 *
 * @author Jake
 */

public class Casino {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
    	
    Dealer dealer1 = new Dealer();
    Player player1 = new Player();
      
    dealer1.firstDraw();
    player1.firstDraw();
      
      
    System.out.println("1 for hit 0 for stay");
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    	
      
    while(i != 0) {
    	player1.hit();
    	System.out.println("1 for hit 0 for stay");
    	i = sc.nextInt();
    		}
    	
    	dealer1.deal();
    	
    	if ((dealer1.dealerTotal > 21) || (dealer1.dealerTotal < player1.playerTotal)) {
    		System.out.println("Dealer = " + dealer1.dealerTotal + " | Player = " + player1.playerTotal);
    		System.out.println("PLAYER WINS!!!");
    	} else if (dealer1.dealerTotal == player1.playerTotal) {
    		System.out.println("Dealer = " + dealer1.dealerTotal + " | Player = " + player1.playerTotal);
    		System.out.println("PUSH");
    	} else {
    		System.out.println("Dealer = " + dealer1.dealerTotal + " | Player = " + player1.playerTotal);
    		System.out.println("HOUSE WINS :(");
    	}
    }
    
    
    
}
