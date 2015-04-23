
  package gen;
  public class D_Gen111 {
  		@com.google.inject.Inject
  		public D_Gen111(D_Gen112 d_gen112){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen112 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  