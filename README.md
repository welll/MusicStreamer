# MusicDNA - A Music Player like no other
<img src = "https://github.com/harjot-oberai/MusicStreamer/blob/master/screenshots/splash.jpg" width = "300"><br>
A Music Player for android that makes use of the Visualzer Class for rendering a beautiful **DNA** (***Visualization***) of the currently playing music.

## Background
The Music Player draws inspiration from [paullewis's music-dna](https://github.com/paullewis/music-dna/).
The Player uses the FFT Data supplied by the **Visualizer** class of Android , calculates the Amplitude at that particular moment and plots the **DNA**.

## The Player
MusicDNA combines the usefullness of a traditional Music Player app with the beautiful visualizations.
The Player allows users to play both **local music** as well as Stream Music directly from **SoundCloud**.
The Player also packs a **Powerful Equalizer with** ***BassBoost and Reverb*** effects

## Build Instructions

After cloning the repo, create a file `Config.java` under `\app\src\main\java\com\sdsmdg\harjot\MusicDNA`
Put the following code in it
```
package com.sdsmdg.harjot.MusicDNA;

public class Config {
    public static final String CLIENT_ID = "YOUR_SOUNDCLOUD_CLIENT_ID";
    public static final String API_URL = "https://api.soundcloud.com";
}
```
Replace `YOUR_SOUNDCLOUD_CLIENT_ID` with a client id received from SoundCloud.<br>
You may grab one here : [https://developers.soundcloud.com/](https://developers.soundcloud.com/)<br>
After that just import the project into Android Studio.

## The Player - *In Action*

Video Demo : [http://sendvid.com/b2hhc1pi](http://sendvid.com/b2hhc1pi)<br>
The video's length was cut short due to ADB screenrecord's limit of 3:00 min. <br>
Credits for combining audio and video [Piyush Mehrotra](https://github.com/hm98)

<img src = "https://github.com/harjot-oberai/MusicStreamer/blob/master/screenshots/dna1.png" width = "300">
<img src = "https://github.com/harjot-oberai/MusicStreamer/blob/master/screenshots/dna2.png" width = "300">
<img src = "https://github.com/harjot-oberai/MusicStreamer/blob/master/screenshots/home.png" width = "300">
<img src = "https://github.com/harjot-oberai/MusicStreamer/blob/master/screenshots/home2.png" width = "300">
<img src = "https://github.com/harjot-oberai/MusicStreamer/blob/master/screenshots/equalizer.png" width = "300">
<img src = "https://github.com/harjot-oberai/MusicStreamer/blob/master/screenshots/album.png" width = "300">
<img src = "https://github.com/harjot-oberai/MusicStreamer/blob/master/screenshots/savedDNA.png" width = "300">
<img src = "https://github.com/harjot-oberai/MusicStreamer/blob/master/screenshots/settings.png" width = "300">