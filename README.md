# 📬 KMMTemplate

![Language](https://img.shields.io/badge/language-Kotlin-blue.svg)
![License](https://img.shields.io/badge/license-MIT-green.svg)
![Status](https://img.shields.io/badge/status-active-brightgreen.svg)

## 📖 Overview
**KMMTemplate** is a Kotlin Multiplatform-based template that provides a pre-configured setup for building cross-platform applications targeting Android and iOS. It spares developers from the initial boilerplate of setting up shared code, UI, data persistence, and dependency injection, offering a solid foundation for rapid development.

---

## 🌍 The Problem It Solves

Setting up a Kotlin Multiplatform project from scratch involves configuring multiple modules, dependencies, and platform-specific integrations, which can be time-consuming and error-prone.

> *This template was created to streamline the KMM onboarding process.*

**KMMTemplate** solves this by:
1. Providing a ready-to-use project structure with shared Compose UI.
2. Integrating essential libraries like Room for local storage, Ktor for networking, and Koin for DI.
3. Handling platform specifics with expect/actual declarations.
4. Offering build scripts and configurations for both Android and iOS.

---

## 📂 Project Structure
```
KMMTemplate/
├── composeApp/          # Shared KMM module with Compose UI
│   ├── src/
│   │   ├── commonMain/  # Shared code
│   │   ├── androidMain/ # Android-specific code
│   │   └── iosMain/     # iOS-specific code
│   ├── build.gradle.kts # Module build config
│   └── schemas/         # Room DB schemas
├── iosApp/              # iOS app entry point
│   └── iosApp/          # SwiftUI code
├── gradle/              # Gradle wrapper and libs versions
├── build.gradle.kts     # Root build config
├── settings.gradle.kts  # Project settings
└── README.md
```

---

## ⚙️ Setup Instructions

### Prerequisites
- JDK 11+ (for Kotlin compilation)
- Android Studio (for Android development)
- Xcode 14+ (for iOS development)
- Kotlin Multiplatform plugin

### Steps
1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/KMMTemplate.git
   cd KMMTemplate
   ```

2. **Install dependencies**

   ```bash
   # On Windows
   .\gradlew build

   # On macOS/Linux
   ./gradlew build
   ```

3. **Configure environment variables**
   - No specific env vars required for the template.

4. **Run the application**

   - **Android**:
     ```bash
     .\gradlew :composeApp:assembleDebug
     ```
     Or open in Android Studio and run.

   - **iOS**: Open `iosApp` in Xcode and run.

---

## 📦 Dependencies
- **Compose Multiplatform** → Shared UI framework
- **Room** → Local database
- **Ktor** → HTTP client
- **Voyager** → Navigation
- **Koin** → Dependency injection

---

## 🤝 Contributing *(optional)*
Contributions are welcome! Please open an issue first to discuss what you'd like to change.  
Make sure to follow the existing code style and include tests where applicable.

---

## 📜 License
This project is licensed under the [LICENSE NAME] License. See the [LICENSE](LICENSE) file for details.

---

## ❤️ Credits
Created with passion by **Giusniyyel**.  
A template to kickstart your KMM journey.
