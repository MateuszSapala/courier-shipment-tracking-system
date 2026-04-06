# Courier Shipping Tracking System

## Task

Your task is to implement a simple courier shipment tracking system. This system should allow for registering shipments and managing their status.

## Requirements
1. Model the data:
    - Create data models for `shipment` and `status event`.
        - A `shipment` should have at least u unique `scss`, `sender's address`, and `recipient's address`. The `sccss` should follow the *SCSS Serial Shipping Container Code* standard. You can find more about in on [Serial shipping container code](https://en.wikipedia.org/wiki/Serial_shipping_container_code) and [International Article Number](https://en.wikipedia.org/wiki/International_Article_Number). The `shipment` must store the entire history of its status changes.
        - A `status event` should represent a single status change, containing the `status` and a `timestamp` indicating when the change occurred.
    - Consider using appropriate Java constructs for these data models.
2. Implement the Courier Company:
    - Modify the existing `CourierCompany` class by implementing methods that currently throw `UnsupportedOperationException`.
    - Update the method signatures (parameters, return types) to be specific and strongly typed.
    - Think about the best way to store and retrieve shipments, ensuring the implementation is thread safe.
3. Demonstrate functionality:
    - Update the `Main` class with example usage to successfully execute all three methods in `CourierCompany`

## Guidelines

The task is simple and serves as a basic for conversation more than its sole purpose. During this task, we also be paying attention to your problem-solving approach, knowledge of Java features, and overall coding practices. During conversation, we can ask clarifying questions, and you can do the same,

Good luck!
