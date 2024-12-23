# Chapter 4 Mathematical Functions, Characters, and Strings

## Common Mathematical Functions

### Trigonometric Methods
| Method                   | Description                                                                 |
|--------------------------|-----------------------------------------------------------------------------|
| **`sin(radians)`**       | Returns the trigonometric sine of an angle in radians.                      |
| **`cos(radians)`**       | Returns the trigonometric cosine of an angle in radians.                    |
| **`tan(radians)`**       | Returns the trigonometric tangent of an angle in radians.                   |
| **`toRadians(degree)`**  | Converts an angle from degrees to radians.                                  |
| **`toDegrees(radians)`** | Converts an angle from radians to degrees.                                  |
| **`asin(a)`**            | Returns the angle in radians for the inverse of sine.                       |
| **`acos(a)`**            | Returns the angle in radians for the inverse of cosine.                     |
| **`atan(a)`**            | Returns the angle in radians for the inverse of tangent.                    |

### Exponent Methods
| Method               | Description                                                                 |
|----------------------|-----------------------------------------------------------------------------|
| **`exp(x)`**         | Returns \(e^x\), where \(e\) is the base of the natural logarithm.          |
| **`log(x)`**         | Returns the natural logarithm of \(x\), \(ln(x) = log_e(x)\).               |
| **`log10(x)`**       | Returns the base 10 logarithm of \(x\), \(log_{10}(x)\).                    |
| **`pow(a, b)`**      | Returns \(a^b\), where \(a\) is raised to the power of \(b\).               |
| **`sqrt(x)`**        | Returns the square root of \(x\) (\(\sqrt{x}\)) for \(x \geq 0\).           |

### Rounding Methods
| Method               | Description                                                                                                                |
|----------------------|----------------------------------------------------------------------------------------------------------------------------|
| **`ceil(x)`**        | Rounds \(x\) up to its nearest integer. This integer is returned as a `double`.                                            |
| **`floor(x)`**       | Rounds \(x\) down to its nearest integer. This integer is returned as a `double`.                                          |
| **`rint(x)`**        | Rounds \(x\) to its nearest integer. If \(x\) is equally close to two integers, the even one is returned as a `double`.    |
| **`round(x)`**       | Returns \( (int) Math.floor(x + 0.5) \) if \(x\) is a `float` and \( (long) Math.floor(x + 0.5) \) if \(x\) is a `double`. |

### min, max, and abs Methods

### Random Method

### Unicode and ASCII Code
| Characters     | Code Value (Decimal)   | Unicode Value        |
|----------------|------------------------|----------------------|
| `'0'` to `'9'` | 48 to 57               | `\u0030` to `\u0039` |
| `'A'` to `'Z'` | 65 to 90               | `\u0041` to `\u005A` |
| `'a'` to `'z'` | 97 to 122              | `\u0061` to `\u007A` |

### Escape Sequences
| Escape Sequence | Name            | Unicode Code | Decimal Value |
|-----------------|-----------------|--------------|---------------|
| `\b`            | Backspace       | `\u0008`     | 8             |
| `\t`            | Tab             | `\u0009`     | 9             |
| `\n`            | Linefeed        | `\u000A`     | 10            |
| `\f`            | Formfeed        | `\u000C`     | 12            |
| `\r`            | Carriage Return | `\u000D`     | 13            |
| `\\`            | Backslash       | `\u005C`     | 92            |
| `\"`            | Double Quote    | `\u0022`     | 34            |

### Methods in the Character Class
| Method                    | Description                                                                   |
|---------------------------|-------------------------------------------------------------------------------|
| **`isDigit(ch)`**         | Returns `true` if the specified character is a digit.                         |
| **`isLetter(ch)`**        | Returns `true` if the specified character is a letter.                        |
| **`isLetterOrDigit(ch)`** | Returns `true` if the specified character is a letter or a digit.             |
| **`isLowerCase(ch)`**     | Returns `true` if the specified character is a lowercase letter.              |
| **`isUpperCase(ch)`**     | Returns `true` if the specified character is an uppercase letter.             |
| **`toLowerCase(ch)`**     | Returns the lowercase of the specified character.                             |
| **`toUpperCase(ch)`**     | Returns the uppercase of the specified character.                             |

## String is known as reference type

### Methods for String Objects 
| Method                   | Description                                                                  |
|--------------------------|------------------------------------------------------------------------------|
| **`length()`**           | Returns the number of characters in this string.                             |
| **`charAt(index)`**      | Returns the character at the specified index from this string.               |
| **`concat(s1)`**         | Returns a new string that concatenates this string with string `s1`.         |
| **`toUpperCase()`**      | Returns a new string with all letters in uppercase.                          |
| **`toLowerCase()`**      | Returns a new string with all letters in lowercase.                          |
| **`trim()`**             | Returns a new string with whitespace characters trimmed on both sides.       |

### Comparison Methods for String Objects
| Method                          | Description                                                                                                                                       |
|---------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------|
| **`equals(s1)`**                | Returns `true` if this string is equal to string `s1`.                                                                                            |
| **`equalsIgnoreCase(s1)`**      | Returns `true` if this string is equal to string `s1`; the comparison is case-insensitive.                                                        |
| **`compareTo(s1)`**             | Returns an integer greater than `0`, equal to `0`, or less than `0` to indicate whether this string is greater than, equal to, or less than `s1`. |
| **`compareToIgnoreCase(s1)`**   | Same as `compareTo`, except that the comparison is case-insensitive.                                                                              |
| **`startsWith(prefix)`**        | Returns `true` if this string starts with the specified `prefix`.                                                                                 |
| **`endsWith(suffix)`**          | Returns `true` if this string ends with the specified `suffix`.                                                                                   |
| **`contains(s1)`**              | Returns `true` if `s1` is a substring in this string.                                                                                             |

### String Class Contains the Methods for Obtaining Substrings
| Method                                      | Description                                                                                                                                                                   |
|---------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **`substring(beginIndex)`**                 | Returns this string’s substring starting from the character at the specified `beginIndex` and extending to the end of the string.                                             |
| **`substring(beginIndex, endIndex)`**       | Returns this string’s substring starting from the character at the specified `beginIndex` and extending to `endIndex - 1`. Note that the character at `endIndex` is excluded. |

### String Class Contains the Methods for Finding Substrings
| Method                                   | Description                                                                                                            |
|------------------------------------------|------------------------------------------------------------------------------------------------------------------------|
| **`indexOf(ch)`**                        | Returns the index of the first occurrence of `ch` in the string. Returns `-1` if not matched.                          |
| **`indexOf(ch, fromIndex)`**             | Returns the index of the first occurrence of `ch` after `fromIndex` in the string. Returns `-1` if not matched.        |
| **`indexOf(s)`**                         | Returns the index of the first occurrence of string `s` in this string. Returns `-1` if not matched.                   |
| **`indexOf(s, fromIndex)`**              | Returns the index of the first occurrence of string `s` after `fromIndex` in this string. Returns `-1` if not matched. |
| **`lastIndexOf(ch)`**                    | Returns the index of the last occurrence of `ch` in the string. Returns `-1` if not matched.                           |
| **`lastIndexOf(ch, fromIndex)`**         | Returns the index of the last occurrence of `ch` before `fromIndex` in this string. Returns `-1` if not matched.       |
| **`lastIndexOf(s)`**                     | Returns the index of the last occurrence of string `s` in this string. Returns `-1` if not matched.                    |
| **`lastIndexOf(s, fromIndex)`**          | Returns the index of the last occurrence of string `s` before `fromIndex`. Returns `-1` if not matched.                |

