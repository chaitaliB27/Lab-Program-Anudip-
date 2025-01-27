package javaBasic1;
//if condition present in program then boolean type variable 
//is also important.
public class DuplicationRemoving {
    public static void main(String[] args) {
        int arr[]= {56,89,56,44,23,44};

        for(int i=0; i<arr.length; i++) {
            boolean isDuplicate = false;//very important
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate) {
                System.out.println(arr[i]);
            }
        }
    }
}
