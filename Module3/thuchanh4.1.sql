use quanlysinhvien;
select Address, count(StudentID) as 'Number of student'
from Student
group by Address;
Select S.StudentID, S.StudentName, avg(Mark)
from student S join Mark M on S.StudentID = M.StudentID
group by S.StudentID, S.StudentName;
Select S.StudentID, S.StudentName, avg(Mark)
from student S join Mark M on S.StudentID = M.StudentID
group by S.StudentID, S.StudentName
Having avg(Mark) > 7;
select S.StudentID, S.StudentName, Avg(Mark) 
from student S join Mark M on S.StudentID = M.StudentID
group by S.StudentID, S.StudentName
Having Avg(Mark) >= All (select Avg(Mark) From Mark  group by Mark.StudentID);
