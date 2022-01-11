// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	//cout<<"yeah we are starting c++"<<endl;
	int z =5;
	while(z <= 25){
		cout<<z<<endl;
		
		z=z+1;
	}
	
	cout<<"-------"<<endl;
	
	for(int i = 5; i <=25; i = i +1){
		cout<<i<<endl;
	}
	
	cout<<"-------"<<endl;
	
	int y= 15;
		while (true) {
		if (y<5)
		{
			break;
		}
		cout<<y<<endl;
		y=y-1;
		}
	
	cout<<"-------"<<endl;
	
	for(int c = 15; c >= 5; c = c -1){
		cout<<c<<endl;
	}
	//int x= 5;
		//while (true) {
		//if (x>25)
		//	{
		//		break;
		//	}
		//	cout<<x<<endl;
		//	x=x+1;
		//}
}


