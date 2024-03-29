import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PostcreatorComponent } from './postcreator.component';

describe('PostcreatorComponent', () => {
  let component: PostcreatorComponent;
  let fixture: ComponentFixture<PostcreatorComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PostcreatorComponent]
    });
    fixture = TestBed.createComponent(PostcreatorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
