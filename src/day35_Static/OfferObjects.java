package day35_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferObjects {
    public static void main(String[] args) {
        Offer offer1 = new Offer();
        offer1.setInfo("VA","BOA",100_000,true);

        Offer offer2 = new Offer();
        offer2.setInfo("KY","CapitalOne",120_000,false);

        Offer offer3=new Offer();
        offer3.setInfo("MD","Chase",95000,true);

        Offer offer4 = new Offer();
        offer4.setInfo("CA","FB", 140000,false);

        Offer[] offers = {offer1, offer2, offer3, offer4};
        String myLocation = "CA";

        ArrayList<Offer> Accept = new ArrayList<>();
        Accept.addAll(Arrays.asList(offers));
        Accept.removeIf(p->p.salary<100_000 || p.isFillTime != true || !p.location.equals(myLocation));



        for (Offer eachOffer: Accept){
            System.out.println(eachOffer);
        }



    }
}
