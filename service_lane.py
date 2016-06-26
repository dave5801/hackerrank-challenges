#!/bin/python
#solution to: https://www.hackerrank.com/challenges/service-lane
import sys

def get_width(i,j):
	return min(i for i in width[i:j+1])

n,t = raw_input().strip().split(' ')
n,t = [int(n),int(t)]
width = map(int,raw_input().strip().split(' '))
for a0 in xrange(t):
    i,j = raw_input().strip().split(' ')
    i,j = [int(i),int(j)]
    print get_width(i,j)
