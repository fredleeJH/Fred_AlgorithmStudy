# 시간초과가 난 이유는 아마 dictionary로 그냥 처리할 수 있었는데 굳이 리스트 까지 추가해서가 아닐까?
# n = int(input())
# companyMembers = {}
# attendanceMembers =[]
# for i in range(n):
#     person,attendance = input().split(" ")
#     companyMembers[person] = attendance
#     if attendance == "leave":
#         attendanceMembers.remove(person)
#     else:
#         attendanceMembers.append(person)
#
# attendanceMembers.sort(reverse=True)
# for member in attendanceMembers:
#     print(member)

n = int(input())
companyMembers = {}
for i in range(n):
    person,attendance = input().split(" ")
    companyMembers[person] = attendance
    if attendance == "leave":
        del companyMembers[person]

sortPeople = sorted(companyMembers.items(), reverse=True)
companyMembers = dict(sortPeople)
for key in companyMembers:
    print(key)
