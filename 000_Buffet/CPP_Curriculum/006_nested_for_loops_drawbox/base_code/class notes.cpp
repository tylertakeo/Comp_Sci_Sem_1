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
	
	cout<<"What symol do you want your box to be."<<endl;
	cin>>sym;
	cout<<"How wide do you want it to be."<<endl;
	cin>>wid;
	cout<<"How tall do you wan it to be."<<endl;
	cin>>tal;
	
	for(mun=0;mun<tal;mun++){
		for(num=0;num<wid;num++){
		cout<<sym;
		}	
		cout<<endl;
	}
	

}
