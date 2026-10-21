# Task Tracker — Backend

REST API for a full-stack task manager, built with **Spring Boot**, **Spring Security + JWT**, and **MySQL**.

**Live demo:** https://task-tracker-frontend-lake-eta.vercel.app
**Live API:** https://task-tracker-backend-lom1.onrender.com
**Frontend repo:** https://github.com/Div776/task-tracker-frontend

> The API is hosted on a free tier, so the first request after idle time can take up to a minute to respond.

<!-- Add a screenshot or GIF of the app here -->

## Features

- User registration and login with JWT-based authentication
- Protected endpoints using a custom JWT filter and Spring Security filter chain
- Full CRUD for tasks and categories (one category has many tasks)
- Input validation and centralized exception handling
- CORS configured for the deployed frontend
- Containerized with a multi-stage Dockerfile

## Tech Stack

| Area | Technology |
|---|---|
| Language | Java 17 |
| Framework | Spring Boot, Spring Data JPA |
| Security | Spring Security, JWT |
| Database | MySQL (Aiven cloud) |
| Build | Maven |
| Deployment | Docker on Render |

## Run Locally

**Requirements:** Java 17, MySQL

```bash
git clone https://github.com/Div776/task-tracker-backend.git
cd task-tracker-backend

# Set your database config
export DB_URL=jdbc:mysql://localhost:3306/task_tracker
export DB_USERNAME=your_username
export DB_PASSWORD=your_password

./mvnw spring-boot:run
```

The server starts on port `8080` (override with `PORT`).

## Run with Docker

```bash
docker build -t task-tracker-backend .
docker run -p 8080:8080 \
  -e DB_URL=... -e DB_USERNAME=... -e DB_PASSWORD=... \
  task-tracker-backend
```

## What I Built

I designed and built the whole backend myself: the data model and relationships, the JWT authentication flow, validation and error handling, and the cloud deployment (Aiven MySQL + Render). I tested each endpoint with Postman.

## Author

Divyansh — [GitHub](https://github.com/Div776)
