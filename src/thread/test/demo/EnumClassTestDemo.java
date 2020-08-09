package thread.test.demo;

public class EnumClassTestDemo {

    enum Phone{
        HuaWei,iPhone,oppo,vivo;

        private Phone(){
            System.out.println("Phone: " + this.toString()); //会将枚举中的元素转换为String(字符串)
        }

        public void phoneColor(){
            System.out.println("手机颜色");
        }
    }

    public static void main(String[] args) {
        //对枚举进行实例赋值
        Phone phone = Phone.HuaWei;
        phone.phoneColor();
    }
}
