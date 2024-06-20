# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS

## Part C: Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

Customize HTML interface for the customer's application:

Changed font and store name to "<Keyed In>" on mainscreen.html, lines 14-18, 23
Added "Confirm Part" to title of confirmationaddpart.html, line 7
Added "Confirm Product" to title of confirmationaddproduct.html, line 7
Added "Confirmation" to title of confirmationassocpart.html, confirmationdeletepart.html, confirmationdeleteproduct.html, line 7, 6/5
Added background color in <body> element of each html page (inhousepartform.html, line 9; mainscreen.html, line 20; outsourcedpartform.html, line 9; productform.html, line 9)
Applied CSS provided on mainscreen.html to the following and adjust formatting with div class container: inhousepartform.html, line ; mainscreen.html, line 20; outsourcedpartform.html, line 9; productform.html, line 9

## Part D: Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.


For About Page:

Created about.html in templates using CSS provided
Added cohesive background color and font, line 20 & line 23
Added brief background of company goals, lines 28-31
Changed title to be About Us, line 18
Added header "who we are", line 26

On mainscreen.html, added "About Us" button leading to new about page, line 25
Added link to home page on about.html, lines 32-33

Created AboutController under controllers:
Imported Controller, GetMapping, Autowired, and Application Context, lines 3-6
Created mapping for the about page to be used with the About Us button, lines 10-15

## Part E: Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

Modified BootStrapData by adding a sample inventory of five parts and five products that will remain 5 by default based on the count of outsourced
part repository and product repository, lines 36-85 and lines 101-112

## Part F: Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
### •  The “Buy Now” button must be next to the buttons that update and delete products.
### •  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
### •  Display a message that indicates the success or failure of a purchase.

Created a new controller 'ProductBuyController' to handle product purchases
Created purchaseProduct in ProductBuyController that handles decreasing the product inventory count by 1 and returns success or failure, lines 30-37
Created purchaseStatus in ProductBuyController that returns message depending on success or failure, lines 39-50

Created purchasestatus.html that displays message from purchaseStatus and
displays a return home option , lines 17-22

Added "Buy Now" button to mainscreen.html next to Update and Delete buttons, line 96

## Part G: Modify the parts to track maximum and minimum inventory by doing the following:
### •  Add additional fields to the part entity for maximum and minimum inventory.
### •  Modify the sample inventory to include the maximum and minimum fields.
### •  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
### •  Rename the file the persistent storage is saved to.
### •  Modify the code to enforce that the inventory is between or at the minimum and maximum value.

In part.java, added new constructor (lines 56-62) to account for new invMin and invMax variables (lines 31-33)
In BootStrapData, incorporated new variables and assigned values to each part involving setters and getters for invMin and invMax, lines 49, 50, 58, 59, 67, 68, 76, 77, 85, 86
Added checker for inventory between the invMin and invMax to part.java (isInvValid with invError), lines 124-134
Added error messaging for isInvValid to AddInhousePartController and AddOutsourcedPartController, lines 46-49

Added invMin and invMax input fields with error messaging to outsourcedpartform.html and inhousepartform.html, lines 39-43
Added minimum inventory and maximum inventory categories to mainscreen.html, lines 45 and 46
Renamed database to keyed-in-new and reflected the change in application properties, line 6

## Part H: Add validation for between or at the maximum and minimum fields. The validation must include the following:
### •  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
### •  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
### •  Display error messages when adding and updating parts if the inventory is greater than the maximum.

Specified error messages from Part G of AddInhousePartController and AddOutsourcedPartController (lines 42-56) to let user know whether their inventory is below the min or above the max
Added validation to EnufPartsValidator to check for the appropriate amount of associated parts when adding/updating products (line 37)

## Part I: Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

Created successful test unit for setInvMin, setter for invMin, under PartTest, lines 153-160
Created successful test unit for getInvMin, getter for invMin, under PartTest, lines 162-169
Created successful test unit for setInvMax, setter for invMax, under PartTest, lines 171-178
Created successful test unit for getInvMax, getter for invMax, under PartTest, lines 180-187

## Part J: Remove the class files for any unused validators in order to clean your code.

Removed any unused validators, imports, code with no usage, line 31-33 MainScreenController, line 19 InhousePartService, validator DeletePartValidator



