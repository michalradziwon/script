
  package gen;
  public class J_Gen49 {
  		@com.google.inject.Inject
  		public J_Gen49(J_Gen50 j_gen50){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen50 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  