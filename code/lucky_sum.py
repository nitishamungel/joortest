def lucky_sum(array):
	sum = 0
	for n in array:
		if n == 13:
			break
		else:
			sum = sum + n
	return sum

print(lucky_sum([2,13,2]))
print(lucky_sum([13,2,3]))
print(lucky_sum([2,4,13]))