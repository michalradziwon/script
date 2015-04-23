
  package gen;
  public class O_Gen121 {
  		@com.google.inject.Inject
  		public O_Gen121(O_Gen122 o_gen122){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen122 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  