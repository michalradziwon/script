
  package gen;
  public class J_Gen138 {
  		@com.google.inject.Inject
  		public J_Gen138(J_Gen139 j_gen139){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen139 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  