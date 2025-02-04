import sys
input = sys.stdin.readline

n = int(input())
time_list = list(map(int, input().strip().split(" ")))
time_list.sort()
result = 0
time = 0
for i in range(n):
    time += time_list[i]
    result += time
print(result)