# Rating Service 🌟

The Rating Service manages hotel ratings provided by users. It offers various API endpoints to create, retrieve, and delete ratings. This service plays a crucial role in the overall hotel rating ecosystem.

## Quick Start 🚀

1. **Clone Repository:**
   ```bash
   git clone https://github.com/yourusername/ratingservice.git

2. **Database Configuration:**
  - Update the `application.properties` file with your database credentials.
  - Specify the database URL, username, and password.
    ```bash
    # Database Configuration
    spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
    spring.datasource.username=your_database_username
    spring.datasource.password=your_database_password
    
3. **Run Rating Service:**
   ```bash
   cd ratingservice
    ./mvnw clean package
    java -jar target/ratingservice-1.0.0.jar

4. **Access Rating Service:**
   - Visit http://localhost:8083/ratings to interact with the Rating Service.

## API Endpoints 🛣️

### Create Rating 🌟

  - **Endpoint:**
    ```bash
    POST http://localhost:8083/ratings

  - **Request Body:**
    ```bash
    {
    "userId": "uniqueUserId",
    "hotelId": "uniqueHotelId",
    "rating": 4,
    "feedback": "Great experience! The staff was very accommodating."
    }

### Get All Ratings 📊

  - **Endpoint:**
    ```bash
    GET http://localhost:8083/ratings

  - **Response:**
    ```bash
    [
      {
        "ratingId": "uniqueRatingId1",
        "userId": "uniqueUserId1",
        "hotelId": "uniqueHotelId1",
        "rating": 5,
        "feedback": "Absolutely fantastic. The view from the room was breathtaking."
      },
      // ... (other ratings)
    ]

### Get Ratings by User ID 🔍

  - **Endpoint:**
    ```bash
    GET http://localhost:8083/ratings/user-id/{userId}

  - **Response:**
    ```bash
    [
      {
        "ratingId": "uniqueRatingId1",
        "userId": "uniqueUserId",
        "hotelId": "uniqueHotelId1",
        "rating": 4,
        "feedback": "Great experience! The staff was very accommodating."
      },
      // ... (other ratings for the specified user)
    ]

### Get Ratings by Hotel ID 🔍

  - **Endpoint:**
    ```bash
    GET http://localhost:8083/ratings/hotel-id/{hotelId}

  - **Response:**
    ```bash
    [
      {
        "ratingId": "uniqueRatingId1",
        "userId": "uniqueUserId1",
        "hotelId": "uniqueHotelId",
        "rating": 5,
        "feedback": "Absolutely fantastic. The view from the room was breathtaking."
      },
      // ... (other ratings for the specified hotel)
    ]

### Delete Rating by ID 🗑️

  - **Endpoint:**
    ```bash
    DELETE http://localhost:8083/ratings/{ratingId}

  - **Response:**
    ```bash
    {
      "ratingId": "deletedRatingId",
      "userId": "deletedUserId",
      "hotelId": "deletedHotelId",
      "rating": 3,
      "feedback": "Average experience."
    }




