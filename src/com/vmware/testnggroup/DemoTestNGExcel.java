package com.vmware.testnggroup;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTestNGExcel {
	Workbook w;
	FileInputStream fis;
	List<Sheet> sf;

	@BeforeTest
	public void readfile() throws IOException {
		sf = new ArrayList<Sheet>();
		String filename = "testngTestcaseExcel-1.xls";
		File f = new File(filename);

		if (f.exists()) {
			System.out.println("file found");
		}
		fis = new FileInputStream(filename);

		System.out.println(f.getName().substring(filename.indexOf(".")));
		if (f.getName().substring(filename.indexOf(".")).equalsIgnoreCase(".xlsx")) {
			System.out.println("latest Excel format");
		} else {
			w = new HSSFWorkbook(fis);
			System.out.println(w.getNumberOfSheets());
			for (int i = 0; i < w.getNumberOfSheets(); i++) {
				sf.add(w.getSheetAt(i));

			}
		}

	}

	@Test
	public void readExcel() {
		List<String> results=new ArrayList<>();
		System.out.println(sf.get(0).getSheetName());
		Cell c;
		System.out.println("readblock");
		for (Sheet st : sf) {

			int rowcount = st.getLastRowNum() - st.getFirstRowNum();
			System.out.println(st.getSheetName() + ":" + rowcount);
			for (int i = 0; i < rowcount+1; i++) {
				//System.out.println(st.getRow(i));
				int colcount = st.getRow(i).getLastCellNum() - st.getRow(i).getFirstCellNum();
				results.add(st.getRow(i).getCell(4).getStringCellValue());
				for (int j = 0; j < colcount; j++) {
					c = st.getRow(i).getCell(j);

					System.out.print(c.getStringCellValue() + "||");

				}
				System.out.println();
			}
			System.out.println(results);
			Collections.sort(results);
			System.out.println(results);
			Set<String> s = new HashSet<>(results);
			Iterator itr = s.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
			System.out.println();
		}
		javax.lang.model.element.Element e;
	}

	@Test
	public void writeExcel() {
		System.out.println("writeblock");

	}

}
