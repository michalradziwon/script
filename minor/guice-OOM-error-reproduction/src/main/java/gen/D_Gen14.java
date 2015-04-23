
  package gen;
  public class D_Gen14 {
  		@com.google.inject.Inject
  		public D_Gen14(D_Gen15 d_gen15){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen15 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  