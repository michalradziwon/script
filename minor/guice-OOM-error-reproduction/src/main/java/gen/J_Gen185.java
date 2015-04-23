
  package gen;
  public class J_Gen185 {
  		@com.google.inject.Inject
  		public J_Gen185(J_Gen186 j_gen186){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen186 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  