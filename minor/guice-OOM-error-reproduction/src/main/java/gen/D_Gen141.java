
  package gen;
  public class D_Gen141 {
  		@com.google.inject.Inject
  		public D_Gen141(D_Gen142 d_gen142){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen142 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  