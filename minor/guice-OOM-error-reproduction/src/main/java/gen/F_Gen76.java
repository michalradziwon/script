
  package gen;
  public class F_Gen76 {
  		@com.google.inject.Inject
  		public F_Gen76(F_Gen77 f_gen77){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen77 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  