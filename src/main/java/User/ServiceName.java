package User;

public enum ServiceName {

    USER_SERVICE("https://reqres.in");
    public final String value;
    private ServiceName(String label) {
        this.value = label;
    }
}
