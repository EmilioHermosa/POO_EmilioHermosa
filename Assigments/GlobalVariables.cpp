#include <stdio.h>
#include <stdlib.h>


int varGlob = 9;
#define varDef 8

void ejemplo() {
    int varLoc = 5;
    varGlob = 4;
    printf("varLoc es una variable local y vale %d\n", varLoc);
    printf("varGlob*varLoc vale %d\n", varGlob*varLoc);
    printf("varGlob ahora vale %d\n", varGlob);
    printf("varDef vale %d\n", varDef);
     varDef = 1;
    printf("varDef ahora vale %d\n", varDef);
}

int main() {
    ejemplo(); 
    printf("varGlob es una variable global y vale %d\n", varGlob);
   
    
    
    return 0;
}
