class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

abstract class GoodsBogie {
    protected String shape;
    protected String cargo;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    public void assignCargo(String cargoType) {
        try {
            if (shape.equalsIgnoreCase("Rectangular") && cargoType.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo assignment: Petroleum cannot be loaded in Rectangular bogie");
            }
            this.cargo = cargoType;
            System.out.println("Cargo assigned successfully: " + cargoType + " to " + shape + " bogie");
        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Cargo assignment process completed");
        }
    }

    public String getCargo() {
        return cargo;
    }
}

class RectangularBogie extends GoodsBogie {
    public RectangularBogie() {
        super("Rectangular");
    }
}

class CylindricalBogie extends GoodsBogie {
    public CylindricalBogie() {
        super("Cylindrical");
    }
}

public class UC15 {
    public static void main(String[] args) {
        GoodsBogie bogie1 = new CylindricalBogie();
        bogie1.assignCargo("Petroleum");

        GoodsBogie bogie2 = new RectangularBogie();
        bogie2.assignCargo("Petroleum");

        GoodsBogie bogie3 = new RectangularBogie();
        bogie3.assignCargo("Coal");
    }
}