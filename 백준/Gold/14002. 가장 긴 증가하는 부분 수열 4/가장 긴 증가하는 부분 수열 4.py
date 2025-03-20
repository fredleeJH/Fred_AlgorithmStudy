import sys
input = sys.stdin.readline


n = int(input())
store = list(map(int, input().split()))
dp = [1] * (n+1)

for i in range(len(store)):
    for j in range(i):
        if store[j] < store[i]:
            dp[i] = max(dp[i], dp[j]+1)

print(max(dp))
max_dp = max(dp)

result = []
for i in range(n-1, -1, -1):
    if dp[i] == max_dp:
        result.append(store[i])
        max_dp -= 1
result.reverse()
for i in result:
    print(i, end=' ')