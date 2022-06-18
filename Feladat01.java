import java.io.Console;

public class Feladat01 {
    public static int feladat01(String[] szinek){
        int keveresek=1;
        //osszes reszhalmaz
        for(int i =0; i< szinek.length; ++i)
            keveresek*=2;
        //0 es 1 elemu reszhelmezok nem keveresek
        keveresek -= szinek.length +1;
        return keveresek;
    }

}
