
  package gen;
  public class D_Gen41 {
  		@com.google.inject.Inject
  		public D_Gen41(D_Gen42 d_gen42){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen42 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  