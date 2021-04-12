# Homework

## Answer these questions

### Question 1

If you pass arguments from Fragment A to Fragment B without using Safe Args to make sure your arguments are type-safe, which of the following problems can occur that might cause the app to crash when the app runs? Select all that apply.

- Fragment B requests data that Fragment A doesn't send to it.
- Fragment A might send data that Fragment B hasn't requested.
- Fragment A might send data that's a different type than Fragment B needs. For example, Fragment A might send a string but Fragment B requests an integer, resulting in a return value of zero.
- Fragment A uses different parameter names than Fragment B requests.

#### Answer 1

- Fragment B requests data that Fragment A doesn't send to it.
- Fragment A might send data that's a different type than Fragment B needs. For example, Fragment A might send a string but Fragment B requests an integer, resulting in a return value of zero.
- Fragment A uses different parameter names than Fragment B requests.

<br>

### Question 2

What does the Safe Args Gradle plugin do? Select all that apply:

- Generates simple object and builder classes for type-safe access to arguments specified for destinations and actions.
- Creates `Navigation` classes that you can edit to simplify the passing of parameters between fragments.
- Makes it so you don't need to use Android bundles in your code.
- Generates a method for each action that you've defined in the navigation graph.
- Prevents your code from using the wrong key when extracting data from a bundle.

#### Answer 2

- Generates simple object and builder classes for type-safe access to arguments specified for destinations and actions.
- Generates a method for each action that you've defined in the navigation graph.

<br>

### Question 3

What's an implicit intent?

- A task that your app initiates in one Fragment in your app, and that's completed in another Fragment.
- A task that your app always completes by showing the user a chooser.
- A task that your app initiates without knowing which app or Activity will handle the task.
- An implicit intent is the same thing as the action that you set between destinations in the navigation graph.

### Answer 3

- A task that your app initiates without knowing which app or Activity will handle the task.

<br>

---

