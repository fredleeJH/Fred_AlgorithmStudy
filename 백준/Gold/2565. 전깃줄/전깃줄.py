import sys
input = sys.stdin.readline

n = int(input())
n_list = [list(map(int, input().split(" "))) for _ in range(n)]
n_list.sort(key=lambda x: x[0])
dp = [0] * n

for i in range(n):
    result = 0
    for j in range(i):
        if n_list[i][1] > n_list[j][1]:
            if result < dp[j]:
                result = dp[j]

    dp[i] = result + 1

print(n - max(dp))