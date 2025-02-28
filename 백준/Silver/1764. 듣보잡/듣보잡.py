import sys
input = sys.stdin.readline
n, m = map(int, input().split())
dic = dict()
result = []
for i in range(n):
    c = input().strip()
    dic[c] = 1

for i in range(m):
    d = input().strip()
    if d in dic:
        result.append(d)
result.sort()
print(len(result))
for i in result:
    print(i)