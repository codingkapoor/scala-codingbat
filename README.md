# Scala CodingBat
Solutions to CodingBat problems in Scala

## Index

1. [Warmup-I](https://github.com/codingkapoor/scala-coding-bat#warmup-i)
2. [Warmup-II](https://github.com/codingkapoor/scala-coding-bat#warmup-ii)
3. [String-I](https://github.com/codingkapoor/scala-coding-bat/blob/master/README.md#string-i)

## Warmup-I
### [sleepIn](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

```
sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
```

### [monkeyTrouble](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

```
monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false
```

### [sumDouble](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given two int values, return their sum. Unless the two values are the same, then return double their sum.

```
sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8
```

### [diff21](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

```
diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
```

### [parrotTrouble](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.

```
parrotTrouble(true, 6) → true
parrotTrouble(true, 7) → false
parrotTrouble(false, 6) → false
```

### [makes10](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

```
makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true
```

### [nearHundred](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.

```
nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false
```

### [posNeg](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.

```
posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true
```

### [notString](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.

```
notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"
```

### [missingChar](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

```
missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"
```

### [frontBack](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given a string, return a new string where the first and last chars have been exchanged.

```
frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
```

### [front3](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.

```
front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"
```

### [backAround](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.

```
backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"
```

### [or35](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator.

```
or35(3) → true
or35(10) → true
or35(8) → false
```

### [front22](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.

```
front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"
```

### [startHi](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given a string, return true if the string starts with "hi" and false otherwise.

```
startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
```

### [icyHot](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given two temperatures, return true if one is less than 0 and the other is greater than 100.

```
icyHot(120, -1) → true
icyHot(-1, 120) → true
icyHot(2, 120) → false
```

### [in1020](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given 2 int values, return true if either of them is in the range 10..20 inclusive.

```
in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false
```

### [hasTeen](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.

```
hasTeen(13, 20, 10) → true
hasTeen(20, 19, 10) → true
hasTeen(20, 10, 13) → true
```

### [loneTeen](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.

```
loneTeen(13, 99) → true
loneTeen(21, 19) → true
loneTeen(13, 13) → false
```

### [delDel](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.

```
delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
```

### [mixStart](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

```
mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
```

### [startOz](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

```
startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
```

### [intMax](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given three int values, a b c, return the largest.

```
intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3
```

### [close10](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.

```
close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0
```

### [in3050](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.

```
in3050(30, 31) → true
in3050(30, 41) → false
in3050(40, 50) → true
```

### [max1020](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.

```
max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11
```

### [stringE](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Return true if the given string contains between 1 and 3 'e' chars.

```
stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
```

### [lastDigit](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.

```
lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true
```

### [endUp](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.

```
endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"
```

### [everyNth](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupI.scala)
Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.

```
everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg"
```
## Warmup-II
### [stringTimes](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupII.scala)
Given a string and a non-negative int n, return a larger string that is n copies of the original string.

```
stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
```

### [frontTimes](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupII.scala)
Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;

```
frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
```

### [countXX](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupII.scala)
Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

```
countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3
```

### [doubleX](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupII.scala)
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

```
doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
```

### [stringBits](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupII.scala)
Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

```
stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"
```

### [stringSplosion](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupII.scala)
Given a non-empty string like "Code" return a string like "CCoCodCode".

```
stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
```

### [last2](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupII.scala)
Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).

```
last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2
```

### [arrayCount9](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupII.scala)
Given an array of ints, return the number of 9's in the array.

```
arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3
```

### [arrayFront9](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupII.scala)
Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.

```
arrayFront9([1, 2, 9, 3, 4]) → true
arrayFront9([1, 2, 3, 4, 9]) → false
arrayFront9([1, 2, 3, 4, 5]) → false
```

### [array123](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupII.scala)
Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.

```
array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true
```

### [stringMatch](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupII.scala)
Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.

```
stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0
```

### [stringX](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupII.scala)
Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.

```
stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
```

### [altPairs](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupII.scala)
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

```
altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
```

### [stringYak](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupII.scala)
Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.

```
stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"
```

### [array667](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupII.scala)
Given an array of ints, return the number of times that two 6's are next to each other in the array. Also count instances where the second "6" is actually a 7.

```
array667([6, 6, 2]) → 1
array667([6, 6, 2, 6]) → 1
array667([6, 7, 2, 6]) → 1
```

### [noTriples](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupII.scala)
Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.

```
noTriples([1, 1, 2, 2, 1]) → true
noTriples([1, 1, 2, 2, 2, 1]) → false
noTriples([1, 1, 1, 2, 2, 2, 1]) → false
```

### [has271](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/WarmupII.scala)
Given an array of ints, return true if it contains a 2, 7, 1 pattern -- a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.

```
has271([1, 2, 7, 1]) → true
has271([1, 2, 8, 1]) → false
has271([2, 7, 1]) → true
```

## String-I
###[helloName](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

```
helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"
```

###[makeAbba](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".

```
makeAbba("Hi", "Bye") → "HiByeByeHi"
makeAbba("Yo", "Alice") → "YoAliceAliceYo"
makeAbba("What", "Up") → "WhatUpUpWhat"
```

###[makeTags](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".

```
makeTags("i", "Yay") → "<i>Yay</i>"
makeTags("i", "Hello") → "<i>Hello</i>"
makeTags("cite", "Yay") → "<cite>Yay</cite>"
```

###[makeOutWord](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given an "out" string length 4, such as "(())", and a word, return a new string where the word is in the middle of the out string, e.g. "((word))". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.

```
makeOutWord("(())", "Yay") → "((Yay))"
makeOutWord("(())", "WooHoo") → "((WooHoo))"
makeOutWord("[[]]", "word") → "[[word]]"
```

###[extraEnd](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.

```
extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"
```

###[firstTwo](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.

```
firstTwo("Hello") → "He"
firstTwo("abcdefg") → "ab"
firstTwo("ab") → "ab"
```

###[firstHalf](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

```
firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
```

###[withoutEnd](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.

```
withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"
```

###[comboString](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).

```
comboString("Hello", "hi") → "hiHellohi"
comboString("hi", "Hello") → "hiHellohi"
comboString("aaa", "b") → "baaab"
```

###[nonStart](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.

```
nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"
```

###[left2](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.

```
left2("Hello") → "lloHe"
left2("java") → "vaja"
left2("Hi") → "Hi"
```

###[right2](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.

```
right2("Hello") → "loHel"
right2("java") → "vaja"
right2("Hi") → "Hi"
```

###[theEnd](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.

```
theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"
```

###[withouEnd2](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.

```
withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""
```

###[middleTwo](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.

```
middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"
```

###[endsLy](https://github.com/codingkapoor/scala-coding-bat/blob/master/src/main/scala/com/codingkapoor/codingbat/StringI.scala)
Given a string, return true if it ends in "ly".

```
endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false
```
