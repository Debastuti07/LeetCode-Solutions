class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
         List<Integer>ans=new ArrayList<>();
        int n=arr.length;
        int i=0;
        while(i<n){
            int idx=arr[i]-1;
            if(arr[i]==i+1||arr[i]==arr[idx]) i++;
            else{
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
            }

        }
        for( i=0;i<n;i++){
            if(arr[i]!=i+1) ans.add(i+1);
        }
        return ans;
    }
}