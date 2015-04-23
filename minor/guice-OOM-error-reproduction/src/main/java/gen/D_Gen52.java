
  package gen;
  public class D_Gen52 {
  		@com.google.inject.Inject
  		public D_Gen52(D_Gen53 d_gen53){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen53 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  