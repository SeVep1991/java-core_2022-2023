package lr10.Example2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONDelete {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        JSONParser parser = new JSONParser();
        Object obj;
        try {
            obj = parser
                    .parse(new FileReader("src/lr10/example2/Example-json.json"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        JSONObject library =  (JSONObject) obj;
        JSONArray books = (JSONArray) library.get("books");
        System.out.println("Введите название книги, которую хотите удалить: ");
        String title = in.nextLine();
        Iterator iterator = books.iterator();
        while (iterator.hasNext()) {
            JSONObject book = (JSONObject) iterator.next();
            if (title.equals(book.get("title"))) {
                iterator.remove();
            }
        }
        try(FileWriter file = new FileWriter("src/lr10/example2/Example-json.json"))
        {
            file.write(library.toJSONString());
            System.out.println("Книга "+title+" удалена.");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
