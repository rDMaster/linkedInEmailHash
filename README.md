# linkedInEmailHash
This repository is a personal project used to get used to Java File handling.

The Idea came when I heard about the massive LinkedIn hack of 2012 when 117 million users
Email and Password hashes were stolen.

I have no interest in cracking the password hashes whatsoever.
When I found the Database dump was freely available online I thought it would a 
great dataset to help me learn File Handling in Java.

3 Functions of the Application
- Remove the email addresses and null values from the files and outputing them to a new file.
- Splitting some of the very large files, up to 11gb in size into managable chunks
- Searching the files for a specific email address returning true or false and the time taken by the search

I may make some future changes to it, such as an improved search function
Atm it reads the file line by line until it finds the email or hits EOF this is only O(n)

If anyone is reading this please feel free to suggest any improvements 


