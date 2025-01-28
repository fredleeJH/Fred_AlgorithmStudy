import sys
input = sys.stdin.readline
n = int(input())
danceGroup = {'ChongChong'}
count = 0
for i in range(n):
    a, b = input().rstrip().split(" ")
    if a in danceGroup or b in danceGroup:
        danceGroup.add(a)
        danceGroup.add(b)
print(len(danceGroup))

