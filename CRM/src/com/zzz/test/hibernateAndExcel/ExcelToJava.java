package com.zzz.test.hibernateAndExcel;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Date;

import jxl.Cell;
import jxl.CellType;
import jxl.DateCell;
import jxl.Sheet;
import jxl.Workbook;

public class ExcelToJava {

	public static void main(String[] args) {
		                                       
		try {
			 //sourcefile
			InputStream is = new FileInputStream("./WebRoot/Resources/student.xls");
			//1.����Workbook
			Workbook rwb = Workbook.getWorkbook(is); 
			//2.��ù�����
			Sheet rs = rwb.getSheet(0);
			   //System.out.println("��ù�����:"+rs.getName());
			//3.���ָ����Ԫ��
			   //Cell cell = rs.getCell(0, 0);//���У� �У�
			//4.��õ�Ԫ������
			   //String str = cell.getContents();
			   //System.out.println("��õ�Ԫ������:"+cell.getContents());
			//5.��õ�Ԫ�������
			   //cell.getType();
			//System.out.println("��õ�Ԫ�������:"+cell.getType());
			
//			6.��������
//			CellType.LABEL
//			CellType.NUMBER
//			CellType.DATE

//			for(int i=0;i<10;i++){
//				for(int j=0;j<6;j++){
//					Cell fcell=rs.getCell(j,i);
//					System.out.println(fcell.getType()+"\t");
//				}
//			}
//			Cell ncell = rs.getCell(4,1);//���У� �У�
//			//int result=Integer.parseInt(ncell.getContents());
//			//System.out.println(ncell.getType());
//			if(ncell.getType()==CellType.NUMBER){
//				NumberCell numberCell=(NumberCell) ncell;
//				int result=(int) numberCell.getValue();
//				System.out.println(result); //80
//			}
			
			Cell ncell = rs.getCell(5,1);//���У� �У�
			if(ncell.getType()==CellType.DATE){
				DateCell dateCell=(DateCell) ncell;
				Date result= dateCell.getDate();
				System.out.println(result);//Thu Jan 10 08:00:00 CST 2013
			}
			
			//7.�������й�����ĸ���
			  //int getNumberOfSheets() 
			  System.out.println("�������й�����ĸ���:"+rwb.getNumberOfSheets());
			//8.�������й������������(����)
			  //Sheet[] getSheets() 
			  //System.out.println("�������й������������:"+rwb.Sheet[] getSheets() );
			//9. ��ȡSheet������
			   //String getName() 
			  System.out.println("��ȡSheet������:"+rs.getName());
			//  10.��ȡSheet������������������
			//  int getColumns() 
			  System.out.println("��ȡSheet������������������:"+rs.getColumns());

				for(int i=0;i<rs.getRows();i++){
					for(int j=0;j<rs.getColumns();j++){
						Cell fcell=rs.getCell(j,i);
						System.out.print(fcell.getContents()+"\t");
					}
				System.out.println();
			}	
			rwb.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
