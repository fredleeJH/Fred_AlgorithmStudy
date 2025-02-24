import sys
input = sys.stdin.readline

n, m = map(int, input().split())
start = []
cnt = []

for _ in range(n):
    start.append(input())

for a in range(n - 7):
    for b in range(m - 7):
        id1 = 0
        id2 = 0
        for i in range(a, a + 8):
            for j in range(b, b + 8):
                if (i + j) % 2 == 0:
                    if start[i][j] != 'W':
                        id1 += 1
                    if start[i][j] != 'B':
                        id2 += 1
                else:
                    if start[i][j] != 'B':
                        id1 += 1
                    if start[i][j] != 'W':
                        id2 += 1
        cnt.append(min(id1, id2))

print(min(cnt))