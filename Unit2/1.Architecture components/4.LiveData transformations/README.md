# Homework

## **Answer these questions**

### **Question 1**

In which class should you add the data-formatting logic that uses the [`Transformations.map()`](https://developer.android.com/reference/androidx/lifecycle/Transformations.html?authuser=1#map(androidx.lifecycle.LiveData, androidx.arch.core.util.Function)) method to convert `LiveData` to a different value or format?

- `ViewModel`
- `Fragment`
- `Activity`
- `MainActivity`

### Answer 1

- `ViewModel`

<br>

### **Question 2**

The `Transformations.map()` method provides an easy way to perform data manipulations on the `LiveData` and returns __________ .

- A `ViewModel` object
- A `LiveData` object
- A formatted `String`
- A `RoomDatabase` object

### Answer 2

- A `LiveData` object

<br>

### **Question 3**

What are the parameters for the `Transformations.map()` method?

- A source `LiveData` and a function to be applied to the `LiveData`
- Only a source `LiveData`
- No parameters
- `ViewModel` and a function to be applied

### Answer 3

- A source `LiveData` and a function to be applied to the `LiveData`

<br>

### **Question 4**

The lambda function passed into the `Transformations.map()` method is executed in which thread?

- Main thread
- Background thread
- UI thread
- In a coroutine

### Answer 4

- Main thread

<br>

---

