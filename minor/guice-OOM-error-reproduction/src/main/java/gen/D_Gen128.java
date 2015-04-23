
  package gen;
  public class D_Gen128 {
  		@com.google.inject.Inject
  		public D_Gen128(D_Gen129 d_gen129){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen129 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  