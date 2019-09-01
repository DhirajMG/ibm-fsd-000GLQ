package comm.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;
public class Deck {
	static Scanner scan = new Scanner(System.in);
	static List<Card> Deck = new ArrayList<Card>();
	static{
		for(Suit s:Suit.values()) {
			for(Rank r:Rank.values()) {
				Deck.add(new Card(s,r));
			}
		}
	}

	public static void main(String[] args) {
		//System.out.println(Deck);
		System.out.println("Enter the no. of hands:");
		int hands = scan.nextInt();
		System.out.println("Enter the no. of cards per hand:");
		int cards = scan.nextInt();
		List<Card> outCards = getCards(hands,cards);
		Collections.shuffle(Deck);
		System.out.println("Cards are:");
		for(int i=0;i<hands;i++) {
			for(int j=0;j<cards;j++) {
				System.out.println(outCards.get(i*cards+j));
			}
			System.out.println();
		}
	}
	static List<Card> getCards(int hands,int cards){
		Collections.shuffle(Deck);
		List<Card> temp = new ArrayList<Card>();
		for(int i=0;i<hands;i++) {
			for(int j=0;j<cards;j++) {
				temp.add(Deck.get(i*cards+j));
			}
		}
		return temp;
	}
}
