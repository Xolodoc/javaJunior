package lesson10;

public class Tovar {
    private int code;
    private String mainName;
    private int priceFull;
    private int priceSail;
    private String description;
    private String guarantee;
    private String country;

    public Tovar() {
    }

    public Tovar(int code, String mainName, int priceFull, int priceSallary) {
        this.code = code;
        this.mainName = mainName;
        this.priceFull = priceFull;
        this.priceSail = priceSallary;
    }

    public Tovar(int code, String mainName, int priceFull, int priceSallary, String description, String guarantee, String country) {
        this.code = code;
        this.mainName = mainName;
        this.priceFull = priceFull;
        this.priceSail = priceSallary;
        this.description = description;
        this.guarantee = guarantee;
        this.country = country;
    }

    public int getCode() {
        return code;
    }

    public String getMainName() {
        return mainName;
    }

    public int getPriceFull() {
        return priceFull;
    }

    public int getPriceSail() {
        return priceSail;
    }

    public String getDescription() {
        return description;
    }

    public String getGuarantee() {
        return guarantee;
    }

    public String getCountry() {
        return country;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMainName(String mainName) {
        this.mainName = mainName;
    }

    public void setPriceFull(int priceFull) {
        this.priceFull = priceFull;
    }

    public void setPriceSail(int priceSail) {
        this.priceSail = priceSail;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setGuarantee(String guarantee) {
        this.guarantee = guarantee;
    }

    public void setCountry(String country) {
        this.country = country;
    }



}
