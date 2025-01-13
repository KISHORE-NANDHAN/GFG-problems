//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.HashMap;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            ArrayList<Integer> array = new ArrayList<>();

            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int k = Integer.parseInt(br.readLine());

            ArrayList<Integer> ans = new Solution().countDistinct(arr, k);

            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();

            t--;
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        int l=0;
        HashMap<Integer,Integer> hs = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        for(int r=0;r<arr.length;r++){
            hs.put(arr[r],hs.getOrDefault(arr[r],0)+1);
            if(r-l+1 == k){
                al.add(hs.size());
                hs.put(arr[l],hs.get(arr[l])-1);
                if (hs.get(arr[l]) == 0) {
                    hs.remove(arr[l]);
                }
                l++;
            }
        }
        return al;
    }
}
