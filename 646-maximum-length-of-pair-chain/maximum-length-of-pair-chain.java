class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->a[1]-b[1]);
        /*Arrays.sort(pairs,new Comparator<int[]>(){
            public int compare (int a[],int b[]){
                if(a[0]>b[0])
                    return 1;
                    //return b[1]-a[1];
                else
                    return -1;
                    //return a[0]-b[0];
            }
        });

*/






        int count=0;int end=Integer.MIN_VALUE;
        for(int pair[] : pairs){
            if(pair[0]>end){
                count++;
                end=pair[1];
            }
        }
        return count;
    }
}