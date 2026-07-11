package Day19;

import java.util.HashMap;
import java.util.Map;
public class hashmap {


    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Kishore", 56);
        hm.put("priya", 48);
        hm.put("vignesh", 98);
        int max=0;
        String name = "";
        for(Map.Entry<String,Integer>e:hm.entrySet()){
            if(e.getValue()>max){
                max=e.getValue();
                name = e.getKey();
            }
        }
        System.out.println(max);
        System.out.println(name);
    }
}