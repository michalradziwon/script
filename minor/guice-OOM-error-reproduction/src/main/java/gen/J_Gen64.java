
  package gen;
  public class J_Gen64 {
  		@com.google.inject.Inject
  		public J_Gen64(J_Gen65 j_gen65){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen65 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  