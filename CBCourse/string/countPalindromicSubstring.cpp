#include<iostream>
using namespace std;

int main() {
	string str;
	cin>>str;
	int ans=0;
	for(int i=0;i<str.size();i++){
		int left=i,right=i;
		while(left>=0 && right<str.size() && str[left]==str[right]){
			left--;
			right++;
			ans++;
		}
	}
	for(int i=0;i<str.size()-1;i++){
		int left=i,right=i+1;
		while(left>=0 && right<str.size() && str[left]==str[right]){
			left--;
			right++;
			ans++;
		}
	}
	cout<<ans;
	return 0;
}