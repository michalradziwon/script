
  package gen;
  public class J_Gen9 {
  		@com.google.inject.Inject
  		public J_Gen9(J_Gen10 j_gen10){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen10 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  