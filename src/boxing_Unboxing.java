import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class boxing_Unboxing {
    public static void main(String[] args) {

//        boxing premitive type
        int x = 10;
        System.out.println(x);

//        Boxing Object
        Integer obj = new Integer(50);
        System.out.println(obj);

//        Unboxing
        int a = obj.intValue();
        System.out.println(a);

//          Autoboxing
        int y =10;
        Integer obj2 = 80;

        System.out.println(y);
        System.out.println(obj2);

        int z =obj2;
        System.out.println(z);




    }
}