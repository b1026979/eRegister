

eRegister App
=============
This app is built as a part of my Web Architecture module Project with looking at web application development.
In this project, we are looking at MVC (Model View Controller) and in particular the investigating of domain modelling and web services.
To achieve this I used GitHub and Grails apps plus using command line in Debian 6.0 operating system.
The purpose of this project is to gather a portfolio toward exploring the aspects of MVC.

Electronic attendance registers for lectures
--------------------------------------------
In this project, I introduce a web based register app. You can use this app to sign a registration sheet for a course session. As a result, the app can give you a list of students, the lecturer and the date of signed registration sheet for a particular class in three different formats HTML, XML and JSON.

Configuration(How to run and checkout the app)
----------------------------------------------
-> To install and set up the application:
.........
1-  Install the required packages: Debian6, Java7, MySQL, Grails packages installed on your computer.(I assumed you are using the same Debian image in your VMware machine as the university computers)

2-	To clone the project into your computer

 a)	Click on the SSH tab and copy the link next to it
 
 b)	In the Debian command line(Terminal) type: git clone<paste the copied link here) and Enter.

3-	Configuring MySQL as a database for the eRegister app

 a)	Sign into your MySQL as the administrator.. In the command line type: mysql -u root -ppassword(this is the user and password for the university copy of Debian image)
 
 b)	Type the command: create database eregister default charset utf8 collate utf8-bin and Enter.
 
 c)	Inside mysql type the command: grant all on eregister.* to ‘Webarch’@’localhost’ identified by ‘webarch’; to grant a user called “Webarch” and the password is “Webarch”
 
 d)	Open a new tap for your terminal and type “gedit” in the terminal command line.
 
 e)	In the opened window, on the view tab, tick the sidebar on and at the bottom left click on the file Browser tap.
 
 f)	Go to the path grails and expand the conf file by clicking on the small arrow next to it.
 
 g)	Double click on the dataSource.groovy file to open it. 
 
 h)	Scroll down and delete inside the environment section.
 
 i)	Copy the code below inside and save the file and exit.
 

environments {

    development {
    
        dataSource {
        
            dbCreate = "update"
            
	driverClassName = "com.mysql.jdbc.Driver"
	
	dialect=org.hiberate.dialect.MYSQL5Dialect
	
	username = "webarch"
	
	password = "webarch"
	
	url = "jdbc:mysql://localhost/eregister?autoReconnect=true&useUnicode=true&characterEncoding=UTF8"
	
	pooled = true
	
        }
        
    }
    
    test {
    
        dataSource {
        
            dbCreate = "update"
            
            url = "jdbc:h2:mem:testDb;MVCC=TRUE;LOCK_TIMEOUT=10000"
            
        }
        
    }
 
4-	 Run athe pp by running grails 

 a)           Enter into your eRegister directory by typing: cd eRegister into command line
 
 b)           Run the grails with typing: grails run-app  in command line.
 
5-	Copy the link given by grails and paste it into your browser URL and Enter.

6-	You will be directed to the app’s homepage.

7-         In the home page you have links to:

 a)         Manage the classes, insert, edit or delete data.
 
8)         Links under Apply:

 a)         List of active attendance: this link directs you to a page that shows the classes they have more than one attendance signed in.
 
 b)         Process Attendance: this links direct you to a page that you can enter an student ID and a class ID and it gets and sends the data true the URL, also replying through command line.
 
 c)         Classes: this is the link to the Instructors and the classes they lecture in the form of HTTP, XML and JSON.


 
