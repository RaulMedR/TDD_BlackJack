
package tdd_blackjack;

import Model.Player;
import Model.cardModel.Card;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BlackJack_main {

    public static void main(String[] args) {
        tests_execute();

    }

    private static void tests_execute() {
        AllMoreThan21();
        CroupierMoreThan21AndTwoPlayersLessThan21();
        CroupierBlackJackAndPlayersLessThan21();
        OnePlayerMoreThanCroupier();
        CroupierMoreThanPlayers();
        PlayersMoreThanCroupier();
        PlayersMoreThan21();
        TwoPlayersMoreThanCroupierAndOnePlayerMoreThan21();
        AllBlackJack();
        
    }

    private static void AllMoreThan21() {
        System.out.println("Testing all players more than 21...");
        List<Player> players = new ArrayList<>();
        List<Card> deck = new ArrayList<>();
        
        List<String> deck_string = Arrays.asList("J", "6", "J", "4", "5");
        deck = BlackJack_utilities.stringToCard(deck_string);
        
        List<String> player1_deckstring = Arrays.asList("K", "Q", "3");
        List<String> player2_deckstring = Arrays.asList("K", "J", "8");
        List<String> player3_deckstring = Arrays.asList("9", "10", "4");
        
        Player Player1 = new Player(1, BlackJack_utilities.stringToCard(player1_deckstring));
        Player Player2 = new Player(2, BlackJack_utilities.stringToCard(player2_deckstring));
        Player Player3 = new Player(3, BlackJack_utilities.stringToCard(player3_deckstring));
        
        players.add(Player1);
        players.add(Player2);
        players.add(Player3);
        
        BlackJack blackjack = new BlackJack(players, deck);
        List<Player> winnerPlayers = blackjack.getWinners(players);
        
        System.out.println(winnerPlayers);
        
    }

    private static void CroupierMoreThan21AndTwoPlayersLessThan21() {
        System.out.println("Testing croupier more than 21 and two Players less than 21...");
        List<Player> players = new ArrayList<>();
        List<Card> deck = new ArrayList<>();
        
        List<String> deck_string = Arrays.asList("J", "6", "J", "4", "5");
        deck = BlackJack_utilities.stringToCard(deck_string);
        
        List<String> player1_deckstring = Arrays.asList("K", "Q", "3");
        List<String> player2_deckstring = Arrays.asList("K", "J");
        List<String> player3_deckstring = Arrays.asList("4", "10");
        
        Player Player1 = new Player(1, BlackJack_utilities.stringToCard(player1_deckstring));
        Player Player2 = new Player(2, BlackJack_utilities.stringToCard(player2_deckstring));
        Player Player3 = new Player(3, BlackJack_utilities.stringToCard(player3_deckstring));
        
        players.add(Player1);
        players.add(Player2);
        players.add(Player3);
        
        BlackJack blackjack = new BlackJack(players, deck);
        List<Player> winnerPlayers = blackjack.getWinners(players);
        
        System.out.println(winnerPlayers);
    }

    private static void CroupierBlackJackAndPlayersLessThan21() {
        System.out.println("Testing croupier blackjack and players less than 21...");
        List<Player> players = new ArrayList<>();
        List<Card> deck = new ArrayList<>();
        
        List<String> deck_string = Arrays.asList("A", "K", "3", "5");
        deck = BlackJack_utilities.stringToCard(deck_string);
        
        List<String> player1_deckstring = Arrays.asList("K", "3");
        List<String> player2_deckstring = Arrays.asList("K", "J");
        List<String> player3_deckstring = Arrays.asList("4", "10");
        
        Player Player1 = new Player(1, BlackJack_utilities.stringToCard(player1_deckstring));
        Player Player2 = new Player(2, BlackJack_utilities.stringToCard(player2_deckstring));
        Player Player3 = new Player(3, BlackJack_utilities.stringToCard(player3_deckstring));
        
        players.add(Player1);
        players.add(Player2);
        players.add(Player3);
        
        BlackJack blackjack = new BlackJack(players, deck);
        List<Player> winnerPlayers = blackjack.getWinners(players);
        
        System.out.println(winnerPlayers);
    }
    
    private static void OnePlayerMoreThanCroupier() {
        System.out.println("Testing one player more than croupier...");
        List<Player> players = new ArrayList<>();
        List<Card> deck = new ArrayList<>();
        
        List<String> deck_string = Arrays.asList("10", "8", "3", "5");
        deck = BlackJack_utilities.stringToCard(deck_string);
        
        List<String> player1_deckstring = Arrays.asList("K", "9");
        List<String> player2_deckstring = Arrays.asList("2", "J");
        List<String> player3_deckstring = Arrays.asList("4", "10");
        
        Player Player1 = new Player(1, BlackJack_utilities.stringToCard(player1_deckstring));
        Player Player2 = new Player(2, BlackJack_utilities.stringToCard(player2_deckstring));
        Player Player3 = new Player(3, BlackJack_utilities.stringToCard(player3_deckstring));
        
        players.add(Player1);
        players.add(Player2);
        players.add(Player3);
        
        BlackJack blackjack = new BlackJack(players, deck);
        List<Player> winnerPlayers = blackjack.getWinners(players);
        
        System.out.println(winnerPlayers);
    }
    
    private static void CroupierMoreThanPlayers() {
        System.out.println("Testing croupier more than players...");
        List<Player> players = new ArrayList<>();
        List<Card> deck = new ArrayList<>();
        
        List<String> deck_string = Arrays.asList("Q", "K", "3", "5");
        deck = BlackJack_utilities.stringToCard(deck_string);
        
        List<String> player1_deckstring = Arrays.asList("K", "3");
        List<String> player2_deckstring = Arrays.asList("K", "8");
        List<String> player3_deckstring = Arrays.asList("4", "10");
        
        Player Player1 = new Player(1, BlackJack_utilities.stringToCard(player1_deckstring));
        Player Player2 = new Player(2, BlackJack_utilities.stringToCard(player2_deckstring));
        Player Player3 = new Player(3, BlackJack_utilities.stringToCard(player3_deckstring));
        
        players.add(Player1);
        players.add(Player2);
        players.add(Player3);
        
        BlackJack blackjack = new BlackJack(players, deck);
        List<Player> winnerPlayers = blackjack.getWinners(players);
        
        System.out.println(winnerPlayers);
    }
    
    private static void PlayersMoreThanCroupier() {
        System.out.println("Testing players more than croupier...");
        List<Player> players = new ArrayList<>();
        List<Card> deck = new ArrayList<>();
        
        List<String> deck_string = Arrays.asList("10", "7", "3", "5");
        deck = BlackJack_utilities.stringToCard(deck_string);
        
        List<String> player1_deckstring = Arrays.asList("K", "J");
        List<String> player2_deckstring = Arrays.asList("10", "J");
        List<String> player3_deckstring = Arrays.asList("J", "8");
        
        Player Player1 = new Player(1, BlackJack_utilities.stringToCard(player1_deckstring));
        Player Player2 = new Player(2, BlackJack_utilities.stringToCard(player2_deckstring));
        Player Player3 = new Player(3, BlackJack_utilities.stringToCard(player3_deckstring));
        
        players.add(Player1);
        players.add(Player2);
        players.add(Player3);
        
        BlackJack blackjack = new BlackJack(players, deck);
        List<Player> winnerPlayers = blackjack.getWinners(players);
        
        System.out.println(winnerPlayers);
    }
    
    private static void PlayersMoreThan21() {
        System.out.println("Testing players more than 21...");
        List<Player> players = new ArrayList<>();
        List<Card> deck = new ArrayList<>();
        
        List<String> deck_string = Arrays.asList("9", "K", "3", "5");
        deck = BlackJack_utilities.stringToCard(deck_string);
        
        List<String> player1_deckstring = Arrays.asList("K", "Q", "6");
        List<String> player2_deckstring = Arrays.asList("K", "J", "10");
        List<String> player3_deckstring = Arrays.asList("4", "10", "J");
        
        Player Player1 = new Player(1, BlackJack_utilities.stringToCard(player1_deckstring));
        Player Player2 = new Player(2, BlackJack_utilities.stringToCard(player2_deckstring));
        Player Player3 = new Player(3, BlackJack_utilities.stringToCard(player3_deckstring));
        
        players.add(Player1);
        players.add(Player2);
        players.add(Player3);
        
        BlackJack blackjack = new BlackJack(players, deck);
        List<Player> winnerPlayers = blackjack.getWinners(players);
        
        System.out.println(winnerPlayers);
    }
    
    private static void TwoPlayersMoreThanCroupierAndOnePlayerMoreThan21() {
        System.out.println("Testing two players more than croupier and one player more than 21...");
        List<Player> players = new ArrayList<>();
        List<Card> deck = new ArrayList<>();
        
        List<String> deck_string = Arrays.asList("8", "K", "3", "5");
        deck = BlackJack_utilities.stringToCard(deck_string);
        
        List<String> player1_deckstring = Arrays.asList("K", "3");
        List<String> player2_deckstring = Arrays.asList("K", "J");
        List<String> player3_deckstring = Arrays.asList("9", "10");
        
        Player Player1 = new Player(1, BlackJack_utilities.stringToCard(player1_deckstring));
        Player Player2 = new Player(2, BlackJack_utilities.stringToCard(player2_deckstring));
        Player Player3 = new Player(3, BlackJack_utilities.stringToCard(player3_deckstring));
        
        players.add(Player1);
        players.add(Player2);
        players.add(Player3);
        
        BlackJack blackjack = new BlackJack(players, deck);
        List<Player> winnerPlayers = blackjack.getWinners(players);
        
        System.out.println(winnerPlayers);
    }

    private static void AllBlackJack() {
        System.out.println("Testing all players blackjack...");
        List<Player> players = new ArrayList<>();
        List<Card> deck = new ArrayList<>();
        
        List<String> deck_string = Arrays.asList("A", "Q", "J", "4", "5");
        deck = BlackJack_utilities.stringToCard(deck_string);
        
        List<String> player1_deckstring = Arrays.asList("K", "A");
        List<String> player2_deckstring = Arrays.asList("A", "J");
        List<String> player3_deckstring = Arrays.asList("Q", "A");
        
        Player Player1 = new Player(1, BlackJack_utilities.stringToCard(player1_deckstring));
        Player Player2 = new Player(2, BlackJack_utilities.stringToCard(player2_deckstring));
        Player Player3 = new Player(3, BlackJack_utilities.stringToCard(player3_deckstring));
        
        players.add(Player1);
        players.add(Player2);
        players.add(Player3);
        
        BlackJack blackjack = new BlackJack(players, deck);
        List<Player> winnerPlayers = blackjack.getWinners(players);
        
        System.out.println(winnerPlayers);
        
    }
    
    
}
