package DesignPatterns.Behavioural.Observer;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {

    private static Flipkart instance = null;
    private List<OnOrderPlacedSubscriber> onOrderPlacedSubscriberList = new ArrayList<>();
    private Flipkart(){

    }

    public static Flipkart getInstance(){
        if(instance == null){
            return new Flipkart();
        }
        return instance;
    }

//    void registerSubscriber(OnOrderPlacedSubscriber onOrderPlacedSubscriberList){
//        onOrderPlacedSubscriberList.add(onOrderPlacedSubscriberList     );
//    }


}
