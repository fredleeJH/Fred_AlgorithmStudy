#1417 국회의원 선거
#표가 가장 많은 후보자의 표를 뺏어오기
num = int(input())
new_list = []
for i in range(num):
    candidate = int(input())
    new_list.append(candidate)

first_candidate = new_list[0]
other_candidates = sorted(new_list[1:], reverse=True)
if num == 1:
    print(0)
else:
    count = 0
    while first_candidate <= other_candidates[0]:
        first_candidate += 1
        other_candidates[0] -= 1
        count += 1
        other_candidates.sort(reverse=True) #나머지 후보자 들의 표들 중 가장 큰 수를 맨 앞으로 보냄.
    print(count)



