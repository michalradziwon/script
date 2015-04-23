
  package gen;
  public class D_Gen62 {
  		@com.google.inject.Inject
  		public D_Gen62(D_Gen63 d_gen63){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen63 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  