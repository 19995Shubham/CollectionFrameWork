package hasmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HasMapCreation {

    public static void main(String[] args) {

        HashMap<String, String> capitalIndia = new HashMap<String, String>();
        capitalIndia.put("Mp", "Bhopal");
        capitalIndia.put("MH", "Pune");
        capitalIndia.put("Bengal","kolkata");
        capitalIndia.put(null,"Delhi");
        capitalIndia.put(null,"New Delhi");
        capitalIndia.put("MH", "Mumbai");
        capitalIndia.put("J&K", null);
        capitalIndia.put("A&N", null);

        System.out.println(capitalIndia.get(null));
        System.out.println(capitalIndia.get(null));
        System.out.println(capitalIndia.get("MH"));
        System.out.println(capitalIndia.get("India"));
        System.out.println(capitalIndia.get("Mp"));
        System.out.println(capitalIndia.size());

        System.out.println("//////////Iterator method by using keyset/////////////////////////////////////");
       // Iterator over the key
        Iterator<String> it = capitalIndia.keySet().iterator();
        while (it.hasNext())
        {
           String key = it.next();
           String value = capitalIndia.get(key);
           System.out.println( key +" "+ value);
        }
        // Iterator over the set(pair)
        Iterator<Map.Entry<String, String>> its = capitalIndia.entrySet().iterator();
        while (its.hasNext())
        {
            Map.Entry<String, String> entry = its.next();
            System.out.println("key "+entry.getKey()+ " value "+ entry.getValue());
        }

        //using for each loop
       capitalIndia.forEach((k,v)-> System.out.println(k +v));
        // capitalIndia.forEach(String,s)->System.out.println(s);
    }
}