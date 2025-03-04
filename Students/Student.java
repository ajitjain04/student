//Student.java

class Student {
    private String name;
    private int prn;
    private String branch;
    private String batch;
    private float cgpa;

   
    public Student(String name, int prn, String branch, String batch, float cgpa) {
        setName(name);
        setPRN(prn);
        setBranch(branch);
        setBatch(batch);
        setCGPA(cgpa);
    }

    
    public String getName() {
        return name;
    }
    public int getPRN() {
        return prn;
    }

    public String getBranch() {
        return branch;
    }

    public String getBatch() {
        return batch;
    }

    public float getCGPA() {
        return cgpa;
    }

}
