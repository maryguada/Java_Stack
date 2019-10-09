import java.util.HashMap;
import java.util.Set;

public class Maps{
    public static void main (String[] args){

    HashMap<String, String> tracksMap = new HashMap<String, String>();
    tracksMap.put("Single Ladies", "All the single ladies");
    tracksMap.put("Slide", "Do you slide on all your nights like this?");
    tracksMap.put("Here Comes The Sun", "Here comes the sun do do do do"); 
    tracksMap.put("Honeymoon Avenue", "You know how to drive in the rain"); 
    tracksMap.put("Pay No Mind", "She was dancing she smiling"); 

    String single = tracksMap.get("Single Ladies"); 
    System.out.println(single); 

    // get the keys by using the keySet method 
    Set<String> keys = tracksMap.keySet(); 
    for(String key : keys) {
        System.out.println(key +": " + tracksMap.get(key));
        
        // System.out.println(tracksMap.get(key)); 
    }

}

}



