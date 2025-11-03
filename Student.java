package encap;

public class Student {
    private int roll;
    private String name;
    private String address;
    static String colname;

    public Student(String name, int roll, String address) {
        this.name = name;
        this.roll = roll;
        this.address = address;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public static String getColname() {
        return colname;
    }
}
