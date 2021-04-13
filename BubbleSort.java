public class BubbleSort {
    private static void sort(int[] args){
        int n = args.length;
        while(n > 1){
            for(int i = 0; i < args.length-1; i++){
                if(args[i] > args[i+1]){
                    int change =  args[i];
                    args[i] = args[i+1];
                    args[i+1] = change;
                }
            }
            n--;
        }
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleSort s = new BubbleSort();
        int arr[] = {6,4,1,2,8,7,5};
        int arr2[] = {5,8,2,4,2,1};
        s.sort(arr);
        s.sort(arr2);
    }
}
