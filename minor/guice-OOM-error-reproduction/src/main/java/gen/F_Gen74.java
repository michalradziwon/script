
  package gen;
  public class F_Gen74 {
  		@com.google.inject.Inject
  		public F_Gen74(F_Gen75 f_gen75){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen75 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  