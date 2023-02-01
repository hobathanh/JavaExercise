I. Số học

1. Viết chương trình tìm ước số chung lớn nhất, bội số chung nhỏ nhất của hai số tự nhiên

2. Viết chương trình tìm tổng các chữ số của một số nguyên

3. Viết chương trình nhận vào một số nguyên và trả về cách phân tích số đó ra tích của thừa số nguyên tố. Ví dụ nhập vào 600 thì cần phải trả về `2 * 2 * 2 * 3 * 5 * 5`

5. Số fibonaci là dãy số bắt đầu từ 1 1 và sau đó, số tiếp theo bằng 2 số trước cộng lại. Tức là `1 1 2 3 5 8 ....`. Nhập vào số nguyên n, trả về tổng tất cả những số fibonaci không lớn hơn n.

6. Viết phương trình nhập vào n và in ra tổng của dãy số
    ![Dãy số](https://latex.codecogs.com/gif.latex?1*2&plus;2*3&plus;3*4&plus;...&plus;n(n&plus;1))

7. Nhập vào a, tính căn bậc hai của a với độ chính xác 0.0001 bằng công thức
    ![Căn](https://latex.codecogs.com/gif.latex?%5Chuge%20f%28n%29%20%3D%20%5Cfrac%7Ba%7D%7B2f%28n%29%7D%20&plus;%20%5Cfrac%7Bf%28n%29%7D%7B2%7D)

8. Tìm những số nguyên n có m chữ số thỏa mãn điều kiện: tổng của các chữ số của n khi lũy thừa hệ số m thì đúng bằng n. Ví dụ n=153 là hợp lệ vì m=3, 1^3 + 5^3 + 3^3 = 153 (Giới hạn 2<=m<=5).

9. Số 23 khi viết nhị phân sẽ là 10111 khi viết ngược lại thành 11101 và nó thành số 29. Nhập số nguyên n và tìm số m bằng cách viết ngược thứ tự số binary như trên.

10. Viết chương trình tính căn bậc 2 của một số thực không âm bất kỳ bằng phương pháp chia đôi.

II. Array

1. Viết chương trình tìm tìm số lớn nhất trong một mảng số nguyên
2. Viết chương trình tìm tổng của các số chẵn và trừ đi tổng các số lẻ trong một mảng số nguyên
3. Viết chương trình sắp xếp các số nguyên trong mảng theo thứ tự của tổng các chữ số tăng dần
4. Viết chương trình tìm mảng con liên tiếp tăng dần dài nhất từ một mảng số nguyên
5. Viết chương trình tìm hiệu giữa số lớn nhất và số nhỏ nhất từ một mảng số nguyên
6. Viết chương trình sử dụng phương pháp tìm kiếm nhị phân để tìm kiếm một số nguyên từ một mảng số nguyên đã sắp xếp (tăng dần hoặc giảm dần), trả về vị trí nếu tìm thấy hoặc -1 nếu không tìm thấy
7. Viết chương trình chèn một số nguyên x vào một mảng số nguyên đã sắp xếp theo thứ tự tăng dần mà vẫn đảm bảo mảng kết quả tăng dần (yêu cầu không thực hiện thao tác sắp xếp trong hàm)
8. Viết chương trình tính tổng các bình phương của các phần tử
9. Viết chương trình đếm số lượng số nguyên tố trong mảng
10. Viết chương trình tạo một mảng số nguyên bằng cách đảo ngược các phần tử trong 1 mảng số nguyên cho trước

III. String

1. Tạo một chuỗi string bằng cách đảo ngược các ký tự từ 1 string cho trước
2. Kiểm tra chuỗi ký tự có đối xứng hay không. (Ví dụ abcdcba là đối xứng)
3. Tính tổng của các số nguyên trong chuỗi. Ví dụ `abc 123 def 33 mn 3.221` sẽ in ra 380 với 380 = 123+33+3+221

4. Viết chương trình kiểm tra một chuỗi string có phải là sự lặp lại của một chuỗi string bất kỳ nào đó hay không:

Ví dụ: 
- abab --> true vì ab lặp lại 2 lần
- abc --> false

5. Một [Barcode EAN 13](https://vi.wikipedia.org/wiki/EAN-13) có 13 con số được coi là hợp lệ nếu: tổng của các số ở vị trí lẻ + 3*(tổng các số ở vị trí chẳn) là một số chia hết cho 10.

Ví dụ mã barcode `8938505974194` ta có (8+3+5+5+7+1+4) + 3 * (9+8+0+9+4+9) = 150. 150 chia hết cho 10 nên mã `8938505974194` là hợp lệ.

Viết chương trình kiểm tra tính hợp lệ của một barcode.

6. Một Barcode EAN 13 có 13 số như trên thì con số đầu tiên bên phải qua là số verify. Viết chương trình nhận vào chuỗi số gồm 12 chữ số. Trả về kết quả là chữ số verify để có thể tạo thành một barcode gồm 13 số hợp lệ.

7. Implement hàm tìm kiếm một chuỗi string trong một chuỗi string khác. (Tất nhiên không dùng hàm có sẵn)

8. Một chuỗi các dấu ngoặc được coi là hợp lệ nếu mỗi ký tự mở ngoặc luôn được đóng ngoặc bởi 1 ký tự đóng ngoặc viết sau nó và dấu đóng ngoặc phải đóng 1 dấu mở ngoặc nào đó. Ví dụ

- `()()()` --> Hợp lệ
- `(())`, `(((())))()()` --> Hợp lệ, các cặp dấu ngoặc có thể lồng nhau 
- `(` --> Không hợp lệ, dấu mở ngoặc không được đóng
- `)` --> Không hợp lệ, dấu đóng ngoặc phải đóng 1 dấu mở ngoặc
- `()(`, `)()` --> Không hợp lệ

Hãy viết chương trình kiểm tra một chuỗi các dấu ngoặc có hợp lệ hay không

9. Viết chương trình để format các ký tự trong chuỗi sao cho các ký tự đầu mỗi từ luôn là viết hoa, các ký tự không phải đầu từ luôn phải viết thường

10. Viết chương trình xoá bớt các ký tự khoảng trắng nếu tồn tại 2 ký tự khoảng trắng liên tiếp hoặc các ký tự đầu hoặc cuối chuỗi.

Bonus
- https://leetcode.com/problems/letter-combinations-of-a-phone-number/
- https://leetcode.com/problems/is-subsequence/description/
