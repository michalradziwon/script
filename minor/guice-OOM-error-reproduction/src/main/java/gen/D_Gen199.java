
  package gen;
  public class D_Gen199 {
  		@com.google.inject.Inject
  		public D_Gen199(D_Gen200 d_gen200){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen200 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  