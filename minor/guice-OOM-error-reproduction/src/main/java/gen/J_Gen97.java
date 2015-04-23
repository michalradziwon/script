
  package gen;
  public class J_Gen97 {
  		@com.google.inject.Inject
  		public J_Gen97(J_Gen98 j_gen98){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen98 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  