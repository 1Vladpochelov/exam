package Task2;



public class Cars implements Comparable<Cars> {
    Boolean isExclusive;
    Integer yearOfProduction;
    Integer levelOfEquipment;

    Double value;

    public Cars(boolean isExclusive, int yearOfProduction, int levelOfEquipment, double value) {
        this.isExclusive = isExclusive;
        this.yearOfProduction = yearOfProduction;
        this.levelOfEquipment = levelOfEquipment;
        this.value = value;

    }

    @Override
    public String toString() {
        return "Rok produkcji: " + yearOfProduction +
                ", Poziom wyposażenia: " + levelOfEquipment +
                ", Cena: " + value +
                ", Exsсlusive: " +isExclusive;
    }

    public boolean isExclusive() {
        return isExclusive;
    }

    public Integer getYearOfProduction() {
        return yearOfProduction;
    }

    public Integer getLevelOfEquipment() {
        return levelOfEquipment;
    }

    public Double getValue() {
        return value;
    }

    @Override
    public int compareTo(Cars o) {
        int result = o.getValue().compareTo(this.getValue());

        if(result == 0) {
            result = o.getYearOfProduction().compareTo(this.getYearOfProduction());
            if(result == 0){
                result = o.getLevelOfEquipment().compareTo(this.getLevelOfEquipment());
                if(result == 0){
                    result = o.getValue().compareTo(this.getValue());
                }
            }
        }
        return result;
    }


}