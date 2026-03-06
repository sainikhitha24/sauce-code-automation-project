# Manual Test Cases: saudedemo.com

## 1. Login Workflow

### Test Case: Valid Login
**Description:** Verify that a user can log in with valid credentials.
**Pre-conditions:** User is on the login page (`https://www.saucedemo.com/`).
**Steps:**
1. Enter username `standard_user` in the username field.
2. Enter password `secret_sauce` in the password field.
3. Click the "Login" button.
**Expected Result:** User is successfully logged in and redirected to the Products page (`https://www.saucedemo.com/inventory.html`).

### Test Case: Invalid Login
**Description:** Verify that appropriately detailed error messages appear when a user attempts to log in with invalid credentials.
**Pre-conditions:** User is on the login page.
**Steps:**
1. Enter username `locked_out_user`.
2. Enter password `secret_sauce`.
3. Click the "Login" button.
**Expected Result:** User remains on the login page and an error message is displayed: "Epic sadface: Sorry, this user has been locked out."

## 2. Product Search & Filtering

### Test Case: Filter Products by Price (Low to High)
**Description:** Verify that products can be sorted by price ascending.
**Pre-conditions:** User is logged in and on the Products page.
**Steps:**
1. Click the sort dropdown menu in the top right.
2. Select "Price (low to high)".
**Expected Result:** The products list updates, with the cheapest product appearing first and the most expensive product appearing last.

## 3. Add to Cart

### Test Case: Add Multiple Items to Cart
**Description:** Verify that a user can add multiple items to their shopping cart.
**Pre-conditions:** User is logged in and on the Products page.
**Steps:**
1. Click the "Add to cart" button for "Sauce Labs Backpack".
2. Click the "Add to cart" button for "Sauce Labs Bike Light".
**Expected Result:** 
- The "Add to cart" buttons change to "Remove" buttons.
- The shopping cart badge in the top right updates to show the number "2".

## 4. Checkout Workflow

### Test Case: Successful Checkout
**Description:** Verify the complete end-to-end checkout process.
**Pre-conditions:** User has at least one item in their cart.
**Steps:**
1. Click the shopping cart icon.
2. Click the "Checkout" button on the cart page.
3. Enter First Name, Last Name, and Zip/Postal Code on the "Checkout: Your Information" page.
4. Click "Continue".
5. Verify the item total and tax on the "Checkout: Overview" page.
6. Click "Finish".
**Expected Result:** User is redirected to the "Checkout: Complete!" page and a success message ("Thank you for your order!") is displayed.
