CREATE TABLE IF NOT EXISTS renter (
                                      id VARCHAR(50) PRIMARY KEY,
    name VARCHAR(150) NOT NULL,
    type VARCHAR(50) NOT NULL
    );

CREATE TABLE IF NOT EXISTS rentable (
                                        id VARCHAR(50) PRIMARY KEY,
    type VARCHAR(50) NOT NULL,
    daily_price NUMERIC(10,2) NOT NULL,
    description TEXT
    );
