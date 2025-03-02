import sys
input =sys.stdin.readline
n, k = map(int, input().split(" "))
coins = []
for i in range(n):
    coins.append(int(input()))
dp = [0] * (k+1)
dp[0] = 1 # 만약 동전을 써서 만들 수 없는 경우도 1가지라고 생각해야한다.
for coin in coins:
    for i in range(coin, k+1):
        dp[i] = dp[i] + dp[i - coin]
print(dp[k])
#예를 들어 1 2 5면 1원만 써서 10 만드는거 채우고
#1 2를 써서 만드는경우 해서 거기에 원래 있던 dp칸에 더하면 1 , 12같이
#125같이 써서 만드는경우도 같이.
