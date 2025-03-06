import java.util.Arrays;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        for(String nc:args){
            if("-version".equals(nc)){
                System.out.println("Hello World");
            }
        }
    }
}
