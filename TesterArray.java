

public class TesterArray {
    public static void main(String[] args) {
        
    
    int[] angka = {1, 2, 3};
    int[] number = new int[3];
    number[2] = 10;

    //array obeject
    produk[] p = new produk[5];
    p[3] = new produk();
    p[3].print();
    p[0] = new CD();
    p[0].print();
    p[1] = new DVD();
    p[1].print();

    CD[] cd = new CD[10];
    cd[0] = new CD();
    cd[0].print();
    DVD[] dvd = new DVD[8];
    dvd[6] = new DVD();
    dvd[6].print();


    }
}