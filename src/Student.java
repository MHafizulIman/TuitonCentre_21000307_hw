// created by team in KL
public class Student {
    // data/attributes
    Name name;
    String kp;
    String address;
    String schoolname;

    float marks[] = new float[5];

    // methods or operations
    float calcAvg() {
        return 0;
    }

    float calcMin() {
        return 0;
    }

    void setName(Name thename) {
        name = thename;
    }

    void setMark(float mark, int i) throws Exception {
        if (mark < 0) throw new Exception("Error in mark detected");
        marks[i] = mark;
    }

    void displayMark(){
        for(int i = 0; i <marks.length; i++){
            System.out.println("Marks at index " + i + " " + marks[i]);
        }

    }

    public static void main(String args[]){
        Student stud0 = new Student();
        try { // try block = something in here can cause exception
            stud0.setMark(10, 0);
            stud0.setMark(-10, 1);
        }
        catch (Exception ex) { //catch block.. action taken when there is exception
            ex.printStackTrace();
            System.out.println("Cannot continue");

        }

        stud0.displayMark();

    }

}