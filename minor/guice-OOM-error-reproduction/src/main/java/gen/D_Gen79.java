
  package gen;
  public class D_Gen79 {
  		@com.google.inject.Inject
  		public D_Gen79(D_Gen80 d_gen80){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen80 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  