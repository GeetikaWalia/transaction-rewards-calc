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
    "customerId": "67690cf288760325e9ad9015",
    "name": "lzKZDSPbdK",
    "totalRewards": 147,
    "totalAmount": 680,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 24
      },
      {
        "month": "FEBRUARY",
        "reward": 18,
        "amount": 68
      },
      {
        "month": "MARCH",
        "reward": 4,
        "amount": 54
      },
      {
        "month": "APRIL",
        "reward": 23,
        "amount": 73
      },
      {
        "month": "MAY",
        "reward": 4,
        "amount": 54
      },
      {
        "month": "JUNE",
        "reward": 5,
        "amount": 55
      },
      {
        "month": "JULY",
        "reward": 14,
        "amount": 64
      },
      {
        "month": "AUGUST",
        "reward": 14,
        "amount": 64
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 10
      },
      {
        "month": "OCTOBER",
        "reward": 18,
        "amount": 68
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 49
      },
      {
        "month": "DECEMBER",
        "reward": 47,
        "amount": 97
      }
    ]
  },
  {
    "customerId": "67690cf288760325e9ad8fd4",
    "name": "mNOHSYJRQU",
    "totalRewards": 108,
    "totalAmount": 531,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 10,
        "amount": 60
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 15
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 28
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 26
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 44
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 29
      },
      {
        "month": "JULY",
        "reward": 10,
        "amount": 60
      },
      {
        "month": "AUGUST",
        "reward": 9,
        "amount": 59
      },
      {
        "month": "SEPTEMBER",
        "reward": 41,
        "amount": 91
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 9
      },
      {
        "month": "NOVEMBER",
        "reward": 38,
        "amount": 88
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 22
      }
    ]
  },
  {
    "customerId": "67690cf288760325e9ad8f93",
    "name": "ZSFmDGFUCR",
    "totalRewards": 239,
    "totalAmount": 807,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 37,
        "amount": 87
      },
      {
        "month": "FEBRUARY",
        "reward": 21,
        "amount": 71
      },
      {
        "month": "MARCH",
        "reward": 19,
        "amount": 69
      },
      {
        "month": "APRIL",
        "reward": 6,
        "amount": 56
      },
      {
        "month": "MAY",
        "reward": 15,
        "amount": 65
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 28
      },
      {
        "month": "JULY",
        "reward": 47,
        "amount": 97
      },
      {
        "month": "AUGUST",
        "reward": 18,
        "amount": 68
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 40
      },
      {
        "month": "OCTOBER",
        "reward": 39,
        "amount": 89
      },
      {
        "month": "NOVEMBER",
        "reward": 16,
        "amount": 66
      },
      {
        "month": "DECEMBER",
        "reward": 21,
        "amount": 71
      }
    ]
  },
  {
    "customerId": "67690cf288760325e9ad8f52",
    "name": "nGjejSwgEI",
    "totalRewards": 90,
    "totalAmount": 608,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 37
      },
      {
        "month": "FEBRUARY",
        "reward": 2,
        "amount": 52
      },
      {
        "month": "MARCH",
        "reward": 3,
        "amount": 53
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 13
      },
      {
        "month": "MAY",
        "reward": 12,
        "amount": 62
      },
      {
        "month": "JUNE",
        "reward": 31,
        "amount": 81
      },
      {
        "month": "JULY",
        "reward": 3,
        "amount": 53
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 22
      },
      {
        "month": "SEPTEMBER",
        "reward": 3,
        "amount": 53
      },
      {
        "month": "OCTOBER",
        "reward": 7,
        "amount": 57
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 46
      },
      {
        "month": "DECEMBER",
        "reward": 29,
        "amount": 79
      }
    ]
  },
  {
    "customerId": "67690cf288760325e9ad8f11",
    "name": "TUIthASKck",
    "totalRewards": 115,
    "totalAmount": 585,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 19,
        "amount": 69
      },
      {
        "month": "FEBRUARY",
        "reward": 42,
        "amount": 92
      },
      {
        "month": "MARCH",
        "reward": 6,
        "amount": 56
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 48
      },
      {
        "month": "MAY",
        "reward": 18,
        "amount": 68
      },
      {
        "month": "JUNE",
        "reward": 21,
        "amount": 71
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 6
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 12
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 48
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 33
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 23
      },
      {
        "month": "DECEMBER",
        "reward": 9,
        "amount": 59
      }
    ]
  },
  {
    "customerId": "67690cf288760325e9ad8ed0",
    "name": "SKYhQlYZWF",
    "totalRewards": 75,
    "totalAmount": 562,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 33
      },
      {
        "month": "FEBRUARY",
        "reward": 2,
        "amount": 52
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 11
      },
      {
        "month": "APRIL",
        "reward": 10,
        "amount": 60
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 25
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 43
      },
      {
        "month": "JULY",
        "reward": 28,
        "amount": 78
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 48
      },
      {
        "month": "SEPTEMBER",
        "reward": 1,
        "amount": 51
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 45
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 32
      },
      {
        "month": "DECEMBER",
        "reward": 34,
        "amount": 84
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad9174",
    "name": "HRGgKvcJRQ",
    "totalRewards": 190,
    "totalAmount": 687,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 34
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 11
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 12
      },
      {
        "month": "APRIL",
        "reward": 25,
        "amount": 75
      },
      {
        "month": "MAY",
        "reward": 41,
        "amount": 91
      },
      {
        "month": "JUNE",
        "reward": 44,
        "amount": 94
      },
      {
        "month": "JULY",
        "reward": 44,
        "amount": 94
      },
      {
        "month": "AUGUST",
        "reward": 8,
        "amount": 58
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 46
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 44
      },
      {
        "month": "NOVEMBER",
        "reward": 4,
        "amount": 54
      },
      {
        "month": "DECEMBER",
        "reward": 24,
        "amount": 74
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad9133",
    "name": "lCftEMTbbh",
    "totalRewards": 147,
    "totalAmount": 616,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 17
      },
      {
        "month": "FEBRUARY",
        "reward": 18,
        "amount": 68
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 36
      },
      {
        "month": "APRIL",
        "reward": 39,
        "amount": 89
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 45
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 43
      },
      {
        "month": "JULY",
        "reward": 6,
        "amount": 56
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 2
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 26
      },
      {
        "month": "OCTOBER",
        "reward": 10,
        "amount": 60
      },
      {
        "month": "NOVEMBER",
        "reward": 35,
        "amount": 85
      },
      {
        "month": "DECEMBER",
        "reward": 39,
        "amount": 89
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad90f2",
    "name": "wqcZTxTdUB",
    "totalRewards": 182,
    "totalAmount": 604,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 8
      },
      {
        "month": "FEBRUARY",
        "reward": 16,
        "amount": 66
      },
      {
        "month": "MARCH",
        "reward": 44,
        "amount": 94
      },
      {
        "month": "APRIL",
        "reward": 47,
        "amount": 97
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 44
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 19
      },
      {
        "month": "JULY",
        "reward": 10,
        "amount": 60
      },
      {
        "month": "AUGUST",
        "reward": 26,
        "amount": 76
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 6
      },
      {
        "month": "OCTOBER",
        "reward": 39,
        "amount": 89
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 2
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 43
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad90b1",
    "name": "HkPasIHAut",
    "totalRewards": 322,
    "totalAmount": 893,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 6,
        "amount": 56
      },
      {
        "month": "FEBRUARY",
        "reward": 36,
        "amount": 86
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 21
      },
      {
        "month": "APRIL",
        "reward": 35,
        "amount": 85
      },
      {
        "month": "MAY",
        "reward": 41,
        "amount": 91
      },
      {
        "month": "JUNE",
        "reward": 21,
        "amount": 71
      },
      {
        "month": "JULY",
        "reward": 6,
        "amount": 56
      },
      {
        "month": "AUGUST",
        "reward": 45,
        "amount": 95
      },
      {
        "month": "SEPTEMBER",
        "reward": 39,
        "amount": 89
      },
      {
        "month": "OCTOBER",
        "reward": 20,
        "amount": 70
      },
      {
        "month": "NOVEMBER",
        "reward": 24,
        "amount": 74
      },
      {
        "month": "DECEMBER",
        "reward": 49,
        "amount": 99
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad9070",
    "name": "DvisPtrmmv",
    "totalRewards": 117,
    "totalAmount": 541,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 49,
        "amount": 99
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 13
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 45
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 5
      },
      {
        "month": "MAY",
        "reward": 37,
        "amount": 87
      },
      {
        "month": "JUNE",
        "reward": 9,
        "amount": 59
      },
      {
        "month": "JULY",
        "reward": 9,
        "amount": 59
      },
      {
        "month": "AUGUST",
        "reward": 4,
        "amount": 54
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 8
      },
      {
        "month": "OCTOBER",
        "reward": 9,
        "amount": 59
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 17
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 36
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad902f",
    "name": "XpLIMoIXIq",
    "totalRewards": 115,
    "totalAmount": 605,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 24,
        "amount": 74
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 42
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 49
      },
      {
        "month": "APRIL",
        "reward": 41,
        "amount": 91
      },
      {
        "month": "MAY",
        "reward": 21,
        "amount": 71
      },
      {
        "month": "JUNE",
        "reward": 5,
        "amount": 55
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 31
      },
      {
        "month": "AUGUST",
        "reward": 23,
        "amount": 73
      },
      {
        "month": "SEPTEMBER",
        "reward": 1,
        "amount": 51
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 22
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 5
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 41
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad933b",
    "name": "aMtqAxgBmb",
    "totalRewards": 122,
    "totalAmount": 646,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 8,
        "amount": 58
      },
      {
        "month": "FEBRUARY",
        "reward": 46,
        "amount": 96
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 18
      },
      {
        "month": "APRIL",
        "reward": 10,
        "amount": 60
      },
      {
        "month": "MAY",
        "reward": 38,
        "amount": 88
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 35
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 48
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 43
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 35
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 48
      },
      {
        "month": "NOVEMBER",
        "reward": 20,
        "amount": 70
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 47
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad92fa",
    "name": "nJAlxXIgWz",
    "totalRewards": 161,
    "totalAmount": 591,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 1,
        "amount": 51
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 34
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 11
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 30
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 42
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 30
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 6
      },
      {
        "month": "AUGUST",
        "reward": 37,
        "amount": 87
      },
      {
        "month": "SEPTEMBER",
        "reward": 45,
        "amount": 95
      },
      {
        "month": "OCTOBER",
        "reward": 34,
        "amount": 84
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 27
      },
      {
        "month": "DECEMBER",
        "reward": 44,
        "amount": 94
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad92b9",
    "name": "PfJZmisqlo",
    "totalRewards": 92,
    "totalAmount": 434,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 3,
        "amount": 53
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 1
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 11
      },
      {
        "month": "APRIL",
        "reward": 33,
        "amount": 83
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 3
      },
      {
        "month": "JUNE",
        "reward": 24,
        "amount": 74
      },
      {
        "month": "JULY",
        "reward": 32,
        "amount": 82
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 50
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 12
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 7
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 46
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 12
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad9278",
    "name": "rGJKxOtwZt",
    "totalRewards": 118,
    "totalAmount": 517,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 28,
        "amount": 78
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 19
      },
      {
        "month": "MARCH",
        "reward": 16,
        "amount": 66
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 16
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 35
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 38
      },
      {
        "month": "JULY",
        "reward": 43,
        "amount": 93
      },
      {
        "month": "AUGUST",
        "reward": 19,
        "amount": 69
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 19
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 3
      },
      {
        "month": "NOVEMBER",
        "reward": 12,
        "amount": 62
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 19
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad9237",
    "name": "rOxSphsZRo",
    "totalRewards": 171,
    "totalAmount": 623,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 24,
        "amount": 74
      },
      {
        "month": "FEBRUARY",
        "reward": 2,
        "amount": 52
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 0
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 1
      },
      {
        "month": "MAY",
        "reward": 34,
        "amount": 84
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 26
      },
      {
        "month": "JULY",
        "reward": 49,
        "amount": 99
      },
      {
        "month": "AUGUST",
        "reward": 2,
        "amount": 52
      },
      {
        "month": "SEPTEMBER",
        "reward": 19,
        "amount": 69
      },
      {
        "month": "OCTOBER",
        "reward": 8,
        "amount": 58
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 25
      },
      {
        "month": "DECEMBER",
        "reward": 33,
        "amount": 83
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad91f6",
    "name": "XYHCltKRit",
    "totalRewards": 207,
    "totalAmount": 749,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 35
      },
      {
        "month": "FEBRUARY",
        "reward": 38,
        "amount": 88
      },
      {
        "month": "MARCH",
        "reward": 2,
        "amount": 52
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 42
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 29
      },
      {
        "month": "JUNE",
        "reward": 12,
        "amount": 62
      },
      {
        "month": "JULY",
        "reward": 45,
        "amount": 95
      },
      {
        "month": "AUGUST",
        "reward": 29,
        "amount": 79
      },
      {
        "month": "SEPTEMBER",
        "reward": 25,
        "amount": 75
      },
      {
        "month": "OCTOBER",
        "reward": 12,
        "amount": 62
      },
      {
        "month": "NOVEMBER",
        "reward": 44,
        "amount": 94
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 36
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad91b5",
    "name": "gkHvclZHPR",
    "totalRewards": 51,
    "totalAmount": 426,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 24,
        "amount": 74
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 41
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 16
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 17
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 4
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 15
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 36
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 44
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 30
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 30
      },
      {
        "month": "NOVEMBER",
        "reward": 27,
        "amount": 77
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 42
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad937c",
    "name": "QCVetYXwvD",
    "totalRewards": 256,
    "totalAmount": 713,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 21
      },
      {
        "month": "FEBRUARY",
        "reward": 31,
        "amount": 81
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 43
      },
      {
        "month": "APRIL",
        "reward": 41,
        "amount": 91
      },
      {
        "month": "MAY",
        "reward": 41,
        "amount": 91
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 12
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 45
      },
      {
        "month": "AUGUST",
        "reward": 46,
        "amount": 96
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 21
      },
      {
        "month": "OCTOBER",
        "reward": 49,
        "amount": 99
      },
      {
        "month": "NOVEMBER",
        "reward": 48,
        "amount": 98
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 15
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad9244",
    "name": "jNIiwatFaX",
    "totalRewards": 230,
    "totalAmount": 645,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 16,
        "amount": 66
      },
      {
        "month": "FEBRUARY",
        "reward": 39,
        "amount": 89
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 22
      },
      {
        "month": "APRIL",
        "reward": 32,
        "amount": 82
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 5
      },
      {
        "month": "JUNE",
        "reward": 48,
        "amount": 98
      },
      {
        "month": "JULY",
        "reward": 26,
        "amount": 76
      },
      {
        "month": "AUGUST",
        "reward": 36,
        "amount": 86
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 6
      },
      {
        "month": "OCTOBER",
        "reward": 33,
        "amount": 83
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 11
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 21
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad91c2",
    "name": "DfXfQGlusl",
    "totalRewards": 205,
    "totalAmount": 733,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 28,
        "amount": 78
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 39
      },
      {
        "month": "MARCH",
        "reward": 20,
        "amount": 70
      },
      {
        "month": "APRIL",
        "reward": 15,
        "amount": 65
      },
      {
        "month": "MAY",
        "reward": 33,
        "amount": 83
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 25
      },
      {
        "month": "JULY",
        "reward": 39,
        "amount": 89
      },
      {
        "month": "AUGUST",
        "reward": 21,
        "amount": 71
      },
      {
        "month": "SEPTEMBER",
        "reward": 13,
        "amount": 63
      },
      {
        "month": "OCTOBER",
        "reward": 1,
        "amount": 51
      },
      {
        "month": "NOVEMBER",
        "reward": 35,
        "amount": 85
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 14
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad903c",
    "name": "LHMaJLmojh",
    "totalRewards": 26,
    "totalAmount": 463,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 39
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 32
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 10
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 41
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 41
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 3
      },
      {
        "month": "JULY",
        "reward": 1,
        "amount": 51
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 49
      },
      {
        "month": "SEPTEMBER",
        "reward": 10,
        "amount": 60
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 42
      },
      {
        "month": "NOVEMBER",
        "reward": 15,
        "amount": 65
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 30
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad9203",
    "name": "IwBbPFTFdA",
    "totalRewards": 146,
    "totalAmount": 586,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 48,
        "amount": 98
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 1
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 11
      },
      {
        "month": "APRIL",
        "reward": 14,
        "amount": 64
      },
      {
        "month": "MAY",
        "reward": 33,
        "amount": 83
      },
      {
        "month": "JUNE",
        "reward": 14,
        "amount": 64
      },
      {
        "month": "JULY",
        "reward": 10,
        "amount": 60
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 16
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 35
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 27
      },
      {
        "month": "NOVEMBER",
        "reward": 1,
        "amount": 51
      },
      {
        "month": "DECEMBER",
        "reward": 26,
        "amount": 76
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad9389",
    "name": "kqbbggGNIM",
    "totalRewards": 65,
    "totalAmount": 499,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 9
      },
      {
        "month": "FEBRUARY",
        "reward": 2,
        "amount": 52
      },
      {
        "month": "MARCH",
        "reward": 18,
        "amount": 68
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 32
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 5
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 50
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 23
      },
      {
        "month": "AUGUST",
        "reward": 19,
        "amount": 69
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 39
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 46
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 30
      },
      {
        "month": "DECEMBER",
        "reward": 26,
        "amount": 76
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad9285",
    "name": "taAgRezLSG",
    "totalRewards": 136,
    "totalAmount": 582,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 16,
        "amount": 66
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 40
      },
      {
        "month": "MARCH",
        "reward": 22,
        "amount": 72
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 35
      },
      {
        "month": "MAY",
        "reward": 16,
        "amount": 66
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 43
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 10
      },
      {
        "month": "AUGUST",
        "reward": 16,
        "amount": 66
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 15
      },
      {
        "month": "OCTOBER",
        "reward": 40,
        "amount": 90
      },
      {
        "month": "NOVEMBER",
        "reward": 26,
        "amount": 76
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 3
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad9348",
    "name": "MqVKlxIdpU",
    "totalRewards": 87,
    "totalAmount": 447,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 35
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 3
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 10
      },
      {
        "month": "APRIL",
        "reward": 23,
        "amount": 73
      },
      {
        "month": "MAY",
        "reward": 6,
        "amount": 56
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 3
      },
      {
        "month": "JULY",
        "reward": 10,
        "amount": 60
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 29
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 48
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 23
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 9
      },
      {
        "month": "DECEMBER",
        "reward": 48,
        "amount": 98
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad92c6",
    "name": "xgFqBqziBg",
    "totalRewards": 162,
    "totalAmount": 591,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 10
      },
      {
        "month": "FEBRUARY",
        "reward": 44,
        "amount": 94
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 42
      },
      {
        "month": "APRIL",
        "reward": 1,
        "amount": 51
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 28
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 1
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 46
      },
      {
        "month": "AUGUST",
        "reward": 30,
        "amount": 80
      },
      {
        "month": "SEPTEMBER",
        "reward": 4,
        "amount": 54
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 2
      },
      {
        "month": "NOVEMBER",
        "reward": 37,
        "amount": 87
      },
      {
        "month": "DECEMBER",
        "reward": 46,
        "amount": 96
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad9307",
    "name": "MIazlzvrnT",
    "totalRewards": 236,
    "totalAmount": 684,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 16
      },
      {
        "month": "FEBRUARY",
        "reward": 41,
        "amount": 91
      },
      {
        "month": "MARCH",
        "reward": 20,
        "amount": 70
      },
      {
        "month": "APRIL",
        "reward": 46,
        "amount": 96
      },
      {
        "month": "MAY",
        "reward": 33,
        "amount": 83
      },
      {
        "month": "JUNE",
        "reward": 47,
        "amount": 97
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 38
      },
      {
        "month": "AUGUST",
        "reward": 49,
        "amount": 99
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 40
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 32
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 5
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 17
      }
    ]
  },
  {
    "customerId": "67690cf288760325e9ad8f5f",
    "name": "jkGlXjbHaM",
    "totalRewards": 233,
    "totalAmount": 762,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 5,
        "amount": 55
      },
      {
        "month": "FEBRUARY",
        "reward": 18,
        "amount": 68
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 28
      },
      {
        "month": "APRIL",
        "reward": 49,
        "amount": 99
      },
      {
        "month": "MAY",
        "reward": 46,
        "amount": 96
      },
      {
        "month": "JUNE",
        "reward": 24,
        "amount": 74
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 30
      },
      {
        "month": "AUGUST",
        "reward": 5,
        "amount": 55
      },
      {
        "month": "SEPTEMBER",
        "reward": 1,
        "amount": 51
      },
      {
        "month": "OCTOBER",
        "reward": 40,
        "amount": 90
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 21
      },
      {
        "month": "DECEMBER",
        "reward": 45,
        "amount": 95
      }
    ]
  },
  {
    "customerId": "67690cf288760325e9ad8f1e",
    "name": "ErdRCHvbEH",
    "totalRewards": 145,
    "totalAmount": 555,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 0
      },
      {
        "month": "FEBRUARY",
        "reward": 37,
        "amount": 87
      },
      {
        "month": "MARCH",
        "reward": 33,
        "amount": 83
      },
      {
        "month": "APRIL",
        "reward": 5,
        "amount": 55
      },
      {
        "month": "MAY",
        "reward": 5,
        "amount": 55
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 22
      },
      {
        "month": "JULY",
        "reward": 38,
        "amount": 88
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 5
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 11
      },
      {
        "month": "OCTOBER",
        "reward": 19,
        "amount": 69
      },
      {
        "month": "NOVEMBER",
        "reward": 8,
        "amount": 58
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 22
      }
    ]
  },
  {
    "customerId": "67690cf288760325e9ad8edd",
    "name": "ghdAGwOubo",
    "totalRewards": 181,
    "totalAmount": 681,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 43
      },
      {
        "month": "FEBRUARY",
        "reward": 4,
        "amount": 54
      },
      {
        "month": "MARCH",
        "reward": 24,
        "amount": 74
      },
      {
        "month": "APRIL",
        "reward": 26,
        "amount": 76
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 29
      },
      {
        "month": "JUNE",
        "reward": 40,
        "amount": 90
      },
      {
        "month": "JULY",
        "reward": 4,
        "amount": 54
      },
      {
        "month": "AUGUST",
        "reward": 25,
        "amount": 75
      },
      {
        "month": "SEPTEMBER",
        "reward": 19,
        "amount": 69
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 9
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 19
      },
      {
        "month": "DECEMBER",
        "reward": 39,
        "amount": 89
      }
    ]
  },
  {
    "customerId": "67690cf288760325e9ad8e9c",
    "name": "nVMSImdvGR",
    "totalRewards": 136,
    "totalAmount": 551,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 31,
        "amount": 81
      },
      {
        "month": "FEBRUARY",
        "reward": 27,
        "amount": 77
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 5
      },
      {
        "month": "APRIL",
        "reward": 40,
        "amount": 90
      },
      {
        "month": "MAY",
        "reward": 24,
        "amount": 74
      },
      {
        "month": "JUNE",
        "reward": 11,
        "amount": 61
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 18
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 45
      },
      {
        "month": "SEPTEMBER",
        "reward": 3,
        "amount": 53
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 15
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 16
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 16
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad9181",
    "name": "VNqdHRSCoY",
    "totalRewards": 165,
    "totalAmount": 577,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 16
      },
      {
        "month": "FEBRUARY",
        "reward": 48,
        "amount": 98
      },
      {
        "month": "MARCH",
        "reward": 27,
        "amount": 77
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 21
      },
      {
        "month": "MAY",
        "reward": 29,
        "amount": 79
      },
      {
        "month": "JUNE",
        "reward": 25,
        "amount": 75
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 13
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 11
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 39
      },
      {
        "month": "OCTOBER",
        "reward": 14,
        "amount": 64
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 12
      },
      {
        "month": "DECEMBER",
        "reward": 22,
        "amount": 72
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad907d",
    "name": "PEiROXyTXh",
    "totalRewards": 216,
    "totalAmount": 688,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 27,
        "amount": 77
      },
      {
        "month": "FEBRUARY",
        "reward": 12,
        "amount": 62
      },
      {
        "month": "MARCH",
        "reward": 4,
        "amount": 54
      },
      {
        "month": "APRIL",
        "reward": 27,
        "amount": 77
      },
      {
        "month": "MAY",
        "reward": 43,
        "amount": 93
      },
      {
        "month": "JUNE",
        "reward": 42,
        "amount": 92
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 12
      },
      {
        "month": "AUGUST",
        "reward": 18,
        "amount": 68
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 1
      },
      {
        "month": "OCTOBER",
        "reward": 43,
        "amount": 93
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 39
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 20
      }
    ]
  },
  {
    "customerId": "67690cf288760325e9ad8fe1",
    "name": "BSMzEVfGZg",
    "totalRewards": 160,
    "totalAmount": 707,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 25,
        "amount": 75
      },
      {
        "month": "FEBRUARY",
        "reward": 35,
        "amount": 85
      },
      {
        "month": "MARCH",
        "reward": 18,
        "amount": 68
      },
      {
        "month": "APRIL",
        "reward": 24,
        "amount": 74
      },
      {
        "month": "MAY",
        "reward": 5,
        "amount": 55
      },
      {
        "month": "JUNE",
        "reward": 26,
        "amount": 76
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 27
      },
      {
        "month": "AUGUST",
        "reward": 22,
        "amount": 72
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 46
      },
      {
        "month": "OCTOBER",
        "reward": 5,
        "amount": 55
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 46
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 28
      }
    ]
  },
  {
    "customerId": "67690cf288760325e9ad8fa0",
    "name": "jBxGqMjOoe",
    "totalRewards": 105,
    "totalAmount": 579,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 2,
        "amount": 52
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 50
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 48
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 35
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 13
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 27
      },
      {
        "month": "JULY",
        "reward": 30,
        "amount": 80
      },
      {
        "month": "AUGUST",
        "reward": 6,
        "amount": 56
      },
      {
        "month": "SEPTEMBER",
        "reward": 14,
        "amount": 64
      },
      {
        "month": "OCTOBER",
        "reward": 21,
        "amount": 71
      },
      {
        "month": "NOVEMBER",
        "reward": 32,
        "amount": 82
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 1
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad9140",
    "name": "xlgZxaQPWm",
    "totalRewards": 181,
    "totalAmount": 701,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 37,
        "amount": 87
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 20
      },
      {
        "month": "MARCH",
        "reward": 10,
        "amount": 60
      },
      {
        "month": "APRIL",
        "reward": 45,
        "amount": 95
      },
      {
        "month": "MAY",
        "reward": 20,
        "amount": 70
      },
      {
        "month": "JUNE",
        "reward": 1,
        "amount": 51
      },
      {
        "month": "JULY",
        "reward": 38,
        "amount": 88
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 40
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 44
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 16
      },
      {
        "month": "NOVEMBER",
        "reward": 27,
        "amount": 77
      },
      {
        "month": "DECEMBER",
        "reward": 3,
        "amount": 53
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad90be",
    "name": "yfxihZGRyG",
    "totalRewards": 223,
    "totalAmount": 708,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 41,
        "amount": 91
      },
      {
        "month": "FEBRUARY",
        "reward": 42,
        "amount": 92
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 25
      },
      {
        "month": "APRIL",
        "reward": 42,
        "amount": 92
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 40
      },
      {
        "month": "JUNE",
        "reward": 41,
        "amount": 91
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 9
      },
      {
        "month": "AUGUST",
        "reward": 25,
        "amount": 75
      },
      {
        "month": "SEPTEMBER",
        "reward": 12,
        "amount": 62
      },
      {
        "month": "OCTOBER",
        "reward": 6,
        "amount": 56
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 11
      },
      {
        "month": "DECEMBER",
        "reward": 14,
        "amount": 64
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad90ff",
    "name": "PXiipRGCVW",
    "totalRewards": 120,
    "totalAmount": 532,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 33
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 0
      },
      {
        "month": "MARCH",
        "reward": 46,
        "amount": 96
      },
      {
        "month": "APRIL",
        "reward": 46,
        "amount": 96
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 4
      },
      {
        "month": "JUNE",
        "reward": 11,
        "amount": 61
      },
      {
        "month": "JULY",
        "reward": 17,
        "amount": 67
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 41
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 48
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 37
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 46
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 3
      }
    ]
  },
  {
    "customerId": "67690cf288760325e9ad9022",
    "name": "jNsbMOKbMj",
    "totalRewards": 121,
    "totalAmount": 539,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 15,
        "amount": 65
      },
      {
        "month": "FEBRUARY",
        "reward": 33,
        "amount": 83
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 6
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 35
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 13
      },
      {
        "month": "JUNE",
        "reward": 42,
        "amount": 92
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 29
      },
      {
        "month": "AUGUST",
        "reward": 5,
        "amount": 55
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 29
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 14
      },
      {
        "month": "NOVEMBER",
        "reward": 26,
        "amount": 76
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 42
      }
    ]
  },
  {
    "customerId": "67690cf288760325e9ad8f6c",
    "name": "nmfeaKEBQK",
    "totalRewards": 99,
    "totalAmount": 513,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 8
      },
      {
        "month": "FEBRUARY",
        "reward": 8,
        "amount": 58
      },
      {
        "month": "MARCH",
        "reward": 34,
        "amount": 84
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 32
      },
      {
        "month": "MAY",
        "reward": 18,
        "amount": 68
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 0
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 31
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 26
      },
      {
        "month": "SEPTEMBER",
        "reward": 39,
        "amount": 89
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 28
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 39
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 50
      }
    ]
  },
  {
    "customerId": "67690cf288760325e9ad8fad",
    "name": "EhWhUngHuM",
    "totalRewards": 222,
    "totalAmount": 664,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 29,
        "amount": 79
      },
      {
        "month": "FEBRUARY",
        "reward": 27,
        "amount": 77
      },
      {
        "month": "MARCH",
        "reward": 46,
        "amount": 96
      },
      {
        "month": "APRIL",
        "reward": 38,
        "amount": 88
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 27
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 19
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 27
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 13
      },
      {
        "month": "SEPTEMBER",
        "reward": 47,
        "amount": 97
      },
      {
        "month": "OCTOBER",
        "reward": 8,
        "amount": 58
      },
      {
        "month": "NOVEMBER",
        "reward": 27,
        "amount": 77
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 6
      }
    ]
  },
  {
    "customerId": "67690cf288760325e9ad8fee",
    "name": "KYsgyFEmDK",
    "totalRewards": 162,
    "totalAmount": 632,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 8,
        "amount": 58
      },
      {
        "month": "FEBRUARY",
        "reward": 14,
        "amount": 64
      },
      {
        "month": "MARCH",
        "reward": 9,
        "amount": 59
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 11
      },
      {
        "month": "MAY",
        "reward": 10,
        "amount": 60
      },
      {
        "month": "JUNE",
        "reward": 1,
        "amount": 51
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 8
      },
      {
        "month": "AUGUST",
        "reward": 1,
        "amount": 51
      },
      {
        "month": "SEPTEMBER",
        "reward": 40,
        "amount": 90
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 1
      },
      {
        "month": "NOVEMBER",
        "reward": 37,
        "amount": 87
      },
      {
        "month": "DECEMBER",
        "reward": 42,
        "amount": 92
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad918e",
    "name": "jxCTYJwCco",
    "totalRewards": 142,
    "totalAmount": 540,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 2,
        "amount": 52
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 18
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 16
      },
      {
        "month": "APRIL",
        "reward": 43,
        "amount": 93
      },
      {
        "month": "MAY",
        "reward": 35,
        "amount": 85
      },
      {
        "month": "JUNE",
        "reward": 40,
        "amount": 90
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 16
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 14
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 10
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 32
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 42
      },
      {
        "month": "DECEMBER",
        "reward": 22,
        "amount": 72
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad914d",
    "name": "KaYMGIgwij",
    "totalRewards": 129,
    "totalAmount": 588,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 1,
        "amount": 51
      },
      {
        "month": "FEBRUARY",
        "reward": 24,
        "amount": 74
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 27
      },
      {
        "month": "APRIL",
        "reward": 34,
        "amount": 84
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 18
      },
      {
        "month": "JUNE",
        "reward": 3,
        "amount": 53
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 15
      },
      {
        "month": "AUGUST",
        "reward": 11,
        "amount": 61
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 31
      },
      {
        "month": "OCTOBER",
        "reward": 12,
        "amount": 62
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 18
      },
      {
        "month": "DECEMBER",
        "reward": 44,
        "amount": 94
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad9314",
    "name": "fvpKUUYwDc",
    "totalRewards": 187,
    "totalAmount": 693,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 39
      },
      {
        "month": "FEBRUARY",
        "reward": 47,
        "amount": 97
      },
      {
        "month": "MARCH",
        "reward": 20,
        "amount": 70
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 24
      },
      {
        "month": "MAY",
        "reward": 12,
        "amount": 62
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 36
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 42
      },
      {
        "month": "AUGUST",
        "reward": 43,
        "amount": 93
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 24
      },
      {
        "month": "OCTOBER",
        "reward": 37,
        "amount": 87
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 41
      },
      {
        "month": "DECEMBER",
        "reward": 28,
        "amount": 78
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad92d3",
    "name": "JQpAhhxgYp",
    "totalRewards": 228,
    "totalAmount": 697,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 16
      },
      {
        "month": "FEBRUARY",
        "reward": 22,
        "amount": 72
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 25
      },
      {
        "month": "APRIL",
        "reward": 42,
        "amount": 92
      },
      {
        "month": "MAY",
        "reward": 42,
        "amount": 92
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 46
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 1
      },
      {
        "month": "AUGUST",
        "reward": 4,
        "amount": 54
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 31
      },
      {
        "month": "OCTOBER",
        "reward": 43,
        "amount": 93
      },
      {
        "month": "NOVEMBER",
        "reward": 32,
        "amount": 82
      },
      {
        "month": "DECEMBER",
        "reward": 43,
        "amount": 93
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad9210",
    "name": "GQTwMpLEmh",
    "totalRewards": 133,
    "totalAmount": 491,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 5,
        "amount": 55
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 27
      },
      {
        "month": "MARCH",
        "reward": 29,
        "amount": 79
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 6
      },
      {
        "month": "MAY",
        "reward": 32,
        "amount": 82
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 40
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 3
      },
      {
        "month": "AUGUST",
        "reward": 30,
        "amount": 80
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 21
      },
      {
        "month": "OCTOBER",
        "reward": 37,
        "amount": 87
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 3
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 8
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad91cf",
    "name": "XpaDQcbXhF",
    "totalRewards": 192,
    "totalAmount": 578,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 14
      },
      {
        "month": "FEBRUARY",
        "reward": 10,
        "amount": 60
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 6
      },
      {
        "month": "APRIL",
        "reward": 33,
        "amount": 83
      },
      {
        "month": "MAY",
        "reward": 34,
        "amount": 84
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 8
      },
      {
        "month": "JULY",
        "reward": 29,
        "amount": 79
      },
      {
        "month": "AUGUST",
        "reward": 25,
        "amount": 75
      },
      {
        "month": "SEPTEMBER",
        "reward": 39,
        "amount": 89
      },
      {
        "month": "OCTOBER",
        "reward": 22,
        "amount": 72
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 2
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 6
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad9292",
    "name": "gDMCNtOEOA",
    "totalRewards": 50,
    "totalAmount": 414,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 33
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 15
      },
      {
        "month": "MARCH",
        "reward": 5,
        "amount": 55
      },
      {
        "month": "APRIL",
        "reward": 16,
        "amount": 66
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 12
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 3
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 33
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 11
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 31
      },
      {
        "month": "OCTOBER",
        "reward": 29,
        "amount": 79
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 33
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 43
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad9251",
    "name": "hMTmsIgMVu",
    "totalRewards": 146,
    "totalAmount": 522,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 14
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 16
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 12
      },
      {
        "month": "APRIL",
        "reward": 14,
        "amount": 64
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 41
      },
      {
        "month": "JUNE",
        "reward": 32,
        "amount": 82
      },
      {
        "month": "JULY",
        "reward": 17,
        "amount": 67
      },
      {
        "month": "AUGUST",
        "reward": 46,
        "amount": 96
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 23
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 4
      },
      {
        "month": "NOVEMBER",
        "reward": 37,
        "amount": 87
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 16
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad9396",
    "name": "yXWGoLgInw",
    "totalRewards": 164,
    "totalAmount": 603,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 47,
        "amount": 97
      },
      {
        "month": "FEBRUARY",
        "reward": 49,
        "amount": 99
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 32
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 0
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 7
      },
      {
        "month": "JUNE",
        "reward": 11,
        "amount": 61
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 33
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 43
      },
      {
        "month": "SEPTEMBER",
        "reward": 21,
        "amount": 71
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 24
      },
      {
        "month": "NOVEMBER",
        "reward": 35,
        "amount": 85
      },
      {
        "month": "DECEMBER",
        "reward": 1,
        "amount": 51
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad9355",
    "name": "pRfoWUPEil",
    "totalRewards": 238,
    "totalAmount": 698,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 42,
        "amount": 92
      },
      {
        "month": "FEBRUARY",
        "reward": 39,
        "amount": 89
      },
      {
        "month": "MARCH",
        "reward": 24,
        "amount": 74
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 2
      },
      {
        "month": "MAY",
        "reward": 29,
        "amount": 79
      },
      {
        "month": "JUNE",
        "reward": 44,
        "amount": 94
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 13
      },
      {
        "month": "AUGUST",
        "reward": 14,
        "amount": 64
      },
      {
        "month": "SEPTEMBER",
        "reward": 16,
        "amount": 66
      },
      {
        "month": "OCTOBER",
        "reward": 30,
        "amount": 80
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 11
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 34
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad910c",
    "name": "EMNtgwaFiE",
    "totalRewards": 110,
    "totalAmount": 474,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 28,
        "amount": 78
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 41
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 48
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 9
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 13
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 32
      },
      {
        "month": "JULY",
        "reward": 20,
        "amount": 70
      },
      {
        "month": "AUGUST",
        "reward": 18,
        "amount": 68
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 1
      },
      {
        "month": "OCTOBER",
        "reward": 44,
        "amount": 94
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 10
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 10
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad90cb",
    "name": "cFeDJpTyox",
    "totalRewards": 241,
    "totalAmount": 727,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 45,
        "amount": 95
      },
      {
        "month": "FEBRUARY",
        "reward": 47,
        "amount": 97
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 32
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 45
      },
      {
        "month": "MAY",
        "reward": 47,
        "amount": 97
      },
      {
        "month": "JUNE",
        "reward": 25,
        "amount": 75
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 35
      },
      {
        "month": "AUGUST",
        "reward": 33,
        "amount": 83
      },
      {
        "month": "SEPTEMBER",
        "reward": 23,
        "amount": 73
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 10
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 14
      },
      {
        "month": "DECEMBER",
        "reward": 21,
        "amount": 71
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad908a",
    "name": "tcEZEultaJ",
    "totalRewards": 231,
    "totalAmount": 689,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 14
      },
      {
        "month": "FEBRUARY",
        "reward": 49,
        "amount": 99
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 19
      },
      {
        "month": "APRIL",
        "reward": 45,
        "amount": 95
      },
      {
        "month": "MAY",
        "reward": 32,
        "amount": 82
      },
      {
        "month": "JUNE",
        "reward": 41,
        "amount": 91
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 14
      },
      {
        "month": "AUGUST",
        "reward": 29,
        "amount": 79
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 46
      },
      {
        "month": "OCTOBER",
        "reward": 33,
        "amount": 83
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 15
      },
      {
        "month": "DECEMBER",
        "reward": 2,
        "amount": 52
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad9049",
    "name": "XOdZFGiNJs",
    "totalRewards": 156,
    "totalAmount": 603,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 13
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 28
      },
      {
        "month": "MARCH",
        "reward": 49,
        "amount": 99
      },
      {
        "month": "APRIL",
        "reward": 13,
        "amount": 63
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 11
      },
      {
        "month": "JUNE",
        "reward": 12,
        "amount": 62
      },
      {
        "month": "JULY",
        "reward": 5,
        "amount": 55
      },
      {
        "month": "AUGUST",
        "reward": 42,
        "amount": 92
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 4
      },
      {
        "month": "OCTOBER",
        "reward": 6,
        "amount": 56
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 41
      },
      {
        "month": "DECEMBER",
        "reward": 29,
        "amount": 79
      }
    ]
  },
  {
    "customerId": "67690cf288760325e9ad8f2b",
    "name": "gXzCVhKmPS",
    "totalRewards": 62,
    "totalAmount": 404,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 29
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 18
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 36
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 6
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 48
      },
      {
        "month": "JUNE",
        "reward": 33,
        "amount": 83
      },
      {
        "month": "JULY",
        "reward": 29,
        "amount": 79
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 12
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 50
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 6
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 25
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 12
      }
    ]
  },
  {
    "customerId": "67690cf288760325e9ad8ea9",
    "name": "dwrntDyswY",
    "totalRewards": 92,
    "totalAmount": 466,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 22,
        "amount": 72
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 13
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 12
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 50
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 9
      },
      {
        "month": "JUNE",
        "reward": 41,
        "amount": 91
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 39
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 25
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 48
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 18
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 10
      },
      {
        "month": "DECEMBER",
        "reward": 29,
        "amount": 79
      }
    ]
  },
  {
    "customerId": "67690cf288760325e9ad8eea",
    "name": "piQPzCFkFq",
    "totalRewards": 100,
    "totalAmount": 449,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 48
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 13
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 21
      },
      {
        "month": "APRIL",
        "reward": 7,
        "amount": 57
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 4
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 3
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 16
      },
      {
        "month": "AUGUST",
        "reward": 41,
        "amount": 91
      },
      {
        "month": "SEPTEMBER",
        "reward": 18,
        "amount": 68
      },
      {
        "month": "OCTOBER",
        "reward": 34,
        "amount": 84
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 11
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 33
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad93a3",
    "name": "RDfrguCYqY",
    "totalRewards": 145,
    "totalAmount": 656,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 46,
        "amount": 96
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 17
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 40
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 32
      },
      {
        "month": "MAY",
        "reward": 47,
        "amount": 97
      },
      {
        "month": "JUNE",
        "reward": 24,
        "amount": 74
      },
      {
        "month": "JULY",
        "reward": 8,
        "amount": 58
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 42
      },
      {
        "month": "SEPTEMBER",
        "reward": 17,
        "amount": 67
      },
      {
        "month": "OCTOBER",
        "reward": 3,
        "amount": 53
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 32
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 48
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad9321",
    "name": "RUMBPdcUVQ",
    "totalRewards": 252,
    "totalAmount": 799,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 49,
        "amount": 99
      },
      {
        "month": "FEBRUARY",
        "reward": 2,
        "amount": 52
      },
      {
        "month": "MARCH",
        "reward": 9,
        "amount": 59
      },
      {
        "month": "APRIL",
        "reward": 26,
        "amount": 76
      },
      {
        "month": "MAY",
        "reward": 5,
        "amount": 55
      },
      {
        "month": "JUNE",
        "reward": 18,
        "amount": 68
      },
      {
        "month": "JULY",
        "reward": 49,
        "amount": 99
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 19
      },
      {
        "month": "SEPTEMBER",
        "reward": 37,
        "amount": 87
      },
      {
        "month": "OCTOBER",
        "reward": 8,
        "amount": 58
      },
      {
        "month": "NOVEMBER",
        "reward": 49,
        "amount": 99
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 28
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad929f",
    "name": "JHfTceNLLp",
    "totalRewards": 98,
    "totalAmount": 452,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 38,
        "amount": 88
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 14
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 42
      },
      {
        "month": "APRIL",
        "reward": 29,
        "amount": 79
      },
      {
        "month": "MAY",
        "reward": 19,
        "amount": 69
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 21
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 50
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 2
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 1
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 5
      },
      {
        "month": "NOVEMBER",
        "reward": 12,
        "amount": 62
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 19
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad921d",
    "name": "KRlEkzrurr",
    "totalRewards": 191,
    "totalAmount": 704,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 28
      },
      {
        "month": "FEBRUARY",
        "reward": 23,
        "amount": 73
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 23
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 13
      },
      {
        "month": "MAY",
        "reward": 20,
        "amount": 70
      },
      {
        "month": "JUNE",
        "reward": 3,
        "amount": 53
      },
      {
        "month": "JULY",
        "reward": 15,
        "amount": 65
      },
      {
        "month": "AUGUST",
        "reward": 47,
        "amount": 97
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 49
      },
      {
        "month": "OCTOBER",
        "reward": 36,
        "amount": 86
      },
      {
        "month": "NOVEMBER",
        "reward": 29,
        "amount": 79
      },
      {
        "month": "DECEMBER",
        "reward": 18,
        "amount": 68
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad919b",
    "name": "bekyitjLaf",
    "totalRewards": 164,
    "totalAmount": 635,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 14
      },
      {
        "month": "FEBRUARY",
        "reward": 18,
        "amount": 68
      },
      {
        "month": "MARCH",
        "reward": 17,
        "amount": 67
      },
      {
        "month": "APRIL",
        "reward": 39,
        "amount": 89
      },
      {
        "month": "MAY",
        "reward": 30,
        "amount": 80
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 48
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 50
      },
      {
        "month": "AUGUST",
        "reward": 22,
        "amount": 72
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 13
      },
      {
        "month": "OCTOBER",
        "reward": 38,
        "amount": 88
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 18
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 28
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad9119",
    "name": "GOrOobNTkx",
    "totalRewards": 212,
    "totalAmount": 774,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 11,
        "amount": 61
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 48
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 43
      },
      {
        "month": "APRIL",
        "reward": 35,
        "amount": 85
      },
      {
        "month": "MAY",
        "reward": 30,
        "amount": 80
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 45
      },
      {
        "month": "JULY",
        "reward": 9,
        "amount": 59
      },
      {
        "month": "AUGUST",
        "reward": 34,
        "amount": 84
      },
      {
        "month": "SEPTEMBER",
        "reward": 18,
        "amount": 68
      },
      {
        "month": "OCTOBER",
        "reward": 29,
        "amount": 79
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 26
      },
      {
        "month": "DECEMBER",
        "reward": 46,
        "amount": 96
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad9056",
    "name": "QguJszWHHJ",
    "totalRewards": 225,
    "totalAmount": 680,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 24,
        "amount": 74
      },
      {
        "month": "FEBRUARY",
        "reward": 43,
        "amount": 93
      },
      {
        "month": "MARCH",
        "reward": 10,
        "amount": 60
      },
      {
        "month": "APRIL",
        "reward": 49,
        "amount": 99
      },
      {
        "month": "MAY",
        "reward": 34,
        "amount": 84
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 17
      },
      {
        "month": "JULY",
        "reward": 49,
        "amount": 99
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 26
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 0
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 19
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 43
      },
      {
        "month": "DECEMBER",
        "reward": 16,
        "amount": 66
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad9362",
    "name": "ecCiBnXrTV",
    "totalRewards": 134,
    "totalAmount": 593,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 36
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 31
      },
      {
        "month": "MARCH",
        "reward": 18,
        "amount": 68
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 36
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 39
      },
      {
        "month": "JUNE",
        "reward": 44,
        "amount": 94
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 17
      },
      {
        "month": "AUGUST",
        "reward": 7,
        "amount": 57
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 37
      },
      {
        "month": "OCTOBER",
        "reward": 44,
        "amount": 94
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 13
      },
      {
        "month": "DECEMBER",
        "reward": 21,
        "amount": 71
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad925e",
    "name": "XWHqyvyEXT",
    "totalRewards": 133,
    "totalAmount": 647,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 34,
        "amount": 84
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 50
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 21
      },
      {
        "month": "APRIL",
        "reward": 32,
        "amount": 82
      },
      {
        "month": "MAY",
        "reward": 34,
        "amount": 84
      },
      {
        "month": "JUNE",
        "reward": 14,
        "amount": 64
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 33
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 29
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 38
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 43
      },
      {
        "month": "NOVEMBER",
        "reward": 17,
        "amount": 67
      },
      {
        "month": "DECEMBER",
        "reward": 2,
        "amount": 52
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad915a",
    "name": "RpDginNQtq",
    "totalRewards": 103,
    "totalAmount": 493,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 34,
        "amount": 84
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 23
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 14
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 31
      },
      {
        "month": "MAY",
        "reward": 1,
        "amount": 51
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 33
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 29
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 43
      },
      {
        "month": "SEPTEMBER",
        "reward": 37,
        "amount": 87
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 14
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 3
      },
      {
        "month": "DECEMBER",
        "reward": 31,
        "amount": 81
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad90d8",
    "name": "IfeJvJhmUM",
    "totalRewards": 106,
    "totalAmount": 461,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 24,
        "amount": 74
      },
      {
        "month": "FEBRUARY",
        "reward": 47,
        "amount": 97
      },
      {
        "month": "MARCH",
        "reward": 18,
        "amount": 68
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 20
      },
      {
        "month": "MAY",
        "reward": 12,
        "amount": 62
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 10
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 10
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 5,
        "amount": 55
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 3
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 40
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 22
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad9097",
    "name": "yXQvPATZcE",
    "totalRewards": 87,
    "totalAmount": 582,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 47
      },
      {
        "month": "FEBRUARY",
        "reward": 22,
        "amount": 72
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 40
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 33
      },
      {
        "month": "MAY",
        "reward": 10,
        "amount": 60
      },
      {
        "month": "JUNE",
        "reward": 33,
        "amount": 83
      },
      {
        "month": "JULY",
        "reward": 10,
        "amount": 60
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 46
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 37
      },
      {
        "month": "OCTOBER",
        "reward": 12,
        "amount": 62
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 19
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 23
      }
    ]
  },
  {
    "customerId": "67690cf288760325e9ad8ffb",
    "name": "jobGEfrQbm",
    "totalRewards": 125,
    "totalAmount": 422,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 49,
        "amount": 99
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 0
      },
      {
        "month": "MARCH",
        "reward": 49,
        "amount": 99
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 19
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 44
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 17
      },
      {
        "month": "JULY",
        "reward": 27,
        "amount": 77
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 11
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 1
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 23
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 32
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 0
      }
    ]
  },
  {
    "customerId": "67690cf288760325e9ad8fba",
    "name": "ztekQAybrE",
    "totalRewards": 189,
    "totalAmount": 706,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 41
      },
      {
        "month": "FEBRUARY",
        "reward": 8,
        "amount": 58
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 36
      },
      {
        "month": "APRIL",
        "reward": 28,
        "amount": 78
      },
      {
        "month": "MAY",
        "reward": 17,
        "amount": 67
      },
      {
        "month": "JUNE",
        "reward": 28,
        "amount": 78
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 33
      },
      {
        "month": "AUGUST",
        "reward": 18,
        "amount": 68
      },
      {
        "month": "SEPTEMBER",
        "reward": 20,
        "amount": 70
      },
      {
        "month": "OCTOBER",
        "reward": 44,
        "amount": 94
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 7
      },
      {
        "month": "DECEMBER",
        "reward": 26,
        "amount": 76
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad92e0",
    "name": "rOJCYfwszR",
    "totalRewards": 174,
    "totalAmount": 640,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 28,
        "amount": 78
      },
      {
        "month": "FEBRUARY",
        "reward": 36,
        "amount": 86
      },
      {
        "month": "MARCH",
        "reward": 14,
        "amount": 64
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 46
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 4
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 39
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 33
      },
      {
        "month": "AUGUST",
        "reward": 49,
        "amount": 99
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 1
      },
      {
        "month": "OCTOBER",
        "reward": 46,
        "amount": 96
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 43
      },
      {
        "month": "DECEMBER",
        "reward": 1,
        "amount": 51
      }
    ]
  },
  {
    "customerId": "67690cf288760325e9ad8f79",
    "name": "jEBBDgkbbp",
    "totalRewards": 231,
    "totalAmount": 738,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 47,
        "amount": 97
      },
      {
        "month": "FEBRUARY",
        "reward": 36,
        "amount": 86
      },
      {
        "month": "MARCH",
        "reward": 43,
        "amount": 93
      },
      {
        "month": "APRIL",
        "reward": 34,
        "amount": 84
      },
      {
        "month": "MAY",
        "reward": 37,
        "amount": 87
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 34
      },
      {
        "month": "JULY",
        "reward": 9,
        "amount": 59
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 25
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 27
      },
      {
        "month": "OCTOBER",
        "reward": 25,
        "amount": 75
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 45
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 26
      }
    ]
  },
  {
    "customerId": "67690cf288760325e9ad8f38",
    "name": "XIKhTVsjPn",
    "totalRewards": 143,
    "totalAmount": 668,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 34
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 41
      },
      {
        "month": "MARCH",
        "reward": 23,
        "amount": 73
      },
      {
        "month": "APRIL",
        "reward": 20,
        "amount": 70
      },
      {
        "month": "MAY",
        "reward": 18,
        "amount": 68
      },
      {
        "month": "JUNE",
        "reward": 25,
        "amount": 75
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 33
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 47
      },
      {
        "month": "SEPTEMBER",
        "reward": 28,
        "amount": 78
      },
      {
        "month": "OCTOBER",
        "reward": 2,
        "amount": 52
      },
      {
        "month": "NOVEMBER",
        "reward": 27,
        "amount": 77
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 20
      }
    ]
  },
  {
    "customerId": "67690cf288760325e9ad8ef7",
    "name": "RDOMfOOXJo",
    "totalRewards": 192,
    "totalAmount": 624,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 26,
        "amount": 76
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 24
      },
      {
        "month": "MARCH",
        "reward": 15,
        "amount": 65
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 10
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 8
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 7
      },
      {
        "month": "JULY",
        "reward": 37,
        "amount": 87
      },
      {
        "month": "AUGUST",
        "reward": 7,
        "amount": 57
      },
      {
        "month": "SEPTEMBER",
        "reward": 38,
        "amount": 88
      },
      {
        "month": "OCTOBER",
        "reward": 31,
        "amount": 81
      },
      {
        "month": "NOVEMBER",
        "reward": 38,
        "amount": 88
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 33
      }
    ]
  },
  {
    "customerId": "67690cf288760325e9ad8eb6",
    "name": "eoxfFPaEmh",
    "totalRewards": 85,
    "totalAmount": 448,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 38,
        "amount": 88
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 24
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 18
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 47
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 42
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 11
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 5
      },
      {
        "month": "AUGUST",
        "reward": 42,
        "amount": 92
      },
      {
        "month": "SEPTEMBER",
        "reward": 5,
        "amount": 55
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 25
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 6
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 35
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad91dc",
    "name": "TpAQSkQcbk",
    "totalRewards": 27,
    "totalAmount": 416,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 33
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 39
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 24
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 42
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 49
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 33
      },
      {
        "month": "JULY",
        "reward": 18,
        "amount": 68
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 9
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 30
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 13
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 17
      },
      {
        "month": "DECEMBER",
        "reward": 9,
        "amount": 59
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad936f",
    "name": "wvIcgAUNRZ",
    "totalRewards": 214,
    "totalAmount": 648,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 45,
        "amount": 95
      },
      {
        "month": "FEBRUARY",
        "reward": 42,
        "amount": 92
      },
      {
        "month": "MARCH",
        "reward": 44,
        "amount": 94
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 18
      },
      {
        "month": "MAY",
        "reward": 27,
        "amount": 77
      },
      {
        "month": "JUNE",
        "reward": 13,
        "amount": 63
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 26
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 23
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 12
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 5
      },
      {
        "month": "NOVEMBER",
        "reward": 41,
        "amount": 91
      },
      {
        "month": "DECEMBER",
        "reward": 2,
        "amount": 52
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad932e",
    "name": "iiukkqChKp",
    "totalRewards": 166,
    "totalAmount": 631,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 39
      },
      {
        "month": "FEBRUARY",
        "reward": 20,
        "amount": 70
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 42
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 13
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 48
      },
      {
        "month": "JUNE",
        "reward": 46,
        "amount": 96
      },
      {
        "month": "JULY",
        "reward": 39,
        "amount": 89
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 24
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 8
      },
      {
        "month": "OCTOBER",
        "reward": 40,
        "amount": 90
      },
      {
        "month": "NOVEMBER",
        "reward": 21,
        "amount": 71
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 41
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad92ed",
    "name": "HNsxmDzdrJ",
    "totalRewards": 161,
    "totalAmount": 524,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 18,
        "amount": 68
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 1
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 12
      },
      {
        "month": "APRIL",
        "reward": 12,
        "amount": 62
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 30
      },
      {
        "month": "JUNE",
        "reward": 29,
        "amount": 79
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 9
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 0
      },
      {
        "month": "SEPTEMBER",
        "reward": 44,
        "amount": 94
      },
      {
        "month": "OCTOBER",
        "reward": 25,
        "amount": 75
      },
      {
        "month": "NOVEMBER",
        "reward": 33,
        "amount": 83
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 11
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad91a8",
    "name": "lOPGBUoDTl",
    "totalRewards": 226,
    "totalAmount": 741,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 2,
        "amount": 52
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 2
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 33
      },
      {
        "month": "APRIL",
        "reward": 47,
        "amount": 97
      },
      {
        "month": "MAY",
        "reward": 42,
        "amount": 92
      },
      {
        "month": "JUNE",
        "reward": 29,
        "amount": 79
      },
      {
        "month": "JULY",
        "reward": 33,
        "amount": 83
      },
      {
        "month": "AUGUST",
        "reward": 32,
        "amount": 82
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 41
      },
      {
        "month": "OCTOBER",
        "reward": 23,
        "amount": 73
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 39
      },
      {
        "month": "DECEMBER",
        "reward": 18,
        "amount": 68
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad92ac",
    "name": "hLNkaioSxY",
    "totalRewards": 169,
    "totalAmount": 678,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 14,
        "amount": 64
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 42
      },
      {
        "month": "MARCH",
        "reward": 43,
        "amount": 93
      },
      {
        "month": "APRIL",
        "reward": 12,
        "amount": 62
      },
      {
        "month": "MAY",
        "reward": 6,
        "amount": 56
      },
      {
        "month": "JUNE",
        "reward": 43,
        "amount": 93
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 38
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 20
      },
      {
        "month": "SEPTEMBER",
        "reward": 28,
        "amount": 78
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 9
      },
      {
        "month": "NOVEMBER",
        "reward": 5,
        "amount": 55
      },
      {
        "month": "DECEMBER",
        "reward": 18,
        "amount": 68
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad926b",
    "name": "RccGgSrFHo",
    "totalRewards": 90,
    "totalAmount": 471,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 22
      },
      {
        "month": "FEBRUARY",
        "reward": 13,
        "amount": 63
      },
      {
        "month": "MARCH",
        "reward": 22,
        "amount": 72
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 10
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 18
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 16
      },
      {
        "month": "JULY",
        "reward": 28,
        "amount": 78
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 50
      },
      {
        "month": "SEPTEMBER",
        "reward": 27,
        "amount": 77
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 37
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 7
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 21
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad91e9",
    "name": "ekgsGyNYzo",
    "totalRewards": 122,
    "totalAmount": 576,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 39
      },
      {
        "month": "FEBRUARY",
        "reward": 21,
        "amount": 71
      },
      {
        "month": "MARCH",
        "reward": 49,
        "amount": 99
      },
      {
        "month": "APRIL",
        "reward": 34,
        "amount": 84
      },
      {
        "month": "MAY",
        "reward": 1,
        "amount": 51
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 3
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 42
      },
      {
        "month": "AUGUST",
        "reward": 8,
        "amount": 58
      },
      {
        "month": "SEPTEMBER",
        "reward": 9,
        "amount": 59
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 16
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 28
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 26
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad922a",
    "name": "OabocXJKmB",
    "totalRewards": 136,
    "totalAmount": 605,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 28,
        "amount": 78
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 36
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 20
      },
      {
        "month": "APRIL",
        "reward": 4,
        "amount": 54
      },
      {
        "month": "MAY",
        "reward": 9,
        "amount": 59
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 36
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 12
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 15
      },
      {
        "month": "SEPTEMBER",
        "reward": 49,
        "amount": 99
      },
      {
        "month": "OCTOBER",
        "reward": 2,
        "amount": 52
      },
      {
        "month": "NOVEMBER",
        "reward": 30,
        "amount": 80
      },
      {
        "month": "DECEMBER",
        "reward": 14,
        "amount": 64
      }
    ]
  },
  {
    "customerId": "67690cf288760325e9ad8fc7",
    "name": "MpCgwxYJDD",
    "totalRewards": 236,
    "totalAmount": 768,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 37,
        "amount": 87
      },
      {
        "month": "FEBRUARY",
        "reward": 23,
        "amount": 73
      },
      {
        "month": "MARCH",
        "reward": 49,
        "amount": 99
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 49
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 47
      },
      {
        "month": "JUNE",
        "reward": 23,
        "amount": 73
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 17
      },
      {
        "month": "AUGUST",
        "reward": 38,
        "amount": 88
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 22
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 47
      },
      {
        "month": "NOVEMBER",
        "reward": 46,
        "amount": 96
      },
      {
        "month": "DECEMBER",
        "reward": 20,
        "amount": 70
      }
    ]
  },
  {
    "customerId": "67690cf288760325e9ad8ec3",
    "name": "zzGYpaZfFU",
    "totalRewards": 63,
    "totalAmount": 441,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 12,
        "amount": 62
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 6
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 43
      },
      {
        "month": "APRIL",
        "reward": 14,
        "amount": 64
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 8
      },
      {
        "month": "JUNE",
        "reward": 13,
        "amount": 63
      },
      {
        "month": "JULY",
        "reward": 3,
        "amount": 53
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 7
      },
      {
        "month": "SEPTEMBER",
        "reward": 18,
        "amount": 68
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 14
      },
      {
        "month": "NOVEMBER",
        "reward": 3,
        "amount": 53
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 0
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad9167",
    "name": "NgGLWNZNFP",
    "totalRewards": 189,
    "totalAmount": 634,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 28
      },
      {
        "month": "FEBRUARY",
        "reward": 5,
        "amount": 55
      },
      {
        "month": "MARCH",
        "reward": 47,
        "amount": 97
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 4
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 36
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 6
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 48
      },
      {
        "month": "AUGUST",
        "reward": 48,
        "amount": 98
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 23
      },
      {
        "month": "OCTOBER",
        "reward": 24,
        "amount": 74
      },
      {
        "month": "NOVEMBER",
        "reward": 43,
        "amount": 93
      },
      {
        "month": "DECEMBER",
        "reward": 22,
        "amount": 72
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad90e5",
    "name": "ZJGOeplJgZ",
    "totalRewards": 96,
    "totalAmount": 548,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 26
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 48
      },
      {
        "month": "MARCH",
        "reward": 9,
        "amount": 59
      },
      {
        "month": "APRIL",
        "reward": 31,
        "amount": 81
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 14
      },
      {
        "month": "JUNE",
        "reward": 10,
        "amount": 60
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 23
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 28
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 42
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 21
      },
      {
        "month": "NOVEMBER",
        "reward": 17,
        "amount": 67
      },
      {
        "month": "DECEMBER",
        "reward": 29,
        "amount": 79
      }
    ]
  },
  {
    "customerId": "67690cf288760325e9ad9008",
    "name": "qaBawOaMvD",
    "totalRewards": 164,
    "totalAmount": 667,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 16
      },
      {
        "month": "FEBRUARY",
        "reward": 23,
        "amount": 73
      },
      {
        "month": "MARCH",
        "reward": 38,
        "amount": 88
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 47
      },
      {
        "month": "MAY",
        "reward": 27,
        "amount": 77
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 23
      },
      {
        "month": "JULY",
        "reward": 23,
        "amount": 73
      },
      {
        "month": "AUGUST",
        "reward": 22,
        "amount": 72
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 33
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 44
      },
      {
        "month": "NOVEMBER",
        "reward": 31,
        "amount": 81
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 40
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad9126",
    "name": "VSxIErxsnG",
    "totalRewards": 139,
    "totalAmount": 599,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 32
      },
      {
        "month": "FEBRUARY",
        "reward": 26,
        "amount": 76
      },
      {
        "month": "MARCH",
        "reward": 11,
        "amount": 61
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 43
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 22
      },
      {
        "month": "JUNE",
        "reward": 47,
        "amount": 97
      },
      {
        "month": "JULY",
        "reward": 45,
        "amount": 95
      },
      {
        "month": "AUGUST",
        "reward": 6,
        "amount": 56
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 3
      },
      {
        "month": "OCTOBER",
        "reward": 0,
        "amount": 40
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 20
      },
      {
        "month": "DECEMBER",
        "reward": 4,
        "amount": 54
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad90a4",
    "name": "zKJupvRfGo",
    "totalRewards": 199,
    "totalAmount": 670,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 30
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 33
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 11
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 38
      },
      {
        "month": "MAY",
        "reward": 39,
        "amount": 89
      },
      {
        "month": "JUNE",
        "reward": 0,
        "amount": 30
      },
      {
        "month": "JULY",
        "reward": 27,
        "amount": 77
      },
      {
        "month": "AUGUST",
        "reward": 20,
        "amount": 70
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 29
      },
      {
        "month": "OCTOBER",
        "reward": 41,
        "amount": 91
      },
      {
        "month": "NOVEMBER",
        "reward": 30,
        "amount": 80
      },
      {
        "month": "DECEMBER",
        "reward": 42,
        "amount": 92
      }
    ]
  },
  {
    "customerId": "67690cf388760325e9ad9063",
    "name": "VEYIbtWxjv",
    "totalRewards": 257,
    "totalAmount": 774,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 46,
        "amount": 96
      },
      {
        "month": "FEBRUARY",
        "reward": 26,
        "amount": 76
      },
      {
        "month": "MARCH",
        "reward": 16,
        "amount": 66
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 47
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 24
      },
      {
        "month": "JUNE",
        "reward": 21,
        "amount": 71
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 17
      },
      {
        "month": "AUGUST",
        "reward": 31,
        "amount": 81
      },
      {
        "month": "SEPTEMBER",
        "reward": 35,
        "amount": 85
      },
      {
        "month": "OCTOBER",
        "reward": 42,
        "amount": 92
      },
      {
        "month": "NOVEMBER",
        "reward": 40,
        "amount": 90
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 29
      }
    ]
  },
  {
    "customerId": "67690cf288760325e9ad8f86",
    "name": "cirLZRdkQP",
    "totalRewards": 123,
    "totalAmount": 602,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 19
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 31
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 32
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 41
      },
      {
        "month": "MAY",
        "reward": 8,
        "amount": 58
      },
      {
        "month": "JUNE",
        "reward": 6,
        "amount": 56
      },
      {
        "month": "JULY",
        "reward": 39,
        "amount": 89
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 25
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 39
      },
      {
        "month": "OCTOBER",
        "reward": 43,
        "amount": 93
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 42
      },
      {
        "month": "DECEMBER",
        "reward": 27,
        "amount": 77
      }
    ]
  },
  {
    "customerId": "67690cf288760325e9ad8f04",
    "name": "vNDUjGzkgK",
    "totalRewards": 192,
    "totalAmount": 556,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 15
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 10
      },
      {
        "month": "MARCH",
        "reward": 0,
        "amount": 10
      },
      {
        "month": "APRIL",
        "reward": 43,
        "amount": 93
      },
      {
        "month": "MAY",
        "reward": 39,
        "amount": 89
      },
      {
        "month": "JUNE",
        "reward": 43,
        "amount": 93
      },
      {
        "month": "JULY",
        "reward": 0,
        "amount": 5
      },
      {
        "month": "AUGUST",
        "reward": 38,
        "amount": 88
      },
      {
        "month": "SEPTEMBER",
        "reward": 0,
        "amount": 28
      },
      {
        "month": "OCTOBER",
        "reward": 29,
        "amount": 79
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 27
      },
      {
        "month": "DECEMBER",
        "reward": 0,
        "amount": 19
      }
    ]
  },
  {
    "customerId": "67690cf288760325e9ad8f45",
    "name": "nCoWEoQEDS",
    "totalRewards": 120,
    "totalAmount": 511,
    "monthlyRewards": [
      {
        "month": "JANUARY",
        "reward": 0,
        "amount": 48
      },
      {
        "month": "FEBRUARY",
        "reward": 0,
        "amount": 2
      },
      {
        "month": "MARCH",
        "reward": 9,
        "amount": 59
      },
      {
        "month": "APRIL",
        "reward": 0,
        "amount": 1
      },
      {
        "month": "MAY",
        "reward": 0,
        "amount": 13
      },
      {
        "month": "JUNE",
        "reward": 11,
        "amount": 61
      },
      {
        "month": "JULY",
        "reward": 5,
        "amount": 55
      },
      {
        "month": "AUGUST",
        "reward": 0,
        "amount": 24
      },
      {
        "month": "SEPTEMBER",
        "reward": 22,
        "amount": 72
      },
      {
        "month": "OCTOBER",
        "reward": 44,
        "amount": 94
      },
      {
        "month": "NOVEMBER",
        "reward": 0,
        "amount": 3
      },
      {
        "month": "DECEMBER",
        "reward": 29,
        "amount": 79
      }
    ]
  }
]
```