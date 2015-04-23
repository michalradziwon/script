
  package gen;
  public class J_Gen134 {
  		@com.google.inject.Inject
  		public J_Gen134(J_Gen135 j_gen135){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen135 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  