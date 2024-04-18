class Solution {
    public int minimumBuckets(String h) {
      char[] arr = h.toCharArray();
        int ans = 0;
        int n = arr.length;
        if(n==1 && arr[0]=='H')
            return -1;
        for(int i=0;i<n;i++){
            if(arr[i] == '.' || arr[i] == 'C') continue;
            if(arr[i]=='H'){
                if(i==0 && arr[i+1] != '.')
                    return -1;
                if(i==n-1 && arr[i-1] != '.')
                    return -1;
                if(i>0 && i<n-1 && arr[i+1]!='.' && arr[i-1]!='.')
                    return -1;
            }
            if(i+2<n && arr[i+1] == '.' && arr[i+2] == 'H'){
                ans++;
                arr[i] = 'C';
                arr[i+2] = 'C';
                continue;
            }
            if(i>0 && arr[i-1] == '.'){
                ans++;
                arr[i] = 'C';
                continue;
            }
            if(i<n-1 && arr[i+1] == '.'){
                ans++;
                arr[i] = 'C';
                continue;
            }
        }
        return ans;  
    }
}