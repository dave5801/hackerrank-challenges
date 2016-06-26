#!/bin/python
#solution to: https://www.hackerrank.com/challenges/arrays-ds
import sys


n = int(raw_input().strip())
arr = map(int,raw_input().strip().split(' '))

x = reversed(arr)

y = []

for i in x:
	y.append(str(i))

print ' '.join(y)