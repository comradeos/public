unprinted_designs = []
completed_models = []


def printing_models(unprinted, completed):
    """
    Имитирует печать моделей, пока список не станет пустым
    каждая модель после печати перемещаеться в printed_models

    """
    while unprinted_designs:
        current_design = unprinted.pop()
        print(f"Printing model: {current_design}")
        completed.append(current_design)


def show_completed_models(completed):
    """
    Выводит информацию о напечатанных моделях

    """
    print(f"Following models have been printed:")
    for item in completed:
        print(item)


unprinted_designs = ['a', 'b', 'c']
completed_models = []

printing_models(unprinted_designs, completed_models)
show_completed_models(completed_models)
