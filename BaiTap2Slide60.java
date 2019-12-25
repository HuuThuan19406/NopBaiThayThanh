package NguyenHuuThuan.com;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;



public class BaiTap2Slide60 {

	public static void main(String[] args) {
		System.out.println("\t\t\tChương trình quản lý sinh viên");
		System.out.println("\tMenu chức năng:");
		System.out.println("1.Thêm Sinh viên\r\n" + 
				"2.Xuất danh sách sinh viên – Theo mã và tên\r\n" + 
				"3.Sửa Sinh Viên\r\n" + 
				"4.Xóa Sinh viên chứa tên bất kỳ\r\n" + 
				"5.Tìm Sinh viên mà tên cho chữ An\r\n" + 
				"6.Xuất ra Các mã sinh viên(chỉ mã)\r\n" + 
				"7.Xuất ra Các tên Sinh viên(chỉ tên)\r\n" + 
				"");
		HashMap<String, String> danhSach= new HashMap<String, String>();
		Scanner sc= new Scanner(System.in);
		int keyNum;
		String tenSV, maSV, info;
		do {
			System.out.print("Mời nhập số chức năng cần sử dụng: ");
			keyNum=sc.nextInt();
			switch (keyNum) {
			case 1: //Thêm/sửa sinh viên
			case 3:
				System.out.println("Nhập thông tin sinh viên theo định dạng: MSSV;Họ và tên");
				sc= new Scanner(System.in);
				info= sc.nextLine();
				String[] Info= info.split(";");
				maSV= Info[0]; tenSV= Info[1];
				danhSach.put(maSV, tenSV);
				System.out.println("Sinh viên [" + tenSV + "] đã được cập nhật vào danh sách thành công");
				break;
			case 2: //Xuất danh sách sinh viên
				System.out.println("Danh sách sinh viên hiện tại:");
				System.out.println(danhSach.entrySet());
				break;
			case 4: //Xóa sinh viên theo tên
				//Đang lỗi =((
				System.out.print("Nhập tên sinh viên cần xóa: ");
				sc= new Scanner(System.in);
				tenSV= sc.nextLine();
				for(String MSSV:danhSach.keySet())
			    {
					System.out.println(MSSV);
					System.out.println(tenSV.equals(danhSach.get(MSSV)));
			    	if(tenSV.equals(MSSV))
			    	{
			    		danhSach.remove(MSSV);
			    	}
			    }
				System.out.println("Đã xóa toàn bộ sinh viên có tên [" + tenSV + "] ra khỏi  danh sách");
				break;
			case 5: //Tìm tên sinh viên có chữ An
				Collection<String> ColTenSV= danhSach.values();
				for(String ten:ColTenSV)
				{
					if(toiUuChuoi(ten).contains("An"))
							System.out.println("Sinh viên [" + ten + "]" );								
				}
				break;
			case 6: //Xuất mã sinh viên
				System.out.println("Danh sách mã sinh viên hiện tại:");
				for(String MSSV:danhSach.keySet())
				{
					System.out.println(MSSV);
				}
				break;
			case 7: //Xuất tên sinh viên
				System.out.println("Danh sách tên sinh viên hiện tại:");
				for(String ten:danhSach.values())
				{
					System.out.println(ten);
				}
				break;

			default:
				break;
			}
		} while (true);
		
	}
	static String toiUuChuoi(String st)
	{
		st=st.trim();
		while (st.indexOf("  ")>0)
		{
			st=st.replace("  ", " ");
		}
		st=st.toLowerCase();
		char[] arr = st.toCharArray();
		arr[0]=Character.toUpperCase(arr[0]);
		st=""; st+=arr[0];
	    for(int i=1;i<arr.length;i++)
	    {
	    	if (arr[i-1]==' '&&arr[i]!=' ')
	    		arr[i]=Character.toUpperCase(arr[i]);
	    	st+=arr[i];
	    }
		return st;
	}

}
