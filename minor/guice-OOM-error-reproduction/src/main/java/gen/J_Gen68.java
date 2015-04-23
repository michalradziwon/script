
  package gen;
  public class J_Gen68 {
  		@com.google.inject.Inject
  		public J_Gen68(J_Gen69 j_gen69){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen69 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  