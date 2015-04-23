
  package gen;
  public class J_Gen177 {
  		@com.google.inject.Inject
  		public J_Gen177(J_Gen178 j_gen178){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen178 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  