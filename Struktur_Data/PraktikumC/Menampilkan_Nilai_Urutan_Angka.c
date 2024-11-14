#include <stdio.h>

void tulis (int i) {
	if(i> -10) {
		printf ("Nilai i =% d \ n",i) ;
		tulis (--i) ;
	}
}

main () {
	int i =10;
	tulis (i) ;
}
