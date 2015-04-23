
  package gen;
  public class J_Gen191 {
  		@com.google.inject.Inject
  		public J_Gen191(J_Gen192 j_gen192){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen192 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  