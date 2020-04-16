package com.hd.common.editor;

import java.beans.PropertyEditorSupport;

import com.hd.common.utils.StringSecurityUtils;

public class StringEditor extends PropertyEditorSupport
{
    public StringEditor()
    {
        super();
    }

    @Override
    public void setAsText(String text)
    {
        if (text == null)
        {
            this.setValue(null);
        }
        else
        {
            this.setValue(StringSecurityUtils.filterString(text));
        }
    }

    @Override
    public String getAsText()
    {
        Object value = this.getValue();
        return value != null ? value.toString() : "";
    }
}
