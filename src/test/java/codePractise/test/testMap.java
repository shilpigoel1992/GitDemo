package codePractise.test;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class testMap {

    public static void main(String args[]){
        HashMap<String, String> map = new HashMap<>();


        map.put("Greet, Help", "Completed");
                map.put("Perform Stable Stacking","Completed");
                map.put("Lift Safely","Completed");
                map.put("Reprint Aisle Location Labels","Completed");
                map.put("Scan a Feature","Completed");
                map.put("10-Foot Rule","Completed");
                map.put("Tour for Pricing","Completed");
                map.put("Build a Feature","Completed");
                map.put("Beer Programs","Overdue");
                map.put("Panty Bins","Overdue");
                map.put("Aisle Location","Completed");

       // map.forEach((key, value) -> System.out.println(key + " " + value));
        HashMap<String, Set<String>> result = new HashMap<>();
        map.keySet().forEach(key->{
            String val = map.get(key);
            if(!result.containsKey(val)){
                Set<String> s = new HashSet<>();
                s.add(key);
                result.put(val,s);
            }else{
                result.get(val).add(key);
            }
        });
        result.keySet().forEach(key->{
            System.out.print(key);
            System.out.println(result.get(key).toString());
        });

//        Set<String> valueSet= new HashSet<String>(map.values());
//        valueSet.forEach(value-> System.out.println(value));
//        List<Map.Entry<String,String>> usersList = map.entrySet().stream().filter(e->valueSet.contains(e.getValue())).collect(Collectors.toList());



       // System.out.println(usersList);

    }




}
