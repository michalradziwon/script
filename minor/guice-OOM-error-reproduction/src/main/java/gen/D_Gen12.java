
  package gen;
  public class D_Gen12 {
  		@com.google.inject.Inject
  		public D_Gen12(D_Gen13 d_gen13){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen13 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  