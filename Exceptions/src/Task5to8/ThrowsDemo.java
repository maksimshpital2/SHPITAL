package Task5to8;

import java.util.Objects;
import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        try {
            String key = myScanner.next();
            printDetails(key);
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println("Error");
            myScanner.next();
        } finally {
            myScanner.close();
        }
    }

    public void printDetails(String key) throws Exception {
        try {
            String message = getDetail(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }

    private String getDetail(String key) throws Exception {
        if (Objects.equals(key, "")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public String getDetails(String key) {
        try {
            if (key == null) {
                throw newNullPointerException("null key in getDetails");
            }
        } catch (Exception exception) {
            System.out.println("Error");
        }
        return "data for" + key;
    }

    private Exception newNullPointerException(String s) {
        System.out.println(s);
        return new Exception();
    }

    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }
}