
  package gen;
  public class J_Gen122 {
  		@com.google.inject.Inject
  		public J_Gen122(J_Gen123 j_gen123){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen123 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  