#include <stdio.h>

void deret ( int i ) {
	if(i <= 20) {
		printf ( " % d " ,i ) ;
		deret (i+2) ;
	}
}

main () {
	int i =0;
	deret (i) ;
}
