
def makeHalfString(str):
	if len(str) % 2 == 0:
	    return str[:len(str) // 2]
	else:
		return str[:(len(str)//2)+1]

print(makeHalfString("hi"))
print(makeHalfString("abcd"))
print(makeHalfString(""))