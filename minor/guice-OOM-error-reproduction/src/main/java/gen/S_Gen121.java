
  package gen;
  public class S_Gen121 {
  		@com.google.inject.Inject
  		public S_Gen121(S_Gen122 s_gen122){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen122 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  