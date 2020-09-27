package netStudy;

public class HotTestDemo {
    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;


//        Integer temp = i.bb;
//        i.setBb(j.bb);
//        j.setBb(temp);
//        System.out.println(i + " , " + j);

    }

    public static void main(String[] args){
        int[] arr = new int[] {1,2,3};
        swap(arr, 0,1);
        System.out.println("i = " + arr[0] + ", j = " + arr[1]);


    }

    public static class AA{
        Integer bb;

        public void setBb(Integer xx) {
            this.bb = xx;
        }

        AA(Integer a){
            this.bb = a;
        }

        @Override
        public String toString() {
            return bb.toString();
        }
    }

}
