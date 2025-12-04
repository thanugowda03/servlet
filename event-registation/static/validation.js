public boolean validate(EventDTO dto) {

    if (dto.getName() == null || dto.getName().trim().isEmpty()) {
        return false;
    }

    if (dto.getEmail() == null || dto.getEmail().trim().isEmpty()
            || !dto.getEmail().contains("@")) {
        return false;
    }

    String phone = dto.getPhone().trim();
    if (phone.isEmpty() || phone.length() != 10 || !phone.chars().allMatch(Character::isDigit)) {
        return false;
    }

    if (dto.getType() == null || dto.getType().trim().isEmpty()) {
        return false;
    }

    if (dto.getCity() == null || dto.getCity().trim().isEmpty()) {
        return false;
    }

    return true;
}
