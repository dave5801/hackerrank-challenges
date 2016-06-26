
#https://www.hackerrank.com/domains/algorithms/implementation
import sys
import math

def count_squares(A, B):
	print int(math.floor(math.sqrt(B)) - math.ceil(math.sqrt(A)) + 1)

T = int(raw_input().strip())

for i in range(T):
	A,B = [int(i) for i in raw_input().strip().split()]
	count_squares(A,B)