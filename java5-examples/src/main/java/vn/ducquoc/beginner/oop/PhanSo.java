package vn.ducquoc.beginner.oop;

public class PhanSo {
  private Integer tuSo;
  private Integer mauSo;

  // Constructor
  public PhanSo(int tuSoParameter, int mauSoParameter) {
    this.tuSo = tuSoParameter;
    this.mauSo = mauSoParameter;
  }

  // static method - cong 2 Phan so kieu ham static (lap trinh ham)
  public static PhanSo add(PhanSo ps1, PhanSo ps2) {
    PhanSo result = new PhanSo(0, 0); // khoi tao object mo'i bang Constructor
    result.tuSo = (ps1.tuSo * ps2.mauSo) + (ps1.mauSo * ps2.tuSo);
    result.mauSo = (ps1.mauSo * ps2.mauSo);
    return result;
  }

  // object method - cong 2 Phan so kieu OOP (lap trinh OOP - ban than object
  // do' "this" se tham gia vao param nen chi can 1 param, tra ve chi'nh doi
  // tuong do')
  public PhanSo add(PhanSo ps2) {
    PhanSo result = new PhanSo(0, 0); // khoi tao object mo'i bang Constructor
    result.tuSo = (this.tuSo * ps2.mauSo) + (this.mauSo * ps2.tuSo);
    result.mauSo = (this.mauSo * ps2.mauSo);
    this.tuSo = result.tuSo;/* assign result back */
    this.mauSo = result.mauSo;
    return this;
  }

  // getters/setters
  public Integer getTuSo() {
    return this.tuSo;
  }

  public void setTuSo(int tuSo) {
    this.tuSo = tuSo;
  }

  public Integer getMauSo() {
    return this.mauSo;
  }

  public void setMauSo(int mauSo) {
    this.mauSo = mauSo;
  }
  // ...
}
