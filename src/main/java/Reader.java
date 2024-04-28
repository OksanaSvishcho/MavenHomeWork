import com.google.gson.Gson;

public class Reader {
    public static void main (String[] args) {
        String name = "Oksana";
        String lastName = "Svishcho";

        Gson gson = new Gson();
        String json = gson.toJson(new Person(name, lastName));

        System.out.println(gson);
    }
}

