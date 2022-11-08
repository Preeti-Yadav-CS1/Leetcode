
#include<bits/stdc++.h>
using namespace std;
int main() {
	string str;
	cin>>str;
	int l=0;
	char ch;
	map<char,int> m;
	for(int i=0;i<str.size();i++){
		m[str[i]]++;
		if(l<m[str[i]]){
			l = m[str[i]];
			ch = str[i];
		}
	}
	cout<<ch;
	return 0;
}
