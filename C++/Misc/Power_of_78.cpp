/* Check whether a number is power of 78 or not. */
#include<iostream>
using namespace std;
int main() {
	int n,a;
	cin>>n;
	while(n--){
		cin>>a;
		if(ceil(log(a)/log(78)) == floor(log(a)/log(78))){
			cout<<1<<endl;
		}
		else {
			cout<<0<endl;
		}
	}
	return 0;
}
