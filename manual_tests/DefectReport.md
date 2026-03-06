# Defect Report: Checkout Failure on Empty Cart

**Bug ID:** BUG-001
**Title:** The Checkout Process allows an empty cart to proceed to the information page.
**Environment:** 
- URL: `https://www.saucedemo.com/`
- Browser: Chrome Desktop
- OS: macOS Sequoia 15.3

## Description
When the user goes to the shopping cart without adding any items and clicks "Checkout", they are still allowed to proceed to the "Checkout: Your Information" page. A checkout flow should prevent users from starting the checkout if their cart is empty.

## Pre-conditions
- User must be logged in with a standard account (`standard_user`).
- Shopping cart MUST be empty (0 items).

## Steps to Reproduce
1. Navigate to `https://www.saucedemo.com/`.
2. Login with `standard_user` and `secret_sauce`.
3. Do NOT add any products to the cart.
4. Click on the shopping cart icon at the top right corner.
5. Click on the "Checkout" button on the "Your Cart" page.

## Expected Result
An error message should be displayed indicating that the cart is empty, and the user should NOT be able to proceed to the next step of checkout. Alternatively, the "Checkout" button should be disabled when the cart is empty.

## Actual Result
The user is successfully directed to the "Checkout: Your Information" page, which implies they can checkout with an empty cart. 

## Severity
Medium (The user flow is logical, but the business rule of not ordering 0 items is violated).

## Attachments
*(In a real scenario, attach screenshots or a screen recording showing the empty cart proceeding and arriving at the checkout information screen).*
