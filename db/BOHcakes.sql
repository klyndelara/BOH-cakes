 BEGIN TRANSACTION;
 drop table if exists cupcake, customer, sale;

CREATE TABLE cupcake(
	cupcake_id serial not null,
	name varchar (50) not null,
	description varchar (100) not null,
	cost varchar not null
);

CREATE TABLE customer(
	customer_id serial not null,
	name varchar(25) not null,
	phone_number varchar not null,
	address varchar (50),
	city varchar (25),
	state varchar(2),
	zipcode varchar (10)
);

/*CREATE TABLE sale(
	sale_id serial not null,
	customer_id int not null,
	sale_date date,
	cupcake_id int not null
);*/

	
INSERT INTO cupcake(name, description, cost) VALUES 
	('Raspberry Cheesecake', 'Fresh Raspberry flavored cupcake, topped with a white chocolate cream frosting, drizzled with raspberry coulis, with a graham crack on topped.', '3.50'),
	('Mocha Espresso', 'Dark chocolate flavored cupcake, filled with espresso mocha mousse, topped with light vanilla buttercream, and sprinkle with espresso powder.', '3.00'),
	('Vanilla Bliss', 'Vanilla chiffon cupcake, topped with a vanilla bavarian cream', '3.00'),
	('Strawberry poptart','Strawberry and vanilla flavored cupcake, topped with strawberry bavarian cream and dusted with nilla wafers', '3.50'),
	('Fruit Cocktial', 'Vanilla flavored cupcake, topped with choice of bavarian cream or cream cheese mousse and seasonal fruit on top', '4.00 or depends on type of fruit'),
	('Miss Red Velvet', 'Simple red velet cake, topped with cream cheese mousse, and topped with a red macaroon', '3.00'),
	('Lemon Drop', 'Lemon cupake, filled with lemon curd, topped with lemon vanilla buttercream, and candied lemon leaf', '3.00'),
	('Hypno', 'Vanilla or chocolate cupcake infused with colors of the rainbow for a fun and colorful dessert experience, topped with choice of vanilla or chocolate mousse', '3.50');

INSERT INTO customer(name, phone_number, address, city, state, zipcode) VALUES
	('Sofia Valencia', '408-929-5568', '254 Evergreen Way', 'Tracy', 'CA', '95376'),
	('Nessa Maranan','408-636-5254','1445 Farthing Way', 'San Jose', 'CA', '95131'),
	('John Legend', '714-458-7953', '2356 Hollywood Lane', 'Hollywood', 'CA', '94526'),
	('Christina Tran','408-631-0440','2547 Mckee Road','San Jose', 'CA','95118'),
	('Leon Chris', '650-487-8991','5647 Jack Lantern Court','Emeryville', 'CA', '95647'),
	('Crystal Espanosa', '714-658-9897', '4578 Vida Leon Drive','Santa Clara', 'CA', '95468');

commit transaction;

