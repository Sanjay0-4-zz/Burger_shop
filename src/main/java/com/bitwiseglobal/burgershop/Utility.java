package main.java.com.bitwiseglobal.burgershop;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Sanjay.
 */
public class Utility {

    public static void printList(List list){
        int i = 0;
        Iterator itr = list.iterator();
        while(itr.hasNext()) {
            Object object = itr.next();
            System.out.println(++i + ". " + object + " ");
        }

    }
}
