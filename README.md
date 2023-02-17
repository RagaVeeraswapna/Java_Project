# Java_Project
# Kitchen_Basket_Management_System
#p0-foundational-kbms
I have worked on the project called "Kitchen_Basket_Management_System".<br>
In this project I have used technologies like Java,Mysql,Logger4j,Junit.<br>
In this project my usecase "Restock".<br>
For this : <br>
1)I have created ER diagram.<br>
2)I have created product Table using DDL in sql workbench. I have cretaed one more table Customer for Authentication.<br>
3)In eclipse I created Maven project. In pom.xml file I have added apache.maven plugin.<br>
4)I have created POJO classes for both product and customer. In dao layer I created inferface which consists of abstract method -----run .This method is implemented in dao.impl layer .In service implementation layer  a class named Login in that login method  is implemented.<br>
5)While implementing, to establish connection I have used JDBC I have added mysql-connector-j dependency in my pom.xml file and added database.propeties file I have established connection using singleton JDBC connection.<br>
6)For logging purpose I have added logger4j dependency in pom.xml.<br>
7)For testcases I have added junit dependency in pom.xml I have created testcases for ----establishing connection ---- login authentication ----RestockDaoImpl ---- <br>

#p1-project-kbms<br>
1)In eclipse I have created Maven project using web-app archetype then in pom.xml file I have added the dependencies for servlets,jsp,mysql also I have added the plugin for tomcat server.So with the help of server my entire application can be run.<br>
2)In com.revature.config package I have created a class named CoonectionFactory in order to establish the connection between mysql and java application
3)Then I have created Jsp files and servlets.<br>
4)Jsp files and all my CSS,Bootstrap,javascript files for project are stored in webapp folder.<br>
5)I have implemented two servlets <br>
I have Created JSp files and Servlets<br>
----"LoginAuthentication" which is accessing the login menthod from service.impl package and executed when login.jsp is submitted.<br>
----"Restock" which is accessing the run method from dao.impl package and executed when restock.jsp is submitted.<br>

This is all about my project and the technologies used in my project
