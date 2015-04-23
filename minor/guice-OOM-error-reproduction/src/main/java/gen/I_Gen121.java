
  package gen;
  public class I_Gen121 {
  		@com.google.inject.Inject
  		public I_Gen121(I_Gen122 i_gen122){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen122 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  