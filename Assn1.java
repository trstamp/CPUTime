import java.util.Random;
import java.util.Arrays;

public class Assn1 {
    int[] a1 = new int[1000];
    int[] a2 = new int[1000];
    int[] tempA = new int[1000];

    Random rd = new Random();

    int[] createArray(int[] array){
        int i = 0;
        while(i < 1000){
            int j = rd.nextInt(1000);
            array[i] = j;
            i++;
        }
        return array;
    }

    int[] createSorted(int[] array){
        createArray(array);
        Arrays.sort(array);
        return array;
    }

    public void function(){
        //long starA = System.nanoTime();
        createSorted(a1);
        //long endA = System.nanoTime();

        //long starB = System.nanoTime();
        createSorted(a2);
        //long endB = System.nanoTime();
        System.out.println("Array size: " + a1.length);

        long start = System.nanoTime();

        int a = 0, b = 0, c = 0;
        for(int d = 0; d < a1.length; d++) {
            if (a1[a] == a2[b]) {
                tempA[c] = a1[a];
                a++;
                b++;
                c++;
            }
            else if(a1[a] > a2[b]){
                b++;
            }
            else{
                a++;
            }
        }

        long end = System.nanoTime();
        System.out.print("CPU Time is ");
        System.out.print(end - start);
    }

}
