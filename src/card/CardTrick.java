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
        }
        
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the card's value?");
        int value= scan.nextInt();
        scan.nextLine();
        
        System.out.println("What is the card's suit?");
        String suit= scan.nextLine().toLowerCase();
        
        Card playersCard = new Card();
        playersCard.setValue(value);
        playersCard.setSuit(suit);
        
        
        boolean hasCard = hasTheCard(magicHand, playersCard);
        System.out.println(hasCard?"Your card is in the magic hand":"Your card is not in the magic hand");
        
        
        
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
    }
    
    public static boolean hasTheCard(Card[] inHand, Card playCard) {
            for (Card c1: inHand) {
                if (c1.getValue()==playCard.getValue() && c1.getSuit().toLowerCase().equals(playCard.getSuit())) {
                    return true;
                }
            }
            
            return false;
        }
    
}
