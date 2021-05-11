import java.util.Random;

public class BogoSort
    {
        public static void main(String[] args)
        {
            //Enter array to be sorted here
            int[] arr={4,6,5,7,8,1,2};

            BogoSort now=new BogoSort();
            System.out.print("Unsorted: ");
            now.display1D(arr);
            double before = System.nanoTime();

            now.bogo(arr);
            double after = System.nanoTime();

            System.out.println("Total time in seconds: " + (after-before)/1000000000);
            System.out.print("Sorted: ");
            now.display1D(arr);
        }
        void bogo(int[] arr)
        {
            //Keep a track of the number of shuffles
            int shuffle=1;
            for(;!isSorted(arr);shuffle++){
                shuffle(arr);
                System.out.print("Current Array: ");
                display1D(arr);
            }

            //Boast
            System.out.println("This took "+shuffle+" shuffles.");
        }
        public void shuffle(int[] a){
            Random r = new Random();
            int x = r.nextInt(a.length);
            for(int i = a.length-1;i > 0;i--){
                int j = r.nextInt(i);
                if (j < x) break;
                swap(a, i, j);
            }
        }
        void swap(int[] arr,int i,int j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        boolean isSorted(int[] arr)
        {

            for(int i=1;i<arr.length;i++)
                if(arr[i]<arr[i-1])
                    return false;
            return true;
        }
        void display1D(int[] arr)
        {
            for(int i=0;i<arr.length;i++)
                System.out.print(arr[i]+" ");
            System.out.println();
        }
    }


