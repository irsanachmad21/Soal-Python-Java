# program menghitung harga setelah diskon
jenis = input("masukan jenis barang =")
harga_a = 50000
harga_b = 75000
harga_c = 100000
if (jenis == 'a'):
    harga = harga_a-0.15*harga_a
elif (jenis == 'b'):
    harga = harga_b-0.17*harga_b
else:
    harga = harga_c-0.20*harga_c
print("harga setelah diskon = Rp", harga)
