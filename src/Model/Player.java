package Model;

import Model.cardModel.Card;
import java.util.ArrayList;
import java.util.List;
import tdd_blackjack.BlackJack;

public class Player {
    private int id;
    private List<Card> betcards = new ArrayList<>();

    public Player(int id, List<Card> betcards) {
        this.id = id;
        this.betcards = betcards;
    }
    
    public List<Card> getCards(){
        return betcards;
    }
    
    @Override
    public String toString(){
        if (id == 0){
            return "Croupier: " + BlackJack.getPoints(betcards);
        }
        return "Jugador " + id + ": " + BlackJack.getPoints(betcards);
    }
    

}
