#!/bin/python3

import sys
n = int(input().strip())
ar = list(map(int, input().strip().split(' ')))
from functools import reduce
print(reduce((lambda x,y:x+y),ar))
