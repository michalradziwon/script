
  package gen;
  public class O_Gen106 {
  		@com.google.inject.Inject
  		public O_Gen106(O_Gen107 o_gen107){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen107 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  