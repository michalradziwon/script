
  package gen;
  public class J_Gen106 {
  		@com.google.inject.Inject
  		public J_Gen106(J_Gen107 j_gen107){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen107 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  