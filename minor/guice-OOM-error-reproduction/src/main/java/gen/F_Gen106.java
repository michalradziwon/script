
  package gen;
  public class F_Gen106 {
  		@com.google.inject.Inject
  		public F_Gen106(F_Gen107 f_gen107){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen107 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  