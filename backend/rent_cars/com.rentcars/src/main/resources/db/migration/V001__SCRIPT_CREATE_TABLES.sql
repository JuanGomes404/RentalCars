CREATE TABLE vehicle (
                         id BIGINT PRIMARY KEY AUTO_INCREMENT,
                         model VARCHAR(255) NOT NULL,
                         brand VARCHAR(255) NOT NULL,
                         year INT NOT NULL,
                         type VARCHAR(255) NOT NULL,
                         plate VARCHAR(255) NOT NULL,
                         availability TINYINT(1) NOT NULL
);
CREATE TABLE address (
                         id BIGINT PRIMARY KEY AUTO_INCREMENT,
                         street VARCHAR(255) NOT NULL,
                         city VARCHAR(255) NOT NULL,
                         state VARCHAR(255) NOT NULL,
                         postal_code VARCHAR(10) NOT NULL
);

CREATE TABLE customer (
                          id BIGINT PRIMARY KEY AUTO_INCREMENT,
                          name VARCHAR(255) NOT NULL,
                          address_id BIGINT,
                          telephone VARCHAR(255) NOT NULL,
                          email VARCHAR(255),
                          password VARCHAR(255),
                          FOREIGN KEY (address_id) REFERENCES address (id)
);

CREATE TABLE rental (
                        id BIGINT PRIMARY KEY AUTO_INCREMENT,
                        customer_id BIGINT NOT NULL,
                        vehicle_id BIGINT NOT NULL,
                        rentalDate TIMESTAMP NOT NULL,
                        returnDate TIMESTAMP,
                        FOREIGN KEY (customer_id) REFERENCES customer (id),
                        FOREIGN KEY (vehicle_id) REFERENCES vehicle (id)
);

CREATE TABLE invoice (
                         id BIGINT PRIMARY KEY AUTO_INCREMENT,
                         rental_id BIGINT NOT NULL,
                         invoiceDate TIMESTAMP NOT NULL,
                         totalAmount DOUBLE NOT NULL,
                         FOREIGN KEY (rental_id) REFERENCES rental (id)
);




