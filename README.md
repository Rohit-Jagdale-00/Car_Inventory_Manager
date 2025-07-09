# 🚗 Car Inventory Manager

A simple **console-based Java application** that manages cars, customers, bookings, and service history using **JDBC** and **PostgreSQL**.

---

## ✅ Project Description

Car Inventory Manager is a console-based Java application that uses JDBC and PostgreSQL to manage:

- Cars  
- Customers  
- Bookings  
- Service Records  

It provides a **menu-driven interface** to perform **CRUD operations** and track car availability, bookings, and maintenance history.

---

## 📂 Project Structure
```
CarInventoryManager/
├── src/
│ └── main/
│ └── java/
│ ├── model/
│ │ ├── Cars.java
│ │ ├── Customers.java
│ │ ├── Bookings.java
│ │ └── ServiceRecords.java
│ ├── dao/
│ │ ├── CarDAO.java
│ │ ├── CustomerDAO.java
│ │ ├── BookingDAO.java
│ │ └── ServiceRecordDAO.java
│ └── util/
│   ├── DBConnection.java
│   └── Main.java
└── pom.xml
```

---
🚗 Car Inventory Manager: SQL Schema for Tables
```
-- 

-- 1. Create 'cars' table
CREATE TABLE cars (
    carId INT PRIMARY KEY,
    make VARCHAR(50),
    model VARCHAR(50),
    year INT,
    price DECIMAL(10,2),
    status VARCHAR(20)
);

-- 2. Create 'customers' table
CREATE TABLE customers (
    customerId INT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    phoneNumber VARCHAR(15),
    address VARCHAR(255)
);

-- 3. Create 'bookings' table (with foreign keys referencing 'cars' and 'customers')
CREATE TABLE bookings (
    bookingId INT PRIMARY KEY,
    carId INT REFERENCES cars(carId) ON DELETE CASCADE,
    customerId INT REFERENCES customers(customerId) ON DELETE CASCADE,
    bookingDate DATE NOT NULL,
    returnDate DATE NOT NULL,
    status VARCHAR(20)
);

-- 4. Create 'service_records' table
CREATE TABLE service_records (
    recordId INT PRIMARY KEY,
    serviceDate DATE NOT NULL,
    description TEXT,
    cost DECIMAL(10,2)
);

```
---

## 🚗 Features

### 🧾 Car Management
- Add new cars with make, model, year, price, and status
- View all cars in the inventory

### 👤 Customer Management
- Add new customers with contact details
- View all registered customers

### 📅 Booking Management
- Book a car for a customer (with booking and return dates)
- View all car bookings
- Delete a booking by ID

### 🛠️ Service Record Management
- Log a car's service details (date, description, cost)
- View service history for all cars

### 📋 User Interface
- Console-based, menu-driven interface
- Simple navigation with numbered options

---

## ⚙️ Dependencies

Add the following PostgreSQL JDBC dependency to your `pom.xml`:

```xml
<!-- PostgreSQL JDBC Dependency -->
<dependency>
  <groupId>org.postgresql</groupId>
  <artifactId>postgresql</artifactId>
  <version>42.7.7</version>
</dependency>

```
---

💻 Prerequisites

Before running the project, ensure the following are installed:

- Java Development Kit (JDK 17 or higher)

- PostgreSQL (v15 or higher)

- Any Java IDE (e.g., IntelliJ IDEA, Eclipse, VS Code)

---
📷 Console Output

![Screenshot 2025-07-09 223241](https://github.com/user-attachments/assets/daebfe32-e4ba-4269-b83f-8dbeeae6435f)



---

📞 Contact Details

Name: Jagdale Rohit Bharat

Email: rohitjagdale0606@gmail.com
