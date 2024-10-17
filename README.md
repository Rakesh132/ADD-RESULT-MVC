# Add Result MVC

**Add Result MVC** is a web application that enables users to insert data into a database through a website interface, using the Model-View-Controller (MVC) architecture. This project demonstrates the use of **JDBC** for database connectivity, **Servlets** for handling server requests, and the MVC pattern to maintain organized and modular code.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup](#setup)
- [Usage](#usage)
- [Project Structure](#project-structure)

## Overview

The **Add Result MVC** project provides a user-friendly interface for users to input data (e.g., student exam results). Once the data is submitted, it is processed by the server-side application, then saved to a database through a JDBC connection. This application illustrates the core concepts of **MVC architecture** by separating the data handling (Model), user interface (View), and request processing (Controller) components.

## Features

- **Data Entry Interface**: A webpage form for users to input data to be stored.
- **Servlet-Based Controllers**: Used to handle client requests and process user input.
- **JDBC Connectivity**: Direct database connection to store, retrieve, and manage data.
- **MVC Architecture**: Clear separation of concerns, making the code organized and easy to maintain.

## Technologies Used

- **Java** (Core, Servlet API)
- **JDBC** for database connectivity
- **HTML/CSS** for frontend form design
- **MVC Architecture** for design pattern
- **MySQL** (or any other relational database) as the database
- **Apache Tomcat** (or similar servlet container)

## Setup

### Prerequisites

1. **Java Development Kit (JDK)** - Version 8 or higher.
2. **Apache Tomcat** - For running the Servlet-based web application.
3. **MySQL Database** - Ensure a MySQL server is running and accessible.
4. **JDBC Driver** - Make sure the JDBC driver for MySQL is added to the project's libraries.

### Steps

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/AddResultMVC.git
   cd AddResultMVC
