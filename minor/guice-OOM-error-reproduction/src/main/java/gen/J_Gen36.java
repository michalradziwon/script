
  package gen;
  public class J_Gen36 {
  		@com.google.inject.Inject
  		public J_Gen36(J_Gen37 j_gen37){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen37 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  