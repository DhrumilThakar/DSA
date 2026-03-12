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
                arr[j+1] = arr[j];
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
            for(int j=i+1;j<arr.length;j++){
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
    
    public static void quickSort(int arr[],int low, int high)
    {
        if(low<high){
            int partion = partion(arr,low,high);
            quickSort(arr,low,partion-1);
            quickSort(arr,partion+1,high);
        }
            
    }
    public static int partion(int arr[],int low,int high){
            int pivot = arr[low];
            int i = low;
            int j = high;
            while(i<j){
                while(arr[i]<=pivot && i<high){
                    i++;
                }
                while(arr[j]>pivot && j>low){
                    j--;
                }
                if(i<j){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            int temp = arr[low];
            arr[low]=arr[j];
            arr[j]=temp;
            return j;
        }
        public static void printArray(int arr[]){
            System.out.println("\nSorted array using Quick Sort: ");
            for(int i:arr){
                System.out.print(i+" ");
            }
        }

    public static void main(String[] args) {
        int arr[] ={7,4,1,5,3};
        // bubbleSort(arr);
        // insertionSort(arr);
        // selectionSort(arr);
        // MergeSort(arr,0,arr.length-1);
        quickSort(arr,0,arr.length-1);
        printArray(arr);
    }    
}