package hackerBlockContest;
import java.util.*;
public class biggestNumber {
    public static int countDig(int n)  
    {  
        int count = 0;  
        while(n != 0)  
        {  
            // removing the last digit of the number n  
            n = n / 10;  
            // increasing count by 1  
            count = count + 1;  
        }  
    return count;  
    }  
    static int findMaxNum(int arr[], int n)
    {
        // sort the given array in
        // ascending order and then
        // traverse into descending
        Arrays.sort(arr);
 
        int num = arr[n - 1];
 
        // generate the number
        for (int i = n - 2; i >= 0; i--) {
            int powerI= countDig(num);
            num = num * (10^ powerI+1) + arr[i];
        }
 
        return num;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 54, 546, 548,60 };
 
        int n = arr.length;
 
        System.out.println(findMaxNum(arr, n));
    }
}


// #include<bits/stdc++.h>
// using namespace std;
// #define ll long long

// bool func(string frist,string second){
// 	return frist+second>second+frist;
// }

// int main() {
// 	ll t;
// 	cin>>t;
// 	while(t--){
// 		ll n;
// 		cin>>n;
// 		vector<string> v;
// 		for(int i=0;i<n;i++){
// 		string frist;
// 		cin>>frist;
// 			v.push_back(frist);
// 		}
// 		sort(v.begin(),v.end(),func);
		
// 		string ans = "";
// 		for(auto i:v){
// 			ans += i;
// 		}
// 		cout<<ans<<endl;
// 	}
// 	return 0;
// }