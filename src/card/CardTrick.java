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
        
        Card luckyCard=new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit(Card.SUITS[3]);
        
        
        boolean hasCard = hasTheCard(magicHand, luckyCard);
        System.out.println(hasCard?"You win! The Lucky Card is in the Magic Hand!":"You lose. The Lucky Card is not in the Magic Hand.");
        
       
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
