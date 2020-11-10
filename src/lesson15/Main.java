package lesson15;

public class Main {
    public static void main(String[] args) {
        Option option1 = new Option("in", false);
        Option option2 = new Option("by", false);
        Option option3 = new Option("on", false);
        Option option4 = new Option("at", true);

        Option option5 = new Option("doesn’t she ?", false);
        Option option6 = new Option("is she?", false);
        Option option7 = new Option("isn’t she?", true);
        Option option8 = new Option("do she?", false);

        Question question1 = new Question("My grandmother started work … 1960.");
        Question question2 = new Question("She likes living in Spain, …?");

        question1.addOption(option1);
        question1.addOption(option2);
        question1.addOption(option3);
        question1.addOption(option4);

        question2.addOption(option5);
        question2.addOption(option6);
        question2.addOption(option7);
        question2.addOption(option8);

        Test test = new Test("Тест Определите уровень английского языка");
        test.setPathToImage("http://easy-it-courses.com/resources/images/tests/icons/Test1.png");
        test.setDescription("В современном мире знание английского языка является неотъемлемой частью успешного профессионального роста. Если Вы хотите: открыть свой бизнес; занимать руководящую должность в крупной компании; быть успешным менеджером, как в Украине, так и за рубежом; или, в конце концов, стать высокооплачиваемым специалистом в сфере IT – Вы просто обязаны владеть английским языком на достойном уровне!\n" +
                "\n" +
                "Вы хотите узнать свой уровень английского языка онлайн? Тогда компания Easy IT предлагает Вам пройти специальный тест, результат которого покажет Ваш уровень владения английским по международной классификации от уровня А1 (Beginner) до С2 (Advanced).");

        test.addQuestion(question1);
        test.addQuestion(question2);

        System.out.println(test);




    }
}
