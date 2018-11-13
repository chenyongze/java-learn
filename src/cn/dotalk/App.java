package cn.dotalk;

class FreshJuice {
    enum FreshJuiceSize{ SMALL, MEDIUM , LARGE }
    FreshJuiceSize size;
}

public class App {

    public static void main(String []args){
        System.out.println("App Start ==>");

        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;

        int size = 10;
        double[] myList = new double[size];

        myList[0] = 5;
        myList[1] = 4;
        myList[2] = 3;
        myList[3] = 13;
        myList[4] = 4;
        myList[5] = 34.33;
        myList[6] = 34.0899;
        myList[7] = 4;
        myList[8] = 3;
        myList[9] = 11123;

        System.out.println(myList[6]);
        String appUrl="http://baidu.com";
        if("".equals(appUrl)){
            System.out.println("appUrl is empty");
        }else {
            System.out.println(appUrl);
        }

    }
}
