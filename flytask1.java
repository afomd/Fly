public class flytask1{
    public static void sort(int a[]){
        int temp=0;
        for(int i=0;i<a.length;i++){
            for(int j=i;j>0&&a[j-1]>a[j];j--){
                temp=a[j-1];
                a[j-1]=a[j];
                a[j]=temp;
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