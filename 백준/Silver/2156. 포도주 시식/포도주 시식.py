# 2156 포도주 시식
# 최댓값을 구하는 문제이므로 dynamic_programming일 확률이 높다고 생각
# 지금 푸는 문제부터는 스네이크 케이스 규칙을 지켜보려고한다.
# 점화식을 구해보면 만약 4번째 와인까지의 최댓값을 구해보면 124, 134, 4를 안마신경우 DP[3] = 3까지의 최댓값 <- 3가지를 비교한 점화식을 세움.
import sys
input = sys.stdin.readline
n = int(input())
grape = [0] * 10001
for i in range(1, n+1):
    grape[i] = int(input())
dp = [0] * 10001 # 최대로 마실 수 있는 포도주의 양
dp[1] = grape[1]
dp[2] = grape[1] + grape[2]
for i in range(3, n+1):
    dp[i] = max(dp[i-1], dp[i-2]+grape[i],dp[i-3]+ grape[i-1]+grape[i])
print(dp[n])
