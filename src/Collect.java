import java.util.ArrayList;
import java.util.Iterator;
public class Collect implements Iterable<Contacts>{
    private ArrayList<Contacts> myList=new ArrayList<>();
    public void addStudent(Contacts a){
        myList.add(a);
    }

    @Override
    public String toString() {
        return "Collect{" +
                "myList=" + myList +
                '}';
    }

    @Override
    public Iterator<Contacts> iterator() {
        return myList.iterator();
    }


}
