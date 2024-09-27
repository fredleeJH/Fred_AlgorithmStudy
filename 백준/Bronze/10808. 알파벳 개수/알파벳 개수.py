#10808 알파벳 개수
num = input()
new_list = [0] * 26


for i in num:
    new_list[ord(i) - 97] += 1

for i in new_list:
    print(i, end=' ')