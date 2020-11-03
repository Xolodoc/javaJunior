package uprazhneniya;

public class Treugolnik {

    private int a;
    private int b;
    private int c;
    private int h;

    public Treugolnik() {

    }

    public Treugolnik(int a, int b, int c, int h) {

        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return this.a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return this.b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getC() {
        return this.c;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getH() {
        return this.h;
    }
// public double countPerimetr(){
// if(a+b<c || b+c<a || a+c<b){
// sout;
// return-1;
// }
// return a + b + c;

    public int perimetr() {
        return (this.a + this.b + this.c);

    }

    public int square() {
        return this.a * this.h / 2;
    }

}
