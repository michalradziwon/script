
  package gen;
  public class F_Gen46 {
  		@com.google.inject.Inject
  		public F_Gen46(F_Gen47 f_gen47){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen47 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  