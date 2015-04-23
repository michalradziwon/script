
  package gen;
  public class F_Gen65 {
  		@com.google.inject.Inject
  		public F_Gen65(F_Gen66 f_gen66){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen66 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  