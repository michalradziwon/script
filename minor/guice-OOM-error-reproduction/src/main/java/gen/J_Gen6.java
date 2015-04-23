
  package gen;
  public class J_Gen6 {
  		@com.google.inject.Inject
  		public J_Gen6(J_Gen7 j_gen7){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen7 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  