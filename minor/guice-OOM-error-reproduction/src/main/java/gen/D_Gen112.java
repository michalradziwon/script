
  package gen;
  public class D_Gen112 {
  		@com.google.inject.Inject
  		public D_Gen112(D_Gen113 d_gen113){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen113 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  