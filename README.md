# BOH-cake

# Project Overview
The BOHCakes Cupcake Business Application is a Java-based project developed in IntelliJ IDEA that showcases the implementation of various features such as the DAO (Data Access Object) pattern for database access, integrating with a REST API, building a RESTful API server, and implementing authentication to control access to REST API endpoints. This project serves as a foundation for managing a cupcake business named BOHCakes.

## Features
1. Using the DAO Pattern for SQL Database Access: The project demonstrates the use of the DAO pattern to interact with a SQL database. It includes data models, DAO classes, and database connection management to perform CRUD operations for managing cupcakes, customers, orders, and more.

2. Getting Data from a REST API: The application integrates with an external REST API to fetch additional data related to cupcake ingredients, pricing, and inventory. It showcases how to make HTTP requests, parse JSON responses, and incorporate this data into the database.

3. Implementing a RESTful API: The project implements server-side code to create a RESTful API for BOHCakes. It provides endpoints for managing cupcakes, customer orders, and other business operations, adhering to REST principles.

4. Authentication for API Endpoints: To ensure secure access to sensitive endpoints, the application implements authentication. It uses a token-based authentication mechanism to control access to REST API endpoints, allowing only authorized users to perform specific actions.

## Project Structure
The project is organized as follows:

* __src/main/java__: Contains Java source code for the BOHCakes application.
  - __com.bohcakes__: Main package for the application.
    - __'dao'__: Data Access Object classes for interacting with the database.
    - __'models'__: Data models representing cupcakes, customers, orders, etc.
    - __'rest'__: Code for building the RESTful API.
    - __'security'__: Authentication and authorization components.
    - __'utils'__: Utility classes and helper methods.
- __src/main/resources__: Configuration files, including database configuration and API endpoints.
- __src/test__: Contains unit tests for various components of the application.
## Getting Started

1. Clone the repository to your local machine:
   Copy code:
   git clone https://github.com/klyndelara/BOH-cakes.git
2. Open the project in IntelliJ IDEA.

3. Configure your database connection details in src/main/resources/application.properties.

4. Configure API endpoints and authentication settings in src/main/resources/application.properties.

5. Build and run the application.

## Usage
1. Use the REST API endpoints to interact with the BOHCakes Cupcake Business application. Refer to the API documentation for details on available endpoints and request/response formats.

2. Authenticate using the provided authentication mechanism to access protected endpoints.

## API Documentation
The API documentation can be found at https://yourdomain.com/api/docs for detailed information on available endpoints and how to use them.

## Contributors
Kimlyn De Lara klyndelara@gmail.com
