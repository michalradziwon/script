
  package gen;
  public class F_Gen122 {
  		@com.google.inject.Inject
  		public F_Gen122(F_Gen123 f_gen123){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen123 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  