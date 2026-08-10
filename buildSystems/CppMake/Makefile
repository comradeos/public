# компілятор c++ якщо ззовні не передали інший
CXX ?= c++
# прапорці компілятора стандарт мови та корисні попередження
CXXFLAGS := -std=c++17 -Wall -Wextra -pedantic
# папка для всіх результатів збірки
BUILD_DIR := build
# шлях до готової програми
TARGET := $(BUILD_DIR)/app
# вихідні файли проєкту
SOURCES := main.cpp utils.cpp
# перетворюємо список cpp файлів на список o файлів у build
OBJECTS := $(SOURCES:%.cpp=$(BUILD_DIR)/%.o)

# стандартна ціль проста команда make збирає програму
all: $(TARGET)

# створюємо папку build якщо її ще немає
$(BUILD_DIR):
	mkdir -p $(BUILD_DIR)

# лінкуємо обєктні файли в готову програму
$(TARGET): $(OBJECTS)
	$(CXX) $(CXXFLAGS) $(OBJECTS) -o $(TARGET)

# шаблонне правило
# файл build імя o збирається з файла імя cpp
# риска означає що build має існувати перед збіркою
# але сама зміна папки не примушує все компілювати знову
$(BUILD_DIR)/%.o: %.cpp | $(BUILD_DIR)
	# тут dollar less це вхідний cpp файл
	# тут dollar at це вихідний o файл
	$(CXX) $(CXXFLAGS) -c $< -o $@

# спочатку збираємо якщо треба потім запускаємо
run: $(TARGET)
	./$(TARGET)

# видаляємо всі створені файли
clean:
	rm -rf $(BUILD_DIR)

# це службові цілі а не справжні файли
.PHONY: all run clean
