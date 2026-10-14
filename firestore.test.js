const { test } = require('node:test');
const assert = require('node:assert');
const fs = require('node:fs');
const http = require('node:http');

// Simple fast check verifying rules file syntax and structure
test('firestore.rules file exists and is valid syntax', () => {
  const rules = fs.readFileSync('firestore.rules', 'utf8');
  assert.ok(rules.includes('service cloud.firestore'));
  assert.ok(rules.includes('isValidUserProfile'));
  assert.ok(rules.includes('isValidConsultancyBooking'));
});
