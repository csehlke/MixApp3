# MixApp
Android App for the MIX at George Mason University

[Demo](#demo)


## Inspiration
The MIX at George Mason wants to eliminate the receptionist that literally just waits all day long for students that need help with their work and rather just send a instructor to the front desk only if he is needed. To accomplish this, every instructor installs an app on their phone that sends them a notifications if someone needs help at the front desk. Students can request help by for example pressing a button that is placed at the entrance.

## What it does
It is an Android app that sends notifications to all phones that are subscribed to the notification channel. 

The app itself lets people subscribe to the notification channels, when they enter the MIX and unsubscribe when they leave the MIX again, so they do not get the notifications when they are not on duty.
(At the moment new help requests need to be submitted online in the Firebase console, since there is no actual button available at this time.)

## How we built it
We created an android app using Android Studio, set up Firebase, integrated Firebase Messaging into the app and implemented the Android notifications when the phone receives a message from Firebase.

## Challenges we ran into
We all had no experience in how to create an Android app at the beginning, so we basically started from zero. 
One of the bigger problems we had was to actually integrating Firebase messaging into the Android app since different tutorials suggested different solutions and most of the ones we ran into were already outdated, so they did not help at all.

## Accomplishments that we're proud of
Creating our very first Android app, that actually works and is receiving messages.

## What we learned
We learned how to create an Android app from scratch, and how to use Google's Firebase system.

## What's next for MixApp
- Up next, the actual button that triggers the messages needs to be build and integrated into sending its messages to Firebase.
- Create a way for the employees to respond to the messages, so that the student/other employees get feedback, that a teacher is coming to help


## Demo

The APK to install on your Android device can be found [here](https://github.com/csehlke/MixApp3/blob/master/demo/MIX_App.apk).

Once the app is installed you currently can choose beween to notification channels:
<img src="https://github.com/csehlke/MixApp3/blob/master/demo/app1.png" height="300">

To get notifications you need to subscribe to the channel. If you do not want to get any more notifications, you can also unsubscribe again.
<img src="https://github.com/csehlke/MixApp3/blob/master/demo/app2.png" height="300">

Once help is requested, devices that are subscribed to the channel get a notification that help is needed.
<img src="https://github.com/csehlke/MixApp3/blob/master/demo/notification.png" height="300">

At the moment you need to add new messages using the Firebase web console, since there is no physical button to press available at the moment.
<img src="https://github.com/csehlke/MixApp3/blob/master/demo/notification.png" height="600">

## Credits
[Firebase Cloud Messaging Tutorial for Android](https://www.simplifiedcoding.net/firebase-cloud-messaging-tutorial-android/)
