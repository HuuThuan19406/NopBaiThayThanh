package Bai1Slide78;

import java.util.ArrayList;
import java.util.Scanner;

public class TEST {

	public static void main(String[] args) {
		DanhMuc danhMuc1=new DanhMuc("1", "Nước ngọt");
		danhMuc1.add(new SanPham("1", "CocaCola", "Hoa Kỳ", 6500));
		danhMuc1.add(new SanPham("2", "Pepsi", "Trung Quốc", 6000));
		danhMuc1.add(new SanPham("3", "Lavie", "Pháp", 4000));
		danhMuc1.add(new SanPham("4", "Fanta", "Đức", 8000));
		
		//Xuất danh sách danh mục 1
		danhMuc1.listed();
		//Cập nhật thông tin sản phẩm
		System.out.println("Danh sách sau cập nhật");
		SanPham sp=danhMuc1.get(0);
		sp.setXuatXu("Trung Quốc");
		danhMuc1.set(sp, 0);
		danhMuc1.listed();
		//Xóa sản phẩm
		System.out.println("Danh sách sau khi xóa");
		danhMuc1.remove(2);
		danhMuc1.listed();
		//Tổng giá trị các sản phẩm
		System.out.print("Tổng giá trị sản phẩm: ");
		System.out.println(danhMuc1.totalValues());
		//Liệt kê các sản phẩm xuất xứ từ Trung Quốc
		System.out.println("Các sản phẩm xuất xứ từ Trung Quốc: ");
		danhMuc1.listed("Trung Quốc");
	}

}
