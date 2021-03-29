# Build Your First App

android studio 를 설치

### **2가지로 app 을 빌드해보는 section**

- **AVD - Android virtual device**
- **Physical Device**

<br>

> Homework

<img height="600" src="Hello world.png">   <img height="600" src="My Dice Roller.png">

<br>

---

<br>

### Summary

- Android studio 설치를 위해서는 [Android Studio](https://developer.android.com/studio)로 가서 다운로드 및 설치를 진행하면 된다.

- 프로젝트 창에서 Android 계층 구조를 보려면 수직탭 열에서 프로젝트 탭을 클릭하고 드롭다운 메뉴에서 Android 를 클릭하면 된다.

  <img src="Android Tab.png">

- 프로젝트에 새 종속성을 추가하거나, 버전 변경시 `build.gradle(Module:app)` 파일을 수정하면 된다.
- App의 모든 코드 및 resource 는 `App` 및 `res` 폴더에 있다.
  - Java 폴더 : activities, tests, other components 등의 Kotlin 혹은 Java(또는 둘다) 의 소스코드
  - res 폴더 : layouts, strings, images 과 같은 resource
- Android 앱의 features, components, permissions 들을 추가하려면 `AndroidManifest.xml` 파일을 편집해야한다.
  추가되는 activities 들과 같은 앱의 구성요소들은 반드시 Manifest 파일에 추가되어야한다.
- Android virtual device(Emulator)를 생성하고 앱을 실행하려면, [AVD Manager](https://developer.android.com/studio/run/managing-avds)를 사용하면된다.

<br>

<br>

---

<br>

### **Badge**

<img src="badge.png">

