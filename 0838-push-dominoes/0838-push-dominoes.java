class Solution {
    public String pushDominoes(String dominoes) {
        int n=dominoes.length();
        char[] arr= new char[n+2];
        arr[0]='L';
        arr[n+1]='R';
        for(int i=1;i<=n;i++)
            arr[i]= dominoes.charAt(i-1);
        
        int j=0;
        int k=1;
        
        while(k<arr.length){
            while(arr[k]=='.')
                k++;
            solveConfig(arr,j,k);
            
            j=k;
            k++;
        }
        
        StringBuilder result=new StringBuilder();
        for(int i=1;i<=n;i++){
            result.append(arr[i]);
        }
        return result.toString();
    }
    
    public void solveConfig(char[] arr, int i, int j){
        if(arr[i]=='L' && arr[j]=='L'){
            //all to the left
            for(int k=i;k<j;k++)
                arr[k]='L';
        }else if(arr[i]=='R' && arr[j]=='R'){
            //all to the right
            for(int k=i;k<j;k++)
                arr[k]='R';
        }else if(arr[i]=='L' && arr[j]=='R'){
            //do nothing
        }else{
            int len=j-i;
            int mid= (j+i)/2;
            if(len%2==0){
                //odd length
                for(int k=i+1; k<mid;k++)
                    arr[k]='R';
                for(int k=mid+1; k<j;k++)
                    arr[k]='L';
            }else{
                // even length
                for(int k=i+1; k<=mid;k++)
                    arr[k]='R';
                for(int k=mid+1; k<j;k++)
                    arr[k]='L';
            }
        }
    }
}