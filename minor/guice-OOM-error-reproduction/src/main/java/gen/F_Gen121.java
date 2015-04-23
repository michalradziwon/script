
  package gen;
  public class F_Gen121 {
  		@com.google.inject.Inject
  		public F_Gen121(F_Gen122 f_gen122){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen122 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  