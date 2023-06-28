package org.example.car;

public enum Gear {
    MANUAL("Manual"),
    AUTOMATIC("Automatic"),
    SEMI_AUTOMATIC("Semi_Automatic");

    private final String value;

    Gear(String value){
        this.value = value;
    }
    public String getValue(){
        return value;
    }

}
