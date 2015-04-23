
  package gen;
  public class R_Gen121 {
  		@com.google.inject.Inject
  		public R_Gen121(R_Gen122 r_gen122){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen122 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  