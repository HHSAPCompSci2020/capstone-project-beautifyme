AP Computer Science Final Project - README Template
Beautify Me
Authors: Mira Shlimenzon, Sarah Sabaa, Mana Nagampalli
Revision: May 13, 2021


Introduction: 
What does your program do? 
Our program is a beauty application that uses an image of the user’s choice. The application looks for ways to remove any sort of red-tone blemishes on the picture such as acne. It essentially “beautifies” their face. The application will change any areas that are clicked on by the user to better match the surrounding color. It’s target use is to make skin appear smoother and to replace areas that have a color that stands out to match the skin around it.
What problem does it solve? Why did you write it? 
This program aims to aid teenagers that are embarrassed by features such as acne. They often would like to look perfect in pictures for things such as social media. However, photoshop is expensive and most photo editing apps on phones are hard to use. This program can help users to create a natural look and alleviate their embarrassment over their acne. We personally have had many experiences where we took pictures with our friends and we felt very happy in the moment. But when we consider posting this photo and sharing it with everyone, we get too insecure to post embarrassed by our acne. This is exactly why we want to create this FREE program, so we can edit our acne better and post these pictures that we have always wanted to post without paying tons of money. 
What is the story? 
Teenagers are tired of feeling not beautiful and not fitting into society on social media just because they can’t edit their acne as well as other influencers. They have tried using other acne-editing softwares but to no avail. It looks fake, blurry, or is too expensive. Photoshop is out of the option! Here is BeautifyMe! It allows for teenagers to gain confidence and to put their very best self out there. 
What are the rules? What is the goal?
The rules include that the user can only drag in a certain sized image (640 x 320 pixels), and if the image is not this size, an error message will show. It must be a selfie showcasing the entire full face with a resolution of at least 200 - 300 ppi. The goal of the program is to help fix hyperpigmentation.
Who would want to use your program?
This program primarily hopes to help teenagers who suffer with acne and hyperpigmentation, who often feel very insecure. This can even help adults who suffer from hyperpigmentation or even babies who have rashes.
What are the primary features of your program?
Some primary features that our program will have is having a general window where the program will run, a selfie box (where the selfie will uploaded that creates a grid that the user can edit pixels), an upload button that can be used by the user to upload the image, an instruction box that helps the user know what to do next, select window where the image can be chosen, and lastly the magic wand tool that allows you to press on an area (pixel) and clean the blemish in that area.


Instructions:
When the user opens the software, a window will appear with a button that prompts the user to upload an image (directions also seen in the instruction box). Then a select window will show up and the user will be able to choose an image from their computer. The image will then appear in the selfie box. Then, the user can click on the magic wand button to then use the magic wand tool to identify the area with skin irritation and the tool will help clear up that area! They can press on certain areas (pixel) of the photograph and then the software will edit the image to fix the blemish. 


Features List (THE ONLY SECTION THAT CANNOT CHANGE LATER):
Must-have Features:
* The window for our program to work: General window that will appear when you run the program here you will see the outline of the selfie box (640 x 320 pixels), the upload button, and the magic wand button. The window will be pretty large and provide a basic layout of the program. (There should be no selfie box “outline” if we figure out how to have different sized-images since the selfie box will change depending on the image size)
* Upload button: Have a button that the user can press to upload a chosen image to the program in the window (in this button it will say “Upload” or “Select”). This button will be right on the top of the program. Once the user presses on it, a window will appear that allows the user to select their picture. The window will specify the rules of the image that can be placed inside (640 x 320 pixels, certain image quality). Once the user selects an image, it will close the window. (If we figure out how to update the image size and still edit it without it being 320 x 640, then the rules will not be necessary)
* Magic Wand Button: Press on a button that then allows the user to use the magic wand tool. The Magic Wand Button will be right below/side of the Upload button.
* Magic Wand: A magic wand tool that when you click on it you can drag your mouse over and press on a certain area of the face (press on pixel of grid) and “fix” the blemish. Only works in the selfie box (grid created that has all the pixels). It changes the color of the area the wand is hovering on (pixel) to match similarly to the areas nearby that don’t have redness and are of normal skin tone. It finds the new value of the pixel it has selected by averaging out the pixel values near it.
* Select Window: Creates another window that allows the user to select the selfie they want to edit. The goal is for the user to be able to access their images on their computer and choose one to edit. After the user chooses the image, the window closes, and the selfie will appear in the selfie box. The software can handle an image that will be of size 640 x 320 pixels. There should be an error if the image isn’t the dimensions it needs. (There shouldn’t be an error if we learn how to have the image be a different size).
* Selfie Box: box/area that is 640 x 320 pixels. This is where the selfie will appear after being dragged in the drop-in window. Users will be able to interact with the image here.


Want-to-have Features: 
* Instruction box: At the bottom of the window, an instruction box will appear. It will be updated with instructions as the user goes along through the program. It will start by telling the user to upload an image to the program (making sure to specify the selfie’s criteria for dimensions). Then, it will tell the user to use the magic wand button to clean their skin. After the first magic wand button move, it will hint at the user that they can go back with the undo button if they disliked the way the magic wand worked. 
* Undo button: A button that is right below the magic wand that appears right after their first use of the magic wand. This allows the user, when they press it, to remove the last move they did with the magic wand.
* Cursor: The cursor changes into a different photograph depending on what button the user chooses. It allows the user to understand what tool they are using and help the user feel more excited to use the tool. The cursor only changes for the magic wand tool, zoom in tool, and brush tool. 
* Zoom in tool: Some sort of tool that allows the user to get closer to the image and really see where the blemish is. It allows the grid cells to get smaller (less pixel size) aka less pixels in the image now. When you press on the button, the user then can press on a certain part of the image, and it will zoom in there. They can press the undo button to “undo” the zoom.
* Main menu screen: It would look very professional if there was a main menu screen that had a start button and a bit of a description about what our goal was for the program. It could also maybe show a before and after example to help the user know exactly what the program can do.
* Brush button: A button that works similar to the magic wand but instead of “fixing the acne”, it allows the user to press on a part of the skin that they would like to use as a foundation color. Then, the user can go on the skin and paint over the parts of their face that they would like to cover with foundation. 


Stretch Features:
[These are features that we agree a fully complete version of this program would have, but that you probably will not have time to implement. A good final project does not necessarily need to have any of these completed at all. At least 3 are required. Again, fully describe each.]
* Save button: A button that is below the zoom in button or maybe the undo button that when you press on it allows you to save the selfie that you edited (.jpeg format only). We aren’t exactly sure, but maybe creating a default spot that the user’s image will save may be in their desktop, document, or downloads folder.  
* Selfie Box that changes size: Since in our original plan we were only able to take images that were 640 x 320 pixels, we could potentially have the selfie box rescale size to fit the image size the user chose. This could allow the user to present landscape photos or maybe photos that are smaller than the selfie box. 
* Image Resolution Change: It shouldn’t matter what the resolution is for the user. The program could automatically adjust the image to the highest resolution it can be to help improve the image quality.


Class List:
* Main → This will create a window and the drawing surface for the application
* Drawing Surface → This will contain all the components necessary for the drawing and it can also handle all the user interactions. It will also handle the user uploading the image. It will hold the two different buttons (magic wand and upload). 
* MagicWand → It uses the grid from the Photograph and the pixel that the user selected in Drawing Surface to identify the problem area (area with hyperpigmentation) to then find the average of the RGB values of the skin around the area and makes the highlighted area that color to give the face a nice and even texture. 
* Pixel → Contains a pixel (area of the image) that is within the grid that has a color. This pixel can have its color be changed.
* Photograph → Holds the image that the user uploaded, and creates a 2D grid array containing all the pixels (with color) of the image. It allows the user to change what image they uploaded, draw the image on the Drawing Surface, and even scale the image if the image is too big to fit in the screen.


Credits:
* Mira Shlimenzon:
   * Pixel (help with and work alongside Mana)
   * Photograph (main focus)
   * DrawingSurface (help Sarah out)
* Mana:
   * MagicWand (main focus)
   * Pixel (help with and work alongside Mira)
* Sarah:
   * DrawingSurface (main focus)
   * Main (main focus)
* External Credits:
   * Pixel class- JavaDip (Pixel class idea)
   * Drawing Surface- C# Corner Article “How to Upload Images in Java Applications” (helped with the image uploading from the person’s computer)  
   * Photograph and Drawing Surface- using the clicktoIndex method from Game Of Life project to edit and select a pixel in the grid 
   * Drawing Surface- using code from CustomCursorDemo (Shelby’s recourse) as help for changing the cursor in our project.