#1308 d-day
#datetime을 호출해보자!
from datetime import *
today_y,today_m,today_d = map(int, input().split(" "))
dday_y,dday_m,dday_d = map(int, input().split(" "))

if today_y + 1000 < dday_y:
    print("gg")
elif today_y + 1000 == dday_y and (today_m, today_d) <= (dday_m, dday_d):
    print("gg")
else:
    today = date(today_y, today_m, today_d)
    d_day = date(dday_y, dday_m, dday_d)
    print(f"D-{str(d_day.toordinal() - today.toordinal())}")