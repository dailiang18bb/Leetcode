# Leetcode
My practice on Leetcode  
Create a index for each question that I've been solved.



## Notes
0. Ask questions
1. Example
2. Edge case
3. Algorithm (Time Complexity, Space Complexity)
4. Code
5. Go through example and edge case
6. Optimization (Trade off, using different data structure)


## Questions Table
|#   | Title                  | Tag             | Level        | Question Link        | Key Point   | Dates     |
|:---| :----------------------| :-------------- | :------------| :------------------- | :---------- | :-------- |
|724 | [Find Pivot Index][724]              | Array                         | Easy       | [Algorithms 724][724q] |       |  |
|747 | [Largest Number At Least Twice of Others][747]| Array                | Easy       | [Algorithms 747][747q] |      |  |
|001 | [Two Sum][001]  | Array, HashTable | Easy | [Algorithms 001][001q]| Using HashMap to trade space for time |  |
|167 | [Two Sum II - Input array is sorted][167]| Array, Two Pointers, Binary Search| Easy | [Algorithms 167][167q]| Using Two pointers search|  |
|007 | [Reverse Integer][007]| Math | Easy | [Algorithms 007][007q]| pop and push idea, overflow check|  |
|190 | [Reverse Bits][190]| Bit Manipulation|Easy | [Algorithms 190][190q]| bit-wise opeartor|  |
|009 | [Palindrome Number][009]| Math | Easy | [Algorithms 009][009q]| check half , two pointers search|  |
|344 | [Reverse String][344]| Two Pointers, String | Easy | [Algorithms 344][344q]| two pointers search, in-place sort|  |
|027 | [Remove Element][027]| Two Pointers, Array | Easy | [Algorithms 027][027q]| two pointers search, in-place sort|06/11/2019|
|412 | [Fizz Buzz][412]| LinkedList | Easy | [Algorithms 412][412q]| LinkedList vs ArrayList|06/12/2019|
|026 | [Remove Duplicates from Sorted Array][026]| Array | Easy | [Algorithms 026][026q]| sorted array two pointers(slow, fast)|06/12/2019|
|088 | [Merge Sorted Array][088]| Array | Easy | [Algorithms 088][088q]| three pointers |06/15/2019|
|118 | [Pascal's Triangle][088]| Array | Easy | [Algorithms 118][118q]| DP |06/16/2019|
|119 | [Pascal's Triangle II][088]| Array | Easy | [Algorithms 119][119q]| List.set(), backward search |06/16/2019|
|189 | [Rotate Array][189]| Array | Easy | [Algorithms 189][189q]| Cyclic Replacements/ Reverse |06/17/2019|
|217 | [Contains Duplicate][217]| Array, Hash Table | Easy | [Algorithms 217][217q]| check duplicate use hashset |06/17/2019|
|219 | [Contains Duplicate II][219]| Array, Hash Table | Easy | [Algorithms 219][219q]| Map put return value |06/18/2019|








## Topic Review
1. [ArrayList vs LinkedList][r001]
2. Two pointer search, left/right, slow/fast, for/while
3. Java `Arrays.sort()` time complexity is `nlog(n)`
4. Java array copy, `System.arraycopy(arr,0,des,0,length)`, `arr.clone()`
5. List.set()
6. ArrayList `add(Index, E)` worst case cost `O(n)`, LinkedList `add(Index, E)` always cost `constant` time.
7. Rotate Array, extra array/ Cyclic Replacements/ Reverse
8. Check duplicate use `Set`
9. `Hashtable.put(K,V)` return `null` when the key not duplicate, return previous value when the key is duplicate.
10. An Object(Integer, String) can hold `null`, a primitive type cannot hold `null`
11. When solving `absolute difference ...`, using `Math.abs()`


## Ask Questions





<!--
Question Link reference:
-->

[724q]: https://leetcode.com/problems/find-pivot-index/description/
[747q]: https://leetcode.com/problems/largest-number-at-least-twice-of-others/description/
[001q]: https://leetcode.com/problems/two-sum/description/
[167q]: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
[007q]: https://leetcode.com/problems/reverse-integer/description/
[190q]: https://leetcode.com/problems/reverse-bits/description/
[009q]: https://leetcode.com/problems/palindrome-number/description/
[344q]: https://leetcode.com/problems/reverse-string/
[027q]: https://leetcode.com/problems/remove-element/
[412q]: https://leetcode.com/problems/fizz-buzz/
[026q]: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
[088q]: https://leetcode.com/problems/merge-sorted-array/
[118q]: https://leetcode.com/problems/pascals-triangle/
[119q]: https://leetcode.com/problems/pascals-triangle-ii/
[189q]: https://leetcode.com/problems/rotate-array/
[217q]: https://leetcode.com/problems/contains-duplicate/
[219q]: https://leetcode.com/problems/contains-duplicate-ii/




<!--
Source code reference:
-->
[724]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_724_Find_Pivot_Index/Solution.java
[747]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_747_Largest_Number_At_Least_Twice_of_Others/Solution.java
[001]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_1_TwoSum/Solution.java
[167]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_167_TwoSumII/Solution.java
[007]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_7_Reverse_Integer/Solution.java
[190]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_190_Reverse_Bits/Solution.java
[009]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_9_Palindrome_Number/Solution.java
[344]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/no_344_Reverse_String/Solution.java
[027]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_27_Remove_Element/MainClass.java
[412]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_412_Fizz_Buzz/MainClass.java
[026]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_26_Remove_Duplicates_from_Sorted_Array/MainClass.java
[088]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_88_Merge_Sorted_Array/MainClass.java
[118]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_118_Pascals_Triangle/MainClass.java
[119]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_119_Pascals_Triangle_II/MainClass.java
[189]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_189_Rotate_Array/MainClass.java
[217]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_217_Contains_Duplicate/MainClass.java
[219]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_219_Contains_Duplicate_II/MainClass.java



<!--
Topic review reference:
-->
[r001]: https://www.google.com/search?q=java+arraylist+vs+linkedlist&oq=java+arraylist+vs+linkedlist&aqs=chrome..69i57.12562j0j1&sourceid=chrome&ie=UTF-8
