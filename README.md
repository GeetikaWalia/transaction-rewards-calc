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

- Once Started: Go to browser and run http://localhost:9897/swagger-ui/index.html.
- Or, run following curl in cmd prompt:
```shell
curl -X 'GET' \
  'http://localhost:9897/api/rewards' \
  -H 'accept: */*'
```
Output for above will be as follows:
```json lines
[
  {
    "customerId": "6763eb40682fa20dc25fc9bf",
    "name": "Ursula Martinez",
    "totalRewards": 270,
    "monthlyRewards": {
      "FEBRUARY": 270
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9bd",
    "name": "Tina Garcia",
    "totalRewards": 100,
    "monthlyRewards": {
      "JANUARY": 100
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9bb",
    "name": "Sam Brown",
    "totalRewards": 350,
    "monthlyRewards": {
      "MARCH": 350
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9b9",
    "name": "Rachel Carter",
    "totalRewards": 190,
    "monthlyRewards": {
      "FEBRUARY": 190
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9b7",
    "name": "Quincy Bell",
    "totalRewards": 40,
    "monthlyRewards": {
      "MARCH": 40
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9b5",
    "name": "Paul Adams",
    "totalRewards": 290,
    "monthlyRewards": {
      "FEBRUARY": 290
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9b2",
    "name": "Nancy Evans",
    "totalRewards": 25,
    "monthlyRewards": {
      "MARCH": 25
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9b0",
    "name": "Mike Scott",
    "totalRewards": 50,
    "monthlyRewards": {
      "MARCH": 50
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9ae",
    "name": "Laura King",
    "totalRewards": 170,
    "monthlyRewards": {
      "FEBRUARY": 170
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9ac",
    "name": "Kenny Young",
    "totalRewards": 130,
    "monthlyRewards": {
      "FEBRUARY": 130
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9aa",
    "name": "Jackie Walker",
    "totalRewards": 100,
    "monthlyRewards": {
      "JANUARY": 100
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9a7",
    "name": "Ian Lewis",
    "totalRewards": 480,
    "monthlyRewards": {
      "MARCH": 310,
      "FEBRUARY": 170
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9a5",
    "name": "Helen Clark",
    "totalRewards": 45,
    "monthlyRewards": {
      "JANUARY": 45
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9e3",
    "name": "Maya Lee",
    "totalRewards": 210,
    "monthlyRewards": {
      "FEBRUARY": 210
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9a3",
    "name": "Grace Harris",
    "totalRewards": 250,
    "monthlyRewards": {
      "FEBRUARY": 250
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9e1",
    "name": "Leo Thomas",
    "totalRewards": 250,
    "monthlyRewards": {
      "JANUARY": 250
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9a0",
    "name": "Frank Taylor",
    "totalRewards": 210,
    "monthlyRewards": {
      "MARCH": 0,
      "FEBRUARY": 210
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9df",
    "name": "Kylie Carter",
    "totalRewards": 350,
    "monthlyRewards": {
      "MARCH": 350
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc99e",
    "name": "Eva Green",
    "totalRewards": 45,
    "monthlyRewards": {
      "MARCH": 45
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9dd",
    "name": "Jack Martin",
    "totalRewards": 60,
    "monthlyRewards": {
      "JANUARY": 60
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc99c",
    "name": "David Williams",
    "totalRewards": 70,
    "monthlyRewards": {
      "JANUARY": 70
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9db",
    "name": "Isaac Moore",
    "totalRewards": 200,
    "monthlyRewards": {
      "MARCH": 200
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9e5",
    "name": "Nina Hernandez",
    "totalRewards": 290,
    "monthlyRewards": {
      "MARCH": 290
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9d9",
    "name": "Holly Lee",
    "totalRewards": 80,
    "monthlyRewards": {
      "JANUARY": 80
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9e7",
    "name": "Omar Wright",
    "totalRewards": 130,
    "monthlyRewards": {
      "JANUARY": 130
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc999",
    "name": "Charlie Brown",
    "totalRewards": 25,
    "monthlyRewards": {
      "MARCH": 25
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9d7",
    "name": "Gina White",
    "totalRewards": 150,
    "monthlyRewards": {
      "FEBRUARY": 150
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9e9",
    "name": "Penny White",
    "totalRewards": 170,
    "monthlyRewards": {
      "MARCH": 170
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc997",
    "name": "Bob Smith",
    "totalRewards": 35,
    "monthlyRewards": {
      "FEBRUARY": 35
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9d5",
    "name": "Finn Walker",
    "totalRewards": 40,
    "monthlyRewards": {
      "MARCH": 40
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9eb",
    "name": "Quinn Fisher",
    "totalRewards": 100,
    "monthlyRewards": {
      "FEBRUARY": 100
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9d3",
    "name": "Eva Jackson",
    "totalRewards": 110,
    "monthlyRewards": {
      "FEBRUARY": 110
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9ed",
    "name": "Riley Evans",
    "totalRewards": 210,
    "monthlyRewards": {
      "JANUARY": 210
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9d1",
    "name": "Daniel Harris",
    "totalRewards": 250,
    "monthlyRewards": {
      "MARCH": 250
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9ef",
    "name": "Sophia Nelson",
    "totalRewards": 270,
    "monthlyRewards": {
      "MARCH": 270
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc991",
    "name": "Alice Johnson",
    "totalRewards": 870,
    "monthlyRewards": {
      "JANUARY": 260,
      "MARCH": 460,
      "FEBRUARY": 150
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9cf",
    "name": "Clara Davis",
    "totalRewards": 45,
    "monthlyRewards": {
      "JANUARY": 45
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9f1",
    "name": "Tommy Parker",
    "totalRewards": 190,
    "monthlyRewards": {
      "JANUARY": 190
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9cd",
    "name": "Bella Johnson",
    "totalRewards": 25,
    "monthlyRewards": {
      "FEBRUARY": 25
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9f3",
    "name": "Ursula Scott",
    "totalRewards": 250,
    "monthlyRewards": {
      "FEBRUARY": 250
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9cb",
    "name": "Alan Wilson",
    "totalRewards": 290,
    "monthlyRewards": {
      "MARCH": 290
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9f5",
    "name": "Vera Davis",
    "totalRewards": 45,
    "monthlyRewards": {
      "JANUARY": 45
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9c9",
    "name": "Zane Taylor",
    "totalRewards": 90,
    "monthlyRewards": {
      "JANUARY": 90
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9f7",
    "name": "Will Foster",
    "totalRewards": 120,
    "monthlyRewards": {
      "MARCH": 120
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9c7",
    "name": "Yara Sanchez",
    "totalRewards": 50,
    "monthlyRewards": {
      "FEBRUARY": 50
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9f9",
    "name": "Xena Hall",
    "totalRewards": 210,
    "monthlyRewards": {
      "FEBRUARY": 210
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9c5",
    "name": "Xander Perez",
    "totalRewards": 230,
    "monthlyRewards": {
      "MARCH": 230
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9c3",
    "name": "Wendy Lopez",
    "totalRewards": 130,
    "monthlyRewards": {
      "JANUARY": 130
    }
  },
  {
    "customerId": "6763eb40682fa20dc25fc9c1",
    "name": "Victor Rodriguez",
    "totalRewards": 30,
    "monthlyRewards": {
      "MARCH": 30
    }
  }
]
```