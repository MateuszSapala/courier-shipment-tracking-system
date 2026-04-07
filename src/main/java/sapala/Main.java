package sapala;

public class Main {
    public static void main(String[] args) {
        final var courierCompany = new CourierCompany();

        // TODO: Create instance of your data models and provide them as parameters, e.g. 123456789012345675 is valid SSCC, but 123456789012345676 isn't as it have incorrect check digit.
        // TODO: How to test adding shipment is working as expected, without writing unit test?
        courierCompany.addShipment(null);

        // TODO: Use the SSCC of the newly created shipment to update it's status.
        courierCompany.updateShipmentStatus(null, null);
    }
}
