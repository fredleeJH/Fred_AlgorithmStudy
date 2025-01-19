n = int(input())
words = []
for i in range(n):
    word = str(input())
    words.append(word)
set_words = list(set(words))
set_words.sort()
set_words.sort(key= len)
for i in set_words:
    print(i)