
  package gen;
  public class J_Gen96 {
  		@com.google.inject.Inject
  		public J_Gen96(J_Gen97 j_gen97){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen97 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  