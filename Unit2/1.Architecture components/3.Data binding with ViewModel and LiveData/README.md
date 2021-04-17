# Homework

## **Answer these questions**

### **Question 1**

Which of the following statements is *not* true about listener bindings?

- Listener bindings are binding expressions that run when an event happens.
- Listener bindings work with all versions of the Android Gradle plugin.
- Listener bindings are written as lambda expressions.
- Listener bindings are similar to method references, but they let you run arbitrary data-binding expressions.

### Answer 1

- Listener bindings work with all versions of the Android Gradle plugin.

<br>

### **Question 2**

Assume your app includes this string resource:
`<string name="generic_name">Hello %s</string>`

Which of the following is the correct syntax for formatting the string, using the data-binding expression?

- `android:text= "@{@string/generic_name(user.name)}"`
- `android:text= "@{string/generic_name(user.name)}"`
- `android:text= "@{@generic_name(user.name)}"`
- `android:text= "@{@string/generic_name,user.name}"`

### Answer 2

- `android:text= "@{@string/generic_name(user.name)}"`

<br>

### **Question 3**

When is a listener-binding expression evaluated and run?

- When the data held by the `LiveData` is changed
- When an activity is re-created by a configuration change
- When an event such as `onClick()` occurs
- When the activity goes into the background

### Answer 3

- When an event such as `onClick()` occurs

<br>

---

