import com.linked.DLQueue;
import com.linked.DoublyLinearLinkedList;
import com.linked.Movie;
import com.linked.Util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Stack;

public class Main {
    public static DLQueue<Movie> queue = new DLQueue<>();


    public static List<Movie> findByDate(String dateStr) {
        List<Movie> movieList = new ArrayList<>();

        while (!queue.isEmpty()) {
            if (Util.toDate(dateStr).compareTo(queue.peek().getReleaseDate()) < 0) {
                movieList.add(queue.peek());
            }
            queue.pop();
        }
        return movieList;
    }

    public static void reverseQueue() {
        Stack<Movie> movieStack = new Stack<>();

        while (!queue.isEmpty()) {
            movieStack.push(queue.peek());
            queue.pop();
        }

        while (!movieStack.isEmpty()) {
            System.out.println(movieStack.pop());
        }
    }


    public static void main(String[] args) {

        queue.push(new Movie(1, "Iron Man", "Robert Downey", "Jon Favreau", " 2008-05-02"));

        queue.push(new Movie(2, "The Incredible Hulk", "Mark Rafalo", "Louis Leterrier", " 2008-06-13"));

        queue.push(new Movie(3, "Captain America", "Chris Evans", "Russo Brothers", " 2016-05-06"));

        queue.push(new Movie(4, "Doctor Strange", "Benedict Cumberbatch", "Scott Derrickson", " 2016-11-04"));

//        reverseQueue();

        List<Movie> list = findByDate("2010-01-01");

        list.forEach(m -> System.out.println(m));


    }


}

