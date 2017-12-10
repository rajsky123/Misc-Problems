#!/bin/python3

import sys

a=list(map(int, input().strip().split(' ')))
b=list(map(int, input().strip().split(' ')))
alice=bob=0
from itertools import zip_longest
for i,j in zip_longest(a,b):
    if(i>j):
        alice+=1
    elif(j>i):
        bob+=1
print(alice,bob)
