import sys
input = sys.stdin.readline
n = int(input())

num_list = []
dp = [[0] * n for _ in range(n)]
for i in range(n):
    num_list.append(list(map(int, input().split())))

dp[0][0] = num_list[0][0]

for i in range(1, n):
    for j in range(0, i+1):
        if j == 0:
            dp[i][j] = dp[i-1][j] + num_list[i][j]
        else:
            dp[i][j] = max(dp[i-1][j-1], dp[i-1][j]) + num_list[i][j]

print(max(dp[n-1]))