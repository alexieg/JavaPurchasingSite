Part C

Customize HTML interface for the customer's application:

Changed font and store name to "<Keyed In>" on mainscreen.html, lines 14-18, 23
Added "Confirm Part" to title of confirmationaddpart.html, line 7
Added "Confirm Product" to title of confirmationaddproduct.html, line 7
Added "Confirmation" to title of confirmationassocpart.html, confirmationdeletepart.html, confirmationdeleteproduct.html, line 7, 6/5
Added background color in <body> element of each html page (inhousepartform.html, line 9; mainscreen.html, line 20; outsourcedpartform.html, line 9; productform.html, line 9)
Applied CSS provided on mainscreen.html to the following and adjust formatting with div class container: inhousepartform.html, line ; mainscreen.html, line 20; outsourcedpartform.html, line 9; productform.html, line 9

Part D

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

Part E

Modified BootStrapData by adding a sample inventory of five parts and five products that will remain 5 by default based on the count of outsourced
part repository and product repository, lines 36-85 and lines 101-112

Part F
Created a new controller 'ProductBuyController' to handle product purchases
Created purchaseProduct in ProductBuyController that handles decreasing the product inventory count by 1 and returns success or failure, lines 30-37
Created purchaseStatus in ProductBuyController that returns message depending on success or failure, lines 39-50

Created purchasestatus.html that displays message from purchaseStatus and
displays a return home option , lines 17-22

Added "Buy Now" button to mainscreen.html next to Update and Delete buttons, line 96

Part G
In part.java, added new constructor (lines 56-62) to account for new invMin and invMax variables (lines 31-33)
In BootStrapData, incorporated new variables and assigned values to each part involving setters and getters for invMin and invMax, lines 49, 50, 58, 59, 67, 68, 76, 77, 85, 86
Added checker for inventory between the invMin and invMax to part.java (isInvValid with invError), lines 124-134
Added error messaging for isInvValid to AddInhousePartController and AddOutsourcedPartController, lines 46-49

Added invMin and invMax input fields with error messaging to outsourcedpartform.html and inhousepartform.html, lines 39-43
Added minimum inventory and maximum inventory categories to mainscreen.html, lines 45 and 46
Renamed database to keyed-in-new and reflected the change in application properties, line 6

Part H
Specified error messages from Part G of AddInhousePartController and AddOutsourcedPartController (lines 42-56) to let user know whether their inventory is below the min or above the max
Added validation to EnufPartsValidator to check for the appropriate amount of associated parts when adding/updating products (line 37)

Part I
Created successful test unit for setInvMin, setter for invMin, under PartTest, lines 153-160
Created successful test unit for getInvMin, getter for invMin, under PartTest, lines 162-169
Created successful test unit for setInvMax, setter for invMax, under PartTest, lines 171-178
Created successful test unit for getInvMax, getter for invMax, under PartTest, lines 180-187

Part J
Removed any unused validators, imports, code with no usage, line 31-33 MainScreenController, line 19 InhousePartService, validator DeletePartValidator


