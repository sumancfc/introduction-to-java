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