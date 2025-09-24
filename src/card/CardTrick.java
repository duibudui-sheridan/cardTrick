/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
// @author Ekaterina Degtiareva ID# 991808017

import java.util.Scanner; 

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random()*13)+1); 
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i]=c;
            System.out.println(c.getSuit()+" "+c.getValue());
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a card value (1-13): ");
        int value= scan.nextInt();
        scan.nextLine();
        
        System.out.print("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        int suitNum= scan.nextInt();
        scan.nextLine();
        
        Card playersCard = new Card();
        playersCard.setValue(value);
        playersCard.setSuit(Card.SUITS[suitNum]);
        
        
        boolean hasCard = hasTheCard(magicHand, playersCard);
        System.out.println(hasCard?"Your card is in the magic hand":"Your card is not in the magic hand");

        
        
        Card luckyCard=new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit(Card.SUITS[3]);
        
       
    }
    
    public static boolean hasTheCard(Card[] inHand, Card playCard) {
            for (Card c1: inHand) {
                if (c1.getValue()==playCard.getValue() && c1.getSuit().equals(playCard.getSuit())) {
                    return true;
                }
            }
            
            return false;
        }
    
}
