public class Block_A extends Student {
    private final String Mon_Toan = "Toan";
    private final String Mon_Ly = "Lý";
    private final String Mon_Hoa = "Hóa";

    public Block_A() {
    }

    public Block_A(int id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    public String getMon_Toan() {
        return Mon_Toan;
    }

    public String getMon_Ly() {
        return Mon_Ly;
    }

    public String getMon_Hoa() {
        return Mon_Hoa;
    }

    @Override
    public String toString() {
        return "Block_A{ " +
                "ID: '" + getId() + '\'' +
                "Name: '" + getName() + '\'' +
                "address: '" + getAddress() + '\'' +
                "priority: '" + getPriority() + '\'' +

                Mon_Toan + '-' +
                Mon_Ly + '-' +
                Mon_Hoa + '-' +
                '}';
    }
}
