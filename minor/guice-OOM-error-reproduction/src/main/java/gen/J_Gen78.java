
  package gen;
  public class J_Gen78 {
  		@com.google.inject.Inject
  		public J_Gen78(J_Gen79 j_gen79){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen79 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  