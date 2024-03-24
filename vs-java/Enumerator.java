enum Level{
    LOW, 
    MEDIUM,
    HIGH
}
public class Enumerator {
    public static void main(String[] args) {
        // Level myLevel = Level.LOW;
        System.out.println(Level.LOW);
        for(Level ele: Level.values()){
            System.out.println(ele);
        }
        
    }
}
