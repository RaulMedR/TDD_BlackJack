package Model.cardModel.type;

import Model.cardModel.Card;

public class Figure extends Card {
    private final int value = 10;

    @Override
    public int getValue() {
        return value;
    }
    

}
