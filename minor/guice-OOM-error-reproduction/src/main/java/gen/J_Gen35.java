
  package gen;
  public class J_Gen35 {
  		@com.google.inject.Inject
  		public J_Gen35(J_Gen36 j_gen36){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen36 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  