# EzzGameBOOST

Android game launcher and network connection checker, with a black/red UI.

## Build APK with GitHub Actions
1. Upload all files in this repository to a GitHub repository.
2. Open the **Actions** tab and select **Build EzzGameBOOST APK**.
3. Click **Run workflow** (or push a commit to `main`/`master`).
4. When the run completes, open the run and download the `EzzGameBOOST-debug-APK` artifact.
5. Extract the downloaded artifact ZIP to get `app-debug.apk`.

This is a debug APK for testing, not a signed production release.

## Limitations
Android apps without special system privileges cannot forcibly stop other apps or guarantee higher FPS/lower in-game ping. The network check measures TCP connection time to `1.1.1.1:443`, not ICMP ping or the game server's ping.
