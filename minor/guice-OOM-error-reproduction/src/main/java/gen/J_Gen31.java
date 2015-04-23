
  package gen;
  public class J_Gen31 {
  		@com.google.inject.Inject
  		public J_Gen31(J_Gen32 j_gen32){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen32 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  