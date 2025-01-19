n = int(input())

members = [list(map(str, input().split(" ")))for _ in range(n)]
members.sort(key = lambda x: int(x[0]))
for i in members:
    print(i[0], i[1])

