#SpringBoot Haversine Distance Calculation

You can use this service to calculate the distance between two points on the Earth's surface.

To find the closest hotel to the city center

````
GET /hotel/search/1 HTTP/1.1
Host: localhost:8000
````

results should be

````json
[
    {
        "id": 2,
        "name": "The Thornton Council Hotel",
        "rating": 6.3,
        "city": {
            "id": 1,
            "name": "Amsterdam",
            "cityCentreLatitude": 52.36878,
            "cityCentreLongitude": 4.903303
        },
        "address": "Waterlooplein",
        "latitude": 52.3681563,
        "longitude": 4.9010029,
        "deleted": true
    },
    {
        "id": 1,
        "name": "Monaghan Hotel",
        "rating": 9.2,
        "city": {
            "id": 1,
            "name": "Amsterdam",
            "cityCentreLatitude": 52.36878,
            "cityCentreLongitude": 4.903303
        },
        "address": "Weesperbuurt en Plantage",
        "latitude": 52.364799,
        "longitude": 4.908971,
        "deleted": false
    },
    {
        "id": 6,
        "name": "Raymond of Amsterdam Hotel",
        "rating": null,
        "city": {
            "id": 1,
            "name": "Amsterdam",
            "cityCentreLatitude": 52.36878,
            "cityCentreLongitude": 4.903303
        },
        "address": "22 High Avenue",
        "latitude": 52.3773989,
        "longitude": 4.8846443,
        "deleted": false
    },
    {
        "id": 5,
        "name": "Fitting Image Hotel",
        "rating": null,
        "city": {
            "id": 1,
            "name": "Amsterdam",
            "cityCentreLatitude": 52.36878,
            "cityCentreLongitude": 4.903303
        },
        "address": "Staatsliedenbuurt",
        "latitude": 52.380936,
        "longitude": 4.8708297,
        "deleted": true
    },
    {
        "id": 4,
        "name": "Stay Schmtay Hotel",
        "rating": 8.7,
        "city": {
            "id": 1,
            "name": "Amsterdam",
            "cityCentreLatitude": 52.36878,
            "cityCentreLongitude": 4.903303
        },
        "address": "Jan van Galenstraat",
        "latitude": 52.3756755,
        "longitude": 4.8668628,
        "deleted": false
    },
    {
        "id": 3,
        "name": "McZoe Trescothiks Hotel",
        "rating": 9.8,
        "city": {
            "id": 1,
            "name": "Amsterdam",
            "cityCentreLatitude": 52.36878,
            "cityCentreLongitude": 4.903303
        },
        "address": "Oude Stad, Harlem",
        "latitude": 52.379577,
        "longitude": 4.633547,
        "deleted": false
    }
]
````