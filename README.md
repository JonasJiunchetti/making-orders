# Making Orders
The Making Orders project is a simple application that introduces an Order entity and a corresponding service. The service provides a method for calculating the total price of an order based on factors such as the gross price, discount, and shipment tax.
## Order Class
The Order class is designed with the following attributes:
|Type   | Name  |
|---|---|
| Integer  | code  |
|  double |  basic |
| double  |  discount |


These attributes represent essential components of an order, including a unique identifier (code), the base price (basic), and a discount applied to the order (discount).

## Testing the project  
To assess the functionality of the project, the following steps can be taken:
- The project employs the CommandLineRunner implementation, allowing the direct execution of the service's method from the terminal.
- The input values for the CommandLineRunner are pre-set within the code for demonstration purposes. However, feel free to experiment with different values to thoroughly test the service's logic.
