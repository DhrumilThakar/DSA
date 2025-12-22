public class sorting {

    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j+1]<arr[j]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted array using Bubble Sort: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            int j =i-1;
            while(j>=0 && arr[j]>temp){
                temp = arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        System.out.println("\nSorted array using Insertion Sort: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
    public static void selectionSort(int arr[]){
        for(int i =0;i<arr.length-1;i++){
            int minNumber =i;
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[j]<arr[minNumber]){
                    minNumber = j;
                }
            }
            int temp = arr[minNumber];
            arr[minNumber]=arr[i];
            arr[i]=temp;
        }
        System.out.println("\nSorted array using Selection Sort: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void MergeSort(int arr[],int low,int high){
        if(low>=high){
            return;
        }
        int mid = low+(high-low)/2;
        MergeSort(arr,low,mid);
        MergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);

    }
    public static void merge(int arr[],int low,int mid,int high){
        int temp[] = new int[arr.length];
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<arr[right]){
                temp[left+right - (mid+1)] = arr[left];
                left++;
            }
            else{
                temp[left+right - (mid+1)] = arr[right];
                right++;
            }
        }
        while(left<=mid){
            temp[left+right - (mid+1)] = arr[left];
            left++;
        }
        while(right<=high){
            temp[left+right - (mid+1)] = arr[right];
            right++;
        }
        for(int i =low;i<=high;i++){
            arr[i]=temp[i];
        }

        System.out.println("\nSorted array using Merge Sort: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] ={5,1,4,2,8};
        bubbleSort(arr);
        insertionSort(arr);
        selectionSort(arr);
        MergeSort(arr,0,arr.length-1);
    }    
}