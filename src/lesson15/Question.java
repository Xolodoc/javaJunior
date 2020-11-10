package lesson15;

import java.util.ArrayList;

public class Question {
    private String question;
    private ArrayList<Option> options = new ArrayList<Option>();

    public Question(String question) {
        this.question = question;
    }

    public void addOption(Option option){
        options.add(option);
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList<Option> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<Option> options) {
        this.options = options;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question)) return false;

        Question question1 = (Question) o;

        if (question != null ? !question.equals(question1.question) : question1.question != null) return false;
        return options != null ? options.equals(question1.options) : question1.options == null;
    }

    @Override
    public int hashCode() {
        int result = question != null ? question.hashCode() : 0;
        result = 31 * result + (options != null ? options.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", options=" + options +
                '}';
    }
}
