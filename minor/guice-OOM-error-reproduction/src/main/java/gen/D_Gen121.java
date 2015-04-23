
  package gen;
  public class D_Gen121 {
  		@com.google.inject.Inject
  		public D_Gen121(D_Gen122 d_gen122){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen122 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  