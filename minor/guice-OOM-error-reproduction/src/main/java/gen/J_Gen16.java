
  package gen;
  public class J_Gen16 {
  		@com.google.inject.Inject
  		public J_Gen16(J_Gen17 j_gen17){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen17 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  