#!/bin/python

#solution to: https://www.hackerrank.com/challenges/quicksort1
def partition(ar):
    res = []
    pivot, ar = ar[0], ar[1:]
    
    lo = [x for x in ar if x <= pivot]
    hi = [x for x in ar if x > pivot]
    
    res.extend(lo)
    res.append(pivot)
    res.extend(hi)
    print ' '.join(map(str, res))

m = input()
ar = [int(i) for i in raw_input().strip().split()]
partition(ar)