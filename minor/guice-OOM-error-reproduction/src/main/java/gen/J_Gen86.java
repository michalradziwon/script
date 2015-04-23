
  package gen;
  public class J_Gen86 {
  		@com.google.inject.Inject
  		public J_Gen86(J_Gen87 j_gen87){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen87 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  