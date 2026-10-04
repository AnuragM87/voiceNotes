# VoiceNotes 🎙️

A clean, modern, and lightweight Android application for recording, managing, and sharing voice notes effortlessly. Built entirely with Kotlin and Jetpack Compose.

## Features ✨
- **Record Voice Notes**: MP3 audio recording with real-time pause and resume capabilities.
- **Smart Naming**: Automatically saves files with a concise date and time format (e.g., `dd-MM-yy_HH-mm-ss`) and displays them beautifully in the app.
- **Playback**: Built-in audio player to listen to your recordings instantly right from the list.
- **Rename & Delete**: Easily rename your voice notes to keep them organized, or delete the ones you no longer need.
- **Share via Apps**: Share your `.mp3` voice notes directly to WhatsApp, Telegram, Email, or any other supported app using the standard Android share sheet.
- **Beautiful UI**: A responsive, smooth, and user-friendly interface leveraging Jetpack Compose and Material Design 3.

## Tech Stack 🛠️
- **Language**: [Kotlin](https://kotlinlang.org/)
- **UI Toolkit**: [Jetpack Compose](https://developer.android.com/jetpack/compose)
- **Audio Core**: Android `MediaRecorder` & `MediaPlayer` APIs
- **Design System**: Material Design 3

## Getting Started 🚀
1. Clone the repository:
   ```bash
   git clone https://github.com/AnuragM87/voiceNotes.git
   ```
2. Open the project in **Android Studio**.
3. Build and run the app on an Android Emulator or a physical device via USB/Wi-Fi Debugging.

## Permissions 🔒
- **Microphone (`RECORD_AUDIO`)**: Required to capture audio for your voice notes.

---
*Developed with ❤️ using Android Studio.*