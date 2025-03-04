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

    public void setName(String name) {
        this.name = name;
    }

    public int getPRN() {
        return prn;
    }

    public void setPRN(int prn) {
        this.prn = prn;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public float getCGPA() {
        return cgpa;
    }

    public void setCGPA(float cgpa) {
        this.cgpa = cgpa;
    }

  
}
