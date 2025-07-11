-- STEP 1: Create Database
CREATE DATABASE IF NOT EXISTS college;
USE college;

-- STEP 2: Create dept Table (Parent)
CREATE TABLE dept (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50)
);

-- STEP 3: Create employee Table (Child with Foreign Key)
CREATE TABLE employee (
    emp_id INT PRIMARY KEY,
    name VARCHAR(50),
    grade VARCHAR(2),
    dept_id INT,
    FOREIGN KEY (dept_id) REFERENCES dept(dept_id)
        ON UPDATE CASCADE
        ON DELETE CASCADE
);

-- STEP 4: Create student Table
CREATE TABLE student (
    rollno INT PRIMARY KEY,
    name VARCHAR(50),
    age INT NOT NULL,
    city VARCHAR(50),
    marks INT DEFAULT 0,
    CONSTRAINT age_check CHECK (age >= 18)
);

-- STEP 5: Insert into dept
INSERT INTO dept (dept_id, dept_name) VALUES
(1, 'Computer Science'),
(2, 'Mechanical'),
(3, 'Electrical');

-- STEP 6: Insert into employee
INSERT INTO employee (emp_id, name, grade, dept_id) VALUES
(1, 'Amit', 'B', 1),
(2, 'Ravi', 'A', 2),
(3, 'Kiran', 'B', 3);

-- STEP 7: Insert into student
INSERT INTO student (rollno, name, age, city, marks) VALUES
(101, 'Kallal', 22, 'Kolkata', 85),
(102, 'Amit', 20, 'Delhi', 75),
(103, 'Sara', 19, 'Mumbai', 90),
(104, 'John', 18, 'Kolkata', 60);

-- STEP 8: SELECT with GROUP BY and AVG
SELECT city, AVG(marks) AS avg_marks FROM student GROUP BY city;

-- STEP 9: SELECT with ORDER BY
SELECT * FROM student ORDER BY marks DESC;

-- STEP 10: COUNT by city with HAVING MAX(marks)
SELECT city, COUNT(rollno) AS student_count, MAX(marks) AS max_marks
FROM student
GROUP BY city
HAVING max_marks > 90;

-- STEP 11: UPDATE employee grades
UPDATE employee SET grade = 'A' WHERE grade = 'B';

-- STEP 12: DELETE students with marks < 20
DELETE FROM student WHERE marks < 20;

-- STEP 13: Basic queries for practice
SELECT DISTINCT city FROM student;
SELECT * FROM student WHERE age > 20;
SELECT * FROM student WHERE marks BETWEEN 70 AND 90;
SELECT * FROM student WHERE city NOT IN ('Delhi');
SELECT COUNT(marks) FROM student;

-- STEP 14: Update marks +1 for all students
UPDATE student SET marks = marks + 1;
                                  ///////////////           MY CODE SPACE..............................................

ALTER TABLE student 
ADD COLUMN aeg INT; 

ALTER TABLE employee 
ADD COLUMN age INT NOT NULL DEFAULT 19;
 

ALTER TABLE student 
MODIFY COLUMN age VARCHAR(2);

ALTER TABLE student
RENAME TO std;

TRUNCATE TABLE std;

ALTER TABLE student 
CHANGE name full_name VARCHAR(50);

ALTER TABLE student
DROP COLUMN grade;


