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
    "customerId": "676d0785563c6749415aca9a",
    "name": "xlgZxaQPWm",
    "totalRewards": 27,
    "totalAmount": 137,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415aca18",
    "name": "yfxihZGRyG",
    "totalRewards": 18,
    "totalAmount": 129,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415aca59",
    "name": "PXiipRGCVW",
    "totalRewards": 0,
    "totalAmount": 131,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acce3",
    "name": "kqbbggGNIM",
    "totalRewards": 0,
    "totalAmount": 115,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acc20",
    "name": "xgFqBqziBg",
    "totalRewards": 41,
    "totalAmount": 143,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acbdf",
    "name": "taAgRezLSG",
    "totalRewards": 66,
    "totalAmount": 181,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acadb",
    "name": "VNqdHRSCoY",
    "totalRewards": 14,
    "totalAmount": 115,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acb9e",
    "name": "jNIiwatFaX",
    "totalRewards": 33,
    "totalAmount": 100,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acb1c",
    "name": "DfXfQGlusl",
    "totalRewards": 49,
    "totalAmount": 199,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acb5d",
    "name": "IwBbPFTFdA",
    "totalRewards": 1,
    "totalAmount": 113,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acca2",
    "name": "MqVKlxIdpU",
    "totalRewards": 0,
    "totalAmount": 80,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acc61",
    "name": "MIazlzvrnT",
    "totalRewards": 0,
    "totalAmount": 77,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acbec",
    "name": "gDMCNtOEOA",
    "totalRewards": 29,
    "totalAmount": 143,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acbab",
    "name": "hMTmsIgMVu",
    "totalRewards": 37,
    "totalAmount": 114,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acc6e",
    "name": "fvpKUUYwDc",
    "totalRewards": 37,
    "totalAmount": 152,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acc2d",
    "name": "JQpAhhxgYp",
    "totalRewards": 75,
    "totalAmount": 206,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415accaf",
    "name": "pRfoWUPEil",
    "totalRewards": 46,
    "totalAmount": 157,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415accf0",
    "name": "yXWGoLgInw",
    "totalRewards": 56,
    "totalAmount": 180,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac9d7",
    "name": "PEiROXyTXh",
    "totalRewards": 43,
    "totalAmount": 133,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac8d3",
    "name": "jEBBDgkbbp",
    "totalRewards": 25,
    "totalAmount": 147,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac996",
    "name": "LHMaJLmojh",
    "totalRewards": 25,
    "totalAmount": 167,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac914",
    "name": "ztekQAybrE",
    "totalRewards": 64,
    "totalAmount": 171,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac955",
    "name": "jobGEfrQbm",
    "totalRewards": 0,
    "totalAmount": 56,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac892",
    "name": "XIKhTVsjPn",
    "totalRewards": 57,
    "totalAmount": 207,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac810",
    "name": "eoxfFPaEmh",
    "totalRewards": 5,
    "totalAmount": 86,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac851",
    "name": "RDOMfOOXJo",
    "totalRewards": 107,
    "totalAmount": 257,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac907",
    "name": "EhWhUngHuM",
    "totalRewards": 82,
    "totalAmount": 232,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac9ca",
    "name": "DvisPtrmmv",
    "totalRewards": 9,
    "totalAmount": 84,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415aca0b",
    "name": "HkPasIHAut",
    "totalRewards": 83,
    "totalAmount": 233,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415aca4c",
    "name": "wqcZTxTdUB",
    "totalRewards": 39,
    "totalAmount": 97,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415aca8d",
    "name": "lCftEMTbbh",
    "totalRewards": 45,
    "totalAmount": 171,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac989",
    "name": "XpLIMoIXIq",
    "totalRewards": 1,
    "totalAmount": 78,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac948",
    "name": "KYsgyFEmDK",
    "totalRewards": 77,
    "totalAmount": 178,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac8c6",
    "name": "nmfeaKEBQK",
    "totalRewards": 39,
    "totalAmount": 156,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac885",
    "name": "gXzCVhKmPS",
    "totalRewards": 0,
    "totalAmount": 81,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac844",
    "name": "piQPzCFkFq",
    "totalRewards": 52,
    "totalAmount": 163,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac803",
    "name": "dwrntDyswY",
    "totalRewards": 0,
    "totalAmount": 76,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415accd6",
    "name": "QCVetYXwvD",
    "totalRewards": 97,
    "totalAmount": 218,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acc54",
    "name": "nJAlxXIgWz",
    "totalRewards": 79,
    "totalAmount": 206,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acbd2",
    "name": "rGJKxOtwZt",
    "totalRewards": 12,
    "totalAmount": 84,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acb50",
    "name": "XYHCltKRit",
    "totalRewards": 81,
    "totalAmount": 231,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acace",
    "name": "HRGgKvcJRQ",
    "totalRewards": 4,
    "totalAmount": 144,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acc95",
    "name": "aMtqAxgBmb",
    "totalRewards": 20,
    "totalAmount": 153,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acb91",
    "name": "rOxSphsZRo",
    "totalRewards": 27,
    "totalAmount": 152,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acb0f",
    "name": "gkHvclZHPR",
    "totalRewards": 27,
    "totalAmount": 137,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acc13",
    "name": "PfJZmisqlo",
    "totalRewards": 0,
    "totalAmount": 65,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac9fe",
    "name": "zKJupvRfGo",
    "totalRewards": 71,
    "totalAmount": 200,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac9bd",
    "name": "VEYIbtWxjv",
    "totalRewards": 117,
    "totalAmount": 267,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac93b",
    "name": "BSMzEVfGZg",
    "totalRewards": 5,
    "totalAmount": 147,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac97c",
    "name": "jNsbMOKbMj",
    "totalRewards": 26,
    "totalAmount": 119,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac8fa",
    "name": "jBxGqMjOoe",
    "totalRewards": 67,
    "totalAmount": 217,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac7f6",
    "name": "nVMSImdvGR",
    "totalRewards": 3,
    "totalAmount": 84,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac8b9",
    "name": "jkGlXjbHaM",
    "totalRewards": 41,
    "totalAmount": 162,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac837",
    "name": "ghdAGwOubo",
    "totalRewards": 19,
    "totalAmount": 97,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac878",
    "name": "ErdRCHvbEH",
    "totalRewards": 27,
    "totalAmount": 138,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac82a",
    "name": "SKYhQlYZWF",
    "totalRewards": 1,
    "totalAmount": 128,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415accc9",
    "name": "wvIcgAUNRZ",
    "totalRewards": 41,
    "totalAmount": 108,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acc88",
    "name": "iiukkqChKp",
    "totalRewards": 61,
    "totalAmount": 169,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acc47",
    "name": "HNsxmDzdrJ",
    "totalRewards": 102,
    "totalAmount": 252,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acb02",
    "name": "lOPGBUoDTl",
    "totalRewards": 23,
    "totalAmount": 153,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acac1",
    "name": "NgGLWNZNFP",
    "totalRewards": 67,
    "totalAmount": 190,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415aca80",
    "name": "VSxIErxsnG",
    "totalRewards": 0,
    "totalAmount": 63,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415aca3f",
    "name": "ZJGOeplJgZ",
    "totalRewards": 17,
    "totalAmount": 130,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acc06",
    "name": "hLNkaioSxY",
    "totalRewards": 33,
    "totalAmount": 142,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acbc5",
    "name": "RccGgSrFHo",
    "totalRewards": 27,
    "totalAmount": 121,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acb84",
    "name": "OabocXJKmB",
    "totalRewards": 81,
    "totalAmount": 231,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acb43",
    "name": "ekgsGyNYzo",
    "totalRewards": 9,
    "totalAmount": 103,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac9f1",
    "name": "yXQvPATZcE",
    "totalRewards": 12,
    "totalAmount": 118,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac96f",
    "name": "lzKZDSPbdK",
    "totalRewards": 18,
    "totalAmount": 127,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac8ed",
    "name": "ZSFmDGFUCR",
    "totalRewards": 55,
    "totalAmount": 195,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acb6a",
    "name": "GQTwMpLEmh",
    "totalRewards": 37,
    "totalAmount": 111,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acb29",
    "name": "XpaDQcbXhF",
    "totalRewards": 61,
    "totalAmount": 163,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415aca66",
    "name": "EMNtgwaFiE",
    "totalRewards": 44,
    "totalAmount": 105,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415aca25",
    "name": "cFeDJpTyox",
    "totalRewards": 23,
    "totalAmount": 97,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac86b",
    "name": "TUIthASKck",
    "totalRewards": 0,
    "totalAmount": 104,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac9b0",
    "name": "QguJszWHHJ",
    "totalRewards": 0,
    "totalAmount": 62,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac8ac",
    "name": "nGjejSwgEI",
    "totalRewards": 10,
    "totalAmount": 156,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acae8",
    "name": "jxCTYJwCco",
    "totalRewards": 0,
    "totalAmount": 84,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acaa7",
    "name": "KaYMGIgwij",
    "totalRewards": 12,
    "totalAmount": 111,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac92e",
    "name": "mNOHSYJRQU",
    "totalRewards": 79,
    "totalAmount": 188,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac9e4",
    "name": "tcEZEultaJ",
    "totalRewards": 33,
    "totalAmount": 144,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac9a3",
    "name": "XOdZFGiNJs",
    "totalRewards": 6,
    "totalAmount": 101,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acc3a",
    "name": "rOJCYfwszR",
    "totalRewards": 46,
    "totalAmount": 140,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415aca32",
    "name": "IfeJvJhmUM",
    "totalRewards": 5,
    "totalAmount": 98,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acbf9",
    "name": "JHfTceNLLp",
    "totalRewards": 12,
    "totalAmount": 68,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acb77",
    "name": "KRlEkzrurr",
    "totalRewards": 65,
    "totalAmount": 214,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acaf5",
    "name": "bekyitjLaf",
    "totalRewards": 38,
    "totalAmount": 119,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415aca73",
    "name": "GOrOobNTkx",
    "totalRewards": 47,
    "totalAmount": 173,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac962",
    "name": "qaBawOaMvD",
    "totalRewards": 31,
    "totalAmount": 158,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac921",
    "name": "MpCgwxYJDD",
    "totalRewards": 46,
    "totalAmount": 165,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac85e",
    "name": "vNDUjGzkgK",
    "totalRewards": 29,
    "totalAmount": 134,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac81d",
    "name": "zzGYpaZfFU",
    "totalRewards": 21,
    "totalAmount": 135,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acbb8",
    "name": "XWHqyvyEXT",
    "totalRewards": 17,
    "totalAmount": 148,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acab4",
    "name": "RpDginNQtq",
    "totalRewards": 37,
    "totalAmount": 104,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac8e0",
    "name": "cirLZRdkQP",
    "totalRewards": 43,
    "totalAmount": 174,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415ac89f",
    "name": "nCoWEoQEDS",
    "totalRewards": 66,
    "totalAmount": 169,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acb36",
    "name": "TpAQSkQcbk",
    "totalRewards": 0,
    "totalAmount": 60,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415accfd",
    "name": "RDfrguCYqY",
    "totalRewards": 20,
    "totalAmount": 152,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415acc7b",
    "name": "RUMBPdcUVQ",
    "totalRewards": 94,
    "totalAmount": 244,
    "monthlyRewards": [
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
      }
    ]
  },
  {
    "customerId": "676d0785563c6749415accbc",
    "name": "ecCiBnXrTV",
    "totalRewards": 44,
    "totalAmount": 144,
    "monthlyRewards": [
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
      }
    ]
  }
]
```