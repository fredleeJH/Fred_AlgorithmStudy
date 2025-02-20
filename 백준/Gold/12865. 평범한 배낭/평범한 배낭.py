import sys
input = sys.stdin.readline
n,k = map(int, input().split(" "))
knapsack = [list(map(int, input().split(" "))) for i in range(n)]
dp = [[0]*(k+1) for _ in range(n+1)]
for i in range(1, n+1):
    for j in range(1, k+1):
        if j >= knapsack[i-1][0]:
            dp[i][j] = max(dp[i-1][j], knapsack[i-1][1]+dp[i-1][j-knapsack[i-1][0]])
        else:
            dp[i][j] = dp[i-1][j]
print(dp[n][k])

# bagpack[i] (a) 를 포함 안하는 경우 ex) bcd 7 -> b가 있는 경우 (cd, 3) 가치 8, b가 없는 경우 cd 7
# a를 포함한다 bcd, 1 가치 13  b가 있을수 없고 c도 있을 수 없다.