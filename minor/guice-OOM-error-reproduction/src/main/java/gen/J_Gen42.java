
  package gen;
  public class J_Gen42 {
  		@com.google.inject.Inject
  		public J_Gen42(J_Gen43 j_gen43){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen43 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  