package netStudy;

public class TodoTestDemo {
    public static void main(String[] args){
        char[] array = {'a','b',' ','c','d',';','e','f',' ','g','h',';','i','j',' ','k','l'};
        String str = new String(array);
        TodoTestDemo tt = new TodoTestDemo();
        tt.demo(str);
    }

    public void demo(String str){
        String[] arr = str.split(";");
        for (String s:arr
             ) {
            System.out.println(s);
        }
    }


}
