import java.util.Random;

public class DeckOfCards {
    private final String[] ranks={"Ace", "2", "3", "4", "5", "6", "7", "8", "9",  "10", "Jack", "Queen", "King"};
    private final String[] suits={"Spades", "Hearts", "Clubs", "Diamonds"};
    private Card[] cards;
    private int top=0;
    public void swap(Card[] cards,int i,int j)
    {
        Card temp=cards[i];
        cards[i]=cards[j];
        cards[j]=temp;
    }
    public DeckOfCards(){
        cards=new Card[52];
        for(int i=1;i<=13;i++){
            for(int j=1;j<=4;j++){
                cards[i*j-1]=new Card(i*j,ranks[i-1],suits[j-1]);
            }
        }
    }
    public void shuffle(){
        int length=cards.length;
        Random rand=new Random();
        for(int i=length;i>0;i--){
            int randInd= rand.nextInt(i);
            swap(cards,randInd,i-1);
        }
    }
    public Card getTop(){
        return cards[top++];
    }
}
class Card{
    private final int num;
    private final String value;
    private final String suit;
    public Card(int aNum,String aValue,String sSuit)
    {
        num=aNum;
        value=aValue;
        suit=sSuit;
    }

    public int getNum() {
        return num;
    }

    public String getValue(){
        return value;
    }

    public String getSuit() {
        return suit;
    }
}
class TestDeckofCards{
    public static void main(String[] args) {
        DeckOfCards deck=new DeckOfCards();
        deck.shuffle();
        for(int i=0;i<4;i++){
            Card card= deck.getTop();
            System.out.println("Card number "+card.getNum()+":"+card.getValue()+" of "+card.getSuit());
        }
    }
}
