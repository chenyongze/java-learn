public class Yongze {

    public static void main(String []args){
        System.out.println("xxxxx 顶顶顶顶");


        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;

        System.out.println("juice###");
        System.out.println(juice.size);


    }
}


class FreshJuice {
    enum FreshJuiceSize{ SMALL, MEDIUM , LARGE }
    FreshJuiceSize size;
}
