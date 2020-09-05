Requirements:

    1. Java 1.8
    2. Docker
    3. Maven 3.6
    4. PostgreSQL

Install component:

    1. With Docker:
        1.1. Move to project folder, example: cd C:\Users\user\techtest
        1.2. Run the command: docker-compose up --build (Docker must be installed).
        
    2. Springboot/Maven:
        NOTE: To run with this option it is necessary to have a PostgreSQL database with a database called "techtest"
              and change the connection string to the database in the application.properties file so that the scripts 
              can be executed table creation.
        2.1. Compile the project with the command: mvn clean install
        2.2. Move to the root folder of the project: cd C:\Users\user\techtest\target
        2.3. Run the following command: mvn spring-boot:run
        
Test hotfix
        
To run the component without a database it is necessary to remove / comment all the classes of the Entity and Repository packages.


Enpoint to consume service:

    Type: POST
    localhost:8080/api/order/db

Request example:

    {
        "clientId": 1,
        "date": "2020-06-28",
        "address": "Calle 1#2-1",
        "products": [
            { 
                "id": 5,
                "quantity": 10,
                "cost": 10000.00 
            },
            { 
                "id": 4,
                "quantity": 20,
                "cost": 10000.00 
            }
        ]
    }
    
Response:

    {
        "numOrder": 145942,
        "totalOrder": 300000.0,
        "numShippingGuide": 223166.0,
        "statusShipping": "Sent",
        "detailOrderResponse": [
            {
                "nameProduct": "SmartTv LG",
                "quantity": 10,
                "total": 100000.0
            },
            {
                "nameProduct": "Macbook Pro",
                "quantity": 20,
                "total": 200000.0
            }
        ]
    }
