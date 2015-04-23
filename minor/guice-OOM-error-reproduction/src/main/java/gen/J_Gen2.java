
  package gen;
  public class J_Gen2 {
  		@com.google.inject.Inject
  		public J_Gen2(J_Gen3 j_gen3){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen3 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  