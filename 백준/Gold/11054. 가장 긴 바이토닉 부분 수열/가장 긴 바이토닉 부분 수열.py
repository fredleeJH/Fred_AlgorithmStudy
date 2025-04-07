import sys
input = sys.stdin.readline

n = int(input())
num_list = list(map(int, input().split()))

up_dp = [1] * n 
down_dp = [1] * n  


for i in range(1, n):
    for j in range(i):
        if num_list[j] < num_list[i]:
            up_dp[i] = max(up_dp[i], up_dp[j] + 1)


for i in range(n - 2, -1, -1):
    for j in range(n - 1, i, -1):
        if num_list[i] > num_list[j]:
            down_dp[i] = max(down_dp[i], down_dp[j] + 1)


max_len = 0
for i in range(n):
    max_len = max(max_len, up_dp[i] + down_dp[i] - 1)
print(max_len)
