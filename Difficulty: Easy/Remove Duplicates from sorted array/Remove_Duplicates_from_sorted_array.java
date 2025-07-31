class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        int i = 0;
        for(int j=1; j<arr.length ;j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(int k=0; k<=i;k++){
            al.add(arr[k]);
        }
        return al;
    }
}
