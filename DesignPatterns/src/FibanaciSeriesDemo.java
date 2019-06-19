public class FibanaciSeriesDemo {

    public static void main(String[] args) {
        System.out.println(getFibnaciSeries(7));
    }

    public static int getFibnaciSeries(int n){
        int result=0;
        int previous=0;
        int next=1;

        for(int i=0; i<n-2; i++){
            result=previous+next;
            previous=next;
            next=result;
        }


        return result;
    }
}
