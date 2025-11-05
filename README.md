🎬 AI Film Recommendation System
📝 Description

This project is a Film Recommendation System built using Spring Boot for the backend and HTML/CSS/JavaScript for the frontend. Users can enter a movie genre to receive a list of recommended movies along with details such as poster, rating, overview, release date, and genres.

⚠️ Note: While it fetches recommendations from external APIs (TMDb & OMDb), it does not currently implement AI-based predictive recommendations. It demonstrates a full-stack movie recommendation application with a responsive, interactive interface.

✨ Key Features:

🔍 Search movies by genre.

🎞️ Display movie details (poster, rating, overview, release date, genres).

⏩ “Load more” functionality for paginated results.

🌗 Light/Dark mode toggle for better UI experience.

📱 Responsive design suitable for desktop and mobile devices.

🛠️ Backend Technology:

Spring Boot – REST APIs for fetching movie data and serving the frontend.

Java 25 – Main programming language.

Maven – Dependency management & build tool.

🌐 Frontend Technology:

HTML/CSS/JavaScript – Interactive UI.

Responsive design & dynamic movie cards.

🔗 APIs Used:

TMDb API

OMDb API

📂 Folder Structure
film-recommendation/
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── filmrecommendation
│   │   │               ├── controller
│   │   │               │   └── MovieController.java
│   │   │               ├── FilmRecommendationApplication.java
│   │   │               └── service
│   │   │                   └── MovieService.java
│   │   └── resources
│   │       ├── application.properties
│   │       ├── static
│   │       │   ├── details.html
│   │       │   └── index.html
│   │       └── templates
│   └── test
│       └── java
└── target
    ├── classes
    │   ├── application.properties
    │   ├── com
    │   │   └── example
    │   │       └── filmrecommendation
    │   │           ├── controller
    │   │           │   └── MovieController.class
    │   │           ├── FilmRecommendationApplication.class
    │   │           └── service
    │   │               └── MovieService.class
    │   └── static
    │       ├── details.html
    │       └── index.html
    ├── film-recommendation-1.0-SNAPSHOT.jar
    ├── film-recommendation-1.0-SNAPSHOT.jar.original
    ├── generated-sources
    │   └── annotations
    ├── generated-test-sources
    │   └── test-annotations
    ├── maven-archiver
    │   └── pom.properties
    ├── maven-status
    │   └── maven-compiler-plugin
    │       ├── compile
    │       │   └── default-compile
    │       │       ├── createdFiles.lst
    │       │       └── inputFiles.lst
    │       └── testCompile
    │           └── default-testCompile
    │               ├── createdFiles.lst
    │               └── inputFiles.lst
    └── test-classes

🚀 How to Run

Clone the repository:

git clone <repository-url>


Navigate to the project directory:

cd film-recommendation


Build the project using Maven:

mvn clean install


Run the Spring Boot application:

mvn spring-boot:run


Open your browser and visit:

http://localhost:8080

📝 Notes

🔑 Add your TMDb and OMDb API keys in application.properties before running.

🤖 This project can be extended to an actual AI-based recommendation system using collaborative filtering or machine learning models.
