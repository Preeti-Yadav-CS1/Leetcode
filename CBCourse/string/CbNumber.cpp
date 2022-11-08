package hackerBlockContest;
#include<bits/stdc++.h>
using namespace std;
public class CbNumber {
    int ans = 0;
    bool isCB(string s,map<long long,int> m){
    long long n =0;
        for(auto i:s){
            n = n*10+(i-'0');
        }
        if(n==0 || n==1) return false;
        if(m[n]) return true;
        for(auto i:m){
            if(n%i.first==0 && i.first!=n){
                return false;
            }
            
        }
        return true;
    }

    void cal(string s,map<long long,int> m,int i,int l){
        if(i==s.size()){
            ans = max(ans,l);
            return;
        }
        string a = "";
        for(int j=i;j<s.size();j++){
            a += s[j];
            if(isCB(a,m)){
            // m[stoi(a)]=1;
                cal(s,m,j+1,l+1);
            }
            else{
                cal(s,m,j+1,l);
            }
            }
		
	
	return;
}

int main() {
	int n;
	cin>>n;
	string s;
	cin>>s;
	map<long long,int> m;
	m[2] = 1;
	m[3]=1;
	m[5] = 1;
	m[7] =1;
	m[11] = 1;
	m[13] = 1;
	m[17] = 1;
	m[19] = 1;
	m[23] = 1;
	m[29]  =1;
	for(int i=0;i<s.size();i++){
	cal(s,m,i,0);
	}
	cout<<ans;
	return 0;
}
}

