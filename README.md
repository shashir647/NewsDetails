# News App 🗞
News App is a simple news app 🗞️ which uses [NewsAPI](https://newsapi.org/) to fetch top news headlines from the API. The main aim of this app is to be a leading example of how to build Modern Android applications for all Android Developers

The codebase focuses 👓 on following key things:
- Code structuring, style and comments
- Dependency injection 🗡
- Offline first ✈️
- Kotlin + Coroutines
- And tests 🛠

The idea is to keep the app super simple while demonstrating new libraries and tools which makes it easier to build high quality Android applications.

# Development Setup 🖥

You will require latest version of Android Studio 3.0 (or newer) to be able to build the app

## API key 🔑
You'll need to provide API key to fetch the news from the News Service (API). Currently the news is fetched from [NewsAPI](https://newsapi.org/)

- Generate an API key (It's only 2 steps!) from [NewsAPI](https://newsapi.org/)
- Create new file named -> `credentials.properties` in our project root folder
- Add the API key as shown below [Make sure to keep the double quotes]:
```
    NEWS_API_KEY = "<INSERT_YOUR_API_KEY>"
```
- Build the app 


## Libraries and tools 🛠

News App uses libraries and tools used to build Modern Android application, mainly part of Android Jetpack 🚀

- [Kotlin](https://kotlinlang.org/) first
- [Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html) and [Flow](https://kotlinlang.org/docs/reference/coroutines/flow.html) first
- Architecture components
- [Dagger 2](https://developer.android.com/training/dependency-injection) for dependency injection 🗡
- [Retrofit](https://square.github.io/retrofit/)
- Other [Android Jetpack](https://developer.android.com/jetpack) components


## Architecture

The app uses MVVM [Model-View-ViewModel] architecture to have a unidirectional flow of data, separation of concern, testability, and a lot more.

Read more: 
- [Building Modern Android Apps with Architecture Guidelines](https://medium.com/@aky/building-modern-apps-using-the-android-architecture-guidelines-3238fff96f14)
- [Guide to app architecture](https://developer.android.com/jetpack/docs/guide)

![Architecture](https://developer.android.com/topic/libraries/architecture/images/final-architecture.png)

## Testing
The architecture components are highly testable. Following table shows how to test various parts of the app (cheatsheet for testing architecture component)

|  Component |     Test     |        Mock        |
|:----------:|:------------:|:------------------:|
|     UI     |   Espresso   |      ViewModel     |
|  ViewModel |     JUnit    |     Repository     |
| Repository |     JUnit    | DAO and WebService |
|     DAO    | Instrumented |          -         |
| WebService | Instrumented |    MockWebServer   |

