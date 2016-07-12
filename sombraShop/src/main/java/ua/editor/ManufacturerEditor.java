package ua.editor;

import java.beans.PropertyEditorSupport;

import ua.service.ManufacturerService;

public class ManufacturerEditor extends PropertyEditorSupport{
	
	private final ManufacturerService manufacturerService;

	public ManufacturerEditor(ManufacturerService manufacturerService) {
		this.manufacturerService = manufacturerService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		setValue(manufacturerService.findOne(Integer.valueOf(text)));
	}
}
