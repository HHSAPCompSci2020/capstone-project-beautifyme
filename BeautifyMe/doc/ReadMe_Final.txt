AP Computer Science Final Project - README Template
Beautify Me
Authors: Mira Shlimenzon, Sarah Sabaa, Mana Nagampalli
Revision: May 23, 2021


Introduction: 
What does your program do? 
Our program is a beauty application that uses an image of the user’s choice. The application looks for ways to remove any sort of red-tone blemishes on the picture such as acne. It essentially “beautifies” their face. The application will change any areas that are clicked on by the user to better match the surrounding color. It’s target use is to make skin appear smoother and to replace areas that have a color that stands out to match the skin around it.
What problem does it solve? Why did you write it? 
This program aims to aid teenagers that are embarrassed by features such as acne. They often would like to look perfect in pictures for things such as social media. However, photoshop is expensive and most photo editing apps on phones are hard to use. This program can help users to create a natural look and alleviate their embarrassment over their acne. We personally have had many experiences where we took pictures with our friends and we felt very happy in the moment, but when we consider posting this photo and sharing it with everyone, we get too insecure to post, embarrassed by our acne. This is exactly why we want to create this FREE program, so we can edit our acne better and post these pictures that we have always wanted to post without paying tons of money. 
What is the story? 
Teenagers are tired of feeling not beautiful and not fitting into society on social media just because they can’t edit their acne as well as other influencers. They have tried using other acne-editing softwares but to no avail. It looks fake, blurry, or is too expensive. Photoshop is out of the option! Here is BeautifyMe! It allows for teenagers to gain confidence and to put their very best self out there. 
What are the rules? What is the goal?
The rules include that the user can select an image to edit (png and jpeg only allowed). The image has to be between 360x640 or 640x360. It must be a selfie showcasing the entire full face with a resolution of at least 200 - 300 ppi. These conditions will make the program work the best. The goal of the program is to help fix hyperpigmentation.
Who would want to use your program?
This program primarily hopes to help teenagers who suffer with acne and hyperpigmentation, who often feel very insecure. This can even help adults who suffer from hyperpigmentation or even babies who have rashes.
What are the primary features of your program?
Some primary features that our program will have is having a general window where the program will run, a selfie box (where the selfie will uploaded that creates a grid that the user can edit pixels), an upload button that can be used by the user to upload the image, an instruction box that helps the user know what to do next, select window where the image can be chosen, and lastly the magic wand tool that allows you to press on an area (pixel) and clean the blemish in that area.


Instructions:
When the user opens the software, a window will appear with a button that prompts the user to upload an image (directions also seen in the instruction box). Then, a select window will show up and the user will be able to choose an image from their computer. The image will then appear in the selfie box. Then, the user can click on the magic wand button to then use the magic wand tool to identify the area with skin irritation and the tool will help clear up that area! They can press on certain areas (pixel) of the photograph and then the software will edit the image to fix the blemish. 


Features List (THE ONLY SECTION THAT CANNOT CHANGE LATER):
Must-have Features:
* The window for our program to work: General window that will appear when you run the program here you will see an upload button and the magic wand button. The window will be pretty large and provide a basic layout of the program.
* Upload button: Have a button that the user can press to upload a chosen image to the program in the window (in this button it will say “Upload” or “Select”). This button will be right on the top of the program. Once the user presses on it, a window will appear that allows the user to select their picture. 
* Magic Wand Button: Press on a button that then allows the user to use the magic wand tool. The Magic Wand Button will be right below/side of the Upload button. Only once the user presses on the magic wand button can they use the magic wand tool.
* Magic Wand: A magic wand tool that when you click on it you can drag your mouse over and press on a certain area of the face (press on pixel of grid) and “fix” the blemish. Only works in the selfie box (grid created that has all the pixels). It changes the color of the area the wand is hovering on (pixel) to match similarly to the areas nearby that don’t have redness and are of normal skin tone. It finds the new value of the pixel it has selected by averaging out the pixel values near it.
* Select Window: Creates another window that allows the user to select the selfie they want to edit. The goal is for the user to be able to access their images on their computer and choose one to edit. After the user chooses the image, the window closes, and the selfie will appear in the selfie box. The software works best with an image of size 640 x 360 pixels or 360 x 640 pixels. But, it allows the user to upload a bigger picture, since we estimated the ideal dimensions.
* Selfie Box: Area that is 640 x 360 pixels or dimensions of the image. This is where the selfie will appear after being selected in the select window. Here a grid of pixels will appear and the user can interact with each pixel of the image using the MagicWand Tool.


Want-to-have Features: 
* Instruction box: At the bottom or top of the window, an instruction box will appear. It will be updated with instructions as the user goes along through the program. It will start by telling the user to upload an image to the program (making sure to specify the selfie’s criteria for dimensions and type of image). Then, it will tell the user to use the magic wand button to clean their skin. After the first magic wand button move, it will hint at the user that they can go back with the undo button if they disliked the way the magic wand worked (only if we end up adding an undo button).
* Undo button: A button that is right below the magic wand that appears right after their first use of the magic wand. This allows the user, when they press it, to remove the last move they did with the magic wand. (unfortunately didn’t get to this)
* Cursor: The cursor changes into a different photograph depending on what button the user chooses. It allows the user to understand what tool they are using and help the user feel more excited to use the tool. The cursor only changes for the magic wand tool, zoom in tool, and brush tool. For example, once the user presses on the magic wand button, to let the user know they are using the magic wand tool, the cursor will change into a magic wand. But when the user wants to upload a different image, the cursor will return to normal, letting the user know that they must press on the magic wand button once again to edit.
* Zoom in tool: Some sort of tool that allows the user to get closer to the image and really see where the blemish is. It allows the grid cells to get bigger in size and only focus on a portion of the image. When you press on the button, the user then can press on a certain part of the image, and it will zoom in there. They can press the undo button to “undo” the zoom. (didn’t get time to do)
* Main menu screen: It would look very professional if there was a main menu screen that had a start button and a bit of a description about what our goal was for the program. It could also maybe show a before and after example to help the user know exactly what the program can do. (didn’t get time to do)
* Example Image: An image that the user can use as an example for when they want to check out the software. Since we are aware that most people who will test out our program (our classmates) won’t have a perfect sized selfie at the moment, it would help for testing purposes to have this example image. It has acne and red-colored blemishes that would help the user see the program in play. 
* Brush button: A button that works similar to the magic wand but instead of “fixing the acne”, it allows the user to press on a part of the skin that they would like to use as a foundation color. Then, the user can go on the skin and paint over the parts of their face that they would like to cover with foundation. (didn’t get time to do) 


Stretch Features:
[These are features that we agree a fully complete version of this program would have, but that you probably will not have time to implement. A good final project does not necessarily need to have any of these completed at all. At least 3 are required. Again, fully describe each.]
* Save button: A button that is below the zoom in button or maybe the undo button. When you press on the button, it allows you to save the selfie that you edited (.jpeg format only). We aren’t exactly sure, but maybe creating a default spot that the user’s image will save may be in their desktop, document, or downloads folder.  
* Selfie Box that changes size: Since in our original plan we were only able to take images that were 640 x 360 pixels, we could potentially have the program resize the image into the specified dimension. This could allow the user to present photos that would have been too big for our program at first, but now the program would be able to work with them too. 
* Image Resolution Change: It shouldn’t matter what the resolution is for the user. The program could automatically adjust the image to the highest resolution it can be to help improve the image quality. We aren’t exactly sure how we would go about this, but maybe making the colors of the pixels stronger and more focused in.


Class List:
* Main → This will create a window and the drawing surface for the application
* Drawing Surface → This will contain all the components necessary for the drawing and it can also handle all the user interactions. It will also handle the user uploading the image. It will hold the two different buttons (magic wand and upload). It also contains a cursor that identifies the problem areas. It will also hold the MagicWand and Photograph. 
* MagicWand → It uses the grid from the Photograph and the pixel that the user selected in Drawing Surface to identify the problem area (area with hyperpigmentation) to then find the average of the RGB values of the skin around the area and makes the highlighted area that color to give the face a nice and even texture. It also helps edit the grid of the Photograph.
* Pixel → Contains a pixel (area of the image) that is within the grid that has a color. This pixel can have its color be changed.
* Photograph → Holds the image that the user uploaded, and creates a 2D grid array containing all the pixels (with color) of the image. It allows the user to change what image they uploaded and draw the image on the Drawing Surface.


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
   * Photographs that are being used in the program are from online sources. We do not own these photos and this program is not for commercial use, so we should not be sued for this.