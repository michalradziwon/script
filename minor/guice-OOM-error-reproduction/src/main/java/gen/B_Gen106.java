
  package gen;
  public class B_Gen106 {
  		@com.google.inject.Inject
  		public B_Gen106(B_Gen107 b_gen107){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen107 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  