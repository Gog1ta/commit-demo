package lwj.java.basic.sort;
public class Bubblesort {
    /**
     * 冒泡排序
     * @param a:数组
     * @param  n:排序趟数
     */
    public static void bubblesort1(int[] a,int n){
        int i,j;
        //表示n次排序的过程
        for  (i=0;i<n;i++){
            for(j=1;j<n-i;j++){
                if(a[j-1]>a[j]){
                    //交换a[j-1]和a[j]
                    int temp;
                    temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
        public static void main(String[] args){
    int[] arr ={1,3,5,4,6,9,8,7,2,1,5,4,6,2,5,};
            Bubblesort.bubblesort1(arr,arr.length);
         for(int i: arr){
             System.out.println(i+",");
         }
        }
}