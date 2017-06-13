# Microservices
Micro-services using spring boot training conducted at RPS consulting on 12th June 2017

1. SOA vs Microservice, technical aspects on microservices/REST
    a. such as deployment in separate operating systems and scale per the volume.
    b. processing of payloads XML vs Plaintext
    c. REST works with HTTP protocol no specific protocols are required.
2. Architectureal Important points - 
    a. Service Failover (Load balancing, circuit breaking pattern)
    b. Maintainance
    c. Security
    d. Choreography vs Orchestration
    	The choreography describes the interactions between multiple services, where as orchestration represents control from one party's perspective.
	This means that a choreography differs from an orchestration with respect to where the logic that controls the interactions between the services
	involved should reside.

Docker commands to deploy the JAR which we generated from spring boot project 

	1. Docker should have access in the drive where it is running.

	2. Navigate to the project directory where we have POM.xml and Keep the Dockerfile, Docker file contains instruction to the Docker container
	   without that the command will fail.

	3. Issue the command docker build -t IMAGENAME:latest .  (There is DOT at the end)

	4. Once Download is completed issue the command docker run IMAGE_NAME or docker run -p 8080:8080 IMAGE_NAME

Spring Boot with Service Discovery using Eureka Server
	1. Every service should register itself with Eureka server, check the eureka console and it should display your services as registered service.
	2. Zuul is the API gateway and needs to be configured with Eureka to discover the service and route. Direct routing is also possible using URL.
	3. While downloading the project from SpringInitilizr, make sure that we add Eureka servver and Zuul Proxy as dependency.


OAUTH AUthentication

	Instead of calling to proxy service directly or discovering the service from service registry, request has to go to the OAUTH server. access 
	token will be given with expiry and then using the token service should be invoked. 

