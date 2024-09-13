# 11047 동전 O
# 오름차순 정리를 적용하지 않는다면 다른 식으로 풀어야할듯

n, price = map(int, input().split(" "))
coins = []
for i in range(n):
    coin = int(input())
    coins.append(coin)
coins.sort(reverse=True)
count = 0
for i in range(n):
    count += price//coins[i]
    price = price % coins[i]
print(count)

