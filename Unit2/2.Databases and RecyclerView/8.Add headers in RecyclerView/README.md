# Homework

## **Answer these questions**

### **Question 1**

Which of the following statements is true about `ViewHolder`?

▢ An adapter can use multiple `ViewHolder` classes to hold headers and various types of data.

▢ You can have exactly one view holder for data, and one view holder for a header.

▢ A `RecyclerView` supports multiple types of headers, but the data has to be uniform.

▢ When adding a header, you subclass `RecyclerView` to insert the header at the correct position.

### Answer 1

:white_check_mark:  An adapter can use multiple `ViewHolder` classes to hold headers and various types of data.

<br>

### **Question 2**

When should you use coroutines with a `RecyclerView`? Select all the statements that are true.

▢ Never. A `RecyclerView` is a UI element and should not use coroutines.

▢ Use coroutines for long-running tasks that could slow the UI.

▢ List manipulations can take a long time, and you should always do them using coroutines.

▢ Use coroutines with suspend functions to avoid blocking the main thread.

### Answer 2

:white_check_mark: Use coroutines for long-running tasks that could slow the UI.

:white_check_mark: Use coroutines with suspend functions to avoid blocking the main thread.

<br>

### **Question 3**

Which of the following do you NOT have to do when using more than one `ViewHolder`?

▢ In the `ViewHolder`, provide multiple layout files to inflate as needed.

▢ In `onCreateViewHolder()`, return the correct type of view holder for the data item.

▢ In `onBindViewHolder()`, only bind data if the view holder is the correct type of view holder for the data item.

▢ Generalize the adapter class signature to accept any `RecyclerView.ViewHolder`.

### Answer 3

:white_check_mark: Generalize the adapter class signature to accept any `RecyclerView.ViewHolder`.

<br>

---

