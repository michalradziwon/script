
  package gen;
  public class F_Gen42 {
  		@com.google.inject.Inject
  		public F_Gen42(F_Gen43 f_gen43){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen43 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  