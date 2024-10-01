# NotesApp Using Room Database
Room is a persistence library that’s part of Android Jetpack. It provides an abstraction layer over SQLite, making it easier to work with databases in Android apps. Room simplifies database operations by offering a more fluent and type-safe API, reducing boilerplate code and ensuring compile-time verification of SQL queries. See more: <br>
https://developer.android.com/training/data-storage/room

# Components of Room Database
1. **Database Class**: This class holds the database and serves as the main access point for the underlying connection to your app’s persisted data. It is annotated with **@Database** and must extend RoomDatabase. <br>
2. **Entities**: These are data classes annotated with @Entity that represent tables in your database. Each field in the entity corresponds to a column in the table. <br>
3. **Data Access Objects (DAOs)**: These are interfaces or abstract classes annotated with **@Dao**. They define methods for interacting with the database, such as querying, inserting, updating, and deleting data. <br>

# Room vs. SQLite
**1. Abstraction and Ease of Use** <br>
**Room**: Provides an abstraction layer over SQLite, making database operations more fluent and type-safe. It reduces boilerplate code and simplifies database interactions with annotations and DAOs (Data Access Objects). <br>
**SQLite**: Requires direct use of SQL queries and raw database operations, which can be more verbose and error-prone. <br>

**2. Compile-time Verification** <br>
**Room**: Offers compile-time verification of SQL queries, ensuring that errors are caught early during development. <br>
**SQLite**: Errors in SQL queries are only caught at runtime, which can lead to more debugging and potential runtime crashes. <br>

**3. Object Relational Mapping (ORM)** <br>
**Room**: Supports ORM, allowing developers to map database tables to Java/Kotlin objects easily. This simplifies data handling and reduces the need for manual mapping code. <br>
**SQLite**: Does not provide built-in ORM support, requiring developers to manually map database results to objects. <br>

**4. Type Safety** <br>
**Room**: Ensures type safety by using entities and DAOs, reducing the chances of runtime errors due to type mismatches. <br>
**SQLite**: Being a raw SQL database engine, it lacks type safety, making it more prone to runtime errors. <br>

**5. Integration with Other Libraries** <br>
**Room**: Integrates seamlessly with Jetpack components like LiveData, ViewModel, and Paging, supporting reactive programming with LiveData and RxJava. <br>
**SQLite**: Does not offer built-in support for reactive programming libraries, requiring manual handling of data observation. <br>

**6. Database Migrations** <br>
**Room**: Simplifies database migrations with its Migration class, allowing developers to define schema changes and handle version management easily. <br>
**SQLite**: Requires manual handling of database migrations, which can be complex and error-prone. <br>

**7. Query Complexity** <br>
**Room**: Provides simplified query building capabilities with annotations, making complex queries more readable and maintainable. <br>
**SQLite**: Requires writing raw SQL queries, which can be more verbose and harder to manage. <br>

# Benefits of Using Room
1. **Compile-time Verification**: Room verifies SQL queries at compile time, reducing runtime errors. <br>
2. **Reduced Boilerplate Code**: Room uses annotations to minimize repetitive code. <br>
3. **Easy Integration**: Room integrates seamlessly with other Jetpack components like LiveData, ViewModel, and Paging. <br>
Room makes it easier to manage local data storage in Android apps, ensuring data consistency and reducing the likelihood of errors.

# Notes App Interfaces
<p align="center">
  <img src="https://github.com/user-attachments/assets/04615dba-2dbe-4e37-9300-e2e39f9c7ac0">
</p>

# Summary
Room offers several advantages over SQLite, including compile-time verification, ORM support, type safety, easier integration with other libraries, simplified database migrations, and more maintainable query building. These features make Room a more developer-friendly choice for managing local databases in Android apps.
