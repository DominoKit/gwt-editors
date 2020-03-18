package org.gwtproject.editor.processor.common;

import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import org.gwtproject.editor.client.Editor;
import org.gwtproject.editor.client.EditorVisitor;
import org.gwtproject.editor.client.impl.SimpleBeanEditorDelegate;

public class WidgetImplementsAsEditorLong_SimpleBeanEditorDelegate extends SimpleBeanEditorDelegate {
  private WidgetImplementsAsEditorLong editor;

  private Long object;

  @Override
  protected WidgetImplementsAsEditorLong getEditor() {
    return editor;
  }

  @Override
  protected void setEditor(Editor editor) {
    this.editor = (WidgetImplementsAsEditorLong) editor;
  }

  @Override
  public Long getObject() {
    return object;
  }

  @Override
  protected void setObject(Object object) {
    this.object = (Long) object;
  }

  @Override
  protected void initializeSubDelegates() {
  }

  @Override
  public void accept(EditorVisitor visitor) {
  }
}
