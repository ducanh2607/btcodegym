DELIMITER //

CREATE PROCEDURE findAllCustomers()

BEGIN

  SELECT * FROM customers;

END //


call findAllCustomers();
drop procedure findAllCustomers;
DELIMITER //

Create procedure findAllCustomer()
begin

select * from customers where customerNumber = 175;

END //

