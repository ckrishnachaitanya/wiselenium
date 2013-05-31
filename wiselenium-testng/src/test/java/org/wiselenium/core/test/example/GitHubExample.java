package org.wiselenium.core.test.example;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.wiselenium.core.element.container.Table;
import org.wiselenium.core.element.container.TableRow;
import org.wiselenium.core.test.FileUtils;
import org.wiselenium.core.test.WiseTestNG;

@SuppressWarnings("javadoc")
public class GitHubExample extends WiseTestNG<GitHubExample> {
	
	@Test
	public void shouldTestWiseleniumTableOfFeatures() {
		// this.get("https://github.com/andreschaffer/wiselenium");
		this.get(FileUtils.getAbsoluteFilePath("github.html"));
		Table table = this.findElement(Table.class, By.name("wiselenium-features"));
		
		for (TableRow bodyRow : table.getBody().and().getRows())
			assertTrue(bodyRow.getCell(1).getText().contains("Yes"));
	}
	
}
