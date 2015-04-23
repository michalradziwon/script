
  package gen;
  public class D_Gen37 {
  		@com.google.inject.Inject
  		public D_Gen37(D_Gen38 d_gen38){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen38 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  