# Battery Saver Auto Clicker 🔋

Automated Accessibility Service that clicks 'Activate'/'Turn On' buttons in system battery saver pages.

## Features ✨
- Automatically detects and clicks battery saver buttons
- Supports multiple manufacturers (Samsung, Xiaomi, Huawei, etc.)
- Multilingual support (English, Russian, Ukrainian)
- Clean Jetpack Compose UI
- Overlay permission support
- Automatic build with GitHub Actions

## Supported Manufacturers 📱
- Samsung (Smart Manager)
- Xiaomi (PowerCenter)
- Huawei
- OnePlus
- OPPO
- Vivo
- Fallback to standard Android battery settings

## Permissions Required 🔐
1. **Accessibility Service** - To detect and click buttons automatically
2. **Overlay Permission** - To show visual feedback when clicking

## How to Use 🚀
1. Install the app
2. Enable Accessibility Service in settings
3. Grant Overlay Permission if requested
4. Click the "POWER SAVE" button
5. App will navigate to battery saver settings
6. Accessibility service will auto-click the activate button

## Build Instructions 🛠️

### Prerequisites
- Android Studio Flamingo or later
- JDK 17
- Android SDK 34

### Build with Gradle
```bash
./gradlew build
