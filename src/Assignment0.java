import java.util.*;
import java.util.Map.Entry;

public class Assignment0 {
Map<String,String> classList= new HashMap<String,String>();
public Assignment0(){
classList.put("Bob", "A");
classList.put("Mary", "c");
classList.put("Sarah", "B");
classList.put("Phillip", "A");
classList.put("Greg", "F");
}


public void printClassList(){
Iterator<Entry<String,String>> entries = classList.entrySet().iterator();
while(entries.hasNext()) {
Entry<String,String> entry= entries.next();
System.out.println("Key= "+ entry.getKey() + ", Value= " + entry.getValue());
}
}

public void printClassList2() {
for(Map.Entry<String,String> entry: classList.entrySet()) {
System.out.println("Key= "+ entry.getKey() + ", Value= " + entry.getValue());
}
for(String Key: classList.keySet()) {
System.out.println("Key= "+ Key);
}
for(String Value: classList.values()) {
System.out.println("Value= "+ Value);
}
}
public static void main(String[] args) {
Assignment0 myClassList= new Assignment0();
myClassList.printClassList();
myClassList.printClassList2();

}
}