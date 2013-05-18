package org.wiselenium.core.element.field;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.wiselenium.core.FileUtils.getAbsoluteFilePath;

import org.openqa.selenium.WebElement;
import org.wiselenium.core.pagefactory.Page;

@SuppressWarnings("javadoc")
public class LabelPage extends Page<LabelPage> {
	
	public static final String LABEL_CLICKED_MESSAGE = "label clicked";
	public static final String LABEL_FOR = "text";
	public static final String LABEL_TEXT = "label text";
	public static final String URL = "label.html";
	public static final String TITLE = "page for label tests";
	
	private Label label;
	private Label hiddenLabel;
	private WebElement message;
	
	
	public Label getHiddenLabel() {
		return this.hiddenLabel;
	}
	
	public Label getLabel() {
		return this.label;
	}
	
	public String getMessage() {
		return this.message.getText();
	}
	
	@Override
	protected void isLoaded() {
		assertEquals(this.getTitle(), TITLE);
		assertTrue(this.getWrappedDriver().getCurrentUrl().endsWith(URL));
	}
	
	@Override
	protected void load() {
		this.get(getAbsoluteFilePath(URL));
	}
	
}