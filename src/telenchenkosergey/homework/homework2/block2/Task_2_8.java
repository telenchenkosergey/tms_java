package telenchenkosergey.homework.homework2.block2;

public class Task_2_8 {
    public static void main(String[] args) {
        String star = "*";
        // String empty = " ";

        int apex = 1;
        int base = 4;

        for (int i = apex; i <= base; i++) {
            System.out.println(star.repeat(i));
        }

        System.out.println("\n");

        for (int j = base; j >= apex; j--) {
            System.out.println(star.repeat(j));
        }

        // for (int i = apex; i <= base; i++) {
        //     System.out.print(empty.repeat(base - apex));
        //     System.out.println(star.repeat(apex));
        //     apex++;
        // }

        // System.out.println("\n");

        // for (int i = 0; i <= base; i++) {
        //     System.out.print(empty.repeat(i));
        //     System.out.println(star.repeat(base - i));  
        // } 
    }

}
