package sapala;

public class Main {
    public static void main(String[] args) {
        final var courierCompany = new CourierCompany();

        // TODO: Create instance of your data models and provide them as parameters, e.g. 123456789012345675 is valid SSCC, but 123456789012345676 isn't.
        courierCompany.addShipment(null);

        // TODO: Use the SSCC of the newly created shipment to update it's status.
        courierCompany.updateShipmentStatus(null, null);

        final var lateShipments = courierCompany.getLateShipments();
        System.out.println("Late shipments report: " + lateShipments);
    }
}
