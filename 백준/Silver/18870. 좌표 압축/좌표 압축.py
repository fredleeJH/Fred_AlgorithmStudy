n = int(input())
data = list(map(int, input().split()))

sortArr = sorted(list(set(data)))
dic = {}
for idx, item in enumerate(sortArr):
    dic[item] = idx

for item in data:
    print(dic[item], end = ' ')