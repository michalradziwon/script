
  package gen;
  public class J_Gen37 {
  		@com.google.inject.Inject
  		public J_Gen37(J_Gen38 j_gen38){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen38 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  