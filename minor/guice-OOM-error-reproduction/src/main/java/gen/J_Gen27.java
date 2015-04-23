
  package gen;
  public class J_Gen27 {
  		@com.google.inject.Inject
  		public J_Gen27(J_Gen28 j_gen28){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen28 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  