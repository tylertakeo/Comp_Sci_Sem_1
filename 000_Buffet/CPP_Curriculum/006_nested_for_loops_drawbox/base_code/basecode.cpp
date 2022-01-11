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
	int santa;
	int x;
	int y;
	cout<<"Santa needs help wrapping gifts this year for christmas... Will you help him???   1-yes   2-no"<<endl;
	cin>>santa;
	
	if(santa==1){
	cout<<"What symol do you want your present to be."<<endl;
	cin>>sym;
	cout<<"How wide do you want your present to be."<<endl;
	cin>>wid;
	cout<<"How tall do you want your present to be."<<endl;
	cin>>tal;
	//cout<<"Enter x coordinate for your present."<<endl;
	//cin>>x;
	//cout<<"Enter y coordinate for your present."<<endl;
	//cin>>y;
	
	//x=x;
	//y=y+15;
	
	for(mun=0;mun<tal;mun++){
		for(num=0;num<wid;num++){
		//gotoxy(x,y);
		cout<<sym;
		}	
		cout<<endl;}
	}
	else if(santa==2){
		cout<<"Because of you lack of kindeness, you will be reciving coal for christmas.."<<endl;
	}
	else{
		cout<<"You didnt follow santas intructions... try again."<<endl;
	}
	
	

}
