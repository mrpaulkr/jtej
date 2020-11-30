package newYearGift;

public class Main {
    public static void main(String[] args) {
        chocolateCandy c1=new chocolateCandy("Mars",20,10);
        lolliPop l1 =new lolliPop("Lollipop",340,30);
        lolliPop chupaChups =new lolliPop("Chupa Chups",35,70);
        chocolateCandy snikers=new chocolateCandy("Snikers",100,70);
        chocolateCandy bounty=new chocolateCandy("Bounty",80,45);
        giftList gift = new giftList();
        gift.addCandy(c1);
        gift.addCandy(c1);
        gift.addCandy(snikers);
        gift.addCandy(bounty);
        gift.addCandy(chupaChups);
        //----------FUNCTIONS-------------//
        //---print list---//
        gift.printList();
        //---sort list by:name || weight || sugar---//
        gift.sortList();
        //---find candy with sugar range---//
        gift.sugarSort();
    }

}
