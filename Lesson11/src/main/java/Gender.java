public enum Gender {
    NAM("Nam"),
    NU("Nữ");

    private String value;

    Gender(String value) {

        this.value = value;
    }

    public String getValue() {

        return value;
    }
}
