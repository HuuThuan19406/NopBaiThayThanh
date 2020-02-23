package Bai1Slide78;

public class SanPham extends DanhMuc {
	private String maSanPhan, tenSanPham, xuatXu;
	private double gia;
	
	public SanPham(String maSanPhan, String tenSanPham, String xuatXu, double gia) {
		super();
		this.maSanPhan = maSanPhan;
		this.tenSanPham = tenSanPham;
		this.xuatXu = xuatXu;
		this.gia = gia;
	}
	public SanPham() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getMaSanPhan() {
		return maSanPhan;
	}
	public void setMaSanPhan(String maSanPhan) {
		this.maSanPhan = maSanPhan;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public String getXuatXu() {
		return xuatXu;
	}
	public void setXuatXu(String xuatXu) {
		this.xuatXu = xuatXu;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
}
