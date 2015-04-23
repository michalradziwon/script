
  package gen;
  public class D_Gen45 {
  		@com.google.inject.Inject
  		public D_Gen45(D_Gen46 d_gen46){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen46 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  