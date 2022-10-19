package case_study_furama.model.facility;

public class Villa extends Facility {
    private String standardFacility;
    private int areaPool;
    private int numberFloors;

    public Villa() {
    }

    public Villa(String nameFacility, int areaFacility, int moneyFacility, int maxPerSon, String typeFacility, String standardFacility, int areaPool, int numberFloors) {
        super(nameFacility, areaFacility, moneyFacility, maxPerSon, typeFacility);
        this.standardFacility = standardFacility;
        this.areaPool = areaPool;
        this.numberFloors = numberFloors;
    }

    public String getStandardFacility() {
        return standardFacility;
    }

    public void setStandardFacility(String standardFacility) {
        this.standardFacility = standardFacility;
    }

    public int getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(int areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "Villa : " + super.toString() +
                "standardFacility='" + standardFacility + '\'' +
                ", areaPool=" + areaPool +
                ", numberFloors=" + numberFloors + '\'';
    }
}
