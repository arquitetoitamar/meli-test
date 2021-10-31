# Meli DNA Test Java Skills for back dev


How to use Spring Boot, Spring Data, and Neo4j together.

Spring Data Neo4j enables convenient integration of Neo4j in your Spring-based application.
It provides object-graph mapping (OGM) functionality and other features common to the Spring Data projects.

 * This project uses the Needleman-Wunsch algorithm
 * to align nucleotide sequences.
 *
 * Reference:
 * https://en.wikipedia.org/wiki/Needleman%E2%80%93Wunsch_algorithm
 
### Documentation
http://localhost:8080/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config
## The Stack

These are the components of our Rest Application:

* Application Type:         Spring-Boot Java Web Application
* Web framework:            Spring-Boot enabled Spring-WebMVC
* Persistence Access:       Spring-Data-Neo4j 6.x
* Database:                 Neo4j-Server 3.5, or 4.x with multi-database
* Frontend:                 jquery, bootstrap, http://d3js.org/[d3.js]

Provision a database quickly with https://sandbox.neo4j.com/?usecase=movies[Neo4j Sandbox] or https://neo4j.com/cloud/aura/[Neo4j Aura].

### Configuration

PORT: 8080 <br>
NEO4J_URI: 
neo4j+s://demo.neo4jlabs.com <br>
NEO4J_USER: <br>
NEO4J_PASSWORD: <br>
NEO4J_DATABASE: meli <br>
NEO4J_VERSION: 4 <br>
=======


