DELIMITER //
Create procedure getCusById(in cusNum int(1))

BEGIN

select * from customers where customerNumber = cusNum;
END //
call getCusById(175);
delimiter //
create procedure GetCustomersCountByCity(

in in_city varchar(50),

out total int)

begin 
select count(customerNumber)

into total

from customers

where city = in_city;
end //
call GetCustomersCountByCity('Lyon', @total);
select @total;
delimiter //
create procedure SetCounter(
inout counter int,
in inc int)
begin
set counter = counter + inc;
end //
set @counter = 1;
call SetCounter(@counter, 1);
select @counter;
call SetCounter(@counter, 2);
select @counter;
call SetCounter(@counter, 3);
select @counter;

