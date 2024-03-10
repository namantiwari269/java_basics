package TwoDimensionArray;

public class numberspiraltwodi {
    public static void main(String[] args) {
    int[][] a= {{43,54,23,6},{1,45,25,4},{34,74,13,56},{12,44,78,13},{74,56,23,65}};
    int n = a.length;
    int m = a[0].length;      
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print (a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    int minr=0,minc=0,maxr=n-1,maxc=m-1;
    while(minr<maxr && minc<maxc ){
        for(int i = minc ; i<=maxc;i++){
            System.out.print(a[minr][i]+" ");
        }
        if(minc>maxc || minr>maxr)break;
        minr++;
        for(int i = minr ; i<=maxr;i++){
            System.out.print(a[i][maxc]+" ");
        }
        maxc--;
        if(minc>maxc || minr>maxr)break;
        for(int i = maxc ; i>=minc;i--){
            System.out.print(a[maxr][i]+" ");
        }
        maxr--;
        if(minc>maxc || minr>maxr)break;
        for(int i = maxr ; i>=minr;i--){
            System.out.print(a[i][minc]+ " ");
        }
        minc++;
        if(minc>maxc || minr>maxr)break;
    }
    }
}
