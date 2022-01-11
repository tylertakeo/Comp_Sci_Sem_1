// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	while(true){
		int num1;
		int num2;
		char joe = 'x';
		int answer;
		cout<<"Enter a number:"<<endl;
		cin>>num1;
		cout<<"Enter another number:"<<endl;
		cin>>num2;
		cout<<"Enter an operation:"<<endl;
		cin>>joe;
		if (joe == '+'){
			cout<<num1+num2<<endl;
		}
		else if(joe == '-'){
			cout<<num1-num2<<endl;
		}
		else if(joe == '*'){
			cout<<num1*num2<<endl;
		}
		else if(joe == '%'){
			cout<<num1%num2<<endl;
		}
		else{
			cout<<"Enter an actual operation next time."<<endl;
		}
		int y;
		cout<<"Would you like to continue? 1=yes 2=no"<<endl;
		cin>>y;
		if(y==2){
			break;
		}
	}

}
