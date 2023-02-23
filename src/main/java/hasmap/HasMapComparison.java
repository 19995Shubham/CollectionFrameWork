package hasmap;

import java.util.HashMap;
import java.util.HashSet;

public class HasMapComparison {

    public static void main(String[] args) {

        HashMap<Integer, String> comp1 = new HashMap<Integer, String>();
        comp1.put(1, "Shubham");
        comp1.put(2, "Shivam");
        comp1.put(3, "Shrija");
        comp1.put(4, "Shrish");

        HashMap<Integer, String> comp2 = new HashMap<Integer, String>();
        comp2.put(1,"Shubham");
        comp2.put(3,"Shrija");
        comp2.put(2,"Shivam");
        comp2.put(4,"Shrish");

        HashMap<Integer,String> comp3 = new HashMap<Integer,String>();
        comp3.put(4,"Shubham");
        comp3.put(3,"Shrija");
        comp3.put(2,"Shrish");
        comp3.put(1,"Shivam");

        comp3.forEach((integer, s) -> System.out.println(s));

        System.out.println(comp3.equals(comp2));
        System.out.println(comp2.equals(comp1));
//////////////////////////////////////////comparing by the value ////////////////////////////////////////////////////////////////
        if(comp3.equals(comp1))
        {
            System.out.println("com3 is equal to com1"+comp3);
        }
        else if (comp3.equals(comp2))
        {
            System.out.println("com3 is equal to com2");
        }
        else if (comp2.equals(comp1))
        {
            System.out.println("com2 is equal to com1"+comp1+ comp2.get(2));
            comp1.forEach((integer, s) -> System.out.println(s));  //only value
            comp2.forEach((Integer,s)->System.out.println(Integer+s)); //both key and value
        }
////////////////Another method/////////////////////////////comparing by the keyset
        System.out.println(comp2.keySet().equals(comp1.keySet()));
        System.out.println(comp1.keySet().equals(comp3));

        HashMap<Integer,String> hm1 = new HashMap<Integer,String >();
         hm1.put(1,"A");
         hm1.put(2,"B");
         hm1.put(3,"C");

         HashMap<Integer,String>hm2 = new HashMap<Integer,String >();
         hm2.put(1,"A");
         hm2.put(2,"B");
         hm2.put(3,"C");
         hm2.put(4,"D");

         //create a hasset and compare two hasmap by storing ther element hasset doesn't contain duplicate

        HashSet<Integer> hs = new HashSet<Integer>(hm1.keySet());
        hs.addAll(hm2.keySet());
        hs.removeAll(hm1.keySet());  //this will remove all the hashmap1 element and only last element of the hasset remian
        System.out.println(hs);

       //hs.forEach((Integer)-> System.out.println(Integer));
        }
    }

