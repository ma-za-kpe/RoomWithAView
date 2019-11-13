# RoomWithAView
Room with a view is a simple application that shows haow to use Android jetpack features by adding words ro the room database and displaying them in a recyclerview.
## RoomWithAView

The RoomWithAView app is a demo app that helps you save, Update and delete names to the Database. 
* CREATE Todo
* READ Todo
* UPDATE Todo
* DELETE Todo

This app demonstrates the following views and techniques:
* Room database
* DAO
* Coroutines
* Transformation map
* Data Binding in XML files
* ViewModel Factory
* Using Backing Properties to protect MutableLiveData
* Observable state LiveData variables to trigger navigation

The recommended Architecture Components include:-
* Entity: Annotated class that describes a database table when working with Room.

* SQLite database: On device storage. The Room persistence library creates and maintains this database for you.

* DAO: Data access object. A mapping of SQL queries to functions. When you use a DAO, you call the methods, and Room takes care of the rest.

* Room database: Simplifies database work and serves as an access point to the underlying SQLite database (hides SQLiteOpenHelper). The Room database uses the DAO to issue queries to the SQLite database.

* Repository: Used to manage multiple data sources.

* ViewModel: Acts as a communication center between the Repository (data) and the UI. The UI no longer needs to worry about the origin of the data. ViewModel instances survive Activity/Fragment recreation.

* LiveData: A data holder class that can be observed. Always holds/caches the latest version of data, and notifies its observers when data has changed. LiveData is lifecycle aware. UI components just observe relevant data and don't stop or resume observation. LiveData automatically manages all of this since it's aware of the relevant lifecycle status changes while observing.

## Working with the RoomWithAView Code

Here are the basic steps for working with with the repo.

The basic steps are:

1. Clone the repo.
2. Open it with Android Studio.
3. Build the app.
4. Run the app on a phone or emulator

## Download an play it here
[APK file]()

## Link to codelab
[COURSE](https://codelabs.developers.google.com/codelabs/android-room-with-a-view-kotlin/index.html?index=..%2F..index#0)
