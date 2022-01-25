package tdd_blackjack;

import Model.Player;
import Model.cardModel.Card;
import Model.cardModel.type.Ace;
import java.util.ArrayList;
import java.util.List;

public class BlackJack {
    
    private List<Player> players;
    private List<Card> deck;
    
    private Player croupier;
    
    
    
    
    public BlackJack(List<Player> players, List<Card> deck) {
        this.players = players;
        this.deck = deck;
        this.croupier = new Player(0, croupierCards()); 
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<Card> getDeck() {
        return deck;
    }
    
    public boolean isBlackJack(List<Card> betcards){
        return getPoints(betcards) == 21 && betcards.size() == 2;
    }

    public static int getPoints(List<Card> betcards) {
        int totalPoints = 0;
        int numberAces = 0;
        for (Card card : betcards){
               if(card instanceof Ace){
                   numberAces++;
               }
               totalPoints += card.getValue();
        }
        
        while(totalPoints > 21 && numberAces >= 1){
            totalPoints -= 10;
            numberAces--;
        }
        return totalPoints;
    }

    private List<Card> croupierCards() {
        List<Card> croupierCards = new ArrayList<>();
        while (getPoints(croupierCards) < 17 && deck.size() > 0){
            croupierCards.add(deck.get(0));
            deck.remove(0);
        }
        return croupierCards;
    }
    
    public List<Player> getWinners(List<Player> players){
        List<Player> winnerPlayers = new ArrayList<>();
        
        if (isBlackJack(croupier.getCards())){
            winnerPlayers.add(croupier);
            return winnerPlayers;
        }
        for(Player player : players){
            int playerPoints = getPoints(player.getCards());
            if(playerPoints > 21){
                continue;
            }
            int croupierPoints = getPoints(croupier.getCards());
            if(croupierPoints > 21 || playerPoints > croupierPoints){
                winnerPlayers.add(player);
            }
        }
        
        if(winnerPlayers.isEmpty() && getPoints(croupier.getCards()) <= 21){
            winnerPlayers.add(croupier);
        }
        return winnerPlayers;
    }
    
    
    
    
    
    
    

}
