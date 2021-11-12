package baiTap1;

public class SinhVien {
	private String maSV;

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public SinhVien(String maSV) {
		super();
		this.maSV = maSV;
	}

	@Override
	public String toString() {
		return "SinhVien [maSV=" + maSV + "]";
	}
	

}
