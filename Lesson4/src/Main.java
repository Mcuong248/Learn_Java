import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char space = ' ';
        String s = "You only live once, but if you do it right, once is enough";
        int count = 0;
        int size = s.length();
        boolean notCounted = true;
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) != space) {
                if(notCounted) {
                    count++;
                    notCounted = false;
                }
            } else {
                notCounted = true;
            }
        }
        System.out.println(count);

    }
    }

