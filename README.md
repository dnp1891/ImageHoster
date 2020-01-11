ImageHoster Assignment
--------
In this assignment, you’ll apply everything you have learnt in course 4 to build an image hoster similar to Imgur, one of the top 100 most visited websites in the world.

To-Do Tasks
--------
Part A: Fixing Issues

1. Image upload issues:
- If you upload an image with the same exact title as of a previously uploaded image, it will get uploaded. But then, if you try to navigate to one of the images with the same title, the image uploader will display an error.
- Please fix this issue, so that the application should not show an error and take you to respective image’s page.

2. After logging into the application, it is possible to edit/delete the image which is posted by some other user. This is a bug in the application. Now, fix this bug in the application, such that only the owner of the image can edit/delete the image.
- If the owner of the image is trying to edit the image, you must return the ‘images/edit.html’ file, thus enabling the user to edit the image. But if the non-owner of the image is trying to edit the image, return the ‘images/image.html’ file displaying all the details of the image and print the message ‘Only the owner of the image can edit the image’. Carefully add all the required attributes in the Model type object needed by ‘images/image.html’ file.
- If the owner of the image is trying to delete the image, the image is deleted and the user must be redirected to the web page displaying all the images. But if the non-owner of the image is trying to delete the image, return the ‘images/image.html’ file displaying all the details of the image and print the message ‘Only the owner of the image can delete the image’. Carefully add all the required attributes in the Model type object needed by ‘images/image.html’ file.

Part B: Implement a new feature

1. Password Strength
- Up till now, there is no check on the strength of the password entered by the user at the time of registration. Let us try to keep a check on the strength of the password entered by the user at the time of registration. You need to implement a feature wherein the password entered by the user must contain at least 1 alphabet (a-z or A-Z), 1 number (0-9) and 1 special character (any character other than a-z, A-Z and 0-9). The user must only be registered if the password contains 1 alphabet, 1 number, and 1 special character. And after successful registration, you must directly return 'users/login.html' file. Otherwise, the user must not be registered and again return the ‘users/registration.html’ file. You also need to display a message ‘Password must contain at least 1 alphabet, 1 number & 1 special character’. Carefully add all the required attributes in the Model type object needed by ‘users/registration.html’ file.

2.  Comments
- Now, implement a feature wherein a user can add a comment to any image in the application after he is logged in the application