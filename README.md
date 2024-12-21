# Introduction to Java Programming

## Types of Error in Java
- Syntax Errors
- Runtime Errors
- Logic Errors

## Naming Conventions
- Lowercase for variables and methods. Examples: radius, area, myVariableName
- Capitalize the first letter of each word in a class name. Examples: CalculateArea, System
- Capitalize every letter in a constant, and use underscore between words. Examples: PI, MAX_VALUE

## Numeric Data Types and Ranges
| Name   | Range                                                                                                        | Storage Size        |
|--------|--------------------------------------------------------------------------------------------------------------|---------------------|
| byte   | -2<sup>7</sup> to 2<sup>7</sup> - 1 (-128 to 127)                                                            | 8-bit signed        |
| short  | -2<sup>15</sup> to 2<sup>15</sup> - 1 (-32768 to 32767)                                                      | 16-bit signed       |
| int    | -2<sup>31</sup> to 2<sup>31</sup> - 1 (-2147483648 to 2147483647)                                            | 32-bit signed       |
| long   | -2<sup>63</sup> to 2<sup>63</sup> - 1 <br/> (i.e., -9223372036854775808 to 9223372036854775807)              | 64-bit signed       |
| float  | Negative range: -3.4028235E+38 to -1.4E-45<br>Positive range: 1.4E-45 to 3.4028235E+38                       | 32-bit IEEE 754     |
| double | Negative range: -1.7976931348623157E+308 to -4.9E-324<br>Positive range: 4.9E-324 to 1.7976931348623157E+308 | 64-bit IEEE 754     |

## Methods for Scanner Objects
| Method       | Description                                   |
|--------------|-----------------------------------------------|
| nextByte()   | Reads an integer of the byte type.            |
| nextShort()  | Reads an integer of the short type.           |
| nextInt()    | Reads an integer of the int type.             |
| nextLong()   | Reads an integer of the long type.            |
| nextFloat()  | Reads a number of the float type.             |
| nextDouble() | Reads a number of the double type.            |

