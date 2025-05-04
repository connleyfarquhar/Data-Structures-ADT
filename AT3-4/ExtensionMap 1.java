package org.example;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ExtensionMap {
    private ArrayList<ValPairs<String, String>> map;
    private String message ; // send message to user in console

    // ExtensionMap Set as constructor
    public ExtensionMap() {
        this.map = new ArrayList<>();
        this.message = "";
    }
    // send the message
    public String getMessage() {
        return message;
    }
    // add an entry to the collection
    public int addEntry( String k, String v ){
        map.add( new ValPairs<>(k, v) );
        this.message = "Key value pair added";
        return getSize();
    }
    // Remove an entry
    public int removeEntry(String k) {
        if (map.removeIf(pair -> pair.getKey().equals(k))) {
            this.message = "key-value pair removed from the map";
        } else {
            this.message = "" + k + " not in the map -> nothing removed";
        }
        return getSize();
    }
    // return the size
    public int getSize() {
       return map.size();
    }
    // return map as a string
    @Override
    public String toString(){
        String result = map.stream()
                .map(pair -> pair.getKey() + "=" + pair.getValue())
                .collect(Collectors.joining(", "));
        return result;
    }
    // get the entry then return the value
    public String getEntry(String key) {
        for (ValPairs<String, String> p : map) {
            if (p.getKey().equals(key)) {
                return p.getValue();
            }
        }
        this.message = "Key not found"; // Only set message if key is not found
        return message;
    }
}
