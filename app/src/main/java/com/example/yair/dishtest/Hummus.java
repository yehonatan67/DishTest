package com.example.yair.dishtest;

/**
 * Created by yeya2 on 03/07/2017.
 */

public class Hummus {

    public boolean hummusBeans = false;
    public boolean tahini = false;
    public boolean egg = false;
    public boolean horseBeans = false;
    public boolean complete = false;
    public boolean masabaha = false;
    public boolean shakshuka = false;
    public boolean mushrooms = false;
    public boolean meat = false;

    boolean[] ingredients = {hummusBeans, tahini, egg, horseBeans,complete,masabaha,shakshuka,mushrooms,meat};

    /*
    public Hummus(boolean hummusBeans, boolean tahini, boolean egg, boolean horseBeans, boolean complete, boolean masabaha, boolean shakshuka, boolean mushrooms, boolean meat){
        this.hummusBeans = hummusBeans;
        this.tahini = tahini;
        this.egg = egg;
        this.horseBeans = horseBeans;
        this.complete = complete;
        this.masabaha = masabaha;
        this.shakshuka = shakshuka;
        this.mushrooms = mushrooms;
        this.meat = meat;
    }
    */

    public Hummus(boolean[] dishValues) {
        this.hummusBeans = dishValues[0];
        this.tahini = dishValues[1];
        this.egg = dishValues[2];
        this.horseBeans = dishValues[3];
        this.complete = dishValues[4];
        this.masabaha = dishValues[5];
        this.shakshuka = dishValues[6];
        this.mushrooms = dishValues[7];
        this.meat = dishValues[8];
    }

    public boolean[] selectedIngredients (boolean[] ingredients){
        boolean[] selectedIngredients = new boolean[9];
        int j = 0;
        for(int i = 0; i<8 ; i++){
            if(ingredients[i]){
                selectedIngredients[j] = ingredients[i];
                j++;
            }
        }
        return selectedIngredients;
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("Hummus Beans ;").append(hummusBeans);
        result.append("\nTahini : ").append(tahini);
        result.append("\nEgg :").append(egg);
        result.append("\nhorseBeans :").append(horseBeans);
        result.append("\ncomplete :").append(complete);
        result.append("\nmasabaha :").append(masabaha);
        result.append("\nshakshuka :").append(shakshuka);
        result.append("\nmushrooms :").append(mushrooms);
        result.append("\nmeat :").append(meat);
        return result.toString();

    }

    //public void completeFunction (){
      //  if(complete){hummusBeans = true; tahini = true; egg = true; horseBeans = true;}
    //}



}


