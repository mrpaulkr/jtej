package newYearGift;



import JavaClases.Student;

import java.util.*;

public class giftList {
    private List<sweets> giftList= new ArrayList<>();
    public void addCandy(sweets s){giftList.add(s);}

    public void printList(){
        System.out.println("List of students faculty ");
        for(sweets st:giftList){

                System.out.println(st.toString());
            }
        }

    public void sortList(){
        System.out.println("\n"+"Please type number how you want to sort Candies in the gift:"+"\n"+"1)By candy name"+"\n"+
                "2)By weight"+"\n"+"3)By count of sugar");
        Scanner in = new Scanner(System.in);
        int sortByUserChoice= in.nextInt();
        if(sortByUserChoice==1){
            System.out.println("You choose 1:So your gift items will be sorted by candy names: ");
            Comparator<sweets> c = (s1, s2) -> s1.getcandyName().compareTo(s2.getcandyName());
            giftList.sort(c);
            Iterator<sweets> it2 = giftList.iterator();
            while(it2.hasNext()) {
                System.out.println(it2.next());
            };
        }
        if(sortByUserChoice==2){
            System.out.println("You choose 2:So your gift items will be sorted by candy weight:");
            Comparator<sweets> w = (s1, s2) ->Integer.compare(s1.getWeight(),s2.getWeight());
            giftList.sort(w);
            Iterator<sweets> it3 = giftList.iterator();
            while(it3.hasNext()) {
                System.out.println(it3.next());

            };

        }
        if(sortByUserChoice==3){
            System.out.println("You choose 3:So your gift items will be sorted by count of sugar:");
            Comparator<sweets> w = (s1, s2) ->Integer.compare(s1.getSugarConsist(),s2.getSugarConsist());
            giftList.sort(w);
            Iterator<sweets> it3 = giftList.iterator();
            while(it3.hasNext()) {
                System.out.println(it3.next());

            };

        }

    }

    public void sugarSort(){
        System.out.println("Please type in what sugar range you looking candyies :");
        System.out.println("Sugar From:");
        Scanner sugarStart = new Scanner(System.in);
        int sugarFrom= sugarStart.nextInt();
        System.out.println("Sugar To:");
        Scanner sugarFinish = new Scanner(System.in);
        int sugarTo= sugarFinish.nextInt();
        sugarStart.close();
        sugarFinish.close();
        System.out.println("Your sugar range is "+sugarFrom+" - "+sugarTo);

        System.out.println("Gift list after ");
        for(sweets st:giftList){
            if(st.getSugarConsist()>=sugarFrom && st.getSugarConsist()<=sugarTo){
                System.out.println(st.toString());}

        }
    }
}


