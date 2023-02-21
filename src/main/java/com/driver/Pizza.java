package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extratoppingprice;
    private int cheeseprice;
    private int takeaway;
    private boolean isCheeseAdded;
    private boolean isToppingAdded;
    private boolean isTakeAwayAdded;

    private boolean isBillGenerated;




    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.isCheeseAdded=false;
        this.isToppingAdded=false;
        this.isTakeAwayAdded=false;
        this.cheeseprice=80;
        this.isVeg=isVeg;
        this.takeaway=20;

            if(isVeg==true){
             this.price = 300;
             this.extratoppingprice = 70;
             }
            else{
             this.price = 400;
             this.extratoppingprice = 120;
             }

        this.bill = "Base Price Of The Pizza: "+this.price + "\n";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        this.isCheeseAdded=true;
        this.price = this.price + this.cheeseprice;
    }

    public void addExtraToppings(){
        // your code goes here
        this.isToppingAdded=false;
        this.price = this.price + this.extratoppingprice;
    }

    public void addTakeaway(){
        // your code goes here
        isTakeAwayAdded=true;
        this.price=this.price+takeaway;
    }

    public String getBill(){
        // your code goes here

        if(isBillGenerated==false) {

            isBillGenerated = true;

             if (isCheeseAdded == true) {
                 this.bill = this.bill + "Extra Cheese Added: " + this.cheeseprice + "\n";
                 }
            if (isToppingAdded == true) {
                 this.bill = this.bill + "Extra Toppings Added: " + this.extratoppingprice + "\n";
                }
             if (isTakeAwayAdded == true) {
                this.bill = this.bill + "Paperbag Added: " + this.takeaway + "\n";
             }
            this.bill = this.bill + "Total Price: "+this.price + "\n";
            }
         return this.bill;


    }
}
