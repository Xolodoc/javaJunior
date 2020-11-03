package lesson9;

public class Krug {
    private double radius;

    public Krug() {

    }

    public Krug(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double perimetr(){ // perimetr - находится в круге
        return 2 * Math.PI * this.radius;
    }

}


// квадрат, прямоугольник, треугольник, овал - самостоятельно прописываем переменные в классе,
// конструкторы, методы сэт и гет, площадь и периметры,
// далее создаем главный класс, в котором демонстрируем работоспособность всех методов