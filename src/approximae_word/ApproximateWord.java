package approximae_word;

/**
 *
 * @author Dũng Sobin
 */

/*
Tư tưởng:
    - Kiểm tra độ dài string so sánh ít hay hơn 30% thì loại
    - So sánh từng kí tự của 2 string nếu không bằng nhau thì so sánh các từ lân cận tiếp theo
    Trong khoảng sai số nếu có chỉnh lại vị trí i, j là chỉ số của 2 string đó để kiếm tra lỗi thừa hay thiếu từ
    nếu có thì số lỗi là số kí tự phải chỉnh lại vị trí i, j nếu không là lỗi 1, đọc kí tự kế tiếp
    - Cuối cùng khi 1 trong 2 string đã hết còn mẩu đuôi ta làm: lỗi += s.length - i + s1.length - j;
    tức là nếu 1 string còn thừa thì cho mẩu đó là lỗi cộng vào
    nếu số lỗi <= 30% thì đạt, không thì không đạt
    Link tham khảo: https://tailieu.vn/doc/thuat-toan-tim-kiem-string-gan-dung-nhu-google-384546.html

 */
public class ApproximateWord {

    private String s;
    private int saiso;

    public ApproximateWord(String nhap) {
        s = nhap.trim();
        saiso = (int) Math.round(s.length() * 0.3);
    }

    public boolean compareTo(String s1) {
        if (s1.length() < (s.length() - saiso) || s1.length() > (s.length() + saiso)) {// nếu s1 có độ dài nhỏ hơn độ dài của s - sai số hoặc là s1 có độ dài lớn hơn s + sai số thì return false
            return false;
        }
        int i = 0;
        int j = 0;
        int loi = 0;
        while (i < s.length() && j < s1.length()) { // cho vòng lặp chạy từ i đến hết s và j đến hết s1
            if (s.charAt(i) != s1.charAt(j)) { // nếu s(i) != s1(j) thì lỗi + 1
                loi++;
                for (int k = 1; k <= saiso; k++) {
                    if ((i + k < s.length()) && s1.charAt(j) == s.charAt(i + k)) {
                        i += k;
                        break;
                    }
                    if ((j + k < s1.length()) && s.charAt(i) == s1.charAt(j + k)) {
                        j += k;
                        break;
                    }
                }
            }
            i++;
            j++;
        }
        loi += s.length() - i + s1.length() - j;
        if (loi <= saiso) {
            return true;
        } else {
            return false;
        }
    }
}
