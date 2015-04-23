
  package gen;
  public class J_Gen139 {
  		@com.google.inject.Inject
  		public J_Gen139(J_Gen140 j_gen140){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen140 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  