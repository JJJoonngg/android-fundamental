# Homework



## **Answer these questions**

### **Question 1**

Why do you want to minimize explicit and implicit calls to `findViewById()`?

- Every time `findViewById()` is called, it traverses the view hierarchy.
- `findViewById()` runs on the main or UI thread.
- These calls can slow down the user interface.
- Your app is less likely to crash.

### Answer 1

- Every time `findViewById()` is called, it traverses the view hierarchy.

<br>

### **Question 2**

How would you describe data binding?

For example, here are some things you could say about data binding:

- The big idea about data binding is to create an object that connects/maps/binds two pieces of distant information together at compile time, so that you don't have to look for the data at runtime.
- The object that surfaces these bindings to you is called the *binding object*.
- The binding object is created by the compiler.

### Answer 2

- Data binding is a general technique that binds data sources from the provider and consumer together and synchronizes them. ([wiki](https://en.wikipedia.org/wiki/Data_binding))

<br>

### **Question 3**

Which of the following is NOT a benefit of data binding?

- Code is shorter, easier to read, and easier to maintain.
- Data and views are clearly separated.
- The Android system only traverses the view hierarchy once to get each view.
- Calling `findViewById()` generates a compiler error.
- [Type safety](https://en.wikipedia.org/wiki/Type_safety) for accessing views.

### Answer 3

- Calling `findViewById()` generates a compiler error.

<br>

### **Question 4**

What is the function of the `<layout>` tag?

- You wrap it around your root view in the layout.
- Bindings are created for all the views in a layout.
- It designates the top-level view in an XML layout that uses data binding.
- You can use the `<data>` tag in inside a `<layout>` to bind a variable to a data class.

### Answer 4

- It designates the top-level view in an XML layout that uses data binding.

<br>

### **Question 5**

Which is the correct way to reference bound data in the XML layout?

- `android:text="@={myDataClass.property}"`
- `android:text="@={myDataClass}"`
- `android:text="@={myDataClass.property.toString()}"`
- `android:text="@={myDataClass.bound_data.property}"`

### Answer 5

- `android:text="@={myDataClass.property}"`

<br>

---

