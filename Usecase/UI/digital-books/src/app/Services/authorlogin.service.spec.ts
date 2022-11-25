import { TestBed } from '@angular/core/testing';

import { AuthorloginService } from './authorlogin.service';

describe('AuthorloginService', () => {
  let service: AuthorloginService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AuthorloginService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
