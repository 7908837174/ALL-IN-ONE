-- Step 1: Create Database
CREATE DATABASE IF NOT EXISTS college;

-- Step 2: Use the Database
USE college;

-- Step 3: Create Table
CREATE TABLE student (
    rollno INT PRIMARY KEY,
    name VARCHAR(50),
    age INT NOT NULL,
    city VARCHAR(50),
    marks INT DEFAULT 0,
    CONSTRAINT age_check CHECK (age >= 18)
);

-- Step 4: Insert Data
INSERT INTO student (rollno, name, age, city, marks) VALUES
(101, 'Kallal', 22, 'Kolkata', 85),
(102, 'Amit', 20, 'Delhi', 75),
(103, 'Sara', 19, 'Mumbai', 90),
(104, 'John', 18, 'Kolkata', 60);

-- Step 5: Select All
SELECT * FROM student;

-- Step 6: Select with WHERE condition
SELECT * FROM student WHERE age > 20;

-- Step 7: COUNT marks
SELECT COUNT(marks) AS total_marks_entries FROM student;

-- Step 8: DISTINCT cities
SELECT DISTINCT city FROM student;

-- Step 9: BETWEEN usage
SELECT * FROM student WHERE marks BETWEEN 70 AND 90;

-- Step 10: NOT IN usage
SELECT * FROM student WHERE city NOT IN ('Delhi');
