
  package gen;
  public class J_Gen199 {
  		@com.google.inject.Inject
  		public J_Gen199(J_Gen200 j_gen200){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen200 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  