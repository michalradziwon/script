
  package gen;
  public class J_Gen5 {
  		@com.google.inject.Inject
  		public J_Gen5(J_Gen6 j_gen6){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen6 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  