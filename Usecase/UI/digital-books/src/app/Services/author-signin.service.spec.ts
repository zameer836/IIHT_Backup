import { TestBed } from '@angular/core/testing';

import { AuthorSigninService } from './author-signin.service';

describe('AuthorSigninService', () => {
  let service: AuthorSigninService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AuthorSigninService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
