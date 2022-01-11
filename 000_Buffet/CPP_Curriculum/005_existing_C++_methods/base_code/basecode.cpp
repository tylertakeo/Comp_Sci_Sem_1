// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	char sym;
	int len;
	int num;
	char dir;
	
	int go=1;
	int to=7;
	
	cout<<"What symol do you want your line to be."<<endl;
	cin>>sym;
	cout<<"How long do you want it to be."<<endl;
	cin>>len;
	cout<<"would you like your line to be vertical or horizontal. v=vertical h=horizontal d=diagonal"<<endl;
	cin>>dir;
	if(dir=='v'){
		for(num=0;num<len;num++){
			cout<<sym<<endl;
		}
	}	
	else if(dir=='h'){
		for(num=0;num<len;num++){
			cout<<sym;
		}
	}
	else if(dir=='d'){
		for(num=0;num<len;num++){
			gotoxy(go,to);
			cout<<sym<<endl;
			go=go+1;
			to=to+1;
		}
	}

}
