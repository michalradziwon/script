
  package gen;
  public class J_Gen33 {
  		@com.google.inject.Inject
  		public J_Gen33(J_Gen34 j_gen34){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen34 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  