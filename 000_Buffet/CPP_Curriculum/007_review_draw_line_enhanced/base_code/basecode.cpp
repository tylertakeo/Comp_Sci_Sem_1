// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	///cout<<"             _______     "<<endl;
    //cout<<"            /       \\    "<<endl;
    //cout<<"           /  0   0  \\   "<<endl;
    //cout<<"           |    >    |   "<<endl;
    //cout<<"            \\_______/    "<<endl;
    //cout<<" ____         /  /       ___"<<endl;
    //cout<<" \\   \\   ____/  /____   /  /"<<endl;
    //cout<<"  \\   \\_/            \\_/  /"<<endl;
    //cout<<"   \\_____________________/"<<endl;
    //cout<<"         |          |      "<<endl;
    
    char sym;
	int len;
	int num;
	int y;
	int x;
	
	int go=1;
	int to=7;
	
	cout<<"What symol do you want your line to be."<<endl;
	cin>>sym;
	cout<<"How long do you want it to be."<<endl;
	cin>>len;
	cout<<"Please enter Y coordinate"<<endl;
	cin>>y;
	cout<<"Please Enter X coordinate"<<endl
	cin>>x;
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
