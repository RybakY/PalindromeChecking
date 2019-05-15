import java.util.ArrayList;
import java.util.concurrent.Callable;

public class Server implements Callable<String> {
    private String word;
    private String result;

    public Server(String word) {
        this.word = word;
    }

    @Override
    public String call() throws Exception {


        StringBuilder wb = new StringBuilder(word);
        if (wb.toString().equals(wb.reverse().toString())) {
            result= "is palindrome";

        } else result= "is not palindrome";
//        Thread.sleep(500);
        return result;

    }
}
