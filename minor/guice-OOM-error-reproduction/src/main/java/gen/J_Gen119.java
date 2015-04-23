
  package gen;
  public class J_Gen119 {
  		@com.google.inject.Inject
  		public J_Gen119(J_Gen120 j_gen120){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen120 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  