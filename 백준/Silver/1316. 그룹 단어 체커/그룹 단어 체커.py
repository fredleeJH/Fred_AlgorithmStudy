#1316 그룹 단어 체커
#단어 길이가 1일때, i와 i-1이 다를 때, i가 이전에 존재했다면 그룹 단어가 아님.

n = int(input())
count = 0
for i in range(n):
    group_word = input()
    words = []
    if len(group_word) == 1:
        count += 1
    else:
        for j in range(len(group_word)):
            if j == 0:
                words.append(group_word[j])
            elif j > 0:
                if group_word[j] == group_word[j-1]:
                    words.append(group_word[j])
                    if j == len(group_word)-1:
                        count += 1

                elif group_word[j] != group_word[j-1]:
                    if group_word[j] not in words:
                        if j == len(group_word)-1:
                            count += 1
                        else:
                            words.append(group_word[j])
                    elif group_word[j] in words:
                        break


print(count)