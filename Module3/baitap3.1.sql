use quanlysinhvien;
select * from student where StudentName like 'h_%';
select * from class where month(StartDate) = 12;
select * from subject where Credit between 3 and 5;
update  student
set ClassID = "2" where StudentName = "Hung";
select * from student;
select S.StudentName, S.StudentID, Sub.SubName, M.Mark
from student S join Mark M on S.StudentID = M.StudentID join subject Sub on M.SubID = Sub.SubID
order by M.Mark, S.StudentName desc;
