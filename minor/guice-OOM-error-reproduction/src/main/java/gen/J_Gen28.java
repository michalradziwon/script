
  package gen;
  public class J_Gen28 {
  		@com.google.inject.Inject
  		public J_Gen28(J_Gen29 j_gen29){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen29 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  