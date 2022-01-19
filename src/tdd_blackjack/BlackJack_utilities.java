package tdd_blackjack;

import Model.cardModel.Card;
import Model.cardModel.type.Ace;
import Model.cardModel.type.Figure;
import Model.cardModel.type.NumericCard;
import java.util.ArrayList;
import java.util.List;

public class BlackJack_utilities {
    public static List<Card> stringToCard(List<String> cards_string){
        List<Card> cards = new ArrayList<>();
        for (String card : cards_string){
            if ("A".equals(card)){
                cards.add(new Ace());
            }
            else if("J".equals(card) || "Q".equals(card) || "K".equals(card)){
                cards.add(new Figure());
            }
            else if("2".equals(card) || "3".equals(card) || "4".equals(card) ||
                    "5".equals(card) || "6".equals(card) || "7".equals(card) ||
                    "8".equals(card) || "9".equals(card) || "10".equals(card)){
                cards.add(new NumericCard(Integer.valueOf(card)));
            }
            else{
                System.out.println("ERROR: UNA CARTA INTRODUCIDA NO ES CORRECTA");
                System.exit(1);
            }
        }
        return cards;
    }
}
