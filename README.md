# transaction-rewards-app
Spring Boot Demo for calculating transactions rewards

### Requirements – For Java Developers
#### Tech Stack
- JDK 17
- Spring boot
- MongoDB

#### Features
- WebAPI Developer
    - A retailer offers a rewards program to its customers, awarding points based on each recorded
purchase.

    - A customer receives 2 points for every dollar spent over $100 in each transaction, plus 1 point for every
dollar spent between $50 and $100 in each transaction.
(e.g. a $120 purchase = 2x$20 + 1x$50 = 90 points).

    - Given a record of every transaction during a three month period, calculate the reward points earned for
each customer per month and total.

        - Solve using Spring Boot
        - Create a RESTful endpoint
        - Make up a data set to best demonstrate


#### Steps to run application

1. With Docker File
```shell
 Open Terminal
 cd <app-source-foler-path>
 docker build -t rewards-app .
 docker-compose up
```

2. Jar File
```shell
 Open Terminal
 cd <app-source-foler-path>
 mvn clean compile package
 java -jar .\target\rewards-0.0.1-SNAPSHOT.jar com/transactions/rewards/TransactionRewardsApplication
```

- Once Started: Go to browser and run http://localhost:9898/swagger-ui/index.html.