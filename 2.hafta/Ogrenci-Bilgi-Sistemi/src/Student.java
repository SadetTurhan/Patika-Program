public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote(int matWritten,int matVerbal, int fizikWritten,int fizikVerbal, int kimyaWritten,int kimyaVerbal) {

        if (matWritten >= 0 && matWritten <= 100 && matVerbal >= 0 && matVerbal <= 100) {
            this.mat.note = (matWritten * 0.8) + (matVerbal * 0.2);
        }

        if (fizikWritten >= 0 && fizikWritten <= 100 && fizikVerbal >= 0 && fizikWritten <= 100) {
            this.fizik.note = (fizikWritten * 0.8) + (fizikVerbal * 0.2);
        }

        if (kimyaWritten >= 0 && kimyaWritten <= 100 && kimyaVerbal >= 0 && kimyaWritten <= 100) {
            this.kimya.note = (kimyaWritten * 0.8) + (kimyaVerbal * 0.2);
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.fizik.note + this.kimya.note + this.mat.note) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }

}