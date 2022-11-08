#include<iostream>
using namespace std;
int main() {
	string str;
	cin>>str;
	for(int i=0;i<str.size();i++){
		if(i%2){
			cout<<char('a'+((str[i]-'a')-1));
		}
		else cout<<char('a'+((str[i]-'a')+1));
	}
	return 0;
}