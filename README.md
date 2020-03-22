# Leetcode
My practice on Leetcode  
Create a index for each question that I've been solved.



## Notes
0. Ask questions
1. Example (Datatype, max value, overflow)
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
|136 | [Single Number][136]| Hash Table, Bit Manipulation | Easy | [Algorithms 136][136q]| Bit Manipulation |06/24/2019|
|268 | [Missing Number][268]| Array, Math, Bit Manipulation | Easy | [Algorithms 268][268q]| Math ,Bit Manipulation |06/24/2019|
|137 | [Single Number II][137]| Bit Manipulation | Medium | [Algorithms 137][137q]| Bit Manipulation |06/25/2019|
|202 | [Happy Number][202]| Hash Table, Math | Easy | [Algorithms 202][202q]| how to break the loop |06/25/2019|
|204 | [Count Primes][204]| Hash Table, Math | Easy | [Algorithms 204][204q]| Sieve of Eratosthenes |06/26/2019|
|263 | [Ugly Number][263]| Math | Easy | [Algorithms 263][263q]| prime factors division |06/26/2019|
|205 | [Isomorphic Strings][205]| Hash Table | Easy | [Algorithms 205][205q]| Integer autoboxing, caching |06/27/2019|
|242 | [Valid Anagram][242]| Hash Table, Sort | Easy | [Algorithms 242][242q]| Array, map check equality |06/27/2019|
|290 | [Word Pattern][290]| Hash Table | Easy | [Algorithms 290][290q]| try to put everything into one HashMap |06/28/2019|
|020 | [Valid Parentheses][020]| String, Stack | Easy | [Algorithms 020][020q]| Stack |06/28/2019|
|496 | [Next Greater Element I][496]| Stack | Easy | [Algorithms 496][496q]| Stack |07/02/2019|
|682 | [Baseball Game][682]| Stack | Easy | [Algorithms 682][682q]| Stack |07/03/2019|
|349 | [Intersection of Two Arrays][349]| Hash table, Two pointer, sort | Easy | [Algorithms 349][349q]| set contains perform O(1) |07/04/2019|
|599 | [Minimum Index Sum of Two Lists][599]| Hash table | Easy | [Algorithms 599][599q]| list toArray() |07/05/2019|
|387 | [First Unique Character in a String][387]| Hash table, String | Easy | [Algorithms 387][387q]| getOrDefault() |07/05/2019|
|350 | [Intersection of Two Arrays II][350]| Hash table, Two pointer, sort | Easy | [Algorithms 350][350q]| sorted use two pointer |07/06/2019|
|049 | [Group Anagrams][049]| Hash table, String | Medium | [Algorithms 049][049q]| anagrams, sorted char array equals |07/07/2019|
|144 | [Binary Tree Preorder Traversal][144]| Tree, Stack | Medium | [Algorithms 144][144q]| user helper function |07/08/2019|
|094 | [Binary Tree Inorder Traversal][094]| Tree, Stack, HashTable | Medium | [Algorithms 094][094q]| Recursive, iterative, Morris Traversal |07/10/2019|
|145 | [Binary Tree Postorder Traversal][145]| Tree, Stack | Hard | [Algorithms 145][145q]| reverse the process of preorder traversal, using link.add(0, val) |07/11/2019|
|002 | [Add Two Numbers][002]| LinkedList, Math | medium | [Algorithms 002][002q]| calculate numbers should care the data type |07/11/2019|
|104 | [Maximum Depth of Binary Tree][104]| Tree, DFS | Easy | [Algorithms 104][104q]| Recursively, Top-down, Bottom-up |07/16/2019|
|101 | [Symmetric Tree][101]| Tree, DFS, BFS | Easy | [Algorithms 101][101q]| use two node compare left and right at the same time |07/16/2019|
|112 | [Path Sum][112]| Tree, DFS | Easy | [Algorithms 112][112q]| DPS, recursive |07/17/2019|
|707 | [Design Linked List][707]| LinkedList, Design | Easy | [Algorithms 707][707q]| edge case |07/22/2019|
|141 | [Linked List Cycle][141]| LinkedList, Two pointers | Easy | [Algorithms 141][141q]| fast and slow pointers detect cycle |07/22/2019|
|142 | [Linked List Cycle II][142]| LinkedList, Two pointers | medium | [Algorithms 142][142q]| when meet move to the begining, move same length |07/23/2019|
|160 | [Intersection of Two Linked Lists][160]| LinkedList, Two pointers | Easy | [Algorithms 160][160q]| align the list or move twice iteration |07/24/2019|
|019 | [Remove Nth Node From End of List][019]| LinkedList, Two pointers | Medium | [Algorithms 019][019q]| add a dummy node before the head to make the head case easier |07/24/2019|
|206 | [Reverse Linked List][206]| LinkedList | Easy | [Algorithms 206][206q]| Recursive, go to the deepest and return piece by piece |07/26/2019|
|203 | [Remove Linked List Elements][203]| LinkedList | Easy | [Algorithms 203][203q]| Recursive, draw a map to help |07/27/2019|
|328 | [Odd Even Linked List][328]| LinkedList | Medium | [Algorithms 328][328q]| use two list |07/27/2019|
|234 | [Palindrome Linked List][234]| LinkedList | Easy | [Algorithms 234][234q]| Use slow and fast pointer to get the middle point |07/27/2019|
|622 | [Design Circular Queue][622]| Design, Queue | Medium | [Algorithms 622][622q]| ArrayList.add(index, val) will shift if the target index has value, use ArrayList.set(ind,val) to solve |07/29/2019|
|994 | [Rotting Oranges][994]| BFS | Easy | [Algorithms 994][994q]| BFS apply in a grid |07/31/2019|
|690 | [Employee Importance][690]| Hash Table, DFS, BFS | Easy | [Algorithms 690][690q]| BFS solving inherited problem |07/31/2019|
|155 | [Min Stack][155]| Stack, Design | Easy | [Algorithms 155][155q]| use a node which has min value |07/31/2019|
|739 | [Daily Temperatures][739]| Hash Table, Stack | Medium | [Algorithms 739][739q]| stack store the index |08/01/2019|
|150 | [Evaluate Reverse Polish Notation][150]| Stack | Medium | [Algorithms 150][150q]| convert between int and String |08/01/2019|
|200 | [Number of Islands][200]| DFS, BFS, Union Find | Medium | [Algorithms 200][200q]| use a marker to achieve the search |08/01/2019|
|589 | [N-ary Tree Preorder Traversal][589]| Tree | Easy | [Algorithms 589][589q]| Preorder use Stack |08/02/2019|
|590 | [N-ary Tree Postorder Traversal][590]| Tree | Easy | [Algorithms 590][590q]| Reverse the Preorder list |08/02/2019|
|429 | [N-ary Tree Level Order Traversal][429]| Tree, BFS | Easy | [Algorithms 429][429q]| BFS == Queue |08/02/2019|
|559 | [Maximum Depth of N-ary Tree][559]| Tree, BFS, DFS | Easy | [Algorithms 559][559q]| Tree problem, using Top-down/ Bottom-up |08/02/2019|
|704 | [Binary Search][704]| Binary Search | Easy | [Algorithms 704][704q]| while(left <= right) |08/04/2019|
|069 | [Sqrt(x)][069]| Math, Binary Search | Easy | [Algorithms 069][069q]| mid = (temp + x/temp)/2 |08/05/2019|
|374 | [Guess Number Higher or Lower][374]| Binary Search | Easy | [Algorithms 374][374q]| Ternary search |08/05/2019|
|278 | [First Bad Version][278]| Binary Search | Easy | [Algorithms 278][278q]| Binary search template 2, get the first ()number |08/06/2019|
|162 | [Find Peak Element][162]| Binary Search, Array | Medium | [Algorithms 162][162q]| think of the whole picture |08/06/2019|
|034 | [Find First and Last Position of Element in Sorted Array][034]| Binary Search, Array | Medium | [Algorithms 034][034q]| search two point, can use twice Binary Search |08/08/2019|
|098 | [Validate Binary Search Tree][098]| Tree, DFS | Medium | [Algorithms 098][098q]| draw a tree map with the range, think of inorder traversal |08/11/2019|
|173 | [Binary Search Tree Iterator][173]| Stack, Tree, Design | Medium | [Algorithms 173][173q]| don't forget the recursive way to do inorder traversal, it's easy |08/13/2019|
|048 | [Rotate Image][048]| Array | Medium | [Algorithms 048][048q]| be careful of the index|08/18/2019|
|784 | [Letter Case Permutation][784]| Backtracking, Bit Manipulation | Easy | [Algorithms 784][784q]| draw the tree |08/24/2019|
|046 | [Permutations][046]| Backtracking | Medium | [Algorithms 046][046q]| use boolean array to track visited elements |08/28/2019|
|047 | [Permutations II][047]| Backtracking | Medium | [Algorithms 047][047q]| sort first and then avoid duplicate |08/28/2019|
|039 | [Combination Sum][039]| Array, Backtracking | Medium | [Algorithms 039][039q]| use i = startIndex to avoid duplicate |08/29/2019|
|040 | [Combination Sum II][040]| Array, Backtracking | Medium | [Algorithms 040][040q]| sort and use i > currIndex to avoid duplicate |08/29/2019|
|078 | [Subsets][078]| Array, Backtracking, Bit Manipulation | Medium | [Algorithms 078][078q]| dfs draw a tree |08/29/2019|
|013 | [Roman to Integer][013]| Math, String | Easy | [Algorithms 013][013q]| warmup |11/26/2019|
|0028| [Implement strStr()][0028]| Two pointers, String | Easy | [Algorithms 0028][0028q]| Arise | 03/21/2020|



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
12. The prefix `0b` usually means "binary". e.g. `0b111 => 7`
13. [Bit Manipulation review][r002]
14. `HashSet.iterator().next()`, `HashMap.keySet().iterator().next()`
15. Math approach
16. `Sieve of Eratosthenes` algorithm get all the prime number, time complexity, O(nloglogn)
17. `Integer.valueOf(i)`, This method will always cache values in the range -128 to 127, Thus, the reference are the same. 
18. Autoboxing, `int => Integer`; unboxing, `Integer => int`.
19. `Map`, use `getOrDefault(key, defaultValue)` instead of checking `containsKey()`
20. Array check equality `Arrays.equals(arr1, arr2)`; Map check equality `map1.equals(map2)`
21. For comparing String use `equals()` instead of  `==` equality operator.
22. use `==` to compare primitive e.g. boolean, int, char etc, while use `equals()` to compare objects in Java.
23. `==` return true if two reference are of same object. Result of `equals()` method depends on overridden implementation.
24. Stack to keep track the next large element.
25. `Switch(){ case "C": break; default:}`
26. `res.toArray(new String[res.size()])`
27. If a array is larger than the main memory, use `external sort`, and `streaming`
28. If a array is sorted, using `two pointer search` usually better.
29. Two strings are anagrams if and only if their `sorted strings` are equal.
30. Return a new empty list, `return new ArrayList();` 
31. Binary Tree Preorder Traversal  => `current > left > right`
32. Create helper function
33. Always add to the head of a list, `List.add(0, val)`
34. Pointer
35. Using `Queue` to do `BFS(Level Order Traversal)`, `Stack` to do `DFS(Preorder/inorder/postorder Traversal)`
36. Cycle detection Floyd's Cycle Detection Algorithm (Two pointers)
37. Two pointers, align the list, or make two iterations.
38. LinkedList alway watch the head and tail case
39. LinkedList add `one dummy node before the head node` can make the head case easier.
40. Recursive, call the other result without me, go to the deepest and then start the return.
41. Slow and fast pointer to get the middle point.
42. `ArrayList.add(index, val)` will shift if the target index has value, use `ArrayList.set(ind,val)` to solve
43. use a node which has min value to create the `Min Stack`
44. Stack can remember 
45. Change the value in a grid to achieve the DFS or BFS
46. Tree problem use Recursive, `top-down`, `bottom-up`
47. int overflow control in Binary Search, `mid = left + (right - left)/2;`
48. Bit manipulate, `a>>1 == a/2`
49. `HashSet<List<Integer>>` to remove duplicate List works


## Ask Questions

1. How big is the input number? smaller than 32 bits(integer), int(-2^31, 2^31-1)?
2. Does the linkedlist contains cycle or intersection?




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
[136q]: https://leetcode.com/problems/single-number/
[268q]: https://leetcode.com/problems/missing-number/
[137q]: https://leetcode.com/problems/single-number-ii/
[202q]: https://leetcode.com/problems/happy-number/
[204q]: https://leetcode.com/problems/count-primes/
[263q]: https://leetcode.com/problems/ugly-number/
[205q]: https://leetcode.com/problems/isomorphic-strings/
[242q]: https://leetcode.com/problems/valid-anagram/
[290q]: https://leetcode.com/problems/word-pattern/
[020q]: https://leetcode.com/problems/valid-parentheses/
[496q]: https://leetcode.com/problems/next-greater-element-i/
[682q]: https://leetcode.com/problems/baseball-game/
[349q]: https://leetcode.com/problems/intersection-of-two-arrays/
[599q]: https://leetcode.com/problems/minimum-index-sum-of-two-lists/
[387q]: https://leetcode.com/problems/first-unique-character-in-a-string/
[350q]: https://leetcode.com/problems/intersection-of-two-arrays-ii/
[049q]: https://leetcode.com/problems/group-anagrams/
[144q]: https://leetcode.com/problems/binary-tree-preorder-traversal/
[094q]: https://leetcode.com/problems/binary-tree-inorder-traversal/solution/
[145q]: https://leetcode.com/problems/binary-tree-postorder-traversal/
[002q]: https://leetcode.com/problems/add-two-numbers/
[104q]: https://leetcode.com/problems/maximum-depth-of-binary-tree/
[101q]: https://leetcode.com/problems/symmetric-tree/
[112q]: https://leetcode.com/problems/path-sum/
[707q]: https://leetcode.com/problems/design-linked-list/
[141q]: https://leetcode.com/problems/linked-list-cycle/
[142q]: https://leetcode.com/problems/linked-list-cycle-ii/
[160q]: https://leetcode.com/problems/intersection-of-two-linked-lists/
[019q]: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
[206q]: https://leetcode.com/problems/reverse-linked-list/
[203q]: https://leetcode.com/problems/remove-linked-list-elements/
[328q]: https://leetcode.com/problems/odd-even-linked-list/
[234q]: https://leetcode.com/problems/palindrome-linked-list/
[622q]: https://leetcode.com/problems/design-circular-queue/
[994q]: https://leetcode.com/problems/rotting-oranges/
[690q]: https://leetcode.com/problems/employee-importance/
[155q]: https://leetcode.com/problems/min-stack/
[739q]: https://leetcode.com/problems/daily-temperatures/
[150q]: https://leetcode.com/problems/evaluate-reverse-polish-notation/
[200q]: https://leetcode.com/problems/number-of-islands/
[589q]: https://leetcode.com/problems/n-ary-tree-preorder-traversal/
[590q]: https://leetcode.com/problems/n-ary-tree-postorder-traversal/
[429q]: https://leetcode.com/problems/n-ary-tree-level-order-traversal/
[559q]: https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
[704q]: https://leetcode.com/problems/binary-search/
[069q]: https://leetcode.com/problems/sqrtx/
[374q]: https://leetcode.com/problems/guess-number-higher-or-lower/
[278q]: https://leetcode.com/problems/first-bad-version/
[162q]: https://leetcode.com/problems/find-peak-element/
[034q]: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
[098q]: https://leetcode.com/problems/validate-binary-search-tree/
[173q]: https://leetcode.com/problems/binary-search-tree-iterator/
[048q]: https://leetcode.com/problems/rotate-image/
[784q]: https://leetcode.com/problems/letter-case-permutation/
[046q]: https://leetcode.com/problems/permutations/
[047q]: https://leetcode.com/problems/permutations-ii/
[039q]: https://leetcode.com/problems/combination-sum/
[040q]: https://leetcode.com/problems/combination-sum-ii/
[078q]: https://leetcode.com/problems/subsets/
[013q]: https://leetcode.com/problems/roman-to-integer/
[0028q]: https://leetcode.com/problems/implement-strstr/












<!--
Source code reference:
-->
[724]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_724_Find_Pivot_Index/Solution.java
[747]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_747_Largest_Number_At_Least_Twice_of_Others/Solution.java
[001]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_001_TwoSum/Solution.java
[167]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_167_TwoSumII/Solution.java
[007]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_007_Reverse_Integer/Solution.java
[190]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_190_Reverse_Bits/Solution.java
[009]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_009_Palindrome_Number/Solution.java
[344]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/no_344_Reverse_String/Solution.java
[027]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_27_Remove_Element/MainClass.java
[412]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_412_Fizz_Buzz/MainClass.java
[026]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_26_Remove_Duplicates_from_Sorted_Array/MainClass.java
[088]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_088_Merge_Sorted_Array/MainClass.java
[118]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_118_Pascals_Triangle/MainClass.java
[119]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_119_Pascals_Triangle_II/MainClass.java
[189]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_189_Rotate_Array/MainClass.java
[217]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_217_Contains_Duplicate/MainClass.java
[219]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_219_Contains_Duplicate_II/MainClass.java
[136]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_136_Single_Number/MainClass.java
[268]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_268_Missing_Number/MainClass.java
[137]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_137_Single_Number_II/MainClass.java
[202]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_202_Happy_Number/MainClass.java
[204]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_204_Count_Primes/MainClass.java
[263]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_263_Ugly_Number/MainClass.java
[205]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_205_Isomorphic_Strings/MainClass.java
[242]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_242_Valid_Anagram/MainClass.java
[290]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_290_Word_Pattern/MainClass.java
[020]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_20_Valid_Parentheses/MainClass.java
[496]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_496_Next_Greater_Element_I/MainClass.java
[682]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_682_Baseball_Game/MainClass.java
[349]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_349_Intersection_of_Two_Arrays/MainClass.java
[599]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_599_Minimum_Index_Sum_of_Two_Lists/MainClass.java
[387]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_387_First_Unique_Character_in_a_String/MainClass.java
[350]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_350_Intersection_of_Two_Arrays_II/MainClass.java
[049]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_49_Group_Anagrams/MainClass.java
[144]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_144_Binary_Tree_Preorder_Traversal/MainClass.java
[094]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_094_Binary_Tree_Inorder_Traversal/MainClass.java
[145]: 
https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_145_Binary_Tree_Postorder_Traversal/MainClass.java
[002]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_002_Add_Two_Numbers/MainClass.java
[104]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_104_Maximum_Depth_of_Binary_Tree/MainClass.java
[101]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_101_Symmetric_Tree/MainClass.java
[112]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_112_Path_Sum/MainClass.java
[707]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_707_Design_Linked_List/MyLinkedList.java
[141]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_141_Linked_List_Cycle/Solution.java
[142]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_142_Linked_List_Cycle_II/Solution.java
[160]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_160_Intersection_of_Two_Linked_Lists/Solution.java
[019]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_019_Remove_Nth_Node_From_End_of_List/MainClass.java
[206]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_206_Reverse_Linked_List/MainClass.java
[203]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_203_Remove_Linked_List_Elements/MainClass.java
[328]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_328_Odd_Even_Linked_List/MainClass.java
[234]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_234_Palindrome_Linked_List/MainClass.java
[622]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_622_Design_Circular_Queue/MyCircularQueue.java
[994]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_994_Rotting_Oranges/MainClass.java
[690]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_690_Employee_Importance/MainClass.java
[155]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_155_Min_Stack/MinStack.java
[739]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_739_Daily_Temperatures/MainClass.java
[150]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_150_Evaluate_Reverse_Polish_Notation/MainClass.java
[200]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_200_Number_of_Islands/Solution.java
[589]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_589_N_ary_Tree_Preorder_Traversal/Solution.java
[590]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_590_N_ary_Tree_Postorder_Traversal/Solution.java
[429]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_429_N_ary_Tree_Level_Order_Traversal/Solution.java
[559]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_559_Maximum_Depth_of_N_ary_Tree/Solution.java
[704]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_704_Binary_Search/MainClass.java
[069]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_069_Sqrt_x/MainClass.java
[374]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_374_Guess_Number_Higher_or_Lower/MainClass.java
[278]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_278_First_Bad_Version/Solution.java
[162]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_162_Find_Peak_Element/MainClass.java
[034]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_034_Find_First_and_Last_Position_of_Element_in_Sorted_Array/MainClass.java
[098]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_098_Validate_Binary_Search_Tree/MainClass.java
[173]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_173_Binary_Search_Tree_Iterator/MainClass.java
[048]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_048_Rotate_Image/MainClass.java
[784]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_784_Letter_Case_Permutation/MainClass.java
[046]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_046_Permutations/MainClass.java
[047]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_047_Permutations_II/MainClass.java
[039]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_039_Combination_Sum/MainClass.java
[040]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_040_Combination_Sum_II/MainClass.java
[078]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_078_Subsets/MainClass.java
[013]: https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_013_Roman_to_Integer/MainClass.java
[0028]:https://github.com/dailiang18bb/Leetcode/blob/master/src/algorithm/No_0028_Implement_strStr/MainClass.java


<!--
Topic review reference:
-->
[r001]: https://www.google.com/search?q=java+arraylist+vs+linkedlist&oq=java+arraylist+vs+linkedlist&aqs=chrome..69i57.12562j0j1&sourceid=chrome&ie=UTF-8
[r002]: https://github.com/dailiang18bb/Leetcode/blob/master/docs/bitwise%20operation.md
