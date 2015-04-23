
  package gen;
  public class D_Gen40 {
  		@com.google.inject.Inject
  		public D_Gen40(D_Gen41 d_gen41){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen41 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  