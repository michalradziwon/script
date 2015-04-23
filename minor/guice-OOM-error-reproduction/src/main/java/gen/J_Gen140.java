
  package gen;
  public class J_Gen140 {
  		@com.google.inject.Inject
  		public J_Gen140(J_Gen141 j_gen141){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen141 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  