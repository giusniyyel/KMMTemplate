# AGENTS.md

## Architecture
- **KMM Setup**: Shared code in `composeApp` module using Compose Multiplatform for cross-platform UI. Android app in `composeApp` (builds APK), iOS app in `iosApp` (SwiftUI hosting Kotlin UIViewController).
- **Data Flow**: UI (Compose) -> ViewModels (Voyager ScreenModel) -> Repositories -> DAOs (Room) / API (Ktor). Local DB uses Room with bundled SQLite; remote layer placeholder in `data/remote`.
- **Key Components**: `App.kt` (main composable), `Database.kt` (Room setup with expect/actual), `KoinModule.kt` (DI initialization).
- **Platform Specifics**: Use `expect/actual` for platform code (e.g., `Platform.kt`, DB builders in `local/`).

## Workflows
- **Build Android**: `.\gradlew :composeApp:assembleDebug` (Windows) or `./gradlew :composeApp:assembleDebug` (macOS/Linux).
- **Run iOS**: Open `iosApp` in Xcode, run from there.
- **Tests**: Run `.\gradlew :composeApp:test` for common tests in `commonTest`.
- **Debug**: Android via IDE run configs; iOS via Xcode debugger.

## Conventions
- **Package**: `org.giusniyyel.kmm` for shared code.
- **Dependencies**: Managed via `gradle/libs.versions.toml` (version catalog).
- **DI**: Koin with `sharedModule` (common) and `platformModule` (Android/iOS specifics).
- **Database**: Room entities in `data/local/entity/`, DAOs in `data/local/`, schemas in `schemas/`.
- **Networking**: Ktor clients in `commonMain` (core), platform-specific in `androidMain`/`iosMain`.
- **Navigation**: Voyager for Compose navigation (navigator, screenmodel, koin integration).
- **Resources**: Compose resources in `composeResources/`, accessed via `Res`.</content>
<parameter name="filePath">C:\Users\giusn\Developer\KMMTemplate\AGENTS.md
