
  package gen;
  public class D_Gen66 {
  		@com.google.inject.Inject
  		public D_Gen66(D_Gen67 d_gen67){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen67 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  