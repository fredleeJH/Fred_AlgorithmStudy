import sys
input = sys.stdin.readline

n = int(input())
d_list = [25, 10, 5, 1]
for i in range(n):
    c = int(input())
    arr = []
    for j in d_list:
        arr.append(c // j)
        c = c % j
    print(*arr)
