
  package gen;
  public class J_Gen39 {
  		@com.google.inject.Inject
  		public J_Gen39(J_Gen40 j_gen40){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen40 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  