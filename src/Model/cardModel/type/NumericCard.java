package Model.cardModel.type;

import Model.cardModel.Card;

public class NumericCard extends Card {
    private int value;
    
    public NumericCard(int value){
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }

}
