import java.util.ArrayList;

public class App {
    public static void main(final String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("ハローワールド");
        ArrayList<String> list = new ArrayList<String>();

        list.add("kotoba");
        System.out.println(list.get(0));
        final int i = 0;
        for (int j = 0; j < 9; j++) {
            System.out.println(i + j);
        }
        for (int l = 0; l < 10; l++) {
            l = l + 2;
            System.out.println(l);
            System.out.println("hogehoge");
            System.out.println("hogehoge");
        }
    }
}
