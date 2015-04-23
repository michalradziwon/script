
  package gen;
  public class J_Gen62 {
  		@com.google.inject.Inject
  		public J_Gen62(J_Gen63 j_gen63){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen63 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  