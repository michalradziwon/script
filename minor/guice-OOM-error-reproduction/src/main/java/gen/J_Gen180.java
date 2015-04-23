
  package gen;
  public class J_Gen180 {
  		@com.google.inject.Inject
  		public J_Gen180(J_Gen181 j_gen181){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen181 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  