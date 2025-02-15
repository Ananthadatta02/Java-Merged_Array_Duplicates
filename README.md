# Duplicate in Merged Array

## Description
This Java program merges two user-input arrays and identifies duplicate elements in the merged array. It prompts the user to enter two arrays, merges them into a third array, and checks for duplicate values. The program efficiently displays duplicate elements, making it useful for array operations and duplicate detection.

## How the Program Works
1. **User Input:** The program first asks the user to enter the size and elements of two separate arrays.
2. **Merging Arrays:** A third array is created with a size equal to the sum of the first two arrays. This third array stores elements of both arrays sequentially.
3. **Finding Duplicates:** The program then iterates through the merged array using nested loops to identify duplicate elements.
4. **Displaying Duplicates:** The duplicates are printed as output.

---

## Code Breakdown

### 1. Taking User Input
```java
Scanner s = new Scanner(System.in);
System.out.println("Enter the 1st Array Size");
int size1 = s.nextInt();
int arr1[] = new int[size1];
System.out.println("Enter the 1st Array Elements");
for(int i = 0; i < arr1.length; i++) {
    arr1[i] = s.nextInt();
}
```
- **Scanner:** Used to take input from the user.
- **Array Declaration:** `arr1[]` is created with `size1` elements.
- **Loop:** A `for` loop is used to take `size1` number of elements into `arr1`.

### 2. Taking Second Array Input
```java
System.out.println("Enter the 2nd Array Size");
int size2 = s.nextInt();
int arr2[] = new int[size2];
System.out.println("Enter the 2nd Array Elements");
for(int i = 0; i < arr2.length; i++) {
    arr2[i] = s.nextInt();
}
```
- The same steps as the first array are repeated for the second array.

### 3. Merging Two Arrays
```java
int size3 = arr1.length + arr2.length;
int arr3[] = new int[size3];
for(int i = 0; i < arr3.length; i++) {
    if(i < arr1.length) {
        arr3[i] = arr1[i];
    } else {
        arr3[i] = arr2[i - arr1.length];
    }
}
```
- **Size Calculation:** `size3 = arr1.length + arr2.length` to store both arrays.
- **Merging Logic:**
  - First, elements of `arr1` are copied into `arr3`.
  - Then, elements of `arr2` are copied, adjusting the index using `i - arr1.length`.

### 4. Finding Duplicate Elements
```java
for(int i = 0; i < arr3.length; i++) {
    for(int j = 0; j < i; j++) {
        if(arr3[j] == arr3[i]) {
            System.out.print(arr3[j] + " ");
        }
    }
}
```
- **Nested Loops:**
  - The outer loop runs through `arr3`.
  - The inner loop checks previous elements for duplicates.
- **If Condition:**
  - If an element `arr3[i]` matches any previous element `arr3[j]`, it is printed.

---

## Example Output
```
Enter the 1st Array Size
3
Enter the 1st Array Elements
1 2 3
Enter the 2nd Array Size
3
Enter the 2nd Array Elements
3 2 5
Output: 3 2
```
- `3` and `2` are duplicates in the merged array.

---

## Improvements & Considerations
1. **Optimize Duplicate Search:** The current method has O(n²) complexity. Using HashSets can improve efficiency.
2. **Avoid Reprinting Duplicates:** Store duplicates in a list before printing.
3. **Handle Edge Cases:**
   - Empty arrays
   - Arrays with all unique elements
   - Large-sized arrays

## How to Run the Program
1. Copy the Java code into a file named `Duplicate_in_Merged_Array.java`.
2. Open a terminal or command prompt and navigate to the file location.
3. Compile the program using:
   ```sh
   javac Duplicate_in_Merged_Array.java
   ```
4. Run the program using:
   ```sh
   java duplicateElemtOperations.Duplicate_in_Merged_Array
   ```
5. Enter the array sizes and elements as prompted.

---

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Merged_Array_Duplicates.git
```
