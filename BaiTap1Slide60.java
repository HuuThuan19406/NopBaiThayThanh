package NguyenHuuThuan.com;

import java.util.ArrayList;
import java.util.Scanner;

public class BaiTap1Slide60 {

		public static void main(String[] args) {
		try {
			System.out.println("\t\t\tChương trình quản lý sinh viên");
			System.out.println("\tMenu chức năng:");
			System.out.println("1.Thêm Sinh viên\r\n" + 
					"2.Xuất danh sách sinh viên\r\n" + 
					"3.Sửa Sinh Viên\r\n" + 
					"4.Xóa Sinh viên chứa tên bất kỳ\r\n" + 
					"5.Tìm Sinh viên mà tên có chữ An\r\n" + 
					"6.Sắp xếp Sinh Viên\r\n" + 
					"7.Xuất ra số lượng sinh viên\r\n" + 
					"");
			Scanner sc;
			int keyNum, stt;
			String tenSV;
			ArrayList<String> danhSachSV= new ArrayList<String>();
			do {
				System.out.print("Mời nhập số chức năng cần sử dụng: ");
				sc= new Scanner(System.in);
				keyNum=sc.nextInt();
				switch (keyNum) {
					case 1: //Thêm sinh viên
						System.out.print("Nhập tên sinh viên cần thêm: ");
						sc= new Scanner(System.in);
						tenSV= sc.nextLine();
						danhSachSV.add(tenSV);
						System.out.println("Đã thêm [" + tenSV + "] vào danh sách");
						break;
					case 2: //Xuất danh sách
						System.out.println("Danh sách sinh viên hiện tại: ");
						for(int i=0; i<danhSachSV.size(); i++)
						{
							System.out.println(i+1 + ". " + danhSachSV.get(i));
						}
						break;
					case 3: //Sửa sinh viên
						System.out.print("Nhập số thứ tự sinh viên cần sửa: ");
						sc= new Scanner(System.in);
						stt=sc.nextInt()-1;
						System.out.print("Sửa sinh viên [" + danhSachSV.get(stt) + "] thành: ");
						sc=new Scanner(System.in);
						tenSV=sc.nextLine();
						danhSachSV.set(stt, tenSV);
						System.out.println("Danh sách đã được sửa thành công.");
						break;
					case 4: //Xóa sinh viên theo tên
						System.out.print("Nhập tên sinh viên cần xóa: ");
						sc= new Scanner(System.in);
						tenSV= sc.nextLine();
						while (danhSachSV.contains(tenSV))
						{
							danhSachSV.remove(danhSachSV.indexOf(tenSV));
						}
						System.out.println("Đã xóa toàn bộ sinh viên có tên [" + tenSV + "] ra khỏi danh sách.");
						break;
					case 5: //Tìm sinh viên tên có chữ An
						System.out.println("Các sinh viên trong tên có chữ An trong danh sách gồm:");
						for(int i=0; i<danhSachSV.size(); i++)
						{
							tenSV= danhSachSV.get(i);
							if(toiUuChuoi(tenSV).contains("An"))
									System.out.println("Sinh viên [" + tenSV + "] số thứ tự " + (i+1) );									
						}
						break;
					case 6: //Sắp xếp danh sách
						danhSachSV.sort(null);
						System.out.println("Danh sách sinh viên sau sắp xếp như sau:");
						for(int i=0; i<danhSachSV.size(); i++)
						{
							System.out.println(i+1 + ". " + danhSachSV.get(i));
						}
						break;
					case 7: //Xuất số lượng sinh viên trong danh sách
					
						System.out.println("Có tổng cộng [" + danhSachSV.size() + "] sinh viên trong danh sách hiện tại");
					    break;
				default:
						System.err.println("\nChức năng vừa nhập không tồn tại!");
						break;
				}
			} while (true);	
		} catch (Exception e) {
			System.err.println("Xảy ra lỗi với dữ liệu vừa nhập");
		}
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
