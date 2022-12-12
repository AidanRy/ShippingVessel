package ie.atu.shippingVessel;

import java.util.Scanner;

public class TrawlerApp{
    public static void main(String[] args) {

        Trawler trawler1 = new Trawler("bigvessel", "36505698524", "Freezer");
        char repeat = 'y';
        while(repeat == 'y') {
            String[] name;

            if (name.length >= 7 && name.length <= 24) {
                return name;
            }
                repeat = 'n';
            } else {
                System.out.println("invalid entry for name please enter again betweeen 7 & 24 characters");
            }
        }
        char repeat3 = 'y';
        while(repeat3 == 'y') {
            if (type =="Freezer"||type == "Stern" || type=="Outrigger") {
                return type;
                repeat3 = 'n';
            } else {
                System.out.println("invalid entry for type must be Freezer, Stern or Outrigger");
        }

            System.out.println(trawler1);
    }
}
