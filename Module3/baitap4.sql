use quanlysinhvien;
select * from subject;
select SubID, SubName, max(Credit), Status
from subject;
select max(Mark), Sub.SubID, Sub.SubName, Sub.Credit
from subject Sub join Mark M on Sub.SubID = M.SubID
group by SubID
having Max(Mark);
select S.StudentID, S.StudentName, Avg(Mark)
from student S
join Mark M on S.StudentID = M.StudentID
group by StudentID
order by avg(Mark) desc;


