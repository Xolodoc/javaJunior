package lesson15;

import java.util.ArrayList;

public class Test {
    private String mainName;
    private String description;
    private String pathToImage;
    private ArrayList<Question> questions = new ArrayList<Question>();

    public Test(String mainName) {
        this.mainName = mainName;
    }

    public String getMainName() {
        return mainName;
    }

    public void setMainName(String mainName) {
        this.mainName = mainName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPathToImage() {
        return pathToImage;
    }

    public void setPathToImage(String pathToImage) {
        this.pathToImage = pathToImage;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public void addQuestion(Question question){
        questions.add(question);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Test)) return false;

        Test test = (Test) o;

        if (getMainName() != null ? !getMainName().equals(test.getMainName()) : test.getMainName() != null)
            return false;
        if (getDescription() != null ? !getDescription().equals(test.getDescription()) : test.getDescription() != null)
            return false;
        if (getPathToImage() != null ? !getPathToImage().equals(test.getPathToImage()) : test.getPathToImage() != null)
            return false;
        return getQuestions() != null ? getQuestions().equals(test.getQuestions()) : test.getQuestions() == null;
    }

    @Override
    public int hashCode() {
        int result = getMainName() != null ? getMainName().hashCode() : 0;
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        result = 31 * result + (getPathToImage() != null ? getPathToImage().hashCode() : 0);
        result = 31 * result + (getQuestions() != null ? getQuestions().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Test{" +
                "mainName='" + mainName + '\'' +
                ", description='" + description + '\'' +
                ", pathToImage='" + pathToImage + '\'' +
                ", questions=" + questions +
                '}';
    }
}
