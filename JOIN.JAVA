SELECT * 
FROM student AS a
INNER JOIN course AS b 
ON std.std_id = course.std_id; 
WHERE course.std_id IS NULL;

SELECT * 
FROM student AS a
LAFT course AS b 
ON std.std_id = course.std_id; 
WHERE std.std_id IS NULL;

SELECT a.name AS manager_name , b.name AS employee_name
FROM employee AS a
 JOIN employee AS b 
 ON a.id = b.manager_id;

 SELECT AVG(marks)
 FROM  student;

SELECT name, marks
FROM student
WHARE marks > (SELECT AVG(marks) FROM student);

SELECT name 
 FROM student
 WHERE rollno IN ( SELECT rollno FROM student WHERE marks > 200 );

 