# AnimeDecider

The Anime Decider app is a simple Android application that helps users decide which anime to watch by randomly selecting an anime title from a list. Users can also add new anime titles to the list for consideration.


## Getting Started

To run the app, you can clone this repository and open it in Android Studio.

1. Clone Clone the repository:
   ```bash
   git clone https://github.com/yourusername/anime-decider-app.git
   ```
2. Open the project in Android Studio.
3. Build and run the app on an Android device or emulator.

## ScreenShots

Description of the screenshot.


Description of the screenshot.

## App Overview

### Description
The Anime Decider app allows users to:
- Randomly select an anime title from a predefined list.
- Add new anime titles to the list for future selections.

### Features
- `Decide Button`: Pressing the "Decide" button randomly selects an anime title from the list and displays it.
- `Add Anime Button`: Pressing the "Add Anime" button adds a new anime title to the list.

## How to Use
1. Launch the app on your Android device or emulator.
2. Press the "Decide" button to randomly select an anime title.
3. Optionally, you can add a new anime title to the list by typing its name in the text field and pressing the "Add Anime" button.
4. The selected anime title will be displayed on the screen.

## Code Overview
- `animeList`: An array list of anime titles.
- `onCreate()`: Initializes the app and sets up event listeners for buttons.
- `decideBtn.setOnClickListener()`: Randomly selects an anime title from animeList and displays it.
- `addAnimeBtn.setOnClickListener()`: Adds a new anime title to animeList.
