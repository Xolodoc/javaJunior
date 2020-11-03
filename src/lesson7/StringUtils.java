package lesson7;

public class StringUtils {

    /* 1 слово - модификатор доступа (одно из 4-х вариантов слов)
    public - доступно внутри всего проекта
    ______ - доступно внутри текущей папки
    protected - (очень редкий) доступно только внутри класса и наследникам
    private - доступ к методу только внутри текущего класса
    (основные используемые очень часто public и private)
    2 - static (есть или нет)
    3 - возвращаемый тип (указываем либо тип, который мы ожидаем в виде ответа
    или слово void - если возвращаемого типа нет)
    4 - название метода (сами придумываем) с маленькой буквы
    5 - входящие параметры в скобках, через запятую
    6 - тело выполнения метода

     */


    public static int perimetrTreugolnika(int a, int b, int c) {
        return a + b + c;
    }

    public static String reverseText(String text) {
        return new StringBuilder(text).reverse().toString();

    }

}
