
  package gen;
  public class F_Gen83 {
  		@com.google.inject.Inject
  		public F_Gen83(F_Gen84 f_gen84){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen84 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  