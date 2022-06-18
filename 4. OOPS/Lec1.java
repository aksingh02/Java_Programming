class Friends{
    String School_Friends;
    String Diploma_Friends;
    String Graduation_Friends;   
    
    public void bonding(){
        System.out.println("Schools Friends are life long Friends!");
    }

    public void names(){
        System.out.println(this.School_Friends);
        System.out.println(this.Graduation_Friends);
        
    }
}

class Family{
    String mem_names;
    int age;
    String relation;

    public void familyInfo(){
        System.out.println(mem_names);
        System.out.println(age);
        System.out.println(relation);
    }
}
 
public class Lec1 {
    public static void main(String args[]) {
        // Friends myfriends = new Friends();
        // myfriends.School_Friends = "Sunny, Tushar, Aditya, Tushar";
        // myfriends.Diploma_Friends = "Dhruv, Aman, Anmol, Dharmesh";
        // myfriends.Graduation_Friends = "Ashutosh, Mukund, Lokesh";

        // myfriends.bonding();
        // myfriends.names();

        Family mFamily = new Family();
        mFamily.mem_names = "Divyanshi";
        mFamily.age = 5;
        mFamily.relation = "Niece";
        mFamily.familyInfo();

        Family mFamily1 = new Family();
        mFamily1.mem_names = "Smt Nilam Devi";
        mFamily1.age = 45;
        mFamily1.relation = "Mother";
        mFamily1.familyInfo();
    }
}
