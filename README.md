# task-group-msapp
*(Watch This in RAW please)*
**For Starting the MicroServices App**-
•Firstly, start the admin server and discovery service.
•Then start the zuul proxy.
•Afterwards the main service i.e task-group is run.
•Which then followed by some h2 tables data insertion.
•At last all the other dashboard services can be run.
(Group-dashboard and task-dashboard are for viewing data. Group-dashboard2 and task-dashboard2 are for creation, updation, deletion of data)


*For insertion of data into the tables these could be used*-
For table of Groups-
--INSERT INTO GROUPS(GROUP_ID,GROUP_NAME,GROUP_STATUS) VALUES(1,'Daily','Active');
--INSERT INTO GROUPS(GROUP_ID,GROUP_NAME,GROUP_STATUS) VALUES(2,'Education','Active');
--INSERT INTO GROUPS(GROUP_ID,GROUP_NAME,GROUP_STATUS) VALUES(3,'Sports','Nonactive');


For table of Tasks-
--INSERT INTO TASK(TASK_ID,TASK_END_DATE,TASK_NAME,TASK_PRIORITY,TASK_START_DATE,TASK_STATUS,GROUP_ID) VALUES(1,'20-04-03','Grocery','Important','20-04-03','Active',1);
--INSERT INTO TASK(TASK_ID,TASK_END_DATE,TASK_NAME,TASK_PRIORITY,TASK_START_DATE,TASK_STATUS,GROUP_ID) VALUES(2,'20-04-03','Milk','Important','20-04-03','Active',1);
--INSERT INTO TASK(TASK_ID,TASK_END_DATE,TASK_NAME,TASK_PRIORITY,TASK_START_DATE,TASK_STATUS,GROUP_ID) VALUES(3,'20-04-02','Science','Important','20-01-01','Active',2);    
--INSERT INTO TASK(TASK_ID,TASK_END_DATE,TASK_NAME,TASK_PRIORITY,TASK_START_DATE,TASK_STATUS,GROUP_ID) VALUES(4,'20-04-02','Maths','Important','20-01-01','Active',2);  
