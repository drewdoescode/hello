/**
 * Not yo grandma's hello world is a less than simple Hello World
 * program that says the fundamentals of most all the command
 * line programs.
 */
import skilstak.c;
public class hello {
    
  public static void color(String message) {
        System.out.println(c.rc() + message + " ");
        }  
    }

    public static void plain(String message) {
        System.out.println(c.clear + message);
    }
    public static void main(String[] args) {
        String message = "world";
        if (args.length > 0) {
        }
        //plain("Helloworld!");
        color("Hello world!");
   
    }
}

