package ro.pub.cs.systems.eim.practicaltest02.model;

public class KeyValue {

    private String value;
    private Integer timeStamp;

    public KeyValue( String value, Integer timeStamp) {
        this.value = value;
        this.timeStamp = timeStamp;
    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Integer timeStamp) {
        this.timeStamp = timeStamp;
    }
}
