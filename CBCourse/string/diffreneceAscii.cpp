#include<iostream>
using namespace std;
int main() {
	string str;
	cin>>str;
	int i;
	for( i=0;i<str.size()-1;i++){
		cout<<str[i]<<str[i+1]-str[i];
	}
	cout<<str[i];
	return 0;
}