import SwiftUI
import ComposeApp

@main
struct iOSApp: App {

    init() {
        koinModuleKt.initializeKoin()
    }

    var body: some Scene {
        WindowGroup {
            ContentView()
        }
    }
}