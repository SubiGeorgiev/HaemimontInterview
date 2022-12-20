class Task1 {

    public static int SeatingStudents(int[] arr) {
        int k = arr[0];
        int a=-1;
        int counter = 0;

        int i=1;
        for(int j = 1 ; j <= arr.length ; j++){
            if(j<arr.length) {a=arr[j];}

            for( ; i < k ; i++){
                if(i==a) {i++;break;}
                if(j+1 < arr.length && arr[j+1] == i+2){j--;i++;break;}
                if( (i%2 != 0 && i < k-1)  &&  ( (i+1) !=a) ) counter++;
                if( (i%2 != 0 && i < k-1)  &&  ( (i+2) !=a) ) counter++;
                if( (i%2 != 0 && i==k-1)   &&  (i+1!=a) ) counter++;
                if( (i%2 == 0 && i < k-1)  &&  (i+2)!=a ) counter++;
            }
        }

        return counter;

//        int k = arr[0];
//        int a = arr[1];
//        int counter = 0;
//        int[][] field = new int[k/2][2];
//
//        int pop=1;
//        for(int i = 0; i<k/2 ; i++){
//            for(int j = 0 ; j<2 ; j++){
//                field[i][j] = pop;
//                pop++;
//            }
//        }
//        for(int p = 1 ; p < arr.length ; p++){
//
//        }
    }

    public static void main (String[] args) {
        // keep this function call here
        int[] s = {4,0};
        System.out.print(SeatingStudents(s));
    }

}
