package visitor;

public class IdadeMediaVisitor implements IVisitor {

	private int acumuladorIdade = 0;
	private int quantidade = 0;

	@Override
	public void visit(Aluno aluno) {
		quantidade++;
		acumuladorIdade += aluno.getIdade();
	}

	@Override
	public void visit(Professor professor) {
		quantidade++;
		acumuladorIdade += professor.getIdade();
	}

	public float getIdadeMedia() {
		return acumuladorIdade / ((float) quantidade);
	}

}
