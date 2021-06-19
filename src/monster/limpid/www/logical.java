package monster.limpid.www;

/**
 * @author zhenghaochen
 * @date 2021-06-18 10:51
 */
public class logical {
    public static void main(String[] args) {
//        与 或 非 短路运算
        int a = 5;
        boolean b = (a<4) && (a++>5);
        System.out.println(b);
        System.out.println(a);
//        说明与运算，前面一个错误后，就不会在判断后面一个。
        int c = 20;
//        + 是字符串连接操作！
        System.out.println(""+a+c);
        System.out.println(a+c+"");
//        两者不同，前面一个直接拼接，后面一个先加再拼接
    }
}
