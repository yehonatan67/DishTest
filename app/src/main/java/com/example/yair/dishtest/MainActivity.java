package com.example.yair.dishtest;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {

    CheckBox[] allButtons = new CheckBox[9];

    ArrayList<Hummus> dishArray = new ArrayList<Hummus>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        allButtons[0] = (CheckBox) findViewById(R.id.hummusBeans);
        allButtons[1] = (CheckBox) findViewById(R.id.tahini);
        allButtons[2] = (CheckBox) findViewById(R.id.egg);
        allButtons[3] = (CheckBox) findViewById(R.id.horseBeans);
        allButtons[4] = (CheckBox) findViewById(R.id.complete);
        allButtons[5] = (CheckBox) findViewById(R.id.masabaha);
        allButtons[6] = (CheckBox) findViewById(R.id.shakshuka);
        allButtons[7] = (CheckBox) findViewById(R.id.mushrooms);
        allButtons[8] = (CheckBox) findViewById(R.id.meat);


        //adding clickListeners to all ingredients buttons
        addListenerOnHummusBeans();
        addListenerOnTahini();
        addListenerOnEgg();
        addListenerOnHorseBeans();
        addListenerOnComplete();
        addListenerOnMasabaha();
        addListenerOnShakshuka();
        addListenerOnMushrooms();
        addListenerOnMeat();

        //adding sum button
        addListenerOnButton(allButtons);



    }




    ////////////////////////////BUTTONS////////////////////////////////

    public void addListenerOnHummusBeans() {

        CheckBox hummusBeans = (CheckBox) findViewById(R.id.hummusBeans);

        hummusBeans.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                //is chkIos checked?
                if (((CheckBox) v).isChecked()) {
                    checkCompleteIfAll(allButtons);
                    changeDishName();
                    //Toast.makeText(MainActivity.this, "hummusBeans", Toast.LENGTH_SHORT).show();
                }
                else{enableComplete(allButtons); changeDishName();}

            }
        });}

    public void addListenerOnTahini() {

        CheckBox tahini = (CheckBox) findViewById(R.id.tahini);

        tahini.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                //is chkIos checked?
                if (((CheckBox) v).isChecked()) {
                    checkCompleteIfAll(allButtons);
                    changeDishName();
                    //Toast.makeText(MainActivity.this, "thiiiini", Toast.LENGTH_SHORT).show();
                }
                else{enableComplete(allButtons); changeDishName();}

            }
        });}

    public void addListenerOnEgg() {

        CheckBox egg = (CheckBox) findViewById(R.id.egg);

        egg.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                //is chkIos checked?
                if (((CheckBox) v).isChecked()) {
                    checkCompleteIfAll(allButtons);
                    changeDishName();
                    //Toast.makeText(MainActivity.this, "egegegeg", Toast.LENGTH_SHORT).show();
                }
                else{enableComplete(allButtons); changeDishName();}

            }
        });}

    public void addListenerOnHorseBeans() {

        CheckBox horseBeans = (CheckBox) findViewById(R.id.horseBeans);

        horseBeans.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                //is chkIos checked?
                if (((CheckBox) v).isChecked()) {
                    checkCompleteIfAll(allButtons);
                    changeDishName();
                    //Toast.makeText(MainActivity.this, "horseBeans", Toast.LENGTH_SHORT).show();
                }
                else{enableComplete(allButtons); changeDishName();}

            }
        });}

    public void addListenerOnComplete() {

        CheckBox complete = (CheckBox) findViewById(R.id.complete);

        complete.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                //is chkIos checked?
                if (((CheckBox) v).isChecked()) {
                    checkAllComplete(allButtons);
                    changeDishName();
                    //Toast.makeText(MainActivity.this, "complete", Toast.LENGTH_SHORT).show();
                }
                else{changeDishName();}

            }
        });}

    public void addListenerOnMasabaha() {

        CheckBox masabaha = (CheckBox) findViewById(R.id.masabaha);

        masabaha.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                //is chkIos checked?
                if (((CheckBox) v).isChecked()) {
                    uncheckAllButMe(allButtons, 5);
                    changeDishName();
                    //Toast.makeText(MainActivity.this, "masabaha", Toast.LENGTH_SHORT).show();
                }
                else{ifIamUnchecked(allButtons,5); changeDishName();}

            }
        });}


    public void addListenerOnShakshuka() {

        CheckBox shakshuka = (CheckBox) findViewById(R.id.shakshuka);

        shakshuka.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                //is chkIos checked?
                if (((CheckBox) v).isChecked()) {
                    uncheckAllButMe(allButtons, 6);
                    changeDishName();
                    //Toast.makeText(MainActivity.this, "shakshuka", Toast.LENGTH_SHORT).show();
                }
                else{ifIamUnchecked(allButtons,6); changeDishName();}


            }
        });}


    public void addListenerOnMushrooms() {

        CheckBox mushrooms = (CheckBox) findViewById(R.id.mushrooms);

        mushrooms.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                //is chkIos checked?
                if (((CheckBox) v).isChecked()) {
                    uncheckAllButMeAndBasics(allButtons, 7);
                    changeDishName();
                    //Toast.makeText(MainActivity.this, "mushrooms", Toast.LENGTH_SHORT).show();
                }
                else{ifIamUnchecked(allButtons,7); changeDishName();}

            }
        });}


    public void addListenerOnMeat() {

        CheckBox meat = (CheckBox) findViewById(R.id.meat);

        meat.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                //is chkIos checked?
                if (((CheckBox) v).isChecked()) {
                    uncheckAllButMeAndBasics(allButtons, 8);
                    changeDishName();
                    //Toast.makeText(MainActivity.this, "meat", Toast.LENGTH_SHORT).show();
                }
                else{ifIamUnchecked(allButtons,8); changeDishName();}

            }
        });}

    ////////////////////////////BUTTONS END////////////////////////////////

    ///////////// costume funcions////////////

    public void checkAllComplete(CheckBox[] allButtons){
        for(int i = 0; i<4; i++){
            allButtons[i].setChecked(true);
        }
        allButtons[4].setEnabled(false);
    }

    public void checkCompleteIfAll(CheckBox[] allButtons){
        for(int i = 0; i<4; i++){
            if(!allButtons[i].isChecked()){return;}
        }
        allButtons[4].setChecked(true);
        allButtons[4].setEnabled(false);

    }

    public void uncheckAllButMe(CheckBox[] allButtons, int me){
        for(int i = 0; i < allButtons.length; i++){
            if(i!= me){
                allButtons[i].setChecked(false);
                allButtons[i].setEnabled(false);
            }
        }
    }


    public void uncheckAllButMeAndBasics(CheckBox[] allButtons, int me){
        for(int i = 3; i < allButtons.length; i++){
            if(i!= me){
                allButtons[i].setChecked(false);
                allButtons[i].setEnabled(false);
            }
        }
        for(int i = 0; i < 3; i++){
            allButtons[i].setChecked(false);
        }
    }



    public void ifIamUnchecked(CheckBox[] allButtons, int me){
        for(int i = 0; i < allButtons.length; i++){
            allButtons[i].setEnabled(true);
            allButtons[i].setChecked(false);
        }
    }

    public void enableComplete(CheckBox[] allButtons){
        if(allButtons[5].isChecked() || allButtons[6].isChecked() || allButtons[7].isChecked() || allButtons[8].isChecked()){return;}
        else{
            if(!allButtons[4].isEnabled()){
            allButtons[4].setEnabled(true);
            allButtons[4].setChecked(false);
        }

        }

    }

    public String dishName(CheckBox[] allButtons){
        ImageView dishImage = (ImageView) findViewById(R.id.DishImage);
        if(allButtons[4].isChecked()){dishImage.setImageResource(R.drawable.hw_hb_ta_eg_hob); return "Dish: Complete";}
        if(allButtons[5].isChecked()){dishImage.setImageResource(R.drawable.mas); return "Dish: Masabaha";}
        if(allButtons[6].isChecked()){dishImage.setImageResource(R.drawable.ham); return "Dish: Hamshuka";}

        if(allButtons[7].isChecked()){
            StringBuffer mushroomsDishBuf = new StringBuffer();
            mushroomsDishBuf.append("Dish: Hummus With Mushrooms");
            mushroomsDishBuf.append(withBasics(allButtons));

            dishImageByString (mushroomsDishBuf.toString());
            //Toast.makeText(MainActivity.this, (mushroomsDishBuf.toString()), Toast.LENGTH_SHORT).show();
            return mushroomsDishBuf.toString();
        }

        if(allButtons[8].isChecked()){
            StringBuffer meatDishBuf = new StringBuffer();
            meatDishBuf.append("Dish: Hummus With Meat");
            meatDishBuf.append(withBasics(allButtons));

            dishImageByString (meatDishBuf.toString());
            //Toast.makeText(MainActivity.this, (meatDishBuf.toString()), Toast.LENGTH_SHORT).show();
            return meatDishBuf.toString();
        }

        if(allButtons[0].isChecked() || allButtons[1].isChecked() || allButtons[2].isChecked() || allButtons[3].isChecked()){
            StringBuffer hummus = new StringBuffer();
            hummus.append("Dish: Hummus With");
            hummus.append(withBasics(allButtons));

            dishImageByString (hummus.toString());
            //Toast.makeText(MainActivity.this, (hummus.toString()), Toast.LENGTH_SHORT).show();
            return hummus.toString();
        }

        dishImage.setImageResource(R.drawable.plain);
        return "Plain Hummus";
    }

    public String withBasics(CheckBox[] allButtons){
        StringBuffer basics = new StringBuffer();
        if(allButtons[0].isChecked()){basics.append(", HummusBeans");}
        if(allButtons[1].isChecked()){basics.append(", Tahini");}
        if(allButtons[2].isChecked()){basics.append(", Egg");}
        if(allButtons[3].isChecked()){basics.append(", HorseBeans");}

        return basics.toString();
    }

    public void changeDishName(){
        String finalName = dishName(allButtons);
        TextView dishnameTextView = (TextView) findViewById(R.id.dishName);
        dishnameTextView.setText(finalName);
    }

    public void dishImageByString (String dishName){
        ImageView dishImage = (ImageView) findViewById(R.id.DishImage);
        if(dishName.equals("Dish: Hummus With Meat")){dishImage.setImageResource(R.drawable.hwme);}
        if(dishName.equals("Dish: Hummus With Meat, HummusBeans")){dishImage.setImageResource(R.drawable.hwme_hb);}
        if(dishName.equals("Dish: Hummus With Meat, HummusBeans, Tahini")){dishImage.setImageResource(R.drawable.hwme_hb_ta);}
        if(dishName.equals("Dish: Hummus With Meat, HummusBeans, Egg")){dishImage.setImageResource(R.drawable.hwme_hb_eg);}
        if(dishName.equals("Dish: Hummus With Meat, HummusBeans, Tahini, Egg")){dishImage.setImageResource(R.drawable.hwme_hb_ta_eg);}
        if(dishName.equals("Dish: Hummus With Meat, Tahini")){dishImage.setImageResource(R.drawable.hwme_ta);}
        if(dishName.equals("Dish: Hummus With Meat, Tahini, Egg")){dishImage.setImageResource(R.drawable.hwme_ta_eg);}
        if(dishName.equals("Dish: Hummus With Meat, Egg")){dishImage.setImageResource(R.drawable.hwme_eg);}

        if(dishName.equals("Dish: Hummus With Mushrooms")){dishImage.setImageResource(R.drawable.hwmu);}
        if(dishName.equals("Dish: Hummus With Mushrooms, HummusBeans")){dishImage.setImageResource(R.drawable.hwmu_hb);}
        if(dishName.equals("Dish: Hummus With Mushrooms, HummusBeans, Tahini")){dishImage.setImageResource(R.drawable.hwmu_hb_ta);}
        if(dishName.equals("Dish: Hummus With Mushrooms, HummusBeans, Egg")){dishImage.setImageResource(R.drawable.hwmu_hb_eg);}
        if(dishName.equals("Dish: Hummus With Mushrooms, HummusBeans, Tahini, Egg")){dishImage.setImageResource(R.drawable.hwmu_hb_ta_eg);}
        if(dishName.equals("Dish: Hummus With Mushrooms, Tahini")){dishImage.setImageResource(R.drawable.hwmu_ta);}
        if(dishName.equals("Dish: Hummus With Mushrooms, Tahini, Egg")){dishImage.setImageResource(R.drawable.hwmu_ta_eg);}
        if(dishName.equals("Dish: Hummus With Mushrooms, Egg")){dishImage.setImageResource(R.drawable.hwmu_eg);}

        if(dishName.equals("Dish: Hummus With")){dishImage.setImageResource(R.drawable.plain);}
        if(dishName.equals("Dish: Hummus With, HummusBeans")){dishImage.setImageResource(R.drawable.hw_hb);}
        if(dishName.equals("Dish: Hummus With, HummusBeans, Tahini")){dishImage.setImageResource(R.drawable.hw_hb_ta);}
        if(dishName.equals("Dish: Hummus With, HummusBeans, Egg")){dishImage.setImageResource(R.drawable.hw_hb_eg);}
        if(dishName.equals("Dish: Hummus With, HummusBeans, Tahini, Egg")){dishImage.setImageResource(R.drawable.hw_hb_ta_eg);}
        if(dishName.equals("Dish: Hummus With, Tahini")){dishImage.setImageResource(R.drawable.hw_ta);}
        if(dishName.equals("Dish: Hummus With, Tahini, Egg")){dishImage.setImageResource(R.drawable.hw_ta_eg);}
        if(dishName.equals("Dish: Hummus With, Egg")){dishImage.setImageResource(R.drawable.hw_eg);}
        if(dishName.equals("Dish: Hummus With, HummusBeans, Tahini, Egg, HorseBeans")){dishImage.setImageResource(R.drawable.hw_hb_ta_eg_hob);}
        if(dishName.equals("Dish: Hummus With, HummusBeans, Tahini, HorseBeans")){dishImage.setImageResource(R.drawable.hw_hb_ta_hob);}
        if(dishName.equals("Dish: Hummus With, HummusBeans, HorseBeans")){dishImage.setImageResource(R.drawable.hw_hb_hob);}
        if(dishName.equals("Dish: Hummus With, HorseBeans")){dishImage.setImageResource(R.drawable.hw_hob);}
        if(dishName.equals("Dish: Hummus With, Tahini, Egg, HorseBeans")){dishImage.setImageResource(R.drawable.hw_ta_eg_hob);}
        if(dishName.equals("Dish: Hummus With, Tahini, HorseBeans")){dishImage.setImageResource(R.drawable.hw_ta_hob);}
        if(dishName.equals("Dish: Hummus With, Egg, HorseBeans")){dishImage.setImageResource(R.drawable.hw_eg_hob);}
        if(dishName.equals("Dish: Hummus With, HummusBeans, Egg, HorseBeans")){dishImage.setImageResource(R.drawable.hw_hb_eg_hob);}
    }

    public void dishImageByStringSecond (Context context, String dishName) {
        ImageView dishImage = (ImageView) findViewById(R.id.DishImage);
        String idName = "plain";

        if(dishName.contains("Dish: Hummus With Meat")){
            idName ="hwme";

            getResources().getIdentifier(idName, "drawable", context.getPackageName());}

        if(dishName.contains("Dish: Hummus With Mushrooms")){dishImage.setImageResource(R.drawable.hwmu);}

        if(dishName.contains("Dish: Hummus With")){dishImage.setImageResource(R.drawable.plain);}
    }



    public void arrayTestFun(View view){
        for(int i = 0; i<dishArray.size(); i++){
           Toast.makeText(MainActivity.this, (dishArray.get(i)).toString(), Toast.LENGTH_SHORT).show();
        }

    }

    ///////////// costume funcions END////////////


    //Create Dish Button

    public void addListenerOnButton(final CheckBox[] allButtons) {

        Button createHummusButton = (Button) findViewById(R.id.createHummusButton);

        createHummusButton.setOnClickListener(new OnClickListener() {

            //Run when button is clicked
            @Override
            public void onClick(View v) {

                StringBuffer result = new StringBuffer();
                result.append("Hummus Beans ;").append(allButtons[0].isChecked());
                result.append("\nTahini : ").append(allButtons[1].isChecked());
                result.append("\nEgg :").append(allButtons[2].isChecked());
                result.append("\nhorseBeans :").append(allButtons[3].isChecked());
                result.append("\ncomplete :").append(allButtons[4].isChecked());
                result.append("\nmasabaha :").append(allButtons[5].isChecked());
                result.append("\nshakshuka :").append(allButtons[6].isChecked());
                result.append("\nmushrooms :").append(allButtons[7].isChecked());
                result.append("\nmeat :").append(allButtons[8].isChecked());

                //Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_SHORT).show();

                boolean[] dishValues = new boolean[9];

                for(int i = 0; i < allButtons.length; i++){
                    if (allButtons[i].isChecked()){dishValues[i] = true;}
                    else{dishValues[i] = false;}
                }

                Hummus dish = new Hummus(dishValues);
                Toast.makeText(MainActivity.this, dish.toString(), Toast.LENGTH_SHORT).show();

                dishArray.add(dish);

            }
        });



    }
}