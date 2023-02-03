package com.techreturners.cats;

public class DomesticCat extends AbstractCat{

   public DomesticCat(){
       super("domestic",23);
   }

    public String eat() {
        if (Math.random() < 0.5) {
            return "It will do I suppose";
        } else {
            return "Purrrrrrr";
        }
    }

}
