// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	char sym;
	int wid;
	int num;
	int mun;
	int tal;
	
	int go=1;
	int to=7;
	
	cout<<"What symol do you want your present to be."<<endl;
	cin>>sym;
	cout<<"How wide do you want your present to be."<<endl;
	cin>>wid;
	cout<<"How tall do you want your present to be."<<endl;
	cin>>tal;
	
	for(mun=0;mun<tal;mun++){
		for(num=0;num<wid;num++){
		
		cout<<sym;
		
		
		}	
		cout<<endl;
	}

}
