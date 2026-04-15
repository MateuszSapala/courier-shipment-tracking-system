# Courier Shipping Tracking System

## Task

Your task is to implement a simple courier shipment tracking system. This system should allow for registering shipments and managing their status.

## Requirements
1. Model the data:
    - Create data models for `shipment` and other data if necessary`.
       - A `shipment` should have at least u unique `sscc`, `status`, `sender's address`, and `recipient's address`. The `sscc` should follow the **SSCC Serial Shipping Container Code** standard. You can find more about in on [Serial shipping container code](https://en.wikipedia.org/wiki/Serial_shipping_container_code) and [How to calculate a check digit manually](https://www.gs1.org/services/how-calculate-check-digit-manually).
    - Consider using appropriate Java constructs for these data models.
    - Add a test checking if the `sscc` validation works as expected.
2. Implement the Courier Company:
    - Modify the existing `CourierCompany` class by adding storage for shipments and implementing methods that currently throw `UnsupportedOperationException`.
    - Update the method signatures (parameters, return types) to be specific and strongly typed.
    - Think about the best way to store and update shipments.
3. Demonstrate functionality:
    - Update the `Main` class with example usage to successfully execute both methods in `CourierCompany`.

## Guidelines

The task is simple and serves as a basic for conversation more than its sole purpose. During this task, we also be paying attention to your problem-solving approach, knowledge of Java features, and overall coding practices. During conversation, we can ask clarifying questions, and you can do the same,

Good luck!
