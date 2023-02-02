## Sock Merchant ( Sales by Match ) - Warmup challenge.

There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.


# Discussion

This is a task of counting matching pairs. So for [a,a,a], it is counted as 1 pair, [a,a] and one unpaired [a]. 

First I thought about counting up unique elements, and dividing them by 2 for finding pairs. 

_Algo_

* Traverse through pile array : _example [a,b,c,a,b,a,d]_
* Count unique elements: (a,b,c,d).
* Count occurrence of each unique element: [(a=>3), (b=>2), (c=>1), (d=>1)]
* Divide them by two to find number of pairs (if stored as integer, 3%2=1, and reminder will be ignored). 
* [(Pa=>1), (Pb=>1), (Pc=>0), (Pd=>0)]
* Total complete pairs are 2.  

Since we are dealing with key->value pairs, While Array is also a key-value pair but we need to manipulate both keys and values. Manipulating keys in array, even in associative array, can cause issues in most common programming languages. Also most programming languages needs array to be declared with a fixed size, Therefore, a Hash data structure is an obvious choice.  
A `Collection` type, like a `List` is also a suitable choice but under the hood, most languages implements collections with hashes.  

>**As long as we have a way to add, remove, lookup elements in DS, it is great.**

Most programming languages provides two implementations of Hash data-structures. HashMaps and HashSet. Primary difference is HashMaps enforces a unique keys but can accept duplicate values, while for HashSet, both keys, and values must be unique.  
If using HashMaps, it is better to set elements as keys, and their occurrence count as values. Then you can traverse it and count the number of pairs.  
HashSets are easier as they will let you know if element you are trying to insert is already there or not. 

For my implementation, my approach is using HashSets.

_Algo_
- Create an empty HashSet.
- Loop through the Array of SockPiles
- if sock is not found in the set, add it to the set and move to next element.
- if sock is found in the set, remove it from set, increment the pair counter, and then move to next element. 


_N.B._
* Kotlin, Java, C#, and most languages provide a high level HashMap and HashSet class with add(), remove(), contains() function. 
* PHP Arrays are implemented with ordered maps, so in theory, you can use arrays for this. PHP does have library for DataStructures but as of now (php 8.4), _it is not part of core, you need to use composer to install library or use pecl in install extension_. Or you can implement it yourself quickly using Arrays.
* Javascript has a Set() Object which only stores unique values. It is case sensitive, and a recent addition, thus require modern browser, deno or node>=10. It is not fully implemented in IE. 
