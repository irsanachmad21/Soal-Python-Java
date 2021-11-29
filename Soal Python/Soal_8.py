# program : menentukan biaya parkir
jam1 = int(input("masukan jam masuk ="))
menit1 = int(input("masukan menit masuk ="))
detik1 = int(input("masukan detik masuk ="))
jam2 = int(input("masukan jam keluar ="))
menit2 = int(input("masukan menit keluar ="))
detik2 = int(input("masukan detik keluar ="))
jammasuk = jam1+menit1/60+detik1/3600
jamkeluar = jam2+menit2/60+detik2/3600
jamparkir = jamkeluar-jammasuk
if (jamparkir < 3):
    biayaparkir = 2000
else:
    biayaparkir = 2000+(jamparkir-3)*1000
    print("biaya parkir selama", jamparkir, "jam Rp =", biayaparkir)
