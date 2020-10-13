Ryan Martin, Pooja C., Alan G, Jay Sharma

Dr. Tamara Bonaci

CS 5004

04/15/2019

Assignment 9: Insurance Company Email Automation
===

In this problem, the task involved creating an automated letter and email processor that generates specified documents on behalf of an insurance company to all customers listed in a CSV file. The design also needed to provide usability for other CSV files that may or may not have the same order of information. Lastly, this program had to execute properly given command line arguments per the client’s request. To accomplish this task, we emphasized the principle of abstraction in this project, which allowed us to generify our code for TXT templates of any kind, and CSV files of any format. We also employed a driver model, which allowed us to encapsulate the details of the program in separate classes, while leaving the driver class to direct the operation of the program. 

With these requirements, our focus was to write a program that was efficient yet flexible. Our first challenge was to extract the information we needed from the CSV file while making this program work for different CSV files with a variety of ordered information. To accomplish this task we implemented a class called “CsvParser”. In this moderately lengthed class, we included four methods to synchronize the process of reading the CSV file, extracting the CSV header to scale for later use, and parsing the customer information to later be written in generated documents. Parsing the file involved utilizing regex to store the split strings in an array list, then iterating through this arraylist to remove quotes to add to another array, which returned the “clean” data. Storing the map header for scalability required removing quotation marks from the headers, splitting the commas, adding each column to a list, and then mapping each column and header with a key/value, which provides usability since our program relies on these keys and values. To match substrings in the CSV file to the customers in their appropriate fields, we used another hashmap in the createRoster method that provides these indices that can be used with a variety of CSV files. Finally our file reader (readCSV) brought these methods together to open the file for reading, parse the information, store all the information in a HashMap once, and return a list of HashMaps for any reasonably structured CSV file.

In out next order of operations, we implemented a driver function that would organize all the methods to later be executed by command line arguments. To bridge the data between user and product we had to encapsulate three classes, each containing just one method. TxtReader, TxtReplacer, and TxtWriter. The TxtReader reads a plain text template file and stores its contents in a buffer. The TxtWriter writes the plaintext to a file, and the TxtReplacer replaces text in a line of a CSV file using regex patterns and a HashMap as a lookup table for each corresponding field, which contributes to this program’s overall scalability in that any reasonably structured CSV file can be applied to the client’s supplied templates to be sent to their listed customers. Note that, to minimize the disk I/O overhead, we designed these last three classes to read in the template file only once, and to store the information in a StringBuilder object. Since reading files from the disk is an expensive process, it made no sense to read the same template file multiple times for each customer. Therefore, we made the decision to trade memory storage for disk I/O, and cached the entire contents of the template file. This also worked well because the template files were small files, and wouldn’t take too much space in memory.

The last step in this development process involved implementing another class called “argParser,” which allows the client to generate documents based on the command line arguments. This “argParser” contained five methods, the largest in the entire program. The parseArgs function works similarly to a stand-alone main function that takes command line arguments, and performs certain tasks in the “decision tree” of the method, in which different branches are divided in the switch statement on a case by case basis. Fields are initialised, which define the different states of the flags. The cases range from mere existence of the flag to complex cases where an argument should exist along with the flag. According to such conditions, the fields are modified accordingly. After iterating through the command line arguments, by verifying the state of the fields, it is possible to figure out whether exceptions exist. This allows the program to execute functions with more exactness by finding the case without having to run through additional conditions during compilation. This way, improperly termed command line arguments are filtered out. The fields are then added to an ArrayList of objects and the argParser method returns the object list of fields. Then the driver function is able to determine the combination of tasks needed by the user based on this list. 

We utilized various data structures in order to replace the necessary fields with the correct information while considering the importance of minimizing I/O disk overhead. In our project, our design contained a series of hashmaps within a list, which allowed the program to only have to read each template only once. Some of the major challenges in this group project involved the question of how to divide the work and how to avoid merge conflicts in our GitHub repositories. By the end of this course, all our team members had a strong grasp on how to work on individual branches to avoid conflicts and perpetuate efficient workflow in software engineering, while creating useful, object-oriented designed programs. 
