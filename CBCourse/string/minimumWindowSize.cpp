#include <bits/stdc++.h>
using namespace std;
int main(){
    string str,test;
    cin>>str>>test;
    if(test.size()>str.size()){
        cout<<"";
        return 0;
    }
    map<char,int> mt;
    map<char,int> ms;
    
    for(int i=0;i<test.size();i++){
        mt[test[i]]++;
    }
    int l=0,r=0,c=0,d=mt.size();
    int n = INT_MAX;
    vector<int> v;
    v.push_back(-1);
    v.push_back(-1);
    while(r<str.size()){
        ms[str[r]]++;
        if(ms[str[r]]==mt[str[r]] && mt[str[r]]){
            c++;
        }
        while(c==d){
            if(n>r-l+1){
                n = r-l+1;
                v[0] = l;
                v[1] = r;
            }
            ms[str[l]]--;
            if(ms[str[l]]<mt[str[l]] && mt[str[l]]){
                c--;
            }
            l++;
        }
        r++;
    }
    string ans = "";
    if(v[0]==-1) v[0]++;
    for(int i=v[0];i<=v[1];i++){
        ans += str[i];
    }
    cout<<ans;
return 0;
}