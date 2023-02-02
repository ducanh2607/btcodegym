use quanlysinhvien;
select * from student where status = true;
select * from subject where credit < 10;
select s.StudentID, s.StudentName, c.ClassName
from Student s join class c on s.ClassID = c.ClassID;
select s.StudentId, s.StudentName, c.ClassName
from student s join class c on s.ClassID = c.ClassID
where c.ClassName = "A1";
select s.StudentID, s.StudentName, Sub.SubName, m.Mark
from student s join mark m on s.StudentID = m.StudentID join subject Sub on m.SubID = Sub.SubID;
select s.StudentID, s.StudentName, Sub.SubName, m.Mark
from student s join mark m on s.StudentID = m.StudentID join subject Sub on m.SubID = Sub.SubID
where Sub.SubName = 'CF';
