import { TestBed } from '@angular/core/testing';

import { WebRessourceService } from './web-ressource.service';

describe('WebRessourceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: WebRessourceService = TestBed.get(WebRessourceService);
    expect(service).toBeTruthy();
  });
});
