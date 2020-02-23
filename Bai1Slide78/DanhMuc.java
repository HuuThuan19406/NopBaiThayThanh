package Bai1Slide78;

import java.util.ArrayList;

public class DanhMuc {
	private String maDanhMuc, tenDanhMuc;

	public DanhMuc() {
		super();
	}

	public DanhMuc(String maDanhMuc, String tenDanhMuc) {
		super();
		this.maDanhMuc = maDanhMuc;
		this.tenDanhMuc = tenDanhMuc;
	}

	public String getMaDanhMuc() {
		return maDanhMuc;
	}

	public void setMaDanhMuc(String maDanhMuc) {
		this.maDanhMuc = maDanhMuc;
	}

	public String getTenDanhMuc() {
		return tenDanhMuc;
	}

	public void setTenDanhMuc(String tenDanhMuc) {
		this.tenDanhMuc = tenDanhMuc;
	}
	
	private ArrayList<SanPham> list=new ArrayList<SanPham>();
	
	public void add(SanPham sp) {
		list.add(sp); 		
	}
	
	/**
	 * Xóa sản phẩm tại vị trí thứ i trong Danh Mục
	 * @param i
	 */
	public void remove(int i) {
		list.remove(i);
	}
	
	public double totalValues() {
		double total=0;
		for (SanPham sp : list) {
			total+=sp.getGia();
		}
		return total;
	}
	
	/**
	 * Liệt kê chính xác tuyệt đối các sản phẩm theo Xuất xứ
	 * @param xuatXu 
	 * @return Danh sách các sản phẩm thõa yêu cầu
	 */
	public void listed(String xuatXu){
		for (SanPham sp : list) {
			if(sp.getXuatXu()==xuatXu)
				System.out.println(sp.getMaSanPhan()+" | "+sp.getTenSanPham()+" | "+sp.getXuatXu()+" | "+sp.getGia());
		}
	}
	
	public void listed(){
		for (SanPham sp : list) {
			System.out.println(sp.getMaSanPhan()+" | "+sp.getTenSanPham()+" | "+sp.getXuatXu()+" | "+sp.getGia());
		}
	}
	
	public SanPham get(int index) {
		return list.get(index);
	}
	
	public void set(SanPham sp, int index) {
		list.add(index, sp);
		this.remove(index);
	}
}
