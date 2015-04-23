
  package gen;
  public class J_Gen71 {
  		@com.google.inject.Inject
  		public J_Gen71(J_Gen72 j_gen72){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen72 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  