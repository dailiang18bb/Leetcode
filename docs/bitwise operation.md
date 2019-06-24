# bitwise operation
In Java

https://blog.csdn.net/hk_john/article/details/70231705  
https://blog.csdn.net/mxiaoyem/article/details/78569782


## Bitwise operators

### NOT `~`
The bitwise NOT, or complement, is a unary operation that performs logical negation on each bit, forming the ones' complement of the given binary value. Bits that are 0 become 1, and those that are 1 become 0. For example:

	NOT 0111  (decimal 7)
	  = 1000  (decimal 8)
	  
	NOT 10101011
	  = 01010100
	  
	  0->1
	  1->0
	  
### AND `&`
A bitwise AND takes two equal-length binary representations and performs the logical AND operation on each pair of the corresponding bits, by multiplying them. Thus, if both bits in the compared position are 1, the bit in the resulting binary representation is 1 (1 × 1 = 1); otherwise, the result is 0 (1 × 0 = 0 and 0 × 0 = 0). For example:

	    0101 (decimal 5)
	AND 0011 (decimal 3)
	  = 0001 (decimal 1)
	  
	    0011 (decimal 3)
	AND 0010 (decimal 2)
	  = 0010 (decimal 2)
	  
	  1 * 1 -> 1
	  1 * 0 -> 0
	  0 * 0 -> 0
	  
### OR `|`
A bitwise OR takes two bit patterns of equal length and performs the logical inclusive OR operation on each pair of corresponding bits. The result in each position is 0 if both bits are 0, while otherwise the result is 1. For example:

	   0101 (decimal 5)
	OR 0011 (decimal 3)
	 = 0111 (decimal 7)
	 
	   0010 (decimal 2)
	OR 1000 (decimal 8)
	 = 1010 (decimal 10)
	 
	 1 + 1 -> 1
	 1 + 0 -> 1
	 0 + 0 -> 0
	 
	 
### XOR `^`
A bitwise XOR takes two bit patterns of equal length and performs the logical exclusive OR operation on each pair of corresponding bits. The result in each position is 1 if only the first bit is 1 or only the second bit is 1, but will be 0 if both are 0 or both are 1. In this we perform the comparison of two bits, being 1 if the two bits are different, and 0 if they are the same. For example:

	    0101 (decimal 5)
	XOR 0011 (decimal 3)
	  = 0110 (decimal 6)
	  
	    0010 (decimal 2)
	XOR 1010 (decimal 10)
	  = 1000 (decimal 8)
	  
	  1 + 1 -> 0
	  1 + 0 -> 1
	  0 + 0 -> 0
	  
	  
## Bit shifts
### Arithmetic shifts `<<` `>>`
* `<<`(left shift) 高位丢弃，低位补0
* `>>`(signed right shift) 对无符号数，高位补0，“有符号”右移位操作符使用“符号扩展”；若符号位正，则在高位插入0；若符号位负。则在高位插入1
* `>>>` (unsigned right shift) “无符号”右移位操作符, 无论正负，都在高位插入0

### Logical right shifts `>>>`






## Assignment

|Operator|   Description |  Example|
| :------| :-------| :--------|
|`|=` | bitwise inclusive OR and assignment operator |   `C |= 2` is same as `C = C | 2` |
|`^=` |  bitwise exclusive OR and assignment operator|   `C ^= 2` is same as `C = C ^ 2` |
|`&=` |  Bitwise AND assignment operator           |    `C &= 2` is same as `C = C & 2` |
|`<<=`|   Left shift AND assignment operator        |   `C <<= 2` is same as `C = C << 2`|
|`>>=`|  Right shift AND assignment operator       |   `C >>= 2` is same as `C = C >> 2`  |


## Qustions
* 判断奇偶
* 交换两数
* 变换符号
* 求绝对值
* 高低位交换
* 二进制逆序
* 二进制中1的个数
* 缺失的数字