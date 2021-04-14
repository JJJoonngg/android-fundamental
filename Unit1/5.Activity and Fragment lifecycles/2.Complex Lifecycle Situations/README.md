# Homework

## Answer these questions

### **Question 1**

Your app contains a physics simulation that requires heavy computation to display. Then the user gets a phone call. Which of the following is true?

- During the phone call, you should continue computing the positions of objects in the physics simulation.
- During the phone call, you should stop computing the positions of objects in the physics simulation.

### Answer 1

- During the phone call, you should stop computing the positions of objects in the physics simulation.

<br>

### **Question 2**

Which lifecycle method should you override to pause the simulation when the app is not on the screen?

- `onDestroy()`
- `onStop()`
- `onPause()`
- `onSaveInstanceState()`

### Answer 2

- `onStop()`

<br>

### **Question 3**

To make a class lifecycle-aware through the Android lifecycle library, which interface should the class implement?

- `Lifecycle`
- `LifecycleOwner`
- `Lifecycle.Event`
- `LifecycleObserver`

### Answer 3

- `LifecycleObserver`

<br>

### Question 4

Under which circumstances does the `onCreate()` method in your activity receive a `Bundle` with data in it (that is, the `Bundle` is not `null`)?

- The activity is restarted after the device is rotated.
- The activity is started from scratch.
- The activity is resumed after returning from the background.
- The device is rebooted.

### Answer 4

- The activity is restarted after the device is rotated.

<br>

---

