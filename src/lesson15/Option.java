package lesson15;

public class Option {
    private String option;
    private boolean isTrue = false;

    public Option() {
    }

    public Option(String option, boolean isTrue) {
        this.option = option;
        this.isTrue = isTrue;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public boolean isTrue() {
        return isTrue;
    }

    public void setTrue(boolean aTrue) {
        isTrue = aTrue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Option)) return false;

        Option option1 = (Option) o;

        if (isTrue() != option1.isTrue()) return false;
        return getOption() != null ? getOption().equals(option1.getOption()) : option1.getOption() == null;
    }

    @Override
    public int hashCode() {
        int result = getOption() != null ? getOption().hashCode() : 0;
        result = 31 * result + (isTrue() ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Option{" +
                "option='" + option + '\'' +
                ", isTrue=" + isTrue +
                '}';
    }
}
