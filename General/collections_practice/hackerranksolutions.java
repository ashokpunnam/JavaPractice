package collections_practice;

import java.util.*;

public class hackerranksolutions {
    public static void main(String[] args) {
        String s = "Ashok";
        //countDuplicates(s);

        List<String> productName = new ArrayList<>();
        productName.add("Eggs");
        productName.add("Milk");

        List<Double> productCost = new ArrayList<>();
        productCost.add(1.98);
        productCost.add(2.97);

        List<String> itemName = new ArrayList<>();
        itemName.add("Eggs");
        itemName.add("Milk");
        //itemName.add("Eggs");
        //itemName.add("Eggs");

        List<Double> itemCost = new ArrayList<>();
        itemCost.add(1.96);
        itemCost.add(2.97);
       // itemCost.add(1.96);
       // itemCost.add(2.47);
        System.out.println(itemName.size());

        System.out.println("CountMismatches"+countMismtaches(productName,productCost,itemName, itemCost));
    }

    public static void countDuplicates(String s){
        char[] charArray = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<charArray.length;i++){
            int counter=1;
            if(map.containsKey(charArray[i])){
                counter = map.get(charArray[i])+1;

            }
            map.put(charArray[i],counter);
        }

        for (Map.Entry i : map.entrySet()){
            System.out.println("Character is:"+i.getKey()+" Value is: "+i.getValue());
        }
    }

    public static int countMismtaches(List<String> productName,List<Double> productCost, List<String> itemName, List<Double> itemCost ){

        Map<String, Double> productMap = new HashMap<>();

        for(int i=0; i<productName.size();i++){
            productMap.put(productName.get(i),productCost.get(i));
        }

        Map<String, Double> itemMap = new HashMap<>();

        for(int i=0; i<itemName.size();i++){
            itemMap.put(itemName.get(i),itemCost.get(i));
        }

        int mismatchCounter=0;
     /*   for(Map.Entry i : itemMap.entrySet()){
            System.out.println(i.getValue()+" Ashok "+productName.get(productName.indexOf(i.getKey())));
            if(productName.contains(i.getKey())){

                if(i.getValue() != productName.get(productName.indexOf(i.getKey()))){
                    System.out.println(i.getValue()+" Ashok "+productName.get(productName.indexOf(i.getKey())));
                    mismatchCounter = mismatchCounter+1;

                }
            }
        }*/

        System.out.println(itemMap.size()+"Count"+productMap.size());

     for(Map.Entry i : itemMap.entrySet()){
         Double itemCost1 = Double.parseDouble(i.getValue().toString());
         Double productCost1 = Double.parseDouble(productMap.get(i.getKey()).toString());
         System.out.println(itemCost1+" Ashok"+ productCost1);
         if(itemCost1.doubleValue() != productCost1.doubleValue()){
             mismatchCounter=mismatchCounter+1;
         }
     }

        return mismatchCounter;
    }
}
