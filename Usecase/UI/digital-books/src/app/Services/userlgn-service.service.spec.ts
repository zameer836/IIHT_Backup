import { TestBed } from '@angular/core/testing';

import { UserlgnServiceService } from './userlgn-service.service';

describe('UserlgnServiceService', () => {
  let service: UserlgnServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(UserlgnServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
