package org.gwtproject.editor.processor.test04;

import java.lang.Object;
import java.lang.Override;
import org.gwtproject.editor.client.Editor;
import org.gwtproject.editor.client.EditorVisitor;
import org.gwtproject.editor.client.impl.SimpleBeanEditorDelegate;
import org.gwtproject.editor.processor.common.UserDto;
import org.gwtproject.editor.processor.common.WidgetImplementsAsEditorBoolean_SimpleBeanEditorDelegate;
import org.gwtproject.editor.processor.common.WidgetImplementsAsEditorInteger_SimpleBeanEditorDelegate;
import org.gwtproject.editor.processor.common.WidgetImplementsAsEditorLong_SimpleBeanEditorDelegate;
import org.gwtproject.editor.processor.common.WidgetImplementsAsEditor_SimpleBeanEditorDelegate;

public class TestEditor04_SimpleBeanEditorDelegate extends SimpleBeanEditorDelegate {
  private TestEditor04 editor;
  
  private UserDto object;
  
  private SimpleBeanEditorDelegate idDelegate;
  
  private SimpleBeanEditorDelegate emailDelegate;
  
  private SimpleBeanEditorDelegate firstNameDelegate;
  
  private SimpleBeanEditorDelegate lastNameDelegate;
  
  private SimpleBeanEditorDelegate ageDelegate;
  
  private SimpleBeanEditorDelegate phoneDelegate;
  
  private SimpleBeanEditorDelegate activeDelegate;
  
  @Override
  protected TestEditor04 getEditor() {
    return editor;
  }
  
  @Override
  protected void setEditor(Editor editor) {
    this.editor = (TestEditor04) editor;
  }
  
  @Override
  public UserDto getObject() {
    return object;
  }
  
  @Override
  protected void setObject(Object object) {
    this.object = (UserDto) object;
  }
  
  @Override
  protected void initializeSubDelegates() {
    if (editor.id != null) {
      idDelegate = new WidgetImplementsAsEditorLong_SimpleBeanEditorDelegate();
      addSubDelegate(idDelegate, appendPath("id"), editor.id);
    }
    if (editor.email != null) {
      emailDelegate = new WidgetImplementsAsEditor_SimpleBeanEditorDelegate();
      addSubDelegate(emailDelegate, appendPath("email"), editor.email);
    }
    if (editor.firstName != null) {
      firstNameDelegate = new WidgetImplementsAsEditor_SimpleBeanEditorDelegate();
      addSubDelegate(firstNameDelegate, appendPath("firstName"), editor.firstName);
    }
    if (editor.lastName != null) {
      lastNameDelegate = new WidgetImplementsAsEditor_SimpleBeanEditorDelegate();
      addSubDelegate(lastNameDelegate, appendPath("lastName"), editor.lastName);
    }
    if (editor.age != null) {
      ageDelegate = new WidgetImplementsAsEditorInteger_SimpleBeanEditorDelegate();
      addSubDelegate(ageDelegate, appendPath("age"), editor.age);
    }
    if (editor.phone != null) {
      phoneDelegate = new WidgetImplementsAsEditor_SimpleBeanEditorDelegate();
      addSubDelegate(phoneDelegate, appendPath("phone"), editor.phone);
    }
    if (editor.active != null) {
      activeDelegate = new WidgetImplementsAsEditorBoolean_SimpleBeanEditorDelegate();
      addSubDelegate(activeDelegate, appendPath("active"), editor.active);
    }
  }
  
  @Override
  public void accept(EditorVisitor visitor) {
    if (idDelegate != null) {
      TestEditor04_id_Context ctx = new TestEditor04_id_Context(getObject(), editor.id, appendPath("id"));
      ctx.setEditorDelegate(idDelegate);
      ctx.traverse(visitor, idDelegate);
    }
    if (emailDelegate != null) {
      TestEditor04_email_Context ctx = new TestEditor04_email_Context(getObject(), editor.email, appendPath("email"));
      ctx.setEditorDelegate(emailDelegate);
      ctx.traverse(visitor, emailDelegate);
    }
    if (firstNameDelegate != null) {
      TestEditor04_firstName_Context ctx = new TestEditor04_firstName_Context(getObject(), editor.firstName, appendPath("firstName"));
      ctx.setEditorDelegate(firstNameDelegate);
      ctx.traverse(visitor, firstNameDelegate);
    }
    if (lastNameDelegate != null) {
      TestEditor04_lastName_Context ctx = new TestEditor04_lastName_Context(getObject(), editor.lastName, appendPath("lastName"));
      ctx.setEditorDelegate(lastNameDelegate);
      ctx.traverse(visitor, lastNameDelegate);
    }
    if (ageDelegate != null) {
      TestEditor04_age_Context ctx = new TestEditor04_age_Context(getObject(), editor.age, appendPath("age"));
      ctx.setEditorDelegate(ageDelegate);
      ctx.traverse(visitor, ageDelegate);
    }
    if (phoneDelegate != null) {
      TestEditor04_phone_Context ctx = new TestEditor04_phone_Context(getObject(), editor.phone, appendPath("phone"));
      ctx.setEditorDelegate(phoneDelegate);
      ctx.traverse(visitor, phoneDelegate);
    }
    if (activeDelegate != null) {
      TestEditor04_active_Context ctx = new TestEditor04_active_Context(getObject(), editor.active, appendPath("active"));
      ctx.setEditorDelegate(activeDelegate);
      ctx.traverse(visitor, activeDelegate);
    }
  }
}
