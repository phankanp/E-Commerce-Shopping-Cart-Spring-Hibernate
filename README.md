Takes an existing e-commerce shopping cart application and identifies bugs, fixes them, and adds new feature enhancements to improve the application's quality and functionality.

# Steps

- Bug fix: Add form validation to the coupon code field in the first step of the checkout process. A coupon code will be considered valid if it contains between 5 and 10 characters. A unit test should also be added to verify that the added validation is working.
- Bug fix: Ensure that enough products are in stock before adding to the shopping cart. Whether adding products to the cart from product detail pages or updating an product&#39;s quantity from the cart view, more products than are in stock can be added to the cart. Fix this issue and add a unit test to cover this scenario.
- Bug fix: Update the order confirmation view template to mask all but the last 4 digits of the credit card number.
- Bug fix: Update the order confirmation email template to remove the billing address and all payment info.
- Enhancement: Add the cart subtotal to the page header, as part of the &quot;View Cart&quot; link. The subtotal should display only if the cart is not empty, and the number should be formatted with a dollar sign, as well as a comma for the thousands separator. Add a unit test to verify that the rendered view contains the subtotal.
- Enhancement: Add flash messaging to the application for adding, updating, and removing products from the cart, and for emptying the cart. Don&#39;t forget the case for when a user tries to request a product quantity that exceeds its amount in stock. Include unit tests to verify that flash messages work correctly.
- Enhancement: Detect when a product&#39;s detail view is requested, but the id requested isn&#39;t found in the database. The rendered view should display a message saying that the product wasn&#39;t found.

- Combine the common elements of Thymeleaf templates into a single template as fragments, and include those fragments in the individual templates, so as to eliminate the duplication of markup.
- Throw exceptions in the service layer for the case when an product&#39;s requested quantity exceeds the quantity in stock, instead of checking the quantity in the controller.
- Throw an exception in the service layer for the case when a certain product entity is requested - ProductService.findById(Long) - but is not found. Explicitly catch this exception in the controller layer, or use an @ExceptionHandler as stated in the next extra credit opportunity.
- Add @ExceptionHandler controller methods for when a product&#39;s detail view is requested for an unknown product id. This should produce a 404 response code and render a view that displays a friendly page saying that the product wasn&#39;t found
