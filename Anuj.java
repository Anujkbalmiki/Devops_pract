import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Anuj {
    private static void printName(int n) {
        if (--n > 0) {
            System.out.println("Anuj");
            printName(n);
        }
    }

    public static void main(String args[]) {
        printName(100);
    }

}
