
  package gen;
  public class J_Gen108 {
  		@com.google.inject.Inject
  		public J_Gen108(J_Gen109 j_gen109){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen109 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  