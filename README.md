# foodHub
Project Scenario

A user can order food from an online platform by choosing a food item and a payment method.

The application:
- creates food items such as Pizza, Burger, and Salad
- allows different payment methods such as Card, Cash, and PayPal
- places and displays the order details

# Design Patterns Used

1. Simple Factory Pattern
 
The FoodFactory class is responsible for creating food objects.
It helps separate the object creation logic from the rest of the application.

Examples:
- Pizza
- Burger
- Salad

2. Strategy Pattern
   
The PaymentStrategy interface defines different payment methods.
This makes it easy to switch between payment options without changing the Order class.

Examples:
- CardPayment
- CashPayment
- PaypalPayment
