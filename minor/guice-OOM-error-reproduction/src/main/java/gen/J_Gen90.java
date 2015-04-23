
  package gen;
  public class J_Gen90 {
  		@com.google.inject.Inject
  		public J_Gen90(J_Gen91 j_gen91){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen91 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  