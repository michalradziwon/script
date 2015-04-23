
  package gen;
  public class J_Gen104 {
  		@com.google.inject.Inject
  		public J_Gen104(J_Gen105 j_gen105){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen105 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  