public class Block_C extends Student {
    private final String Mon_Van = "Văn";
    private final String Mon_Su = "Sử";
    private final String Mon_Dia = "Địa";

    public Block_C() {
    }

    public Block_C(int id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    public String getMon_Van() {
        return Mon_Van;
    }

    public String getMon_Su() {
        return Mon_Su;
    }

    public String getMon_Dia() {
        return Mon_Dia;
    }

    @Override
    public String toString() {
        return "Block_A{ " +
                "ID: '" + getId() + '\'' +
                "Name: '" + getName() + '\'' +
                "address: '" + getAddress() + '\'' +
                "priority: '" + getPriority() + '\'' +

                Mon_Van + '-' +
                Mon_Su + '-' +
                Mon_Dia + '-' +
                '}';
    }
}
