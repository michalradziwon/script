
  package gen;
  public class J_Gen121 {
  		@com.google.inject.Inject
  		public J_Gen121(J_Gen122 j_gen122){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen122 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  