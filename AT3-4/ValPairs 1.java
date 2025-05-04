package org.example;

public class ValPairs<Key, Value> {
   private Key key;
   private Value value;

   // Constructor for the key value pair.
   public ValPairs(Key key, Value value) {
       this.key = key;
       this.value = value;
   }
   public Key getKey() {
       return key;
   }
   public Value getValue() {
       return value;
   }
}
