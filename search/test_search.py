from search import search
import pytest

def test_search():
    assert search([5, 5, 5, 5, 1]) == 1
    assert search([4, 1, 4, 1, 4, 4]) == 4
    with pytest.raises(ValueError):
        search([3, 3])
    assert search([8, 8, 8, 8, 8, 8, 8, 8]) == 8
    assert search([2, 3, 3, 2, 2]) == 2