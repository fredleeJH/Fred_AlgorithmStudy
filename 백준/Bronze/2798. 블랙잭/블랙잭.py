#2798 블랙잭
# 브루트 포스 문제

num, blackjack = map(int, input().split(" "))
num_list = list(map(int, input().split(" ")))
new_list = []
for i in range(num):
    for j in range(i+1, num):
        for k in range(j+1, num):
            sum = num_list[i]+ num_list[j] + num_list[k]
            if sum > blackjack:
                continue
            else:
                new_list.append(sum)
print(max(new_list))