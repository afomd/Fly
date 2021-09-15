public class flytask3{
    public static void sort(int[] arr,int begin,int end) {
        int a = begin;
        int b = end;
        if (a >= b) {
            return;
        }
        int x = arr[a];
        while (a < b) {
            while (a < b && arr[b] >= x) {
                b--;
            }
            if (a < b) {
                arr[a] = arr[b];
                a++;
            }
            while (a < b && arr[a] <= x) {
                a++;
            }
            if (a < b) {
                arr[b] = arr[a];
                b--;
            }
        }
        arr[a] = x;
        sort(arr,begin,a-1);
        sort(arr,a+1,end);
    }
public static void main(String args[]){
    int c[] =new int[] {4,8,5,1,7,6,2,9,3};
    sort(c,4,3);
    for(int i=0;i<c.length;i++)
        System.out.print(c[i]+",");
    }
}

            
        