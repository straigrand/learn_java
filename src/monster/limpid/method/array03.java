package monster.limpid.method;

/**
 * @author zhenghaochen
 * @date 2021-06-19 16:32
 */
public class array03 {
    public static void main(String[] args) {
        int[][] array1 = new int[11][11];
        array1[1][2]=1;
        array1[2][3]=2;
        for (int[] ints : array1) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }
        int sum = 0;
        for (int[] ints : array1) {
            for (int anInt : ints) {
             if(anInt!=0){
                 sum++;
             }
            }
        }

        System.out.println("==========================");
        int[][] array2 = new int[sum+1][3];
        array2[0][0]=array1.length;
        array2[0][1]=array1[0].length;
        array2[0][2]=sum;
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int i1 = 0; i1 < array1[0].length; i1++) {
                if(array1[i][i1]!=0){
                    count++;
                    array2[count][0]=i;
                    array2[count][1]=i1;
                    array2[count][2]=array1[i][i1];
                }
            }
        }
        for (int[] ints : array2) {
            for (int i : ints) {
                System.out.print(i+"\t");
            }
            System.out.println();
        }
    }
}
