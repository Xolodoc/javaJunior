package lesson9;

public class People {
    // что можно писать в классе:
    // 1 - переменные (поля класса, характеристики объекта) - пишутся в самом начале
    // 2 - конструкторы - метод, котторый вызывается после слова "new"
    // 3 - методы
// если static - то это общее, добавляется всем
  private int age;
  private String name;
  private String surname;
  private boolean gender;

    // формула создания конструктора
    // 1 - модификатор доступа (в большинстве случаев public)
    // 2 - возвращаемый тип (всегда совпадает с названием класса)
    // 3 - входящие параметры
    // 4 - тело выполнения конструктора

// добавили пустой конструктор
    public People() {
    }

    public People (boolean gender){
        this.gender = gender;
    }

    public People(int age, String name, String surname, boolean gender){
        this.gender = gender;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

  public void setAge(int age){

      this.age = age;
  }

  public int getAge(){

      return this.age;
  }
public void setName(String name){

      this.name = name;
}
  public String getName(){

        return this.name;
  }


}
