alphabet = input().upper()
alphabet_list = list(set(alphabet)) #중복을 제거한 알파벳 리스트
cnt = []
for i in alphabet_list: # if abcc -> [a,b,c]
    count = alphabet.count(i) # 알파벳안의 i개수를 count
    cnt.append(count) # cnt list에 count 넣기

if cnt.count(max(cnt)) > 1: # 만약 가장 많은 단어의 알파벳 개수가 1개 이상 즉 abbcc bc중복이면
    print("?") # ? 출력
else:
    print(alphabet_list[cnt.index(max(cnt))]) # 가장 많은 알파벳 개수가 1개면 알파벳 리스트에서 가장 cnt 큰 거 출력
