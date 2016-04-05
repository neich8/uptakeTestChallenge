
Ideally page objects would have a selector for pretty much all elements on pages.
If you were to have all/most elements for every page. you would want to split them up into classes so
they are reusable and easily readable.

Also the assumption is in a real scenario you would be using a selenium grid so the browser instantiation
should be moved into its own package/class and you would also want to move the url construction into some
Enum/test.xml or Command Line arg/flag to manage staging/uat environments or different countries.
