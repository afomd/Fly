public class flytask2{
    public static void sort(int a[]){
        int temp=0;
        for(int i=a.length/2;i>0;i/=2){
            for(int j=0;j<a.length;j++){
                for(int k=j;k>0&&a[k-1]>a[k];k--){
                temp=a[k-1];
                a[k-1]=a[k];
                a[k]=temp;
                }
            }
        }
    }
public static void main(String args[]){
    int b[] =new int[] {4,8,5,1,7,6,2,9,3};
    sort(b);
    for(int i=0;i<b.length;i++)
        System.out.print(b[i]+",");
    }
}