 BEGIN TRANSACTION;
 drop table if exists cupcake, sale, customer;

CREATE TABLE cupcake(
	cupcake_id serial not null,
	name varchar  not null,
	description (100) not null,
	cost int not null
	)

CREATE TABLE sale(
	sale_id serial not null,
	customer_id int not null,
	sale_date date,
	cupcake_id int not null
);

CREATE TABLE customer(
	customer_id serial not null,
	name varchar(25) not null,
	phone_number int not null,
	address varchar (50),
	city varchar (25),
	state varchar(2),
	zipcode varchar (10)
);
	
INSERT INTO cupcake(name, description, cost) VALUES 
('Raspberry Cheesecake', 'Fresh Raspberry flavored cupcake, topped with a white chocolate cream frosting, drizzled with raspberry coulis, with a graham crack on topped. ', '3.50')
('Mocha Espresso', 'Dark chocolate flavored cupcake, filled with espresso mocha mousse, topped with light vanilla buttercream, and sprinkle with espresso powder.' '3.00')
()

commit;

