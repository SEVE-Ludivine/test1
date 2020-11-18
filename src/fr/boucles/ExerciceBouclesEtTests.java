package fr.boucles;

public class ExerciceBouclesEtTests {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        // SUPERIEUR A 3
        /*
        for (int a:array) {
            if (a>3){
                System.out.println(a);
            }
        }*/
        // ENTIER PAIR
        for (int a:array) {
            if (a%2==0){
                System.out.println(a);
            }
        }
        //POSITION ENTIER PAIR
        for ( int i=0; i<array.length-1; i++ ) {
            if (array[i]%2==0) {
                System.out.println(i);
            }
        }
        // ENTIER IMPAIR
        for (int a:array) {
            if (a%2!=0){
                System.out.println(a);
            }
        }
    }
}
