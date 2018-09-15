import java.text.SimpleDateFormat;
import java.util.Date;

public class Datex {

    public static void main(String[] args){
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat ft = new SimpleDateFormat("YY-MM-dd");
        System.out.println("当前时间：" + ft.format(date));
    }
}
