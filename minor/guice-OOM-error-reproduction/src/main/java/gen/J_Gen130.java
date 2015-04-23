
  package gen;
  public class J_Gen130 {
  		@com.google.inject.Inject
  		public J_Gen130(J_Gen131 j_gen131){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen131 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  