
  package gen;
  public class F_Gen131 {
  		@com.google.inject.Inject
  		public F_Gen131(F_Gen132 f_gen132){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen132 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  