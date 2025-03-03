import sys
input = sys.stdin.readline

n = input().split('-') #n기준으로 분리시킴

result = []
for i in n:
    sum = 0
    new_result = i.split('+')
    for j in new_result:
        sum += int(j)
    result.append(sum)

answer = result[0]
for i in range(1, len(result)):
    answer -= result[i]

print(answer)