package case_study_furama.model.facility;

public abstract class Facility {
    private String nameFacility;
    private double areaFacility;
    private double moneyFacility;
    private int maxPerSon;
    private String typeFacility;

    protected Facility() {
    }

    protected Facility(String nameFacility, double areaFacility, double moneyFacility, int maxPerSon, String typeFacility) {
        this.nameFacility = nameFacility;
        this.areaFacility = areaFacility;
        this.moneyFacility = moneyFacility;
        this.maxPerSon = maxPerSon;
        this.typeFacility = typeFacility;
    }

    public String getNameFacility() {
        return nameFacility;
    }

    public void setNameFacility(String nameFacility) {
        this.nameFacility = nameFacility;
    }

    public double getAreaFacility() {
        return areaFacility;
    }

    public void setAreaFacility(double areaFacility) {
        this.areaFacility = areaFacility;
    }

    public double getMoneyFacility() {
        return moneyFacility;
    }

    public void setMoneyFacility(double moneyFacility) {
        this.moneyFacility = moneyFacility;
    }

    public double getMaxPerSon() {
        return maxPerSon;
    }

    public void setMaxPerSon(int maxPerSon) {
        this.maxPerSon = maxPerSon;
    }

    public String getTypeFacility() {
        return typeFacility;
    }

    public void setTypeFacility(String typeFacility) {
        this.typeFacility = typeFacility;
    }

    @Override
    public String toString() {
        return "nameFacility='" + nameFacility + '\'' +
                ", areaFacility=" + areaFacility +
                ", moneyFacility=" + moneyFacility +
                ", maxPerSon=" + maxPerSon +
                ", typeFacility='" + typeFacility + '\'';
    }
}
