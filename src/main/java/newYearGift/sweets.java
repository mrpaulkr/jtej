package newYearGift;

abstract class sweets {
    private String candyName;
    private int weight;
    private int sugarConsist;

    private candyList list = candyList.cndL;


    private enum candyList {cndL,lolly,choko}

    sweets(String candyName, int weight,int sugarConsist) {
        this.candyName = candyName;
        this.weight = weight;
        this.sugarConsist=sugarConsist;

    }
    public String toString(){
        return "Candy name: "+ this.candyName
                + ". weight:"+ this.weight
                + ". sugarConsist:"+ this.sugarConsist;
    }


    String getcandyName() {
        return candyName;
    }

    int getWeight() {
        return weight;
    }
    int getSugarConsist(){
        return sugarConsist;
    }



}
