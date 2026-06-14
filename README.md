# Three-Layer Architecture – Spring Boot Demo
 
A minimal Spring Boot project demonstrating the classic three-layer architecture: Controller → Service → Repository.
 
Built as a learning project to practice separating concerns in a web application.
 
## Tech Stack
 
- Java
- Spring Boot
- Spring Web
- Maven
## Architecture
 
```
Controller  →  Service  →  Repository
```
 
- **Controller** – handles HTTP requests
- **Service**  contains business logic
- **Repository** – data access layer (interface only in this demo)
## Endpoint
 
```
GET /hello
```
 
Returns a hardcoded list of names:
 
```json
["Джеймс", "Хаммонд"]
```
 
## Getting Started
 
### Prerequisites
 
- Java 17+
- Maven
### Run
 
1. Clone the repository:
```bash
   git clone https://github.com/KonstantinVojt/three-layer-arch.git
   cd three-layer-arch
```
 
2. Run the app:
```bash
   ./mvnw spring-boot:run
```
 
3. Test the endpoint:
```bash
   curl http://localhost:8080/hello
```
 
## Project Structure
 
```
src/main/java/com/example/threelayerarch/
├── StringController.java         # GET /hello
├── StringService.java            # Returns list of names
└── ThreeLayerArchApplication.java
```
 
