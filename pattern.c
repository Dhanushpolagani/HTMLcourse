#include <stdio.h>
#include <stdlib.h>

int main() {
    int i;
int n;
int t;
scanf("%d",&t);
for(int p=0;p<t;p++){
scanf("%d",&n);
printf("Case #%d:",p+1);
printf("\n");
for(int i=1;i<=n;i++){
    for(int j=n;j>=1;j--){
     if(i>=j){
         printf("*");
     }
     else{
         printf(" ");
     }
    }
   
    printf("\n");
}


}

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    return 0;

}