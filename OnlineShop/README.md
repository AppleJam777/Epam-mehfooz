a simple store with a shopping basket. It's a multi-part exercise:

Warehouse: uses a map to track each product's price and stock. It lets you add a product, look up its price, check its stock, and take one item from stock (returning whether that worked).
Purchase: represents one line in the basket, with a product name, amount and unit price. It can compute its total price and increase its amount.
ShoppingBasket: holds the purchases. Adding a product already in the basket increases its amount instead of making a duplicate. It can give the basket's total price and print its contents.
Store: a text interface where the customer types product names to add to the basket, and then checks out to see the total.
