// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	
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
		cout<<num1+num2;
	}
	else if(joe == '-'){
		cout<<num1-num2;
	}
	
	else if(joe == '*'){
		cout<<num1*num2;
	}
	else if(joe == '%'){
		cout<<num1%num2;
	}
	else{
		cout<<"Enter an actual operation next time.";
	}
	
}
