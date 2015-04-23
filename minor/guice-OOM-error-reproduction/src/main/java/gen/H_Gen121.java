
  package gen;
  public class H_Gen121 {
  		@com.google.inject.Inject
  		public H_Gen121(H_Gen122 h_gen122){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen122 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  