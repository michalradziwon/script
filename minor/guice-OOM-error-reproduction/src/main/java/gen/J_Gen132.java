
  package gen;
  public class J_Gen132 {
  		@com.google.inject.Inject
  		public J_Gen132(J_Gen133 j_gen133){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen133 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  