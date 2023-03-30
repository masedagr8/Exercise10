public class Main {
    public static void main(String[] args) {


        Contacts person1=new Contacts("joe","1@gmail");
        Contacts person2=new Contacts("hoe","2@gmail");
        Contacts person3=new Contacts("goe","3@gmail");
        Contacts person4=new Contacts("foe","4@gmail");
        Contacts person5=new Contacts("doe","5@gmail");
        Contacts person6=new Contacts("soe","6@gmail");
        Collect job=new Collect();
        job.addStudent(person1);
        job.addStudent(person2);
        job.addStudent(person3);
        job.addStudent(person4);
        job.addStudent(person5);
        job.addStudent(person6);
        for(Contacts a: job){
            System.out.println(a);
        }
    }
}
//Create a class to store contact information consisting of a name and email address.
// Additionally, create a class to store a collection of contacts that implements the
// Iterable interface so that a for-each loop can be used with the the collection class.
// Demonstrate this functionality with a for-each loop in the Main.main() method that
// displays contact information.