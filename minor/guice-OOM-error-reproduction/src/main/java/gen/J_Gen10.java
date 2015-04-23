
  package gen;
  public class J_Gen10 {
  		@com.google.inject.Inject
  		public J_Gen10(J_Gen11 j_gen11){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen11 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  