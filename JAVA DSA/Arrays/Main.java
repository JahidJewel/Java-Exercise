public class Main {

    static int removeDuplicate(int[] ar){
        int rd = 0;
        for (int i=1;i<ar.length;i++){
            if (ar[rd] != ar[i]){
                rd++;
                ar[rd] = ar[i];

            }
        }
        return rd+1;
    }


    public static void main(String[] args) {

        int [] ar = {1,1,3,4,4,5,5,7,7,9};

        for (int i =0; i<ar.length;i++){
            System.out.print(ar[i] + " ");
        }
        int rd = removeDuplicate(ar);
        System.out.println();

        for (int i =0; i<rd;i++){
            System.out.print(ar[i] + " ");
        }




    }
}