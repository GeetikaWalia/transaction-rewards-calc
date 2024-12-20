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
    "customerId": "676540630ce21574ed0caf4a",
    "name": "XOdZFGiNJs",
    "totalRewards": 156,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 49
      },
      {
        "month": "APRIL",
        "reward": 13
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 12
      },
      {
        "month": "JULY",
        "reward": 5
      },
      {
        "month": "AUGUST",
        "reward": 42
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 6
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 29
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0caf09",
    "name": "qaBawOaMvD",
    "totalRewards": 164,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 23
      },
      {
        "month": "MARCH",
        "reward": 38
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 27
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 23
      },
      {
        "month": "AUGUST",
        "reward": 22
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 31
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cae46",
    "name": "nCoWEoQEDS",
    "totalRewards": 120,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 9
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 11
      },
      {
        "month": "JULY",
        "reward": 5
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 22
      },
      {
        "month": "OCTOBER",
        "reward": 44
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 29
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cae05",
    "name": "vNDUjGzkgK",
    "totalRewards": 192,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 43
      },
      {
        "month": "MAY",
        "reward": 39
      },
      {
        "month": "JUNE",
        "reward": 43
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 38
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 29
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0caec8",
    "name": "MpCgwxYJDD",
    "totalRewards": 236,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 37
      },
      {
        "month": "FEBRUARY",
        "reward": 23
      },
      {
        "month": "MARCH",
        "reward": 49
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 23
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 38
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 46
      },
      {
        "month": "DECEMBER",
        "reward": 20
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cae87",
    "name": "cirLZRdkQP",
    "totalRewards": 123,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 8
      },
      {
        "month": "JUNE",
        "reward": 6
      },
      {
        "month": "JULY",
        "reward": 39
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 43
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 27
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cadc4",
    "name": "zzGYpaZfFU",
    "totalRewards": 63,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 12
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 14
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 13
      },
      {
        "month": "JULY",
        "reward": 3
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 18
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 3
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb05b",
    "name": "RpDginNQtq",
    "totalRewards": 103,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 34
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 1
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 37
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 31
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb1e1",
    "name": "rOJCYfwszR",
    "totalRewards": 174,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 28
      },
      {
        "month": "FEBRUARY",
        "reward": 36
      },
      {
        "month": "MARCH",
        "reward": 14
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 49
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 46
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 1
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb263",
    "name": "ecCiBnXrTV",
    "totalRewards": 134,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 18
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 44
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 7
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 44
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 21
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb15f",
    "name": "XWHqyvyEXT",
    "totalRewards": 133,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 34
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 32
      },
      {
        "month": "MAY",
        "reward": 34
      },
      {
        "month": "JUNE",
        "reward": 14
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 17
      },
      {
        "month": "DECEMBER",
        "reward": 2
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb0dd",
    "name": "TpAQSkQcbk",
    "totalRewards": 27,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 18
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 9
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cafd9",
    "name": "IfeJvJhmUM",
    "totalRewards": 106,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 24
      },
      {
        "month": "FEBRUARY",
        "reward": 47
      },
      {
        "month": "MARCH",
        "reward": 18
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 12
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 5
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0caf57",
    "name": "QguJszWHHJ",
    "totalRewards": 225,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 24
      },
      {
        "month": "FEBRUARY",
        "reward": 43
      },
      {
        "month": "MARCH",
        "reward": 10
      },
      {
        "month": "APRIL",
        "reward": 49
      },
      {
        "month": "MAY",
        "reward": 34
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 49
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 16
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0caed5",
    "name": "mNOHSYJRQU",
    "totalRewards": 108,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 10
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 10
      },
      {
        "month": "AUGUST",
        "reward": 9
      },
      {
        "month": "SEPTEMBER",
        "reward": 41
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 38
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cae53",
    "name": "nGjejSwgEI",
    "totalRewards": 90,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 2
      },
      {
        "month": "MARCH",
        "reward": 3
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 12
      },
      {
        "month": "JUNE",
        "reward": 31
      },
      {
        "month": "JULY",
        "reward": 3
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 3
      },
      {
        "month": "OCTOBER",
        "reward": 7
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 29
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb2a4",
    "name": "RDfrguCYqY",
    "totalRewards": 145,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 46
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 47
      },
      {
        "month": "JUNE",
        "reward": 24
      },
      {
        "month": "JULY",
        "reward": 8
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 17
      },
      {
        "month": "OCTOBER",
        "reward": 3
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb1a0",
    "name": "JHfTceNLLp",
    "totalRewards": 98,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 38
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 29
      },
      {
        "month": "MAY",
        "reward": 19
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 12
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb09c",
    "name": "bekyitjLaf",
    "totalRewards": 164,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 18
      },
      {
        "month": "MARCH",
        "reward": 17
      },
      {
        "month": "APRIL",
        "reward": 39
      },
      {
        "month": "MAY",
        "reward": 30
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 22
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 38
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0caf98",
    "name": "yXQvPATZcE",
    "totalRewards": 87,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 22
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 10
      },
      {
        "month": "JUNE",
        "reward": 33
      },
      {
        "month": "JULY",
        "reward": 10
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 12
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cae94",
    "name": "ZSFmDGFUCR",
    "totalRewards": 239,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 37
      },
      {
        "month": "FEBRUARY",
        "reward": 21
      },
      {
        "month": "MARCH",
        "reward": 19
      },
      {
        "month": "APRIL",
        "reward": 6
      },
      {
        "month": "MAY",
        "reward": 15
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 47
      },
      {
        "month": "AUGUST",
        "reward": 18
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 39
      },
      {
        "month": "NOVEMBER",
        "reward": 16
      },
      {
        "month": "DECEMBER",
        "reward": 21
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb11e",
    "name": "KRlEkzrurr",
    "totalRewards": 191,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 23
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 20
      },
      {
        "month": "JUNE",
        "reward": 3
      },
      {
        "month": "JULY",
        "reward": 15
      },
      {
        "month": "AUGUST",
        "reward": 47
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 36
      },
      {
        "month": "NOVEMBER",
        "reward": 29
      },
      {
        "month": "DECEMBER",
        "reward": 18
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0caf16",
    "name": "lzKZDSPbdK",
    "totalRewards": 147,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 18
      },
      {
        "month": "MARCH",
        "reward": 4
      },
      {
        "month": "APRIL",
        "reward": 23
      },
      {
        "month": "MAY",
        "reward": 4
      },
      {
        "month": "JUNE",
        "reward": 5
      },
      {
        "month": "JULY",
        "reward": 14
      },
      {
        "month": "AUGUST",
        "reward": 14
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 18
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 47
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cae12",
    "name": "TUIthASKck",
    "totalRewards": 115,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 19
      },
      {
        "month": "FEBRUARY",
        "reward": 42
      },
      {
        "month": "MARCH",
        "reward": 6
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 18
      },
      {
        "month": "JUNE",
        "reward": 21
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 9
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cadd1",
    "name": "SKYhQlYZWF",
    "totalRewards": 75,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 2
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 10
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 28
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 1
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 34
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb222",
    "name": "RUMBPdcUVQ",
    "totalRewards": 252,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 49
      },
      {
        "month": "FEBRUARY",
        "reward": 2
      },
      {
        "month": "MARCH",
        "reward": 9
      },
      {
        "month": "APRIL",
        "reward": 26
      },
      {
        "month": "MAY",
        "reward": 5
      },
      {
        "month": "JUNE",
        "reward": 18
      },
      {
        "month": "JULY",
        "reward": 49
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 37
      },
      {
        "month": "OCTOBER",
        "reward": 8
      },
      {
        "month": "NOVEMBER",
        "reward": 49
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb01a",
    "name": "GOrOobNTkx",
    "totalRewards": 212,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 11
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 35
      },
      {
        "month": "MAY",
        "reward": 30
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 9
      },
      {
        "month": "AUGUST",
        "reward": 34
      },
      {
        "month": "SEPTEMBER",
        "reward": 18
      },
      {
        "month": "OCTOBER",
        "reward": 29
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 46
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb1ee",
    "name": "HNsxmDzdrJ",
    "totalRewards": 161,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 18
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 12
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 29
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 44
      },
      {
        "month": "OCTOBER",
        "reward": 25
      },
      {
        "month": "NOVEMBER",
        "reward": 33
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb1ad",
    "name": "hLNkaioSxY",
    "totalRewards": 169,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 14
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 43
      },
      {
        "month": "APRIL",
        "reward": 12
      },
      {
        "month": "MAY",
        "reward": 6
      },
      {
        "month": "JUNE",
        "reward": 43
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 28
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 5
      },
      {
        "month": "DECEMBER",
        "reward": 18
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb16c",
    "name": "RccGgSrFHo",
    "totalRewards": 90,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 13
      },
      {
        "month": "MARCH",
        "reward": 22
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 28
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 27
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb12b",
    "name": "OabocXJKmB",
    "totalRewards": 136,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 28
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 4
      },
      {
        "month": "MAY",
        "reward": 9
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 49
      },
      {
        "month": "OCTOBER",
        "reward": 2
      },
      {
        "month": "NOVEMBER",
        "reward": 30
      },
      {
        "month": "DECEMBER",
        "reward": 14
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb270",
    "name": "wvIcgAUNRZ",
    "totalRewards": 214,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 45
      },
      {
        "month": "FEBRUARY",
        "reward": 42
      },
      {
        "month": "MARCH",
        "reward": 44
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 27
      },
      {
        "month": "JUNE",
        "reward": 13
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 41
      },
      {
        "month": "DECEMBER",
        "reward": 2
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb22f",
    "name": "iiukkqChKp",
    "totalRewards": 166,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 20
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 46
      },
      {
        "month": "JULY",
        "reward": 39
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 40
      },
      {
        "month": "NOVEMBER",
        "reward": 21
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb0ea",
    "name": "ekgsGyNYzo",
    "totalRewards": 122,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 21
      },
      {
        "month": "MARCH",
        "reward": 49
      },
      {
        "month": "APRIL",
        "reward": 34
      },
      {
        "month": "MAY",
        "reward": 1
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 8
      },
      {
        "month": "SEPTEMBER",
        "reward": 9
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb0a9",
    "name": "lOPGBUoDTl",
    "totalRewards": 226,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 2
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 47
      },
      {
        "month": "MAY",
        "reward": 42
      },
      {
        "month": "JUNE",
        "reward": 29
      },
      {
        "month": "JULY",
        "reward": 33
      },
      {
        "month": "AUGUST",
        "reward": 32
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 23
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 18
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb068",
    "name": "NgGLWNZNFP",
    "totalRewards": 189,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 5
      },
      {
        "month": "MARCH",
        "reward": 47
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 48
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 24
      },
      {
        "month": "NOVEMBER",
        "reward": 43
      },
      {
        "month": "DECEMBER",
        "reward": 22
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb027",
    "name": "VSxIErxsnG",
    "totalRewards": 139,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 26
      },
      {
        "month": "MARCH",
        "reward": 11
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 47
      },
      {
        "month": "JULY",
        "reward": 45
      },
      {
        "month": "AUGUST",
        "reward": 6
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 4
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cafe6",
    "name": "ZJGOeplJgZ",
    "totalRewards": 96,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 9
      },
      {
        "month": "APRIL",
        "reward": 31
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 10
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 17
      },
      {
        "month": "DECEMBER",
        "reward": 29
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cafa5",
    "name": "zKJupvRfGo",
    "totalRewards": 199,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 39
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 27
      },
      {
        "month": "AUGUST",
        "reward": 20
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 41
      },
      {
        "month": "NOVEMBER",
        "reward": 30
      },
      {
        "month": "DECEMBER",
        "reward": 42
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0caf64",
    "name": "VEYIbtWxjv",
    "totalRewards": 257,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 46
      },
      {
        "month": "FEBRUARY",
        "reward": 26
      },
      {
        "month": "MARCH",
        "reward": 16
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 21
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 31
      },
      {
        "month": "SEPTEMBER",
        "reward": 35
      },
      {
        "month": "OCTOBER",
        "reward": 42
      },
      {
        "month": "NOVEMBER",
        "reward": 40
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0caf23",
    "name": "jNsbMOKbMj",
    "totalRewards": 121,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 15
      },
      {
        "month": "FEBRUARY",
        "reward": 33
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 42
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 5
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 26
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cad9d",
    "name": "nVMSImdvGR",
    "totalRewards": 136,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 31
      },
      {
        "month": "FEBRUARY",
        "reward": 27
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 40
      },
      {
        "month": "MAY",
        "reward": 24
      },
      {
        "month": "JUNE",
        "reward": 11
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 3
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0caee2",
    "name": "BSMzEVfGZg",
    "totalRewards": 160,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 25
      },
      {
        "month": "FEBRUARY",
        "reward": 35
      },
      {
        "month": "MARCH",
        "reward": 18
      },
      {
        "month": "APRIL",
        "reward": 24
      },
      {
        "month": "MAY",
        "reward": 5
      },
      {
        "month": "JUNE",
        "reward": 26
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 22
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 5
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cadde",
    "name": "ghdAGwOubo",
    "totalRewards": 181,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 4
      },
      {
        "month": "MARCH",
        "reward": 24
      },
      {
        "month": "APRIL",
        "reward": 26
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 40
      },
      {
        "month": "JULY",
        "reward": 4
      },
      {
        "month": "AUGUST",
        "reward": 25
      },
      {
        "month": "SEPTEMBER",
        "reward": 19
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 39
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0caea1",
    "name": "jBxGqMjOoe",
    "totalRewards": 105,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 2
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 30
      },
      {
        "month": "AUGUST",
        "reward": 6
      },
      {
        "month": "SEPTEMBER",
        "reward": 14
      },
      {
        "month": "OCTOBER",
        "reward": 21
      },
      {
        "month": "NOVEMBER",
        "reward": 32
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cae1f",
    "name": "ErdRCHvbEH",
    "totalRewards": 145,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 37
      },
      {
        "month": "MARCH",
        "reward": 33
      },
      {
        "month": "APRIL",
        "reward": 5
      },
      {
        "month": "MAY",
        "reward": 5
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 38
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 19
      },
      {
        "month": "NOVEMBER",
        "reward": 8
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cae60",
    "name": "jkGlXjbHaM",
    "totalRewards": 233,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 5
      },
      {
        "month": "FEBRUARY",
        "reward": 18
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 49
      },
      {
        "month": "MAY",
        "reward": 46
      },
      {
        "month": "JUNE",
        "reward": 24
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 5
      },
      {
        "month": "SEPTEMBER",
        "reward": 1
      },
      {
        "month": "OCTOBER",
        "reward": 40
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 45
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb1fb",
    "name": "nJAlxXIgWz",
    "totalRewards": 161,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 1
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 37
      },
      {
        "month": "SEPTEMBER",
        "reward": 45
      },
      {
        "month": "OCTOBER",
        "reward": 34
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 44
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0caeef",
    "name": "KYsgyFEmDK",
    "totalRewards": 162,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 8
      },
      {
        "month": "FEBRUARY",
        "reward": 14
      },
      {
        "month": "MARCH",
        "reward": 9
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 10
      },
      {
        "month": "JUNE",
        "reward": 1
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 1
      },
      {
        "month": "SEPTEMBER",
        "reward": 40
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 37
      },
      {
        "month": "DECEMBER",
        "reward": 42
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cafb2",
    "name": "HkPasIHAut",
    "totalRewards": 322,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 6
      },
      {
        "month": "FEBRUARY",
        "reward": 36
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 35
      },
      {
        "month": "MAY",
        "reward": 41
      },
      {
        "month": "JUNE",
        "reward": 21
      },
      {
        "month": "JULY",
        "reward": 6
      },
      {
        "month": "AUGUST",
        "reward": 45
      },
      {
        "month": "SEPTEMBER",
        "reward": 39
      },
      {
        "month": "OCTOBER",
        "reward": 20
      },
      {
        "month": "NOVEMBER",
        "reward": 24
      },
      {
        "month": "DECEMBER",
        "reward": 49
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0caf71",
    "name": "DvisPtrmmv",
    "totalRewards": 117,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 49
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 37
      },
      {
        "month": "JUNE",
        "reward": 9
      },
      {
        "month": "JULY",
        "reward": 9
      },
      {
        "month": "AUGUST",
        "reward": 4
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 9
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0caf30",
    "name": "XpLIMoIXIq",
    "totalRewards": 115,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 24
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 41
      },
      {
        "month": "MAY",
        "reward": 21
      },
      {
        "month": "JUNE",
        "reward": 5
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 23
      },
      {
        "month": "SEPTEMBER",
        "reward": 1
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0caeae",
    "name": "EhWhUngHuM",
    "totalRewards": 222,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 29
      },
      {
        "month": "FEBRUARY",
        "reward": 27
      },
      {
        "month": "MARCH",
        "reward": 46
      },
      {
        "month": "APRIL",
        "reward": 38
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 47
      },
      {
        "month": "OCTOBER",
        "reward": 8
      },
      {
        "month": "NOVEMBER",
        "reward": 27
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cae6d",
    "name": "nmfeaKEBQK",
    "totalRewards": 99,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 8
      },
      {
        "month": "MARCH",
        "reward": 34
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 18
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 39
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cae2c",
    "name": "gXzCVhKmPS",
    "totalRewards": 62,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 33
      },
      {
        "month": "JULY",
        "reward": 29
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cadeb",
    "name": "piQPzCFkFq",
    "totalRewards": 100,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 7
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 41
      },
      {
        "month": "SEPTEMBER",
        "reward": 18
      },
      {
        "month": "OCTOBER",
        "reward": 34
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb23c",
    "name": "aMtqAxgBmb",
    "totalRewards": 122,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 8
      },
      {
        "month": "FEBRUARY",
        "reward": 46
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 10
      },
      {
        "month": "MAY",
        "reward": 38
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 20
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb27d",
    "name": "QCVetYXwvD",
    "totalRewards": 256,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 31
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 41
      },
      {
        "month": "MAY",
        "reward": 41
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 46
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 49
      },
      {
        "month": "NOVEMBER",
        "reward": 48
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb034",
    "name": "lCftEMTbbh",
    "totalRewards": 147,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 18
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 39
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 6
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 10
      },
      {
        "month": "NOVEMBER",
        "reward": 35
      },
      {
        "month": "DECEMBER",
        "reward": 39
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0caff3",
    "name": "wqcZTxTdUB",
    "totalRewards": 182,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 16
      },
      {
        "month": "MARCH",
        "reward": 44
      },
      {
        "month": "APRIL",
        "reward": 47
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 10
      },
      {
        "month": "AUGUST",
        "reward": 26
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 39
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb1ba",
    "name": "PfJZmisqlo",
    "totalRewards": 92,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 3
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 33
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 24
      },
      {
        "month": "JULY",
        "reward": 32
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb138",
    "name": "rOxSphsZRo",
    "totalRewards": 171,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 24
      },
      {
        "month": "FEBRUARY",
        "reward": 2
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 34
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 49
      },
      {
        "month": "AUGUST",
        "reward": 2
      },
      {
        "month": "SEPTEMBER",
        "reward": 19
      },
      {
        "month": "OCTOBER",
        "reward": 8
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 33
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb0b6",
    "name": "gkHvclZHPR",
    "totalRewards": 51,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 24
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 27
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb179",
    "name": "rGJKxOtwZt",
    "totalRewards": 118,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 28
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 16
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 43
      },
      {
        "month": "AUGUST",
        "reward": 19
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 12
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb075",
    "name": "HRGgKvcJRQ",
    "totalRewards": 190,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 25
      },
      {
        "month": "MAY",
        "reward": 41
      },
      {
        "month": "JUNE",
        "reward": 44
      },
      {
        "month": "JULY",
        "reward": 44
      },
      {
        "month": "AUGUST",
        "reward": 8
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 4
      },
      {
        "month": "DECEMBER",
        "reward": 24
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb0f7",
    "name": "XYHCltKRit",
    "totalRewards": 207,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 38
      },
      {
        "month": "MARCH",
        "reward": 2
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 12
      },
      {
        "month": "JULY",
        "reward": 45
      },
      {
        "month": "AUGUST",
        "reward": 29
      },
      {
        "month": "SEPTEMBER",
        "reward": 25
      },
      {
        "month": "OCTOBER",
        "reward": 12
      },
      {
        "month": "NOVEMBER",
        "reward": 44
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cadaa",
    "name": "dwrntDyswY",
    "totalRewards": 92,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 22
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 41
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 29
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb082",
    "name": "VNqdHRSCoY",
    "totalRewards": 165,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 48
      },
      {
        "month": "MARCH",
        "reward": 27
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 29
      },
      {
        "month": "JUNE",
        "reward": 25
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 14
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 22
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb000",
    "name": "PXiipRGCVW",
    "totalRewards": 120,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 46
      },
      {
        "month": "APRIL",
        "reward": 46
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 11
      },
      {
        "month": "JULY",
        "reward": 17
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cae7a",
    "name": "jEBBDgkbbp",
    "totalRewards": 231,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 47
      },
      {
        "month": "FEBRUARY",
        "reward": 36
      },
      {
        "month": "MARCH",
        "reward": 43
      },
      {
        "month": "APRIL",
        "reward": 34
      },
      {
        "month": "MAY",
        "reward": 37
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 9
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 25
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cadf8",
    "name": "RDOMfOOXJo",
    "totalRewards": 192,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 26
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 15
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 37
      },
      {
        "month": "AUGUST",
        "reward": 7
      },
      {
        "month": "SEPTEMBER",
        "reward": 38
      },
      {
        "month": "OCTOBER",
        "reward": 31
      },
      {
        "month": "NOVEMBER",
        "reward": 38
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb28a",
    "name": "kqbbggGNIM",
    "totalRewards": 65,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 2
      },
      {
        "month": "MARCH",
        "reward": 18
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 19
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 26
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb249",
    "name": "MqVKlxIdpU",
    "totalRewards": 87,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 23
      },
      {
        "month": "MAY",
        "reward": 6
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 10
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 48
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb041",
    "name": "xlgZxaQPWm",
    "totalRewards": 181,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 37
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 10
      },
      {
        "month": "APRIL",
        "reward": 45
      },
      {
        "month": "MAY",
        "reward": 20
      },
      {
        "month": "JUNE",
        "reward": 1
      },
      {
        "month": "JULY",
        "reward": 38
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 27
      },
      {
        "month": "DECEMBER",
        "reward": 3
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cae39",
    "name": "XIKhTVsjPn",
    "totalRewards": 143,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 23
      },
      {
        "month": "APRIL",
        "reward": 20
      },
      {
        "month": "MAY",
        "reward": 18
      },
      {
        "month": "JUNE",
        "reward": 25
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 28
      },
      {
        "month": "OCTOBER",
        "reward": 2
      },
      {
        "month": "NOVEMBER",
        "reward": 27
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb208",
    "name": "MIazlzvrnT",
    "totalRewards": 236,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 41
      },
      {
        "month": "MARCH",
        "reward": 20
      },
      {
        "month": "APRIL",
        "reward": 46
      },
      {
        "month": "MAY",
        "reward": 33
      },
      {
        "month": "JUNE",
        "reward": 47
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 49
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb1c7",
    "name": "xgFqBqziBg",
    "totalRewards": 162,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 44
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 1
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 30
      },
      {
        "month": "SEPTEMBER",
        "reward": 4
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 37
      },
      {
        "month": "DECEMBER",
        "reward": 46
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb0c3",
    "name": "DfXfQGlusl",
    "totalRewards": 205,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 28
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 20
      },
      {
        "month": "APRIL",
        "reward": 15
      },
      {
        "month": "MAY",
        "reward": 33
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 39
      },
      {
        "month": "AUGUST",
        "reward": 21
      },
      {
        "month": "SEPTEMBER",
        "reward": 13
      },
      {
        "month": "OCTOBER",
        "reward": 1
      },
      {
        "month": "NOVEMBER",
        "reward": 35
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cadb7",
    "name": "eoxfFPaEmh",
    "totalRewards": 85,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 38
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 42
      },
      {
        "month": "SEPTEMBER",
        "reward": 5
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb104",
    "name": "IwBbPFTFdA",
    "totalRewards": 146,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 48
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 14
      },
      {
        "month": "MAY",
        "reward": 33
      },
      {
        "month": "JUNE",
        "reward": 14
      },
      {
        "month": "JULY",
        "reward": 10
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 1
      },
      {
        "month": "DECEMBER",
        "reward": 26
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb186",
    "name": "taAgRezLSG",
    "totalRewards": 136,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 16
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 22
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 16
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 16
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 40
      },
      {
        "month": "NOVEMBER",
        "reward": 26
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb145",
    "name": "jNIiwatFaX",
    "totalRewards": 230,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 16
      },
      {
        "month": "FEBRUARY",
        "reward": 39
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 32
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 48
      },
      {
        "month": "JULY",
        "reward": 26
      },
      {
        "month": "AUGUST",
        "reward": 36
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 33
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cafbf",
    "name": "yfxihZGRyG",
    "totalRewards": 223,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 41
      },
      {
        "month": "FEBRUARY",
        "reward": 42
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 42
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 41
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 25
      },
      {
        "month": "SEPTEMBER",
        "reward": 12
      },
      {
        "month": "OCTOBER",
        "reward": 6
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 14
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0caebb",
    "name": "ztekQAybrE",
    "totalRewards": 189,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 8
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 28
      },
      {
        "month": "MAY",
        "reward": 17
      },
      {
        "month": "JUNE",
        "reward": 28
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 18
      },
      {
        "month": "SEPTEMBER",
        "reward": 20
      },
      {
        "month": "OCTOBER",
        "reward": 44
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 26
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0caf7e",
    "name": "PEiROXyTXh",
    "totalRewards": 216,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 27
      },
      {
        "month": "FEBRUARY",
        "reward": 12
      },
      {
        "month": "MARCH",
        "reward": 4
      },
      {
        "month": "APRIL",
        "reward": 27
      },
      {
        "month": "MAY",
        "reward": 43
      },
      {
        "month": "JUNE",
        "reward": 42
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 18
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 43
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0caefc",
    "name": "jobGEfrQbm",
    "totalRewards": 125,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 49
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 49
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 27
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0caf3d",
    "name": "LHMaJLmojh",
    "totalRewards": 26,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 1
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 10
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 15
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cafcc",
    "name": "cFeDJpTyox",
    "totalRewards": 241,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 45
      },
      {
        "month": "FEBRUARY",
        "reward": 47
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 47
      },
      {
        "month": "JUNE",
        "reward": 25
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 33
      },
      {
        "month": "SEPTEMBER",
        "reward": 23
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 21
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0caf8b",
    "name": "tcEZEultaJ",
    "totalRewards": 231,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 49
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 45
      },
      {
        "month": "MAY",
        "reward": 32
      },
      {
        "month": "JUNE",
        "reward": 41
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 29
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 33
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 2
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb256",
    "name": "pRfoWUPEil",
    "totalRewards": 238,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 42
      },
      {
        "month": "FEBRUARY",
        "reward": 39
      },
      {
        "month": "MARCH",
        "reward": 24
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 29
      },
      {
        "month": "JUNE",
        "reward": 44
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 14
      },
      {
        "month": "SEPTEMBER",
        "reward": 16
      },
      {
        "month": "OCTOBER",
        "reward": 30
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb215",
    "name": "fvpKUUYwDc",
    "totalRewards": 187,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 47
      },
      {
        "month": "MARCH",
        "reward": 20
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 12
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 43
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 37
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 28
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb152",
    "name": "hMTmsIgMVu",
    "totalRewards": 146,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 14
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 32
      },
      {
        "month": "JULY",
        "reward": 17
      },
      {
        "month": "AUGUST",
        "reward": 46
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 37
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb111",
    "name": "GQTwMpLEmh",
    "totalRewards": 133,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 5
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 29
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 32
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 30
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 37
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb04e",
    "name": "KaYMGIgwij",
    "totalRewards": 129,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 1
      },
      {
        "month": "FEBRUARY",
        "reward": 24
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 34
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 3
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 11
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 12
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 44
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb00d",
    "name": "EMNtgwaFiE",
    "totalRewards": 110,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 28
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 20
      },
      {
        "month": "AUGUST",
        "reward": 18
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 44
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb297",
    "name": "yXWGoLgInw",
    "totalRewards": 164,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 47
      },
      {
        "month": "FEBRUARY",
        "reward": 49
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 0
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 11
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 21
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 35
      },
      {
        "month": "DECEMBER",
        "reward": 1
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb0d0",
    "name": "XpaDQcbXhF",
    "totalRewards": 192,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 10
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 33
      },
      {
        "month": "MAY",
        "reward": 34
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 29
      },
      {
        "month": "AUGUST",
        "reward": 25
      },
      {
        "month": "SEPTEMBER",
        "reward": 39
      },
      {
        "month": "OCTOBER",
        "reward": 22
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb08f",
    "name": "jxCTYJwCco",
    "totalRewards": 142,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 2
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 43
      },
      {
        "month": "MAY",
        "reward": 35
      },
      {
        "month": "JUNE",
        "reward": 40
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 0
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 22
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb1d4",
    "name": "JQpAhhxgYp",
    "totalRewards": 228,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 22
      },
      {
        "month": "MARCH",
        "reward": 0
      },
      {
        "month": "APRIL",
        "reward": 42
      },
      {
        "month": "MAY",
        "reward": 42
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 4
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 43
      },
      {
        "month": "NOVEMBER",
        "reward": 32
      },
      {
        "month": "DECEMBER",
        "reward": 43
      }
    ]
  },
  {
    "customerId": "676540630ce21574ed0cb193",
    "name": "gDMCNtOEOA",
    "totalRewards": 50,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 0
      },
      {
        "month": "MARCH",
        "reward": 5
      },
      {
        "month": "APRIL",
        "reward": 16
      },
      {
        "month": "MAY",
        "reward": 0
      },
      {
        "month": "JUNE",
        "reward": 0
      },
      {
        "month": "JULY",
        "reward": 0
      },
      {
        "month": "AUGUST",
        "reward": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 0
      },
      {
        "month": "OCTOBER",
        "reward": 29
      },
      {
        "month": "NOVEMBER",
        "reward": 0
      },
      {
        "month": "DECEMBER",
        "reward": 0
      }
    ]
  }
]
```