
  package gen;
  public class J_Gen129 {
  		@com.google.inject.Inject
  		public J_Gen129(J_Gen130 j_gen130){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen130 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  