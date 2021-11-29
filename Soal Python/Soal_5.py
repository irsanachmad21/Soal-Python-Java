a = int(input("masukan nilai a ="))  # nilai a>b
b = int(input("masukan nilai b ="))
r = a % b
k = b
x = a
while (r != 0):
    a = a+k  # r adalah sisa pembagian
    r = a % b
print("KPK dari", x, "dan", k, "adalah", a)
