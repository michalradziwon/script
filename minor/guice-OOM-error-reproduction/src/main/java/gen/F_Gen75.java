
  package gen;
  public class F_Gen75 {
  		@com.google.inject.Inject
  		public F_Gen75(F_Gen76 f_gen76){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen76 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  