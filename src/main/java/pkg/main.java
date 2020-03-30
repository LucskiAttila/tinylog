package pkg;

import org.tinylog.Logger;

public class Main {
    public static void main(String[] args) {
        Logger.error("Thiss is an ERROR message");
        Logger.warn("This is a WARN message");
        Logger.info("This is an INFO message");
        Logger.debug("This is a DEBUG message");
        Logger.trace("This is a TRACE message");
        Logger.info(message: "User's name is {}", System.getProperty("user.name"));
        Logger.error(new RuntimeException("Oops"), message:"Something is wrong");
    }    
} 
