
  package gen;
  public class D_Gen144 {
  		@com.google.inject.Inject
  		public D_Gen144(D_Gen145 d_gen145){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen145 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  