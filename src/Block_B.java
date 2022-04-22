public class Block_B extends Student {
    private final String Mon_Toan = "Toán";
    private final String Mon_Hoa = "Hóa";
    private final String Mon_Sinh = "Sinh";

    public Block_B() {
    }

    public Block_B(int id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    public String getMon_Toan() {
        return Mon_Toan;
    }

    public String getMon_Hoa() {
        return Mon_Hoa;
    }

    public String getMon_Sinh() {
        return Mon_Sinh;
    }

    @Override
    public String toString() {
        return "Block_A{ " +
                "ID: '" + getId() + '\'' +
                "Name: '" + getName() + '\'' +
                "address: '" + getAddress() + '\'' +
                "priority: '" + getPriority() + '\'' +

                Mon_Toan + '-' +
                Mon_Hoa + '-' +
                Mon_Sinh + '-' +
                '}';
    }
}
