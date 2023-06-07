 BEGIN TRANSCATION;
CREATE TABLE cupcake(
	cupcake_id serial,
	name varchar (25),
	description (100),
	cost int
	)

CREATE TABLE sale_id(
	sale_id serial, 
	customer_id int,
	sale_date date
);

CREATE TABLE customer_id(
	customer_id serial,
	name varchar(25),
	phone_number int,
	address varchar (50),
	city varchar (25),
	zipcode varchar (10)
);
	
INSERT INTO cupcake(name, description, cost) VALUES 
('Rasberry Cheesecake', 'Fresh Rasberry flavored cupcake, topped with a white chocolate cream frosting, drizzled with rasberry coulis, with a graham crack on topped. ', '3.50')
('Mocha Espresso', 'Dark chocolate flavored cupcake, filled with espresso mocha mousse, topped with light vanilla buttercream, and sprinkle with espresso powder.' '3.00')
()

