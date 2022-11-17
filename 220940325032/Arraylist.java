import java.util.*;
public class Arraylist{
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<String>();
        colors.add("Blue");
        colors.add("Red");
        colors.add("White");
        colors.add("Black");

        for(String color:colors){
            System.out.println(color);
        }
    }
}