import java.util.ArrayList;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ArrayList<String> list = new ArrayList<>();
        list.add("asa");
        list.add("word");
        list.add("did");
        list.add("clone");
        list.add("snow");
        list.add("kayak");
        list.add("winter");

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (String s:list) {
            Callable<String> callable = new Server(s);
            Future<String> future = executorService.submit(callable);
            System.out.println(s+" "+future.get());
        }



    }


}
