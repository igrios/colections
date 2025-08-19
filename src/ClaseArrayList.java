import java.util.ArrayList;

public class ClaseArrayList {

public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<>(16);
            al.add("ignacio");
            al.trimToSize();
            al.add("byebye");
            al.ensureCapacity(1000);

}


}
