package monster.limpid.www;

/**
 * @author zhenghaochen
 * @date 2021-06-18 15:12
 */
public class ninemulnine {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int i1 = 1; i1 <= i; i1++) {
                System.out.print(i1+"*"+i+"="+(i*i1)+"\t");
            }
            System.out.println();

        }
    }
}
